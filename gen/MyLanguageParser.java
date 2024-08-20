// Generated from C:/Users/ASUS/Desktop/Compiler/MyNewLanguage/MyLanguageParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Const=2, UseEffect=3, UseRef=4, Create=5, Function=6, From=7, Imp=8, 
		EXP=9, Use_State=10, VarType=11, Bool=12, Console=13, Class=14, ID=15, 
		Return=16, Div=17, H1=18, Img=19, P=20, Button=21, Width=22, Height=23, 
		Pixl=24, Rate=25, Src=26, OnClick=27, Minus=28, SEIMIE_QO=29, Space=30, 
		Equal=31, Esc=32, Slash=33, Colon=34, DColon=35, LParen=36, RParen=37, 
		LBrack=38, RBrack=39, LBig=40, RBig=41, RArrow=42, Lt=43, Gt=44, EE=45, 
		NE=46, NOT=47, Question=48, Star=49, Plus=50, PlusAssign=51, Underscore=52, 
		Pipe=53, COMMA=54, Dot=55, At=56, Math=57, Path=58, One_Qoute_Term=59, 
		Tow_Qoute_Term=60, Text=61, Quote=62, DQuote=63, ARRAY_STRING_VALUES=64, 
		LETTER=65, ARRAY_NUMERIC_VALUES=66;
	public static final int
		RULE_new_component = 0, RULE_useRef = 1, RULE_useEffect = 2, RULE_useEffectContent = 3, 
		RULE_imp = 4, RULE_link = 5, RULE_assign = 6, RULE_decl = 7, RULE_log = 8, 
		RULE_value = 9, RULE_export = 10, RULE_return_html = 11, RULE_pure = 12, 
		RULE_useState = 13, RULE_var = 14, RULE_fun = 15, RULE_component = 16, 
		RULE_function = 17, RULE_arrow_function = 18, RULE_html_tag = 19, RULE_tag = 20, 
		RULE_jsxTag = 21, RULE_div = 22, RULE_h1 = 23, RULE_p = 24, RULE_img = 25, 
		RULE_button = 26, RULE_props = 27, RULE_width = 28, RULE_height = 29, 
		RULE_src = 30, RULE_className = 31, RULE_id = 32, RULE_onClick = 33, RULE_javaScriptValue = 34, 
		RULE_callFunction = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"new_component", "useRef", "useEffect", "useEffectContent", "imp", "link", 
			"assign", "decl", "log", "value", "export", "return_html", "pure", "useState", 
			"var", "fun", "component", "function", "arrow_function", "html_tag", 
			"tag", "jsxTag", "div", "h1", "p", "img", "button", "props", "width", 
			"height", "src", "className", "id", "onClick", "javaScriptValue", "callFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'useEffect'", "'use Ref'", "'React.createElement'", 
			null, null, null, null, "'useState'", null, null, "'console.log('", "'className'", 
			"'id'", "'return'", "'div'", "'h1'", "'img'", "'p'", "'button'", null, 
			null, "'px'", "'%'", null, null, "'-'", "';'", "' '", "'='", "'\\'", 
			"'/'", "':'", "'::'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", 
			"'<'", "'>'", "'=='", "'!='", "'!'", "'?'", "'*'", "'+'", "'+='", "'_'", 
			"'|'", "','", "'.'", "'@'", null, null, null, null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "Const", "UseEffect", "UseRef", "Create", "Function", "From", 
			"Imp", "EXP", "Use_State", "VarType", "Bool", "Console", "Class", "ID", 
			"Return", "Div", "H1", "Img", "P", "Button", "Width", "Height", "Pixl", 
			"Rate", "Src", "OnClick", "Minus", "SEIMIE_QO", "Space", "Equal", "Esc", 
			"Slash", "Colon", "DColon", "LParen", "RParen", "LBrack", "RBrack", "LBig", 
			"RBig", "RArrow", "Lt", "Gt", "EE", "NE", "NOT", "Question", "Star", 
			"Plus", "PlusAssign", "Underscore", "Pipe", "COMMA", "Dot", "At", "Math", 
			"Path", "One_Qoute_Term", "Tow_Qoute_Term", "Text", "Quote", "DQuote", 
			"ARRAY_STRING_VALUES", "LETTER", "ARRAY_NUMERIC_VALUES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguageParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_componentContext extends ParserRuleContext {
		public Return_htmlContext return_html() {
			return getRuleContext(Return_htmlContext.class,0);
		}
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ImpContext> imp() {
			return getRuleContexts(ImpContext.class);
		}
		public ImpContext imp(int i) {
			return getRuleContext(ImpContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<LogContext> log() {
			return getRuleContexts(LogContext.class);
		}
		public LogContext log(int i) {
			return getRuleContext(LogContext.class,i);
		}
		public List<UseEffectContext> useEffect() {
			return getRuleContexts(UseEffectContext.class);
		}
		public UseEffectContext useEffect(int i) {
			return getRuleContext(UseEffectContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<UseStateContext> useState() {
			return getRuleContexts(UseStateContext.class);
		}
		public UseStateContext useState(int i) {
			return getRuleContext(UseStateContext.class,i);
		}
		public List<UseRefContext> useRef() {
			return getRuleContexts(UseRefContext.class);
		}
		public UseRefContext useRef(int i) {
			return getRuleContext(UseRefContext.class,i);
		}
		public New_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterNew_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitNew_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitNew_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_componentContext new_component() throws RecognitionException {
		New_componentContext _localctx = new New_componentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_new_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Imp) {
				{
				{
				setState(72);
				imp();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LParen:
				{
				setState(78);
				arrow_function();
				}
				break;
			case Function:
				{
				setState(79);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & 4611686035607259667L) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(82);
					assign();
					}
					break;
				case 2:
					{
					setState(83);
					decl();
					}
					break;
				case 3:
					{
					setState(84);
					log();
					}
					break;
				case 4:
					{
					setState(85);
					useEffect();
					}
					break;
				case 5:
					{
					setState(86);
					component();
					}
					break;
				case 6:
					{
					setState(87);
					useState();
					}
					break;
				case 7:
					{
					setState(88);
					useEffect();
					}
					break;
				case 8:
					{
					setState(89);
					useRef();
					}
					break;
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			return_html();
			setState(96);
			match(RBrack);
			setState(97);
			export();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MyLanguageParser.Const, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode UseRef() { return getToken(MyLanguageParser.UseRef, 0); }
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Const);
			setState(100);
			var();
			setState(101);
			match(Equal);
			setState(102);
			match(UseRef);
			setState(103);
			match(LParen);
			setState(104);
			match(ARRAY_STRING_VALUES);
			setState(105);
			match(RParen);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(106);
				match(SEIMIE_QO);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode UseEffect() { return getToken(MyLanguageParser.UseEffect, 0); }
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
		public TerminalNode LBig() { return getToken(MyLanguageParser.LBig, 0); }
		public TerminalNode RBig() { return getToken(MyLanguageParser.RBig, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<UseEffectContentContext> useEffectContent() {
			return getRuleContexts(UseEffectContentContext.class);
		}
		public UseEffectContentContext useEffectContent(int i) {
			return getRuleContext(UseEffectContentContext.class,i);
		}
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_useEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(UseEffect);
			setState(113);
			match(LParen);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LParen:
				{
				setState(114);
				arrow_function();
				}
				break;
			case Function:
				{
				setState(115);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 37111202177L) != 0)) {
				{
				{
				setState(118);
				useEffectContent();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RBrack);
			setState(125);
			match(COMMA);
			setState(126);
			match(LBig);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==ARRAY_STRING_VALUES) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==ARRAY_STRING_VALUES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RBig);
			setState(134);
			match(RParen);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(135);
				match(SEIMIE_QO);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContentContext extends ParserRuleContext {
		public TerminalNode SEIMIE_QO() { return getToken(MyLanguageParser.SEIMIE_QO, 0); }
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> RParen() { return getTokens(MyLanguageParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(MyLanguageParser.RParen, i);
		}
		public List<TerminalNode> LParen() { return getTokens(MyLanguageParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(MyLanguageParser.LParen, i);
		}
		public List<TerminalNode> Path() { return getTokens(MyLanguageParser.Path); }
		public TerminalNode Path(int i) {
			return getToken(MyLanguageParser.Path, i);
		}
		public List<TerminalNode> Tow_Qoute_Term() { return getTokens(MyLanguageParser.Tow_Qoute_Term); }
		public TerminalNode Tow_Qoute_Term(int i) {
			return getToken(MyLanguageParser.Tow_Qoute_Term, i);
		}
		public List<TerminalNode> Dot() { return getTokens(MyLanguageParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(MyLanguageParser.Dot, i);
		}
		public UseEffectContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffectContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterUseEffectContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitUseEffectContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitUseEffectContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContentContext useEffectContent() throws RecognitionException {
		UseEffectContentContext _localctx = new UseEffectContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_useEffectContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 289931267L) != 0)) {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 289931267L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(SEIMIE_QO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImpContext extends ParserRuleContext {
		public TerminalNode Imp() { return getToken(MyLanguageParser.Imp, 0); }
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TerminalNode From() { return getToken(MyLanguageParser.From, 0); }
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public List<TerminalNode> Use_State() { return getTokens(MyLanguageParser.Use_State); }
		public TerminalNode Use_State(int i) {
			return getToken(MyLanguageParser.Use_State, i);
		}
		public List<TerminalNode> UseEffect() { return getTokens(MyLanguageParser.UseEffect); }
		public TerminalNode UseEffect(int i) {
			return getToken(MyLanguageParser.UseEffect, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Imp);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2308094912106594449L) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBrack) {
					{
					setState(150);
					match(LBrack);
					}
				}

				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2308094809027379329L) != 0)) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2308094809027379329L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBrack) {
					{
					setState(159);
					match(RBrack);
					}
				}

				setState(162);
				match(From);
				}
			}

			setState(165);
			link();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(166);
				match(SEIMIE_QO);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinkContext extends ParserRuleContext {
		public TerminalNode One_Qoute_Term() { return getToken(MyLanguageParser.One_Qoute_Term, 0); }
		public TerminalNode Path() { return getToken(MyLanguageParser.Path, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==Path || _la==One_Qoute_Term) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public List<TerminalNode> Tow_Qoute_Term() { return getTokens(MyLanguageParser.Tow_Qoute_Term); }
		public TerminalNode Tow_Qoute_Term(int i) {
			return getToken(MyLanguageParser.Tow_Qoute_Term, i);
		}
		public List<TerminalNode> Text() { return getTokens(MyLanguageParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(MyLanguageParser.Text, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public List<TerminalNode> Plus() { return getTokens(MyLanguageParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MyLanguageParser.Plus, i);
		}
		public List<TerminalNode> Slash() { return getTokens(MyLanguageParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(MyLanguageParser.Slash, i);
		}
		public List<TerminalNode> Minus() { return getTokens(MyLanguageParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(MyLanguageParser.Minus, i);
		}
		public List<TerminalNode> Star() { return getTokens(MyLanguageParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(MyLanguageParser.Star, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ARRAY_STRING_VALUES);
			setState(175);
			match(Equal);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					_la = _input.LA(1);
					if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 83L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688858718633984L) != 0)) {
						{
						setState(177);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688858718633984L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(185);
				match(SEIMIE_QO);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode VarType() { return getToken(MyLanguageParser.VarType, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(VarType);
			setState(192);
			match(ARRAY_STRING_VALUES);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(193);
				match(Equal);
				setState(194);
				value();
				}
			}

			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(197);
				match(SEIMIE_QO);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(MyLanguageParser.Console, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public List<TerminalNode> Tow_Qoute_Term() { return getTokens(MyLanguageParser.Tow_Qoute_Term); }
		public TerminalNode Tow_Qoute_Term(int i) {
			return getToken(MyLanguageParser.Tow_Qoute_Term, i);
		}
		public List<TerminalNode> Text() { return getTokens(MyLanguageParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(MyLanguageParser.Text, i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> Plus() { return getTokens(MyLanguageParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MyLanguageParser.Plus, i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Console);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 19L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus) {
					{
					setState(205);
					match(Plus);
					}
				}

				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 19L) != 0) );
			setState(212);
			match(RParen);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(213);
				match(SEIMIE_QO);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MyLanguageParser.Text, 0); }
		public TerminalNode ARRAY_NUMERIC_VALUES() { return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, 0); }
		public TerminalNode One_Qoute_Term() { return getToken(MyLanguageParser.One_Qoute_Term, 0); }
		public TerminalNode Tow_Qoute_Term() { return getToken(MyLanguageParser.Tow_Qoute_Term, 0); }
		public TerminalNode Bool() { return getToken(MyLanguageParser.Bool, 0); }
		public TerminalNode Path() { return getToken(MyLanguageParser.Path, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 19069929672146945L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(MyLanguageParser.EXP, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(EXP);
			setState(222);
			match(ARRAY_STRING_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_htmlContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(MyLanguageParser.Return, 0); }
		public Html_tagContext html_tag() {
			return getRuleContext(Html_tagContext.class,0);
		}
		public PureContext pure() {
			return getRuleContext(PureContext.class,0);
		}
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public Return_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterReturn_html(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitReturn_html(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitReturn_html(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_htmlContext return_html() throws RecognitionException {
		Return_htmlContext _localctx = new Return_htmlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Return);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				{
				setState(225);
				html_tag();
				}
				break;
			case Create:
				{
				setState(226);
				pure();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(229);
				match(SEIMIE_QO);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PureContext extends ParserRuleContext {
		public TerminalNode Create() { return getToken(MyLanguageParser.Create, 0); }
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public TerminalNode One_Qoute_Term() { return getToken(MyLanguageParser.One_Qoute_Term, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public PureContext pure() {
			return getRuleContext(PureContext.class,0);
		}
		public List<TerminalNode> DQuote() { return getTokens(MyLanguageParser.DQuote); }
		public TerminalNode DQuote(int i) {
			return getToken(MyLanguageParser.DQuote, i);
		}
		public PureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterPure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitPure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitPure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureContext pure() throws RecognitionException {
		PureContext _localctx = new PureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Create);
			setState(236);
			match(LParen);
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==One_Qoute_Term || _la==ARRAY_STRING_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(238);
			match(COMMA);
			setState(239);
			match(LBrack);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(240);
				props();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(RBrack);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(247);
				match(COMMA);
				setState(257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Create:
					{
					setState(248);
					pure();
					}
					break;
				case DQuote:
					{
					setState(249);
					match(DQuote);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ARRAY_STRING_VALUES) {
						{
						{
						setState(250);
						match(ARRAY_STRING_VALUES);
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(256);
					match(DQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(261);
			match(RParen);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					match(SEIMIE_QO);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MyLanguageParser.Const, 0); }
		public TerminalNode LBig() { return getToken(MyLanguageParser.LBig, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public TerminalNode RBig() { return getToken(MyLanguageParser.RBig, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode Use_State() { return getToken(MyLanguageParser.Use_State, 0); }
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public List<TerminalNode> Path() { return getTokens(MyLanguageParser.Path); }
		public TerminalNode Path(int i) {
			return getToken(MyLanguageParser.Path, i);
		}
		public List<TerminalNode> Tow_Qoute_Term() { return getTokens(MyLanguageParser.Tow_Qoute_Term); }
		public TerminalNode Tow_Qoute_Term(int i) {
			return getToken(MyLanguageParser.Tow_Qoute_Term, i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_useState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Const);
			setState(269);
			match(LBig);
			setState(270);
			var();
			setState(271);
			match(COMMA);
			setState(272);
			fun();
			setState(273);
			match(RBig);
			setState(274);
			match(Equal);
			setState(275);
			match(Use_State);
			setState(276);
			match(LParen);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 325L) != 0)) {
				{
				{
				setState(277);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 325L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(RParen);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(284);
				match(SEIMIE_QO);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ARRAY_STRING_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ARRAY_STRING_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public Return_htmlContext return_html() {
			return getRuleContext(Return_htmlContext.class,0);
		}
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public List<LogContext> log() {
			return getRuleContexts(LogContext.class);
		}
		public LogContext log(int i) {
			return getRuleContext(LogContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				setState(294);
				function();
				}
				break;
			case Const:
			case LParen:
				{
				setState(295);
				arrow_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 9007199254740997L) != 0)) {
				{
				setState(301);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Console:
					{
					setState(298);
					log();
					}
					break;
				case VarType:
					{
					setState(299);
					decl();
					}
					break;
				case ARRAY_STRING_VALUES:
					{
					setState(300);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			return_html();
			setState(307);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(MyLanguageParser.Function, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(Function);
			setState(310);
			match(ARRAY_STRING_VALUES);
			setState(311);
			match(LParen);
			setState(312);
			match(RParen);
			setState(313);
			match(LBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arrow_functionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public List<TerminalNode> Equal() { return getTokens(MyLanguageParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(MyLanguageParser.Equal, i);
		}
		public TerminalNode Gt() { return getToken(MyLanguageParser.Gt, 0); }
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode Const() { return getToken(MyLanguageParser.Const, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public Arrow_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterArrow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitArrow_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitArrow_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_functionContext arrow_function() throws RecognitionException {
		Arrow_functionContext _localctx = new Arrow_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrow_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(315);
				match(Const);
				setState(316);
				match(ARRAY_STRING_VALUES);
				setState(317);
				match(Equal);
				}
			}

			setState(320);
			match(LParen);
			setState(321);
			match(RParen);
			setState(322);
			match(Equal);
			setState(323);
			match(Gt);
			setState(324);
			match(LBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_tagContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> Div() { return getTokens(MyLanguageParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(MyLanguageParser.Div, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public Html_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterHtml_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitHtml_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitHtml_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_tagContext html_tag() throws RecognitionException {
		Html_tagContext _localctx = new Html_tagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_html_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LParen);
			setState(327);
			match(Lt);
			setState(328);
			match(Div);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(329);
				props();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(Gt);
			setState(336);
			tag();
			setState(337);
			match(Lt);
			setState(338);
			match(Slash);
			setState(339);
			match(Div);
			setState(340);
			match(Gt);
			setState(341);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagContext extends ParserRuleContext {
		public JsxTagContext jsxTag() {
			return getRuleContext(JsxTagContext.class,0);
		}
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
		}
		public List<ButtonContext> button() {
			return getRuleContexts(ButtonContext.class);
		}
		public ButtonContext button(int i) {
			return getRuleContext(ButtonContext.class,i);
		}
		public List<H1Context> h1() {
			return getRuleContexts(H1Context.class);
		}
		public H1Context h1(int i) {
			return getRuleContext(H1Context.class,i);
		}
		public List<ImgContext> img() {
			return getRuleContexts(ImgContext.class);
		}
		public ImgContext img(int i) {
			return getRuleContext(ImgContext.class,i);
		}
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public List<JavaScriptValueContext> javaScriptValue() {
			return getRuleContexts(JavaScriptValueContext.class);
		}
		public JavaScriptValueContext javaScriptValue(int i) {
			return getRuleContext(JavaScriptValueContext.class,i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(349);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(343);
							div();
							}
							break;
						case 2:
							{
							setState(344);
							button();
							}
							break;
						case 3:
							{
							setState(345);
							h1();
							}
							break;
						case 4:
							{
							setState(346);
							img();
							}
							break;
						case 5:
							{
							setState(347);
							p();
							}
							break;
						case 6:
							{
							setState(348);
							javaScriptValue();
							}
							break;
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(354);
				jsxTag();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxTagContext extends ParserRuleContext {
		public TerminalNode Lt() { return getToken(MyLanguageParser.Lt, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public TerminalNode Gt() { return getToken(MyLanguageParser.Gt, 0); }
		public JsxTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterJsxTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitJsxTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitJsxTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxTagContext jsxTag() throws RecognitionException {
		JsxTagContext _localctx = new JsxTagContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsxTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Lt);
			setState(358);
			match(ARRAY_STRING_VALUES);
			setState(359);
			match(Slash);
			setState(360);
			match(Gt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> Div() { return getTokens(MyLanguageParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(MyLanguageParser.Div, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(Lt);
			setState(363);
			match(Div);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(364);
				props();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(Gt);
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(371);
				tag();
				}
				break;
			case 2:
				{
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(372);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(378);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(386);
			match(Lt);
			setState(387);
			match(Slash);
			setState(388);
			match(Div);
			setState(389);
			match(Gt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class H1Context extends ParserRuleContext {
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> H1() { return getTokens(MyLanguageParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(MyLanguageParser.H1, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public H1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitH1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1Context h1() throws RecognitionException {
		H1Context _localctx = new H1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_h1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(Lt);
			setState(392);
			match(H1);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(393);
				props();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(Gt);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(400);
				tag();
				}
				break;
			case 2:
				{
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(401);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(407);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(415);
			match(Lt);
			setState(416);
			match(Slash);
			setState(417);
			match(H1);
			setState(418);
			match(Gt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends ParserRuleContext {
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> P() { return getTokens(MyLanguageParser.P); }
		public TerminalNode P(int i) {
			return getToken(MyLanguageParser.P, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public List<JavaScriptValueContext> javaScriptValue() {
			return getRuleContexts(JavaScriptValueContext.class);
		}
		public JavaScriptValueContext javaScriptValue(int i) {
			return getRuleContext(JavaScriptValueContext.class,i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Lt);
			setState(421);
			match(P);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(422);
				props();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(Gt);
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(429);
				tag();
				}
				break;
			case 2:
				{
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 335544321L) != 0)) {
					{
					setState(433);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBrack:
						{
						setState(430);
						javaScriptValue();
						}
						break;
					case ARRAY_STRING_VALUES:
						{
						setState(431);
						match(ARRAY_STRING_VALUES);
						}
						break;
					case ARRAY_NUMERIC_VALUES:
						{
						setState(432);
						match(ARRAY_NUMERIC_VALUES);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(440);
			match(Lt);
			setState(441);
			match(Slash);
			setState(442);
			match(P);
			setState(443);
			match(Gt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgContext extends ParserRuleContext {
		public TerminalNode Lt() { return getToken(MyLanguageParser.Lt, 0); }
		public TerminalNode Img() { return getToken(MyLanguageParser.Img, 0); }
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public TerminalNode Gt() { return getToken(MyLanguageParser.Gt, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(Lt);
			setState(446);
			match(Img);
			setState(447);
			src();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(448);
				props();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(Slash);
			setState(455);
			match(Gt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonContext extends ParserRuleContext {
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> Button() { return getTokens(MyLanguageParser.Button); }
		public TerminalNode Button(int i) {
			return getToken(MyLanguageParser.Button, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_button);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Lt);
			setState(458);
			match(Button);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146849792L) != 0)) {
				{
				{
				setState(459);
				props();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(Gt);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) {
				{
				{
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(Lt);
			setState(473);
			match(Slash);
			setState(474);
			match(Button);
			setState(475);
			match(Gt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropsContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Width:
				{
				setState(477);
				width();
				}
				break;
			case Height:
				{
				setState(478);
				height();
				}
				break;
			case OnClick:
				{
				setState(479);
				onClick();
				}
				break;
			case Class:
				{
				setState(480);
				className();
				}
				break;
			case ID:
				{
				setState(481);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode Width() { return getToken(MyLanguageParser.Width, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode ARRAY_NUMERIC_VALUES() { return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, 0); }
		public TerminalNode Pixl() { return getToken(MyLanguageParser.Pixl, 0); }
		public TerminalNode Rate() { return getToken(MyLanguageParser.Rate, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(Width);
			setState(485);
			match(Equal);
			setState(486);
			match(ARRAY_NUMERIC_VALUES);
			setState(487);
			_la = _input.LA(1);
			if ( !(_la==Pixl || _la==Rate) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightContext extends ParserRuleContext {
		public TerminalNode Height() { return getToken(MyLanguageParser.Height, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode ARRAY_NUMERIC_VALUES() { return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, 0); }
		public TerminalNode Pixl() { return getToken(MyLanguageParser.Pixl, 0); }
		public TerminalNode Rate() { return getToken(MyLanguageParser.Rate, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(Height);
			setState(490);
			match(Equal);
			setState(491);
			match(ARRAY_NUMERIC_VALUES);
			setState(492);
			_la = _input.LA(1);
			if ( !(_la==Pixl || _la==Rate) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SrcContext extends ParserRuleContext {
		public TerminalNode Src() { return getToken(MyLanguageParser.Src, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode Path() { return getToken(MyLanguageParser.Path, 0); }
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(Src);
			setState(495);
			match(Equal);
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Path:
				{
				setState(496);
				match(Path);
				}
				break;
			case LBrack:
				{
				{
				setState(497);
				match(LBrack);
				setState(498);
				match(ARRAY_STRING_VALUES);
				setState(499);
				match(RBrack);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MyLanguageParser.Class, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode One_Qoute_Term() { return getToken(MyLanguageParser.One_Qoute_Term, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(Class);
			setState(503);
			match(Equal);
			setState(504);
			match(One_Qoute_Term);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public JavaScriptValueContext javaScriptValue() {
			return getRuleContext(JavaScriptValueContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(ID);
			setState(507);
			match(Equal);
			setState(508);
			javaScriptValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnClickContext extends ParserRuleContext {
		public TerminalNode OnClick() { return getToken(MyLanguageParser.OnClick, 0); }
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public List<CallFunctionContext> callFunction() {
			return getRuleContexts(CallFunctionContext.class);
		}
		public CallFunctionContext callFunction(int i) {
			return getRuleContext(CallFunctionContext.class,i);
		}
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_onClick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(OnClick);
			setState(511);
			match(Equal);
			setState(512);
			match(LBrack);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LParen) {
				{
				{
				setState(513);
				callFunction();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JavaScriptValueContext extends ParserRuleContext {
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode ARRAY_NUMERIC_VALUES() { return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, 0); }
		public JavaScriptValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaScriptValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterJavaScriptValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitJavaScriptValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitJavaScriptValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaScriptValueContext javaScriptValue() throws RecognitionException {
		JavaScriptValueContext _localctx = new JavaScriptValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_javaScriptValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(LBrack);
			setState(522);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(523);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public List<TerminalNode> LParen() { return getTokens(MyLanguageParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(MyLanguageParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(MyLanguageParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(MyLanguageParser.RParen, i);
		}
		public TerminalNode Equal() { return getToken(MyLanguageParser.Equal, 0); }
		public TerminalNode Gt() { return getToken(MyLanguageParser.Gt, 0); }
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public List<TerminalNode> ARRAY_NUMERIC_VALUES() { return getTokens(MyLanguageParser.ARRAY_NUMERIC_VALUES); }
		public TerminalNode ARRAY_NUMERIC_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_NUMERIC_VALUES, i);
		}
		public List<TerminalNode> Plus() { return getTokens(MyLanguageParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MyLanguageParser.Plus, i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(LParen);
			setState(526);
			match(RParen);
			setState(527);
			match(Equal);
			setState(528);
			match(Gt);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES) {
				{
				{
				setState(529);
				match(ARRAY_STRING_VALUES);
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(LParen);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 81921L) != 0)) {
				{
				{
				setState(536);
				_la = _input.LA(1);
				if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 81921L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			match(RParen);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(543);
				match(SEIMIE_QO);
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0226\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000Q\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000[\b\u0000\n\u0000\f\u0000^\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001l\b\u0001\n\u0001"+
		"\f\u0001o\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002u\b\u0002\u0001\u0002\u0005\u0002x\b\u0002\n\u0002\f\u0002{\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0081\b\u0002"+
		"\n\u0002\f\u0002\u0084\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0089\b\u0002\n\u0002\f\u0002\u008c\t\u0002\u0001\u0003\u0005\u0003"+
		"\u008f\b\u0003\n\u0003\f\u0003\u0092\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0098\b\u0004\u0001\u0004\u0005\u0004\u009b"+
		"\b\u0004\n\u0004\f\u0004\u009e\t\u0004\u0001\u0004\u0003\u0004\u00a1\b"+
		"\u0004\u0001\u0004\u0003\u0004\u00a4\b\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00a8\b\u0004\n\u0004\f\u0004\u00ab\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006"+
		"\u0005\u0006\u00b5\b\u0006\n\u0006\f\u0006\u00b8\t\u0006\u0001\u0006\u0005"+
		"\u0006\u00bb\b\u0006\n\u0006\f\u0006\u00be\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c4\b\u0007\u0001\u0007\u0005\u0007"+
		"\u00c7\b\u0007\n\u0007\f\u0007\u00ca\t\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00cf\b\b\u0004\b\u00d1\b\b\u000b\b\f\b\u00d2\u0001\b\u0001\b\u0005"+
		"\b\u00d7\b\b\n\b\f\b\u00da\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e4\b\u000b\u0001\u000b"+
		"\u0005\u000b\u00e7\b\u000b\n\u000b\f\u000b\u00ea\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f2\b\f\n\f\f\f\u00f5\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00fc\b\f\n\f\f\f\u00ff"+
		"\t\f\u0001\f\u0003\f\u0102\b\f\u0003\f\u0104\b\f\u0001\f\u0001\f\u0005"+
		"\f\u0108\b\f\n\f\f\f\u010b\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0117\b\r\n\r\f\r\u011a"+
		"\t\r\u0001\r\u0001\r\u0005\r\u011e\b\r\n\r\f\r\u0121\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0129"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u012e\b\u0010"+
		"\n\u0010\f\u0010\u0131\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u013f\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u014b\b\u0013\n\u0013\f\u0013"+
		"\u014e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u015e\b\u0014\n\u0014"+
		"\f\u0014\u0161\t\u0014\u0001\u0014\u0003\u0014\u0164\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u016e\b\u0016\n\u0016\f\u0016\u0171\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0176\b\u0016\n\u0016\f\u0016"+
		"\u0179\t\u0016\u0001\u0016\u0005\u0016\u017c\b\u0016\n\u0016\f\u0016\u017f"+
		"\t\u0016\u0003\u0016\u0181\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u018b\b\u0017\n\u0017\f\u0017\u018e\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0193\b\u0017\n\u0017\f\u0017\u0196\t\u0017\u0001\u0017"+
		"\u0005\u0017\u0199\b\u0017\n\u0017\f\u0017\u019c\t\u0017\u0003\u0017\u019e"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01a8\b\u0018\n\u0018\f\u0018"+
		"\u01ab\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01b2\b\u0018\n\u0018\f\u0018\u01b5\t\u0018\u0003\u0018\u01b7"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01c2\b\u0019\n"+
		"\u0019\f\u0019\u01c5\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01cd\b\u001a\n\u001a\f\u001a"+
		"\u01d0\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01d4\b\u001a\n\u001a"+
		"\f\u001a\u01d7\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01e3\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01f5\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005!\u0203"+
		"\b!\n!\f!\u0206\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0005#\u0213\b#\n#\f#\u0216\t#\u0001#\u0001"+
		"#\u0005#\u021a\b#\n#\f#\u021d\t#\u0001#\u0001#\u0005#\u0221\b#\n#\f#\u0224"+
		"\t#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\r\u0002"+
		"\u000066@@\u0005\u0000$%77::<<@@\u0004\u0000\u0003\u0003\n\n66@@\u0001"+
		"\u0000:;\u0003\u0000<=@@BB\u0003\u0000\u001c\u001c!!12\u0002\u0000<=@"+
		"@\u0003\u0000\f\f:=BB\u0002\u0000;;@@\u0004\u0000::<<@@BB\u0002\u0000"+
		"@@BB\u0001\u0000\u0018\u0019\u0003\u000022@@BB\u024f\u0000K\u0001\u0000"+
		"\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004p\u0001\u0000\u0000\u0000"+
		"\u0006\u0090\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000\u0000\u0000\n"+
		"\u00ac\u0001\u0000\u0000\u0000\f\u00ae\u0001\u0000\u0000\u0000\u000e\u00bf"+
		"\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000\u0000\u0000\u0012\u00db"+
		"\u0001\u0000\u0000\u0000\u0014\u00dd\u0001\u0000\u0000\u0000\u0016\u00e0"+
		"\u0001\u0000\u0000\u0000\u0018\u00eb\u0001\u0000\u0000\u0000\u001a\u010c"+
		"\u0001\u0000\u0000\u0000\u001c\u0122\u0001\u0000\u0000\u0000\u001e\u0124"+
		"\u0001\u0000\u0000\u0000 \u0128\u0001\u0000\u0000\u0000\"\u0135\u0001"+
		"\u0000\u0000\u0000$\u013e\u0001\u0000\u0000\u0000&\u0146\u0001\u0000\u0000"+
		"\u0000(\u0163\u0001\u0000\u0000\u0000*\u0165\u0001\u0000\u0000\u0000,"+
		"\u016a\u0001\u0000\u0000\u0000.\u0187\u0001\u0000\u0000\u00000\u01a4\u0001"+
		"\u0000\u0000\u00002\u01bd\u0001\u0000\u0000\u00004\u01c9\u0001\u0000\u0000"+
		"\u00006\u01e2\u0001\u0000\u0000\u00008\u01e4\u0001\u0000\u0000\u0000:"+
		"\u01e9\u0001\u0000\u0000\u0000<\u01ee\u0001\u0000\u0000\u0000>\u01f6\u0001"+
		"\u0000\u0000\u0000@\u01fa\u0001\u0000\u0000\u0000B\u01fe\u0001\u0000\u0000"+
		"\u0000D\u0209\u0001\u0000\u0000\u0000F\u020d\u0001\u0000\u0000\u0000H"+
		"J\u0003\b\u0004\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LP\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000NQ\u0003$\u0012\u0000OQ\u0003\"\u0011"+
		"\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\\\u0001\u0000"+
		"\u0000\u0000R[\u0003\f\u0006\u0000S[\u0003\u000e\u0007\u0000T[\u0003\u0010"+
		"\b\u0000U[\u0003\u0004\u0002\u0000V[\u0003 \u0010\u0000W[\u0003\u001a"+
		"\r\u0000X[\u0003\u0004\u0002\u0000Y[\u0003\u0002\u0001\u0000ZR\u0001\u0000"+
		"\u0000\u0000ZS\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000ZU\u0001"+
		"\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0003\u0016\u000b\u0000`a\u0005"+
		"\'\u0000\u0000ab\u0003\u0014\n\u0000b\u0001\u0001\u0000\u0000\u0000cd"+
		"\u0005\u0002\u0000\u0000de\u0003\u001c\u000e\u0000ef\u0005\u001f\u0000"+
		"\u0000fg\u0005\u0004\u0000\u0000gh\u0005$\u0000\u0000hi\u0005@\u0000\u0000"+
		"im\u0005%\u0000\u0000jl\u0005\u001d\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u0003\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0003\u0000\u0000qt\u0005$\u0000\u0000ru\u0003$\u0012\u0000su\u0003\""+
		"\u0011\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000uy\u0001"+
		"\u0000\u0000\u0000vx\u0003\u0006\u0003\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\'\u0000"+
		"\u0000}~\u00056\u0000\u0000~\u0082\u0005(\u0000\u0000\u007f\u0081\u0007"+
		"\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005)\u0000\u0000\u0086\u008a\u0005%\u0000"+
		"\u0000\u0087\u0089\u0005\u001d\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0005\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0001\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u001d\u0000\u0000\u0094\u0007\u0001\u0000\u0000"+
		"\u0000\u0095\u00a3\u0005\b\u0000\u0000\u0096\u0098\u0005&\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u009c\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0002\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0005\'\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0005\u0007\u0000\u0000\u00a3\u0097\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a9\u0003\n\u0005\u0000\u00a6\u00a8\u0005\u001d\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\t\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007"+
		"\u0003\u0000\u0000\u00ad\u000b\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"@\u0000\u0000\u00af\u00b6\u0005\u001f\u0000\u0000\u00b0\u00b2\u0007\u0004"+
		"\u0000\u0000\u00b1\u00b3\u0007\u0005\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bc\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0005\u001d\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\r\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u000b\u0000"+
		"\u0000\u00c0\u00c3\u0005@\u0000\u0000\u00c1\u00c2\u0005\u001f\u0000\u0000"+
		"\u00c2\u00c4\u0003\u0012\t\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c8\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c7\u0005\u001d\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u000f\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d0\u0005\r\u0000\u0000\u00cc\u00ce"+
		"\u0007\u0006\u0000\u0000\u00cd\u00cf\u00052\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0005"+
		"%\u0000\u0000\u00d5\u00d7\u0005\u001d\u0000\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u0011\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0007\u0007"+
		"\u0000\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\t\u0000"+
		"\u0000\u00de\u00df\u0005@\u0000\u0000\u00df\u0015\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0005\u0010\u0000\u0000\u00e1\u00e4\u0003&\u0013\u0000\u00e2"+
		"\u00e4\u0003\u0018\f\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e8\u0001\u0000\u0000\u0000\u00e5\u00e7"+
		"\u0005\u001d\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0005\u0000\u0000\u00ec\u00ed"+
		"\u0005$\u0000\u0000\u00ed\u00ee\u0007\b\u0000\u0000\u00ee\u00ef\u0005"+
		"6\u0000\u0000\u00ef\u00f3\u0005&\u0000\u0000\u00f0\u00f2\u00036\u001b"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f6\u0103\u0005\'\u0000\u0000\u00f7\u0101\u00056\u0000\u0000"+
		"\u00f8\u0102\u0003\u0018\f\u0000\u00f9\u00fd\u0005?\u0000\u0000\u00fa"+
		"\u00fc\u0005@\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u0005?\u0000\u0000\u0101\u00f8\u0001"+
		"\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0102\u0104\u0001"+
		"\u0000\u0000\u0000\u0103\u00f7\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0109\u0005"+
		"%\u0000\u0000\u0106\u0108\u0005\u001d\u0000\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0019\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0002"+
		"\u0000\u0000\u010d\u010e\u0005(\u0000\u0000\u010e\u010f\u0003\u001c\u000e"+
		"\u0000\u010f\u0110\u00056\u0000\u0000\u0110\u0111\u0003\u001e\u000f\u0000"+
		"\u0111\u0112\u0005)\u0000\u0000\u0112\u0113\u0005\u001f\u0000\u0000\u0113"+
		"\u0114\u0005\n\u0000\u0000\u0114\u0118\u0005$\u0000\u0000\u0115\u0117"+
		"\u0007\t\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u011f\u0005%\u0000\u0000\u011c\u011e\u0005\u001d"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u001b\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005@\u0000\u0000\u0123\u001d\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005@\u0000\u0000\u0125\u001f\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0003\"\u0011\u0000\u0127\u0129\u0003$\u0012\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012f\u0001\u0000\u0000\u0000\u012a\u012e\u0003\u0010\b\u0000\u012b\u012e"+
		"\u0003\u000e\u0007\u0000\u012c\u012e\u0003\f\u0006\u0000\u012d\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0003"+
		"\u0016\u000b\u0000\u0133\u0134\u0005\'\u0000\u0000\u0134!\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005\u0006\u0000\u0000\u0136\u0137\u0005@\u0000"+
		"\u0000\u0137\u0138\u0005$\u0000\u0000\u0138\u0139\u0005%\u0000\u0000\u0139"+
		"\u013a\u0005&\u0000\u0000\u013a#\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		"\u0002\u0000\u0000\u013c\u013d\u0005@\u0000\u0000\u013d\u013f\u0005\u001f"+
		"\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0005$\u0000"+
		"\u0000\u0141\u0142\u0005%\u0000\u0000\u0142\u0143\u0005\u001f\u0000\u0000"+
		"\u0143\u0144\u0005,\u0000\u0000\u0144\u0145\u0005&\u0000\u0000\u0145%"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0005$\u0000\u0000\u0147\u0148\u0005"+
		"+\u0000\u0000\u0148\u014c\u0005\u0011\u0000\u0000\u0149\u014b\u00036\u001b"+
		"\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005,\u0000\u0000\u0150\u0151\u0003(\u0014\u0000\u0151"+
		"\u0152\u0005+\u0000\u0000\u0152\u0153\u0005!\u0000\u0000\u0153\u0154\u0005"+
		"\u0011\u0000\u0000\u0154\u0155\u0005,\u0000\u0000\u0155\u0156\u0005%\u0000"+
		"\u0000\u0156\'\u0001\u0000\u0000\u0000\u0157\u015e\u0003,\u0016\u0000"+
		"\u0158\u015e\u00034\u001a\u0000\u0159\u015e\u0003.\u0017\u0000\u015a\u015e"+
		"\u00032\u0019\u0000\u015b\u015e\u00030\u0018\u0000\u015c\u015e\u0003D"+
		"\"\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000\u0000"+
		"\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0164\u0001\u0000\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u0003*\u0015\u0000"+
		"\u0163\u015f\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0164)\u0001\u0000\u0000\u0000\u0165\u0166\u0005+\u0000\u0000\u0166\u0167"+
		"\u0005@\u0000\u0000\u0167\u0168\u0005!\u0000\u0000\u0168\u0169\u0005,"+
		"\u0000\u0000\u0169+\u0001\u0000\u0000\u0000\u016a\u016b\u0005+\u0000\u0000"+
		"\u016b\u016f\u0005\u0011\u0000\u0000\u016c\u016e\u00036\u001b\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0180\u0005,\u0000\u0000\u0173\u0181\u0003(\u0014\u0000\u0174\u0176\u0005"+
		"@\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0181\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0005B\u0000\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0173\u0001\u0000\u0000"+
		"\u0000\u0180\u0177\u0001\u0000\u0000\u0000\u0180\u017d\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005+\u0000\u0000"+
		"\u0183\u0184\u0005!\u0000\u0000\u0184\u0185\u0005\u0011\u0000\u0000\u0185"+
		"\u0186\u0005,\u0000\u0000\u0186-\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"+\u0000\u0000\u0188\u018c\u0005\u0012\u0000\u0000\u0189\u018b\u00036\u001b"+
		"\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u019d\u0005,\u0000\u0000\u0190\u019e\u0003(\u0014\u0000\u0191"+
		"\u0193\u0005@\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u019e\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u0199\u0005B\u0000\u0000\u0198\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u0190\u0001"+
		"\u0000\u0000\u0000\u019d\u0194\u0001\u0000\u0000\u0000\u019d\u019a\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"+\u0000\u0000\u01a0\u01a1\u0005!\u0000\u0000\u01a1\u01a2\u0005\u0012\u0000"+
		"\u0000\u01a2\u01a3\u0005,\u0000\u0000\u01a3/\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0005+\u0000\u0000\u01a5\u01a9\u0005\u0014\u0000\u0000\u01a6\u01a8"+
		"\u00036\u001b\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01b6\u0005,\u0000\u0000\u01ad\u01b7\u0003(\u0014"+
		"\u0000\u01ae\u01b2\u0003D\"\u0000\u01af\u01b2\u0005@\u0000\u0000\u01b0"+
		"\u01b2\u0005B\u0000\u0000\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b6\u01ad\u0001\u0000\u0000\u0000\u01b6\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0005+\u0000\u0000\u01b9\u01ba\u0005!\u0000\u0000\u01ba\u01bb\u0005\u0014"+
		"\u0000\u0000\u01bb\u01bc\u0005,\u0000\u0000\u01bc1\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0005+\u0000\u0000\u01be\u01bf\u0005\u0013\u0000\u0000\u01bf"+
		"\u01c3\u0003<\u001e\u0000\u01c0\u01c2\u00036\u001b\u0000\u01c1\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"!\u0000\u0000\u01c7\u01c8\u0005,\u0000\u0000\u01c83\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0005+\u0000\u0000\u01ca\u01ce\u0005\u0015\u0000\u0000"+
		"\u01cb\u01cd\u00036\u001b\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd"+
		"\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d5\u0005,\u0000\u0000\u01d2\u01d4"+
		"\u0007\n\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0005+\u0000\u0000\u01d9\u01da\u0005!\u0000"+
		"\u0000\u01da\u01db\u0005\u0015\u0000\u0000\u01db\u01dc\u0005,\u0000\u0000"+
		"\u01dc5\u0001\u0000\u0000\u0000\u01dd\u01e3\u00038\u001c\u0000\u01de\u01e3"+
		"\u0003:\u001d\u0000\u01df\u01e3\u0003B!\u0000\u01e0\u01e3\u0003>\u001f"+
		"\u0000\u01e1\u01e3\u0003@ \u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01de\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"7\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0016\u0000\u0000\u01e5\u01e6"+
		"\u0005\u001f\u0000\u0000\u01e6\u01e7\u0005B\u0000\u0000\u01e7\u01e8\u0007"+
		"\u000b\u0000\u0000\u01e89\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\u0017"+
		"\u0000\u0000\u01ea\u01eb\u0005\u001f\u0000\u0000\u01eb\u01ec\u0005B\u0000"+
		"\u0000\u01ec\u01ed\u0007\u000b\u0000\u0000\u01ed;\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0005\u001a\u0000\u0000\u01ef\u01f4\u0005\u001f\u0000\u0000"+
		"\u01f0\u01f5\u0005:\u0000\u0000\u01f1\u01f2\u0005&\u0000\u0000\u01f2\u01f3"+
		"\u0005@\u0000\u0000\u01f3\u01f5\u0005\'\u0000\u0000\u01f4\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f1\u0001\u0000\u0000\u0000\u01f5=\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0005\u000e\u0000\u0000\u01f7\u01f8\u0005\u001f"+
		"\u0000\u0000\u01f8\u01f9\u0005;\u0000\u0000\u01f9?\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0005\u000f\u0000\u0000\u01fb\u01fc\u0005\u001f\u0000\u0000"+
		"\u01fc\u01fd\u0003D\"\u0000\u01fdA\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0005\u001b\u0000\u0000\u01ff\u0200\u0005\u001f\u0000\u0000\u0200\u0204"+
		"\u0005&\u0000\u0000\u0201\u0203\u0003F#\u0000\u0202\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000"+
		"\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0005\'\u0000"+
		"\u0000\u0208C\u0001\u0000\u0000\u0000\u0209\u020a\u0005&\u0000\u0000\u020a"+
		"\u020b\u0007\n\u0000\u0000\u020b\u020c\u0005\'\u0000\u0000\u020cE\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0005$\u0000\u0000\u020e\u020f\u0005%\u0000"+
		"\u0000\u020f\u0210\u0005\u001f\u0000\u0000\u0210\u0214\u0005,\u0000\u0000"+
		"\u0211\u0213\u0005@\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0217\u021b\u0005$\u0000\u0000\u0218\u021a"+
		"\u0007\f\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001"+
		"\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001"+
		"\u0000\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001"+
		"\u0000\u0000\u0000\u021e\u0222\u0005%\u0000\u0000\u021f\u0221\u0005\u001d"+
		"\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000"+
		"\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000"+
		"\u0000\u0000\u0223G\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000"+
		"\u0000=KPZ\\mty\u0082\u008a\u0090\u0097\u009c\u00a0\u00a3\u00a9\u00b2"+
		"\u00b6\u00bc\u00c3\u00c8\u00ce\u00d2\u00d8\u00e3\u00e8\u00f3\u00fd\u0101"+
		"\u0103\u0109\u0118\u011f\u0128\u012d\u012f\u013e\u014c\u015d\u015f\u0163"+
		"\u016f\u0177\u017d\u0180\u018c\u0194\u019a\u019d\u01a9\u01b1\u01b3\u01b6"+
		"\u01c3\u01ce\u01d5\u01e2\u01f4\u0204\u0214\u021b\u0222";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}