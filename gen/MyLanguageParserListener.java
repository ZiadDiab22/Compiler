// Generated from C:/Users/ASUS/Desktop/Compiler/MyNewLanguage/MyLanguageParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#new_component}.
	 * @param ctx the parse tree
	 */
	void enterNew_component(MyLanguageParser.New_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#new_component}.
	 * @param ctx the parse tree
	 */
	void exitNew_component(MyLanguageParser.New_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(MyLanguageParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(MyLanguageParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(MyLanguageParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(MyLanguageParser.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(MyLanguageParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(MyLanguageParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(MyLanguageParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(MyLanguageParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(MyLanguageParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(MyLanguageParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(MyLanguageParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(MyLanguageParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#return_html}.
	 * @param ctx the parse tree
	 */
	void enterReturn_html(MyLanguageParser.Return_htmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#return_html}.
	 * @param ctx the parse tree
	 */
	void exitReturn_html(MyLanguageParser.Return_htmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#pure}.
	 * @param ctx the parse tree
	 */
	void enterPure(MyLanguageParser.PureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#pure}.
	 * @param ctx the parse tree
	 */
	void exitPure(MyLanguageParser.PureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#useState}.
	 * @param ctx the parse tree
	 */
	void enterUseState(MyLanguageParser.UseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#useState}.
	 * @param ctx the parse tree
	 */
	void exitUseState(MyLanguageParser.UseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MyLanguageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MyLanguageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(MyLanguageParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(MyLanguageParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(MyLanguageParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(MyLanguageParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MyLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MyLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#arrow_function}.
	 * @param ctx the parse tree
	 */
	void enterArrow_function(MyLanguageParser.Arrow_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#arrow_function}.
	 * @param ctx the parse tree
	 */
	void exitArrow_function(MyLanguageParser.Arrow_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#html_tag}.
	 * @param ctx the parse tree
	 */
	void enterHtml_tag(MyLanguageParser.Html_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#html_tag}.
	 * @param ctx the parse tree
	 */
	void exitHtml_tag(MyLanguageParser.Html_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(MyLanguageParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(MyLanguageParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyLanguageParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyLanguageParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#h1}.
	 * @param ctx the parse tree
	 */
	void enterH1(MyLanguageParser.H1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#h1}.
	 * @param ctx the parse tree
	 */
	void exitH1(MyLanguageParser.H1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(MyLanguageParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(MyLanguageParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(MyLanguageParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(MyLanguageParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(MyLanguageParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(MyLanguageParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(MyLanguageParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(MyLanguageParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(MyLanguageParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(MyLanguageParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#src}.
	 * @param ctx the parse tree
	 */
	void enterSrc(MyLanguageParser.SrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#src}.
	 * @param ctx the parse tree
	 */
	void exitSrc(MyLanguageParser.SrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(MyLanguageParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(MyLanguageParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#javaScriptValue}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptValue(MyLanguageParser.JavaScriptValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#javaScriptValue}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptValue(MyLanguageParser.JavaScriptValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(MyLanguageParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(MyLanguageParser.CallFunctionContext ctx);
}