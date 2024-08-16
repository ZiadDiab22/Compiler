parser grammar MyLanguageParser;

options { tokenVocab = MyLanguageLexer; }

new_component: (imp)* (arrow_function | function) ( decl| log| useEffect| component | useState | useEffect | useRef )*
 return_html RBrack export;

useRef : Const var Equal UseRef LParen ARRAY_STRING_VALUES RParen SEIMIE_QO*;

useEffect : UseEffect LParen (arrow_function|function)(ARRAY_STRING_VALUES|RParen|LParen|Dot|SEIMIE_QO)*
            RBrack COMMA LBig (ARRAY_STRING_VALUES|COMMA)* RBig RParen SEIMIE_QO*;

imp : Imp (ARRAY_STRING_VALUES From)? link SEIMIE_QO*;

link : One_Qoute_Term | Path;

decl : VarType ARRAY_STRING_VALUES (Equal value)? SEIMIE_QO*;

log : Console ((Text|ARRAY_STRING_VALUES) Plus?)+ RParen SEIMIE_QO*;

value: Text|(ARRAY_NUMERIC_VALUES|DIGITS)|One_Qoute_Term|Tow_Qoute_Term|Bool;

export: EXP ARRAY_STRING_VALUES;

return_html: Return (html_tag|pure) SEIMIE_QO*;

pure : Create LParen (ARRAY_STRING_VALUES|One_Qoute_Term) COMMA LBrack (props)* RBrack
 (COMMA (pure|DQuote (ARRAY_STRING_VALUES)* DQuote))? RParen SEIMIE_QO*;

useState : Const LBig var COMMA fun RBig Equal Use_State LParen (ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES)* RParen SEIMIE_QO*;

var: ARRAY_STRING_VALUES;
fun:ARRAY_STRING_VALUES;

component : (function | arrow_function) ( log | decl)* return_html RBrack ;

function : Function ARRAY_STRING_VALUES LParen RParen LBrack;

arrow_function : ( Const ARRAY_STRING_VALUES  Equal )? LParen RParen  Equal Gt LBrack;

html_tag: LParen Lt Div Gt tag Lt Slash Div Gt RParen ;
tag : ( div | h1 | img | p | javaScriptValue )*;
div: Lt Div (props)* Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash Div Gt;
h1: Lt H1 (props)* Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash H1 Gt;
p: Lt P (props)* Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash P Gt;
img: Lt Img src (props)* Slash Gt;

props : ( width | height | onClick );
width : Width Equal ARRAY_NUMERIC_VALUES ( Pixl | Rate );
height : Height Equal ARRAY_NUMERIC_VALUES ( Pixl | Rate );
src : Src Equal  LBrack ARRAY_STRING_VALUES RBrack;
onClick : OnClick Equal LBrack  callFunction*  RBrack;

javaScriptValue : LBrack (ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES ) RBrack;
callFunction : ARRAY_STRING_VALUES* LParen (ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) RParen SEIMIE_QO*;

