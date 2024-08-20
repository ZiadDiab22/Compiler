lexer grammar MyLanguageLexer;

WS : [ \t\r\n]+ -> skip ;
Const : 'const' ' '*;
UseEffect : 'useEffect' ;
UseRef : 'use Ref';
Create : 'React.createElement';
Function:  ('Function' | 'function') ' '* ;
From : 'from' ' '* ;
Imp : 'import' ' '* ;
EXP : 'export default' ' '* ;
Use_State: 'useState' ;
VarType:'let'|'const'|'var';
Bool:'true'|'false';
Console : 'console.log(';
Class : 'className';
ID : 'id';

Return: 'return';

Div : 'div' ;
H1 : 'h1' ;
Img : 'img' ;
P : 'p';
Button : 'button';

Width: ' '* 'width';
Height : ' '* 'height';
Pixl:'px';
Rate : '%';
Src: ' '* 'src';
OnClick :  ( 'onClick' | 'onclick' );

Minus : '-';
SEIMIE_QO : ';';
Space : ' ' ;
Equal : '=' ;
//DIGITS : '0' .. '9' ;
Esc : '\\' ;
Slash:'/';
Colon : ':' ;
DColon : '::' ;
LParen : '(' ;
RParen : ')' ;
LBrack : '{' ;
RBrack : '}' ;
LBig : '[' ;
RBig : ']' ;
RArrow : '->' ;
Lt : '<' ;
Gt : '>' ;
EE: '==';
NE: '!=';
NOT: '!';
Question : '?' ;
Star : '*' ;
Plus : '+' ;
PlusAssign : '+=' ;
Underscore : '_' ;
Pipe : '|' ;
COMMA: ',';
Dot : '.' ;
At : '@' ;
Math : Plus | Star | Slash | Minus;

Path : Quote Dot? (Slash ARRAY_STRING_VALUES)+ (Dot ARRAY_STRING_VALUES)? Quote;

One_Qoute_Term : '\''Space*(LETTER|ARRAY_STRING_VALUES|Minus|At|Slash)* Space*'\'';
Tow_Qoute_Term : DQuote Space* (ARRAY_STRING_VALUES | Space | Underscore)* Space* DQuote;
Text : DQuote Space* (ARRAY_STRING_VALUES Space*)* Space* DQuote;

Quote : '\'' ;

DQuote : '"' ;

ARRAY_STRING_VALUES: [a-zA-Z]+ [0-9]* |  LETTER  ;

LETTER : ('a' .. 'z' | 'A' .. 'Z') ;

ARRAY_NUMERIC_VALUES: [0-9]+;
