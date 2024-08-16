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
		EXP=9, Use_State=10, VarType=11, Bool=12, Console=13, Return=14, Div=15, 
		H1=16, Img=17, P=18, Width=19, Height=20, Pixl=21, Rate=22, Src=23, OnClick=24, 
		SEIMIE_QO=25, Space=26, Equal=27, DIGITS=28, Esc=29, Slash=30, Colon=31, 
		DColon=32, Quote=33, LParen=34, RParen=35, LBrack=36, RBrack=37, LBig=38, 
		RBig=39, RArrow=40, Lt=41, Gt=42, EE=43, NE=44, NOT=45, Question=46, Star=47, 
		Plus=48, PlusAssign=49, Underscore=50, Pipe=51, COMMA=52, Dot=53, Path=54, 
		One_Qoute_Term=55, Tow_Qoute_Term=56, Text=57, DQuote=58, ARRAY_STRING_VALUES=59, 
		LETTER=60, ARRAY_NUMERIC_VALUES=61;
	public static final int
		RULE_new_component = 0, RULE_useRef = 1, RULE_useEffect = 2, RULE_imp = 3, 
		RULE_link = 4, RULE_decl = 5, RULE_log = 6, RULE_value = 7, RULE_export = 8, 
		RULE_return_html = 9, RULE_pure = 10, RULE_useState = 11, RULE_var = 12, 
		RULE_fun = 13, RULE_component = 14, RULE_function = 15, RULE_arrow_function = 16, 
		RULE_html_tag = 17, RULE_tag = 18, RULE_div = 19, RULE_h1 = 20, RULE_p = 21, 
		RULE_img = 22, RULE_props = 23, RULE_width = 24, RULE_height = 25, RULE_src = 26, 
		RULE_onClick = 27, RULE_javaScriptValue = 28, RULE_callFunction = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"new_component", "useRef", "useEffect", "imp", "link", "decl", "log", 
			"value", "export", "return_html", "pure", "useState", "var", "fun", "component", 
			"function", "arrow_function", "html_tag", "tag", "div", "h1", "p", "img", 
			"props", "width", "height", "src", "onClick", "javaScriptValue", "callFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'useEffect'", "'use Ref'", "'React.createElement'", 
			null, null, null, null, "'useState'", null, null, "'console.log('", "'return'", 
			"'div'", "'h1'", "'img'", "'p'", null, null, "'px'", "'%'", null, null, 
			"';'", "' '", "'='", null, "'\\'", "'/'", "':'", "'::'", "'''", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'->'", "'<'", "'>'", "'=='", "'!='", 
			"'!'", "'?'", "'*'", "'+'", "'+='", "'_'", "'|'", "','", "'.'", null, 
			null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "Const", "UseEffect", "UseRef", "Create", "Function", "From", 
			"Imp", "EXP", "Use_State", "VarType", "Bool", "Console", "Return", "Div", 
			"H1", "Img", "P", "Width", "Height", "Pixl", "Rate", "Src", "OnClick", 
			"SEIMIE_QO", "Space", "Equal", "DIGITS", "Esc", "Slash", "Colon", "DColon", 
			"Quote", "LParen", "RParen", "LBrack", "RBrack", "LBig", "RBig", "RArrow", 
			"Lt", "Gt", "EE", "NE", "NOT", "Question", "Star", "Plus", "PlusAssign", 
			"Underscore", "Pipe", "COMMA", "Dot", "Path", "One_Qoute_Term", "Tow_Qoute_Term", 
			"Text", "DQuote", "ARRAY_STRING_VALUES", "LETTER", "ARRAY_NUMERIC_VALUES"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Imp) {
				{
				{
				setState(60);
				imp();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LParen:
				{
				setState(66);
				arrow_function();
				}
				break;
			case Function:
				{
				setState(67);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179879500L) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(70);
					decl();
					}
					break;
				case 2:
					{
					setState(71);
					log();
					}
					break;
				case 3:
					{
					setState(72);
					useEffect();
					}
					break;
				case 4:
					{
					setState(73);
					component();
					}
					break;
				case 5:
					{
					setState(74);
					useState();
					}
					break;
				case 6:
					{
					setState(75);
					useEffect();
					}
					break;
				case 7:
					{
					setState(76);
					useRef();
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			return_html();
			setState(83);
			match(RBrack);
			setState(84);
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
			setState(86);
			match(Const);
			setState(87);
			var();
			setState(88);
			match(Equal);
			setState(89);
			match(UseRef);
			setState(90);
			match(LParen);
			setState(91);
			match(ARRAY_STRING_VALUES);
			setState(92);
			match(RParen);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(93);
				match(SEIMIE_QO);
				}
				}
				setState(98);
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
		public List<TerminalNode> LParen() { return getTokens(MyLanguageParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(MyLanguageParser.LParen, i);
		}
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
		public TerminalNode LBig() { return getToken(MyLanguageParser.LBig, 0); }
		public TerminalNode RBig() { return getToken(MyLanguageParser.RBig, 0); }
		public List<TerminalNode> RParen() { return getTokens(MyLanguageParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(MyLanguageParser.RParen, i);
		}
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
		}
		public List<TerminalNode> ARRAY_STRING_VALUES() { return getTokens(MyLanguageParser.ARRAY_STRING_VALUES); }
		public TerminalNode ARRAY_STRING_VALUES(int i) {
			return getToken(MyLanguageParser.ARRAY_STRING_VALUES, i);
		}
		public List<TerminalNode> Dot() { return getTokens(MyLanguageParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(MyLanguageParser.Dot, i);
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
			setState(99);
			match(UseEffect);
			setState(100);
			match(LParen);
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LParen:
				{
				setState(101);
				arrow_function();
				}
				break;
			case Function:
				{
				setState(102);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 585468003131326464L) != 0)) {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 585468003131326464L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RBrack);
			setState(112);
			match(COMMA);
			setState(113);
			match(LBig);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==ARRAY_STRING_VALUES) {
				{
				{
				setState(114);
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
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RBig);
			setState(121);
			match(RParen);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(122);
				match(SEIMIE_QO);
				}
				}
				setState(127);
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
	public static class ImpContext extends ParserRuleContext {
		public TerminalNode Imp() { return getToken(MyLanguageParser.Imp, 0); }
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode From() { return getToken(MyLanguageParser.From, 0); }
		public List<TerminalNode> SEIMIE_QO() { return getTokens(MyLanguageParser.SEIMIE_QO); }
		public TerminalNode SEIMIE_QO(int i) {
			return getToken(MyLanguageParser.SEIMIE_QO, i);
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
		enterRule(_localctx, 6, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Imp);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_STRING_VALUES) {
				{
				setState(129);
				match(ARRAY_STRING_VALUES);
				setState(130);
				match(From);
				}
			}

			setState(133);
			link();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(134);
				match(SEIMIE_QO);
				}
				}
				setState(139);
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
		enterRule(_localctx, 8, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 10, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(VarType);
			setState(143);
			match(ARRAY_STRING_VALUES);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(144);
				match(Equal);
				setState(145);
				value();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(148);
				match(SEIMIE_QO);
				}
				}
				setState(153);
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
		enterRule(_localctx, 12, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Console);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==Text || _la==ARRAY_STRING_VALUES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus) {
					{
					setState(156);
					match(Plus);
					}
				}

				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Text || _la==ARRAY_STRING_VALUES );
			setState(163);
			match(RParen);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(164);
				match(SEIMIE_QO);
				}
				}
				setState(169);
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
		public TerminalNode DIGITS() { return getToken(MyLanguageParser.DIGITS, 0); }
		public TerminalNode One_Qoute_Term() { return getToken(MyLanguageParser.One_Qoute_Term, 0); }
		public TerminalNode Tow_Qoute_Term() { return getToken(MyLanguageParser.Tow_Qoute_Term, 0); }
		public TerminalNode Bool() { return getToken(MyLanguageParser.Bool, 0); }
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
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Text:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(Text);
				}
				break;
			case DIGITS:
			case ARRAY_NUMERIC_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==DIGITS || _la==ARRAY_NUMERIC_VALUES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case One_Qoute_Term:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(One_Qoute_Term);
				}
				break;
			case Tow_Qoute_Term:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(Tow_Qoute_Term);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(Bool);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 16, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(EXP);
			setState(178);
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
		enterRule(_localctx, 18, RULE_return_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Return);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				{
				setState(181);
				html_tag();
				}
				break;
			case Create:
				{
				setState(182);
				pure();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 20, RULE_pure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(Create);
			setState(192);
			match(LParen);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==One_Qoute_Term || _la==ARRAY_STRING_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(COMMA);
			setState(195);
			match(LBrack);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18350080L) != 0)) {
				{
				{
				setState(196);
				props();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(RBrack);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(203);
				match(COMMA);
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Create:
					{
					setState(204);
					pure();
					}
					break;
				case DQuote:
					{
					setState(205);
					match(DQuote);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ARRAY_STRING_VALUES) {
						{
						{
						setState(206);
						match(ARRAY_STRING_VALUES);
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(212);
					match(DQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(217);
			match(RParen);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(SEIMIE_QO);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 22, RULE_useState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Const);
			setState(225);
			match(LBig);
			setState(226);
			var();
			setState(227);
			match(COMMA);
			setState(228);
			fun();
			setState(229);
			match(RBig);
			setState(230);
			match(Equal);
			setState(231);
			match(Use_State);
			setState(232);
			match(LParen);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) {
				{
				{
				setState(233);
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
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(RParen);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(240);
				match(SEIMIE_QO);
				}
				}
				setState(245);
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
		enterRule(_localctx, 24, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 26, RULE_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 28, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				setState(250);
				function();
				}
				break;
			case Const:
			case LParen:
				{
				setState(251);
				arrow_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VarType || _la==Console) {
				{
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Console:
					{
					setState(254);
					log();
					}
					break;
				case VarType:
					{
					setState(255);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			return_html();
			setState(262);
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
		enterRule(_localctx, 30, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(Function);
			setState(265);
			match(ARRAY_STRING_VALUES);
			setState(266);
			match(LParen);
			setState(267);
			match(RParen);
			setState(268);
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
		enterRule(_localctx, 32, RULE_arrow_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(270);
				match(Const);
				setState(271);
				match(ARRAY_STRING_VALUES);
				setState(272);
				match(Equal);
				}
			}

			setState(275);
			match(LParen);
			setState(276);
			match(RParen);
			setState(277);
			match(Equal);
			setState(278);
			match(Gt);
			setState(279);
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
		enterRule(_localctx, 34, RULE_html_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LParen);
			setState(282);
			match(Lt);
			setState(283);
			match(Div);
			setState(284);
			match(Gt);
			setState(285);
			tag();
			setState(286);
			match(Lt);
			setState(287);
			match(Slash);
			setState(288);
			match(Div);
			setState(289);
			match(Gt);
			setState(290);
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
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
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
		enterRule(_localctx, 36, RULE_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(292);
						div();
						}
						break;
					case 2:
						{
						setState(293);
						h1();
						}
						break;
					case 3:
						{
						setState(294);
						img();
						}
						break;
					case 4:
						{
						setState(295);
						p();
						}
						break;
					case 5:
						{
						setState(296);
						javaScriptValue();
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 38, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Lt);
			setState(303);
			match(Div);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18350080L) != 0)) {
				{
				{
				setState(304);
				props();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(Gt);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(311);
				tag();
				}
				break;
			case 2:
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(312);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(318);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(326);
			match(Lt);
			setState(327);
			match(Slash);
			setState(328);
			match(Div);
			setState(329);
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
		enterRule(_localctx, 40, RULE_h1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(Lt);
			setState(332);
			match(H1);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18350080L) != 0)) {
				{
				{
				setState(333);
				props();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(Gt);
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(340);
				tag();
				}
				break;
			case 2:
				{
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(341);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(347);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(355);
			match(Lt);
			setState(356);
			match(Slash);
			setState(357);
			match(H1);
			setState(358);
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
		enterRule(_localctx, 42, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(Lt);
			setState(361);
			match(P);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18350080L) != 0)) {
				{
				{
				setState(362);
				props();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(Gt);
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(369);
				tag();
				}
				break;
			case 2:
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(370);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(376);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(384);
			match(Lt);
			setState(385);
			match(Slash);
			setState(386);
			match(P);
			setState(387);
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
		enterRule(_localctx, 44, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(Lt);
			setState(390);
			match(Img);
			setState(391);
			src();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18350080L) != 0)) {
				{
				{
				setState(392);
				props();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(Slash);
			setState(399);
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
		enterRule(_localctx, 46, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Width:
				{
				setState(401);
				width();
				}
				break;
			case Height:
				{
				setState(402);
				height();
				}
				break;
			case OnClick:
				{
				setState(403);
				onClick();
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
		enterRule(_localctx, 48, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(Width);
			setState(407);
			match(Equal);
			setState(408);
			match(ARRAY_NUMERIC_VALUES);
			setState(409);
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
		enterRule(_localctx, 50, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(Height);
			setState(412);
			match(Equal);
			setState(413);
			match(ARRAY_NUMERIC_VALUES);
			setState(414);
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
		enterRule(_localctx, 52, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(Src);
			setState(417);
			match(Equal);
			setState(418);
			match(LBrack);
			setState(419);
			match(ARRAY_STRING_VALUES);
			setState(420);
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
		enterRule(_localctx, 54, RULE_onClick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OnClick);
			setState(423);
			match(Equal);
			setState(424);
			match(LBrack);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LParen || _la==ARRAY_STRING_VALUES) {
				{
				{
				setState(425);
				callFunction();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
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
		enterRule(_localctx, 56, RULE_javaScriptValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(LBrack);
			setState(434);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(435);
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
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
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
		enterRule(_localctx, 58, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES) {
				{
				{
				setState(437);
				match(ARRAY_STRING_VALUES);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(LParen);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(444);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(450);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(458);
			match(RParen);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(459);
				match(SEIMIE_QO);
				}
				}
				setState(464);
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
		"\u0004\u0001=\u01d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"E\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001_\b\u0001\n\u0001\f\u0001b\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0005\u0002"+
		"k\b\u0002\n\u0002\f\u0002n\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002t\b\u0002\n\u0002\f\u0002w\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002|\b\u0002\n\u0002\f\u0002\u007f\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0088\b\u0003\n\u0003\f\u0003\u008b\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0093\b\u0005\u0001\u0005\u0005\u0005\u0096\b\u0005\n\u0005"+
		"\f\u0005\u0099\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u009e\b\u0006\u0004\u0006\u00a0\b\u0006\u000b\u0006\f\u0006\u00a1\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00a6\b\u0006\n\u0006\f\u0006\u00a9\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00b8\b\t\u0001\t\u0005\t\u00bb\b\t\n\t\f\t\u00be\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c6\b\n\n\n\f\n\u00c9\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d0\b\n\n\n\f\n\u00d3\t\n"+
		"\u0001\n\u0003\n\u00d6\b\n\u0003\n\u00d8\b\n\u0001\n\u0001\n\u0005\n\u00dc"+
		"\b\n\n\n\f\n\u00df\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00eb\b\u000b\n\u000b\f\u000b\u00ee\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00f2\b\u000b\n\u000b\f\u000b\u00f5\t\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u00fd\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0101\b\u000e\n\u000e\f\u000e\u0104"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0112\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u012a\b\u0012\n\u0012\f\u0012\u012d\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0132\b\u0013\n\u0013\f\u0013\u0135"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u013a\b\u0013"+
		"\n\u0013\f\u0013\u013d\t\u0013\u0001\u0013\u0005\u0013\u0140\b\u0013\n"+
		"\u0013\f\u0013\u0143\t\u0013\u0003\u0013\u0145\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u014f\b\u0014\n\u0014\f\u0014\u0152\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0157\b\u0014\n\u0014\f\u0014\u015a"+
		"\t\u0014\u0001\u0014\u0005\u0014\u015d\b\u0014\n\u0014\f\u0014\u0160\t"+
		"\u0014\u0003\u0014\u0162\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u016c"+
		"\b\u0015\n\u0015\f\u0015\u016f\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0174\b\u0015\n\u0015\f\u0015\u0177\t\u0015\u0001\u0015\u0005"+
		"\u0015\u017a\b\u0015\n\u0015\f\u0015\u017d\t\u0015\u0003\u0015\u017f\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u018a\b\u0016\n"+
		"\u0016\f\u0016\u018d\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0195\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01ab\b\u001b\n\u001b\f\u001b\u01ae\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0005\u001d\u01b7\b\u001d\n\u001d\f\u001d\u01ba\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u01be\b\u001d\n\u001d\f\u001d\u01c1\t\u001d\u0001\u001d"+
		"\u0005\u001d\u01c4\b\u001d\n\u001d\f\u001d\u01c7\t\u001d\u0003\u001d\u01c9"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01cd\b\u001d\n\u001d\f\u001d"+
		"\u01d0\t\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:\u0000\b\u0004\u0000\u0019\u0019\"#55;;\u0002\u000044;;\u0001\u0000"+
		"67\u0002\u000099;;\u0002\u0000\u001c\u001c==\u0002\u000077;;\u0002\u0000"+
		";;==\u0001\u0000\u0015\u0016\u01f6\u0000?\u0001\u0000\u0000\u0000\u0002"+
		"V\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000\u0000\u0006\u0080\u0001"+
		"\u0000\u0000\u0000\b\u008c\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000"+
		"\u0000\u0000\f\u009a\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000"+
		"\u0000\u0010\u00b1\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000\u0000"+
		"\u0000\u0014\u00bf\u0001\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000"+
		"\u0000\u0018\u00f6\u0001\u0000\u0000\u0000\u001a\u00f8\u0001\u0000\u0000"+
		"\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e\u0108\u0001\u0000\u0000"+
		"\u0000 \u0111\u0001\u0000\u0000\u0000\"\u0119\u0001\u0000\u0000\u0000"+
		"$\u012b\u0001\u0000\u0000\u0000&\u012e\u0001\u0000\u0000\u0000(\u014b"+
		"\u0001\u0000\u0000\u0000*\u0168\u0001\u0000\u0000\u0000,\u0185\u0001\u0000"+
		"\u0000\u0000.\u0194\u0001\u0000\u0000\u00000\u0196\u0001\u0000\u0000\u0000"+
		"2\u019b\u0001\u0000\u0000\u00004\u01a0\u0001\u0000\u0000\u00006\u01a6"+
		"\u0001\u0000\u0000\u00008\u01b1\u0001\u0000\u0000\u0000:\u01b8\u0001\u0000"+
		"\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@D\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0003 \u0010\u0000"+
		"CE\u0003\u001e\u000f\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EO\u0001\u0000\u0000\u0000FN\u0003\n\u0005\u0000GN\u0003\f\u0006"+
		"\u0000HN\u0003\u0004\u0002\u0000IN\u0003\u001c\u000e\u0000JN\u0003\u0016"+
		"\u000b\u0000KN\u0003\u0004\u0002\u0000LN\u0003\u0002\u0001\u0000MF\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000"+
		"MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0003\u0012\t\u0000ST\u0005%\u0000\u0000TU\u0003"+
		"\u0010\b\u0000U\u0001\u0001\u0000\u0000\u0000VW\u0005\u0002\u0000\u0000"+
		"WX\u0003\u0018\f\u0000XY\u0005\u001b\u0000\u0000YZ\u0005\u0004\u0000\u0000"+
		"Z[\u0005\"\u0000\u0000[\\\u0005;\u0000\u0000\\`\u0005#\u0000\u0000]_\u0005"+
		"\u0019\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0003\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\u0003\u0000\u0000dg\u0005"+
		"\"\u0000\u0000eh\u0003 \u0010\u0000fh\u0003\u001e\u000f\u0000ge\u0001"+
		"\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000hl\u0001\u0000\u0000\u0000"+
		"ik\u0007\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005%\u0000\u0000pq\u00054\u0000"+
		"\u0000qu\u0005&\u0000\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005"+
		"\'\u0000\u0000y}\u0005#\u0000\u0000z|\u0005\u0019\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0005\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0083\u0005\b\u0000\u0000\u0081\u0082"+
		"\u0005;\u0000\u0000\u0082\u0084\u0005\u0007\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0089\u0003\b\u0004\u0000\u0086\u0088\u0005\u0019"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0007\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0007\u0002\u0000\u0000\u008d\t\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0092\u0005;\u0000\u0000"+
		"\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0093\u0003\u000e\u0007\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0097\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u0019\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u009a\u009f\u0005\r\u0000\u0000\u009b\u009d\u0007\u0003\u0000\u0000\u009c"+
		"\u009e\u00050\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009b"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a7\u0005#\u0000\u0000\u00a4\u00a6\u0005"+
		"\u0019\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\r\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00b0\u00059\u0000\u0000\u00ab\u00b0\u0007\u0004\u0000"+
		"\u0000\u00ac\u00b0\u00057\u0000\u0000\u00ad\u00b0\u00058\u0000\u0000\u00ae"+
		"\u00b0\u0005\f\u0000\u0000\u00af\u00aa\u0001\u0000\u0000\u0000\u00af\u00ab"+
		"\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u000f"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\t\u0000\u0000\u00b2\u00b3\u0005"+
		";\u0000\u0000\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b7\u0005\u000e"+
		"\u0000\u0000\u00b5\u00b8\u0003\"\u0011\u0000\u00b6\u00b8\u0003\u0014\n"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0019\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c1\u0005\"\u0000\u0000"+
		"\u00c1\u00c2\u0007\u0005\u0000\u0000\u00c2\u00c3\u00054\u0000\u0000\u00c3"+
		"\u00c7\u0005$\u0000\u0000\u00c4\u00c6\u0003.\u0017\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00d7\u0005"+
		"%\u0000\u0000\u00cb\u00d5\u00054\u0000\u0000\u00cc\u00d6\u0003\u0014\n"+
		"\u0000\u00cd\u00d1\u0005:\u0000\u0000\u00ce\u00d0\u0005;\u0000\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0005:\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dd\u0005#\u0000\u0000\u00da\u00dc\u0005"+
		"\u0019\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005\u0002\u0000\u0000\u00e1\u00e2\u0005"+
		"&\u0000\u0000\u00e2\u00e3\u0003\u0018\f\u0000\u00e3\u00e4\u00054\u0000"+
		"\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e6\u0005\'\u0000\u0000"+
		"\u00e6\u00e7\u0005\u001b\u0000\u0000\u00e7\u00e8\u0005\n\u0000\u0000\u00e8"+
		"\u00ec\u0005\"\u0000\u0000\u00e9\u00eb\u0007\u0006\u0000\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f3"+
		"\u0005#\u0000\u0000\u00f0\u00f2\u0005\u0019\u0000\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u0017\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		";\u0000\u0000\u00f7\u0019\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005;\u0000"+
		"\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003\u001e\u000f"+
		"\u0000\u00fb\u00fd\u0003 \u0010\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0102\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0003\f\u0006\u0000\u00ff\u0101\u0003\n\u0005\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u0012\t\u0000\u0106\u0107"+
		"\u0005%\u0000\u0000\u0107\u001d\u0001\u0000\u0000\u0000\u0108\u0109\u0005"+
		"\u0006\u0000\u0000\u0109\u010a\u0005;\u0000\u0000\u010a\u010b\u0005\""+
		"\u0000\u0000\u010b\u010c\u0005#\u0000\u0000\u010c\u010d\u0005$\u0000\u0000"+
		"\u010d\u001f\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0002\u0000\u0000"+
		"\u010f\u0110\u0005;\u0000\u0000\u0110\u0112\u0005\u001b\u0000\u0000\u0111"+
		"\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005\"\u0000\u0000\u0114\u0115"+
		"\u0005#\u0000\u0000\u0115\u0116\u0005\u001b\u0000\u0000\u0116\u0117\u0005"+
		"*\u0000\u0000\u0117\u0118\u0005$\u0000\u0000\u0118!\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\"\u0000\u0000\u011a\u011b\u0005)\u0000\u0000"+
		"\u011b\u011c\u0005\u000f\u0000\u0000\u011c\u011d\u0005*\u0000\u0000\u011d"+
		"\u011e\u0003$\u0012\u0000\u011e\u011f\u0005)\u0000\u0000\u011f\u0120\u0005"+
		"\u001e\u0000\u0000\u0120\u0121\u0005\u000f\u0000\u0000\u0121\u0122\u0005"+
		"*\u0000\u0000\u0122\u0123\u0005#\u0000\u0000\u0123#\u0001\u0000\u0000"+
		"\u0000\u0124\u012a\u0003&\u0013\u0000\u0125\u012a\u0003(\u0014\u0000\u0126"+
		"\u012a\u0003,\u0016\u0000\u0127\u012a\u0003*\u0015\u0000\u0128\u012a\u0003"+
		"8\u001c\u0000\u0129\u0124\u0001\u0000\u0000\u0000\u0129\u0125\u0001\u0000"+
		"\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000"+
		"\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c%\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005)\u0000\u0000\u012f\u0133\u0005\u000f\u0000\u0000"+
		"\u0130\u0132\u0003.\u0017\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0144\u0005*\u0000\u0000\u0137\u0145"+
		"\u0003$\u0012\u0000\u0138\u013a\u0005;\u0000\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0145\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0140\u0005=\u0000"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144\u0137\u0001\u0000\u0000\u0000\u0144\u013b\u0001\u0000\u0000"+
		"\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005)\u0000\u0000\u0147\u0148\u0005\u001e\u0000\u0000"+
		"\u0148\u0149\u0005\u000f\u0000\u0000\u0149\u014a\u0005*\u0000\u0000\u014a"+
		"\'\u0001\u0000\u0000\u0000\u014b\u014c\u0005)\u0000\u0000\u014c\u0150"+
		"\u0005\u0010\u0000\u0000\u014d\u014f\u0003.\u0017\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001"+
		"\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0161\u0005"+
		"*\u0000\u0000\u0154\u0162\u0003$\u0012\u0000\u0155\u0157\u0005;\u0000"+
		"\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u0162\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015d\u0005=\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0154\u0001\u0000\u0000\u0000"+
		"\u0161\u0158\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0005)\u0000\u0000\u0164"+
		"\u0165\u0005\u001e\u0000\u0000\u0165\u0166\u0005\u0010\u0000\u0000\u0166"+
		"\u0167\u0005*\u0000\u0000\u0167)\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		")\u0000\u0000\u0169\u016d\u0005\u0012\u0000\u0000\u016a\u016c\u0003.\u0017"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u0170\u017e\u0005*\u0000\u0000\u0171\u017f\u0003$\u0012\u0000\u0172"+
		"\u0174\u0005;\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u017f\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u017a\u0005=\u0000\u0000\u0179\u0178\u0001"+
		"\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017f\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0171\u0001"+
		"\u0000\u0000\u0000\u017e\u0175\u0001\u0000\u0000\u0000\u017e\u017b\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		")\u0000\u0000\u0181\u0182\u0005\u001e\u0000\u0000\u0182\u0183\u0005\u0012"+
		"\u0000\u0000\u0183\u0184\u0005*\u0000\u0000\u0184+\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0005)\u0000\u0000\u0186\u0187\u0005\u0011\u0000\u0000\u0187"+
		"\u018b\u00034\u001a\u0000\u0188\u018a\u0003.\u0017\u0000\u0189\u0188\u0001"+
		"\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0001"+
		"\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"\u001e\u0000\u0000\u018f\u0190\u0005*\u0000\u0000\u0190-\u0001\u0000\u0000"+
		"\u0000\u0191\u0195\u00030\u0018\u0000\u0192\u0195\u00032\u0019\u0000\u0193"+
		"\u0195\u00036\u001b\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195/\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005\u0013\u0000\u0000\u0197\u0198\u0005"+
		"\u001b\u0000\u0000\u0198\u0199\u0005=\u0000\u0000\u0199\u019a\u0007\u0007"+
		"\u0000\u0000\u019a1\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0014\u0000"+
		"\u0000\u019c\u019d\u0005\u001b\u0000\u0000\u019d\u019e\u0005=\u0000\u0000"+
		"\u019e\u019f\u0007\u0007\u0000\u0000\u019f3\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005\u0017\u0000\u0000\u01a1\u01a2\u0005\u001b\u0000\u0000\u01a2"+
		"\u01a3\u0005$\u0000\u0000\u01a3\u01a4\u0005;\u0000\u0000\u01a4\u01a5\u0005"+
		"%\u0000\u0000\u01a55\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u0018\u0000"+
		"\u0000\u01a7\u01a8\u0005\u001b\u0000\u0000\u01a8\u01ac\u0005$\u0000\u0000"+
		"\u01a9\u01ab\u0003:\u001d\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0\u0005%\u0000\u0000\u01b07\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005$\u0000\u0000\u01b2\u01b3\u0007\u0006"+
		"\u0000\u0000\u01b3\u01b4\u0005%\u0000\u0000\u01b49\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0005;\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01bb\u01c8\u0005\"\u0000\u0000\u01bc\u01be"+
		"\u0005;\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c9\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0005=\u0000\u0000\u01c3\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01ca\u01ce\u0005#\u0000\u0000\u01cb\u01cd\u0005\u0019\u0000"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf;\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"4?DMO`glu}\u0083\u0089\u0092\u0097\u009d\u00a1\u00a7\u00af\u00b7\u00bc"+
		"\u00c7\u00d1\u00d5\u00d7\u00dd\u00ec\u00f3\u00fc\u0100\u0102\u0111\u0129"+
		"\u012b\u0133\u013b\u0141\u0144\u0150\u0158\u015e\u0161\u016d\u0175\u017b"+
		"\u017e\u018b\u0194\u01ac\u01b8\u01bf\u01c5\u01c8\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}