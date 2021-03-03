grammar Iotlang;

prog:    statement ;

statement: ( func_return | break_statement | continue_statement |func_def | func_call | assign | expr_statement | if_statement | loop_statement | block | NEWLINE)*;

func_argv: ID?|ID(','ID)+ ;

func_def  : 'func' ID '(' func_argv ')' block ;

func_call : ID '(' func_argv ')';

block : '{' ( statement ) '}';

func_return : 'return' (func_argv);

break_statement: 'break';

continue_statement : 'continue';

loop_statement:
    'while' condition_expr
        block
    ;

if_statement :
    'if' condition_expr
        block
    ('else' ( block |if_statement ))?;

assign: 'let' (varname=ID)  '='  (val = expr);

expr_statement:(expr|condition_expr);

condition_expr:
     left = expr op=('<'|'>'|'<='|'>='|'<>'|'==')  right = expr
     | left = expr op=('&&'|'||')  right = expr
     | op = '!'  right = expr
      ;

expr:    left = expr op= ('*'|'/')  right=expr #Arith
    |    left = expr op= ('+'|'-')  right=expr #Arith
    |    INT                 #Val
    |    ID                  #Var
    |    '(' expr ')'        #Paren
    ;

NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;

ID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : 'a'..'z' | 'A'..'Z' | '_' ;
fragment DIGIT : '0'..'9';

STRING : ('"')([a-zA-Z0-9])('"');
WS      :   [ \t\n\r]+ -> skip;