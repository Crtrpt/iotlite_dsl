grammar Iotlang;

prog:    (expr  | statement | NEWLINE )* ;

statement: (assign|print|match);

match:  ((ID)(','(ID))+) '=' expr;

assign: (varname=ID) (NEWLINE)? '=' (NEWLINE)? (val = expr|ID);

print:  'print' (expr);

expr:    left = expr op= ('*'|'/')  right=expr #Arith
    |    left = expr op= ('+'|'-')  right=expr #Arith
    |    INT                 #Val
    |    ID                  #Var
    |    '(' expr ')'        #Paren
    ;

//数字
NUMBER :( DOUBLE | INT);

DOUBLE : [0-9]+'.'[0-9]+'d';

NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
ID     : ([a-z]);
STRING : ('"')([a-zA-Z0-9])('"');
Delimiter:(NEWLINE)?(',') (NEWLINE)?;