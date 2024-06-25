grammar NotSimpleCalc;

program: (statement)+;

statement
    : assign_stmt
    | block_stmt
    | if_stmt
    | while_stmt
    | for_stmt
    | loop_stmt
    | print_stmt
    ;

assign_stmt: Identifier EQ expr sc;

block_stmt: begin program end;

if_stmt: if expr then statement (else statement)?;

while_stmt: while expr do statement;

for_stmt: for Identifier of Number to Number do statement;

loop_stmt: loop Identifier c Number do statement;

print_stmt: print (StringLiteral com)? Identifier sc;

expr: cmp_expr ((DE | NE | LT | GT | LE | GE) cmp_expr)?;

cmp_expr: term ((PLUS | MINUS) term)*;

term: power ((MULT | DIV | REM) power)*;

power: factor (PWR power)*;

factor: (PLUS | MINUS)? (Identifier | Number | openp expr closep );


begin: 'begin' ;
end: 'end' ;
if: 'if' ;
then: 'then' ;
else: 'else' ;
while: 'while' ;
for: 'for' ;
loop: 'loop' ;
print: 'print' ;
of: 'of' ;
to: 'to' ;
do: 'do' ;

MULT: '*';
DIV: '/';
PLUS: '+';
MINUS: '-';
PWR: '^';
REM: '%';
openp: '(';
closep: ')';
sc: ';';
c: ':';
com: ',';
EQ: '=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
DE: '==';
NE: '!=';
NO: '!';
Identifier: [a-zA-Z_][a-zA-Z_0-9]*;
Number: [0-9]+;
StringLiteral: '"' ~["]* '"';
WS: [ \t\r\n]+ -> channel(HIDDEN);
NEWLINE: [\n\r];