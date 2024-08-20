// Generated from C:/Users/ASUS/Desktop/Compiler/MyNewLanguage/MyLanguageParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#new_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_component(MyLanguageParser.New_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(MyLanguageParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(MyLanguageParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#useEffectContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffectContent(MyLanguageParser.UseEffectContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#imp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(MyLanguageParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(MyLanguageParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MyLanguageParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(MyLanguageParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(MyLanguageParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#return_html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_html(MyLanguageParser.Return_htmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#pure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPure(MyLanguageParser.PureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(MyLanguageParser.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MyLanguageParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(MyLanguageParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(MyLanguageParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MyLanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#arrow_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_function(MyLanguageParser.Arrow_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#html_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_tag(MyLanguageParser.Html_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(MyLanguageParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#jsxTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxTag(MyLanguageParser.JsxTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(MyLanguageParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#h1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(MyLanguageParser.H1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(MyLanguageParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(MyLanguageParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(MyLanguageParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(MyLanguageParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(MyLanguageParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(MyLanguageParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrc(MyLanguageParser.SrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(MyLanguageParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MyLanguageParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(MyLanguageParser.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#javaScriptValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaScriptValue(MyLanguageParser.JavaScriptValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(MyLanguageParser.CallFunctionContext ctx);
}