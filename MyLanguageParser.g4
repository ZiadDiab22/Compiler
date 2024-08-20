parser grammar MyLanguageParser;

options { tokenVocab = MyLanguageLexer; }

new_component: (imp)* (arrow_function | function) ( assign | decl| log| useEffect| component | useState | useEffect | useRef )*
 return_html RBrack export;

useRef : Const var Equal UseRef LParen ARRAY_STRING_VALUES RParen SEIMIE_QO*;

useEffect : UseEffect LParen (arrow_function|function) ( useEffectContent)*
            RBrack COMMA LBig (ARRAY_STRING_VALUES|COMMA)* RBig RParen SEIMIE_QO*;

useEffectContent : (ARRAY_STRING_VALUES|RParen|LParen|Path|Tow_Qoute_Term|Dot)* SEIMIE_QO;

imp : Imp (LBrack? (Use_State | UseEffect | COMMA | ARRAY_STRING_VALUES)* RBrack? From)? link SEIMIE_QO*;

link : One_Qoute_Term | Path;

assign : ARRAY_STRING_VALUES Equal ((Tow_Qoute_Term|ARRAY_STRING_VALUES | Text |ARRAY_NUMERIC_VALUES) (Plus|Slash|Minus|Star)?)* SEIMIE_QO*;

decl : VarType ARRAY_STRING_VALUES (Equal value)? SEIMIE_QO*;

log : Console ((Tow_Qoute_Term|Text|ARRAY_STRING_VALUES) Plus?)+ RParen SEIMIE_QO*;

value: Text|ARRAY_NUMERIC_VALUES|One_Qoute_Term|Tow_Qoute_Term|Bool|Path;

export: EXP ARRAY_STRING_VALUES;

return_html: Return (html_tag|pure) SEIMIE_QO*;

pure : Create LParen (ARRAY_STRING_VALUES|One_Qoute_Term) COMMA LBrack (props)* RBrack
 (COMMA (pure|DQuote (ARRAY_STRING_VALUES)* DQuote))? RParen SEIMIE_QO*;

useState : Const LBig var COMMA fun RBig Equal Use_State LParen (Path |Tow_Qoute_Term | ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES)* RParen SEIMIE_QO*;

var: ARRAY_STRING_VALUES;
fun:ARRAY_STRING_VALUES;

component : (function | arrow_function) ( log | decl | assign)* return_html RBrack ;

function : Function ARRAY_STRING_VALUES LParen RParen LBrack;

arrow_function : ( Const ARRAY_STRING_VALUES  Equal )? LParen RParen  Equal Gt LBrack;

html_tag: LParen Lt Div (props)* Gt tag Lt Slash Div Gt RParen ;
tag : (( div | button | h1 | img | p | javaScriptValue )*| jsxTag);
jsxTag : Lt ARRAY_STRING_VALUES Slash Gt;
div: Lt Div (props)* Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash Div Gt;
h1: Lt H1 (props)* Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash H1 Gt;
p: Lt P (props)* Gt ( tag | ( javaScriptValue | ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES)*) Lt Slash P Gt;
img: Lt Img src (props)* Slash Gt;
button : Lt Button (props)* Gt (ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES)* Lt Slash Button Gt;

props : ( width | height | onClick | className | id);
width : Width Equal ARRAY_NUMERIC_VALUES ( Pixl | Rate );
height : Height Equal ARRAY_NUMERIC_VALUES ( Pixl | Rate );
src : Src Equal (Path | (LBrack ARRAY_STRING_VALUES RBrack));
className : Class Equal One_Qoute_Term;
id : ID Equal javaScriptValue;
onClick : OnClick Equal LBrack  callFunction*  RBrack;

javaScriptValue : LBrack (ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES ) RBrack;
callFunction : LParen RParen Equal Gt ARRAY_STRING_VALUES* LParen (ARRAY_STRING_VALUES |ARRAY_NUMERIC_VALUES | Plus )* RParen SEIMIE_QO*;

