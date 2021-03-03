grammar Iotlang;

prog:    statement ;

statement: ( assign | select_statement |    obj_method | obj_member| expr | NEWLINE ) *;

select_statement:  ('select')
                            ('*'|ID|obj_member|obj_method)
                   ('from') ('*'|ID|('('select_statement')'))
                            ('where'  expr)+
                            ('group' 'by'  group_argv)+
                            ('order' 'by'  order_argv)+
                            ('limit' expr','expr )+
                            ;

group_argv     :    ((obj_member|obj_method) (obj_member|obj_method)*)?;

order_argv     :    ( order* );

order          :    (obj_member|obj_method) ('desc'|'asc')?  ;


assign: 'let' (varname=ID)  '='  (val = expr);

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

obj_member      :   ID'.'ID;

obj_method      :   ID'.'ID'(' method_argv ')';

method_argv     :   (ID (',' ID)*)? ;

NUMBER: (INT);

NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;

ID : ID_LETTER (ID_LETTER | DIGIT)* ;

STRING  : '"'([a-zA-Z0-9]+)'"';

fragment ID_LETTER : 'a'..'z' | 'A'..'Z' | '_' ;
fragment DIGIT : '0'..'9';



WS      : [ \t\n\r]+ -> channel(HIDDEN);