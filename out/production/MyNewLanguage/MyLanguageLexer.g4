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

Return: 'return';

Div : 'div' ;
H1 : 'h1' ;
Img : 'img' ;
P : 'p';

Width: ' '* 'width';
Height : ' '* 'height';
Pixl:'px';
Rate : '%';
Src: ' '* 'src';
OnClick :  ( 'onClick' | 'onclick' );

SEIMIE_QO : ';';
Space : ' ' ;
Equal : '=' ;
DIGITS : '0' .. '9' ;
Esc : '\\' ;
Slash:'/';
Colon : ':' ;
DColon : '::' ;
Quote : '\'' ;
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

Path : Quote Dot? (Slash ARRAY_STRING_VALUES)+ (Dot ARRAY_STRING_VALUES)? Quote;

One_Qoute_Term : '\''Space*(LETTER|ARRAY_STRING_VALUES) Space*'\'';
Tow_Qoute_Term : DQuote Space* (ARRAY_STRING_VALUES Space)* Space* DQuote;
Text : DQuote Space* (ARRAY_STRING_VALUES Space*)* Space* DQuote;


DQuote : '"' ;

ARRAY_STRING_VALUES: [a-zA-Z]+ [0-9]* |  LETTER  ;

LETTER : ('a' .. 'z' | 'A' .. 'Z') ;

ARRAY_NUMERIC_VALUES: [0-9]+;
