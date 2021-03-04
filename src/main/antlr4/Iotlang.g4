grammar Iotlang;

prog:    statement ;

//全部语句
statement: ( select_statement |expr | NEWLINE ) *;
//sql 样式的 查询语句
select_statement:  ('select') select_body = select_argv   ('from') from_body = from_argv
                            ('where'  where_body= expr)?
                            ('group' 'by'  group_body =  group_argv)+
                            ('order' 'by'  order_body = order_argv)+
                            limit_body = limit
                   ;

select_argv:    ('*'| ID |obj_member|obj_method);

from_argv      : ('*'| ID |('('select_statement')'));

group_argv     :    ((obj_member|obj_method) (obj_member|obj_method)*)?;

order_argv     :    ( order* );

order          :    (obj_member|obj_method) ('desc'|'asc')?  ;

limit           :  ('limit' offset_argv=expr',' limit_argv=expr )+;
//TODO 方法定义
//TODO 方法调用
//TODO 循环
//TODO 判断
//变量
assign: 'let' (varname=ID)  '='  (val = expr);

//计算表达式
expr:
         left = expr    op=('&&' | '||')     right = expr                                        #ADD
    |    left = expr    op= ('*'|'/'|'%')  right=expr                                            #ADD
    |    left = expr    op= ('+'|'-')      right=expr                                            #ADD
    |    left = expr    op=('<=' | '>=' | '>' | '<' | '==' | '<>' |'!=')  right = expr           #ADD
    |    left = expr    op=('&' | '|')  right = expr            #ADD
    |    NUMBER                         #GET_REF_NUMBER
    |    BOOL                           #GET_REF_BOOL
    |    STRING                         #GET_REF_STRING
    |    ID                             #GET_REF_ID
    |    obj_member                     #GET_REF_OBJ_MEMBER
    |    '(' expr ')'                   #PAREN

    ;


//对象成员调用
obj_member      :    instance=ID'.'member=ID;
//对象方法调用
obj_method      :   instance=ID'.'method=ID'('argv=method_argv ')';
//方法参数列表
method_argv     :   (ID (',' ID)*)?;
//数字类型
NUMBER: (HEX|BINARY|INT|FLOAT);

//进制 0x 二进制 0x 16进制
BINARY: ('0b'[0|1]+);
HEX :('0x'[0-9]+);

//基础数据类型
INT     :               [0-9]+;
FLOAT   :               ([0-9]+'.'[0-9])+;
STRING  :               '"'([ a-zA-Z0-9]+)'"';
BOOL    :               ('true'|'false');

//变量名称
ID : ID_LETTER (ID_LETTER | DIGIT)* ;

fragment ID_LETTER : 'a'..'z' | 'A'..'Z' | '_'
        | ~[\u0000-\u00FF\uD800-\uDBFF] {Character.isJavaIdentifierPart(_input.LA(-1))}?
        | [\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?

        ;

fragment DIGIT : '0'..'9';
//空行
NEWLINE : [\r\n]+ ;
//无用丢弃字符
WS      : [ \t\n\r]+ -> channel(HIDDEN);