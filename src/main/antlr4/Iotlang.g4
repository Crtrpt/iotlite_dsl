grammar Iotlang;

prog:    statement ;

//全部语句
statement: ( assign | select_statement |    obj_method | obj_member| expr | NEWLINE ) *;
//sql 样式的 查询语句
select_statement:  ('select')
                            ('*'| ID |obj_member|obj_method)
                   ('from') ('*'| ID |('('select_statement')'))
                            ('where'  expr)+
                            ('group' 'by'  group_argv)+
                            ('order' 'by'  order_argv)+
                            ('limit' expr','expr )+
                   ;

group_argv     :    ((obj_member|obj_method) (obj_member|obj_method)*)?;

order_argv     :    ( order* );

order          :    (obj_member|obj_method) ('desc'|'asc')?  ;

//TODO 方法定义
//TODO 方法调用
//TODO 循环
//TODO 判断
//变量
assign: 'let' (varname=ID)  '='  (val = expr);

//计算表达式
expr:    left = expr op= ('*'|'/')  right=expr
    |    left = expr op= ('+'|'-')  right=expr
    |    left = expr op= ('<'|'>')  right=expr
    |    left = expr op= ('<='|'=>')  right=expr
    |    left = expr op= ('=='|'!=')  right=expr
    |    STRING
    |    NUMBER
    |    obj_member
    |    ID
    |    '(' expr ')'
    ;

//对象成员调用
obj_member      :   ID'.'ID;
//对象方法调用
obj_method      :   ID'.'ID'(' method_argv ')';
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
STRING  :               '"'([a-zA-Z0-9]+)'"';

//变量名称
ID : ID_LETTER (ID_LETTER | DIGIT)* ;

fragment ID_LETTER : 'a'..'z' | 'A'..'Z' | '_' ;

fragment DIGIT : '0'..'9';
//空行
NEWLINE : [\r\n]+ ;
//无用丢弃字符
WS      : [ \t\n\r]+ -> channel(HIDDEN);