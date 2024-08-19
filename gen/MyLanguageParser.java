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
		H1=16, Img=17, P=18, Button=19, Width=20, Height=21, Pixl=22, Rate=23, 
		Src=24, OnClick=25, Minus=26, SEIMIE_QO=27, Space=28, Equal=29, Esc=30, 
		Slash=31, Colon=32, DColon=33, Quote=34, LParen=35, RParen=36, LBrack=37, 
		RBrack=38, LBig=39, RBig=40, RArrow=41, Lt=42, Gt=43, EE=44, NE=45, NOT=46, 
		Question=47, Star=48, Plus=49, PlusAssign=50, Underscore=51, Pipe=52, 
		COMMA=53, Dot=54, Math=55, Path=56, One_Qoute_Term=57, Tow_Qoute_Term=58, 
		Text=59, DQuote=60, ARRAY_STRING_VALUES=61, LETTER=62, ARRAY_NUMERIC_VALUES=63;
	public static final int
		RULE_new_component = 0, RULE_useRef = 1, RULE_useEffect = 2, RULE_imp = 3, 
		RULE_link = 4, RULE_assign = 5, RULE_decl = 6, RULE_log = 7, RULE_value = 8, 
		RULE_export = 9, RULE_return_html = 10, RULE_pure = 11, RULE_useState = 12, 
		RULE_var = 13, RULE_fun = 14, RULE_component = 15, RULE_function = 16, 
		RULE_arrow_function = 17, RULE_html_tag = 18, RULE_tag = 19, RULE_div = 20, 
		RULE_h1 = 21, RULE_p = 22, RULE_img = 23, RULE_button = 24, RULE_variable = 25, 
		RULE_props = 26, RULE_width = 27, RULE_height = 28, RULE_src = 29, RULE_onClick = 30, 
		RULE_javaScriptValue = 31, RULE_callFunction = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"new_component", "useRef", "useEffect", "imp", "link", "assign", "decl", 
			"log", "value", "export", "return_html", "pure", "useState", "var", "fun", 
			"component", "function", "arrow_function", "html_tag", "tag", "div", 
			"h1", "p", "img", "button", "variable", "props", "width", "height", "src", 
			"onClick", "javaScriptValue", "callFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'useEffect'", "'use Ref'", "'React.createElement'", 
			null, null, null, null, "'useState'", null, null, "'console.log('", "'return'", 
			"'div'", "'h1'", "'img'", "'p'", "'button'", null, null, "'px'", "'%'", 
			null, null, "'-'", "';'", "' '", "'='", "'\\'", "'/'", "':'", "'::'", 
			"'''", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<'", "'>'", 
			"'=='", "'!='", "'!'", "'?'", "'*'", "'+'", "'+='", "'_'", "'|'", "','", 
			"'.'", null, null, null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "Const", "UseEffect", "UseRef", "Create", "Function", "From", 
			"Imp", "EXP", "Use_State", "VarType", "Bool", "Console", "Return", "Div", 
			"H1", "Img", "P", "Button", "Width", "Height", "Pixl", "Rate", "Src", 
			"OnClick", "Minus", "SEIMIE_QO", "Space", "Equal", "Esc", "Slash", "Colon", 
			"DColon", "Quote", "LParen", "RParen", "LBrack", "RBrack", "LBig", "RBig", 
			"RArrow", "Lt", "Gt", "EE", "NE", "NOT", "Question", "Star", "Plus", 
			"PlusAssign", "Underscore", "Pipe", "COMMA", "Dot", "Math", "Path", "One_Qoute_Term", 
			"Tow_Qoute_Term", "Text", "DQuote", "ARRAY_STRING_VALUES", "LETTER", 
			"ARRAY_NUMERIC_VALUES"
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Imp) {
				{
				{
				setState(66);
				imp();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LParen:
				{
				setState(72);
				arrow_function();
				}
				break;
			case Function:
				{
				setState(73);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843043573442636L) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(76);
					assign();
					}
					break;
				case 2:
					{
					setState(77);
					decl();
					}
					break;
				case 3:
					{
					setState(78);
					log();
					}
					break;
				case 4:
					{
					setState(79);
					useEffect();
					}
					break;
				case 5:
					{
					setState(80);
					component();
					}
					break;
				case 6:
					{
					setState(81);
					useState();
					}
					break;
				case 7:
					{
					setState(82);
					useEffect();
					}
					break;
				case 8:
					{
					setState(83);
					useRef();
					}
					break;
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			return_html();
			setState(90);
			match(RBrack);
			setState(91);
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
			setState(93);
			match(Const);
			setState(94);
			var();
			setState(95);
			match(Equal);
			setState(96);
			match(UseRef);
			setState(97);
			match(LParen);
			setState(98);
			match(ARRAY_STRING_VALUES);
			setState(99);
			match(RParen);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(100);
				match(SEIMIE_QO);
				}
				}
				setState(105);
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
			setState(106);
			match(UseEffect);
			setState(107);
			match(LParen);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LParen:
				{
				setState(108);
				arrow_function();
				}
				break;
			case Function:
				{
				setState(109);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2323857510936608768L) != 0)) {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2323857510936608768L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(RBrack);
			setState(119);
			match(COMMA);
			setState(120);
			match(LBig);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==ARRAY_STRING_VALUES) {
				{
				{
				setState(121);
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
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(RBig);
			setState(128);
			match(RParen);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(129);
				match(SEIMIE_QO);
				}
				}
				setState(134);
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
			setState(135);
			match(Imp);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_STRING_VALUES) {
				{
				setState(136);
				match(ARRAY_STRING_VALUES);
				setState(137);
				match(From);
				}
			}

			setState(140);
			link();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(141);
				match(SEIMIE_QO);
				}
				}
				setState(146);
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
			setState(147);
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
		enterRule(_localctx, 10, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ARRAY_STRING_VALUES);
			setState(150);
			match(Equal);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -6341068275337658368L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 844427144724480L) != 0)) {
						{
						setState(152);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 844427144724480L) != 0)) ) {
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
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(160);
				match(SEIMIE_QO);
				}
				}
				setState(165);
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
		enterRule(_localctx, 12, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(VarType);
			setState(167);
			match(ARRAY_STRING_VALUES);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(168);
				match(Equal);
				setState(169);
				value();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(172);
				match(SEIMIE_QO);
				}
				}
				setState(177);
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
		enterRule(_localctx, 14, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Console);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==Text || _la==ARRAY_STRING_VALUES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus) {
					{
					setState(180);
					match(Plus);
					}
				}

				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Text || _la==ARRAY_STRING_VALUES );
			setState(187);
			match(RParen);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(188);
				match(SEIMIE_QO);
				}
				}
				setState(193);
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
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Text:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Text);
				}
				break;
			case ARRAY_NUMERIC_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(195);
				match(ARRAY_NUMERIC_VALUES);
				}
				}
				break;
			case One_Qoute_Term:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(One_Qoute_Term);
				}
				break;
			case Tow_Qoute_Term:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(Tow_Qoute_Term);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
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
		enterRule(_localctx, 18, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(EXP);
			setState(202);
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
		enterRule(_localctx, 20, RULE_return_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Return);
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				{
				setState(205);
				html_tag();
				}
				break;
			case Create:
				{
				setState(206);
				pure();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(209);
				match(SEIMIE_QO);
				}
				}
				setState(214);
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
		enterRule(_localctx, 22, RULE_pure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Create);
			setState(216);
			match(LParen);
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==One_Qoute_Term || _la==ARRAY_STRING_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			match(COMMA);
			setState(219);
			match(LBrack);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36700160L) != 0)) {
				{
				{
				setState(220);
				props();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(RBrack);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(227);
				match(COMMA);
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Create:
					{
					setState(228);
					pure();
					}
					break;
				case DQuote:
					{
					setState(229);
					match(DQuote);
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ARRAY_STRING_VALUES) {
						{
						{
						setState(230);
						match(ARRAY_STRING_VALUES);
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(236);
					match(DQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(241);
			match(RParen);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					match(SEIMIE_QO);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 24, RULE_useState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(Const);
			setState(249);
			match(LBig);
			setState(250);
			var();
			setState(251);
			match(COMMA);
			setState(252);
			fun();
			setState(253);
			match(RBig);
			setState(254);
			match(Equal);
			setState(255);
			match(Use_State);
			setState(256);
			match(LParen);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) {
				{
				{
				setState(257);
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
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(RParen);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(264);
				match(SEIMIE_QO);
				}
				}
				setState(269);
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
		enterRule(_localctx, 26, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 28, RULE_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		enterRule(_localctx, 30, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				setState(274);
				function();
				}
				break;
			case Const:
			case LParen:
				{
				setState(275);
				arrow_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009213704192L) != 0)) {
				{
				setState(281);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Console:
					{
					setState(278);
					log();
					}
					break;
				case VarType:
					{
					setState(279);
					decl();
					}
					break;
				case ARRAY_STRING_VALUES:
					{
					setState(280);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			return_html();
			setState(287);
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
		enterRule(_localctx, 32, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(Function);
			setState(290);
			match(ARRAY_STRING_VALUES);
			setState(291);
			match(LParen);
			setState(292);
			match(RParen);
			setState(293);
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
		enterRule(_localctx, 34, RULE_arrow_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(295);
				match(Const);
				setState(296);
				match(ARRAY_STRING_VALUES);
				setState(297);
				match(Equal);
				}
			}

			setState(300);
			match(LParen);
			setState(301);
			match(RParen);
			setState(302);
			match(Equal);
			setState(303);
			match(Gt);
			setState(304);
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
		enterRule(_localctx, 36, RULE_html_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(LParen);
			setState(307);
			match(Lt);
			setState(308);
			match(Div);
			setState(309);
			match(Gt);
			setState(310);
			tag();
			setState(311);
			match(Lt);
			setState(312);
			match(Slash);
			setState(313);
			match(Div);
			setState(314);
			match(Gt);
			setState(315);
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
		enterRule(_localctx, 38, RULE_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(317);
						div();
						}
						break;
					case 2:
						{
						setState(318);
						button();
						}
						break;
					case 3:
						{
						setState(319);
						h1();
						}
						break;
					case 4:
						{
						setState(320);
						img();
						}
						break;
					case 5:
						{
						setState(321);
						p();
						}
						break;
					case 6:
						{
						setState(322);
						javaScriptValue();
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 40, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Lt);
			setState(329);
			match(Div);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36700160L) != 0)) {
				{
				{
				setState(330);
				props();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(Gt);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(337);
				tag();
				}
				break;
			case 2:
				{
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(338);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(344);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(352);
			match(Lt);
			setState(353);
			match(Slash);
			setState(354);
			match(Div);
			setState(355);
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
		enterRule(_localctx, 42, RULE_h1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Lt);
			setState(358);
			match(H1);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36700160L) != 0)) {
				{
				{
				setState(359);
				props();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(Gt);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(366);
				tag();
				}
				break;
			case 2:
				{
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_STRING_VALUES) {
					{
					{
					setState(367);
					match(ARRAY_STRING_VALUES);
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_NUMERIC_VALUES) {
					{
					{
					setState(373);
					match(ARRAY_NUMERIC_VALUES);
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(381);
			match(Lt);
			setState(382);
			match(Slash);
			setState(383);
			match(H1);
			setState(384);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
		enterRule(_localctx, 44, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(Lt);
			setState(387);
			match(P);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36700160L) != 0)) {
				{
				{
				setState(388);
				props();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(Gt);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(395);
				tag();
				}
				break;
			case 2:
				{
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6917528890202128384L) != 0)) {
					{
					setState(399);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBrack:
						{
						setState(396);
						variable();
						}
						break;
					case ARRAY_STRING_VALUES:
						{
						setState(397);
						match(ARRAY_STRING_VALUES);
						}
						break;
					case ARRAY_NUMERIC_VALUES:
						{
						setState(398);
						match(ARRAY_NUMERIC_VALUES);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(406);
			match(Lt);
			setState(407);
			match(Slash);
			setState(408);
			match(P);
			setState(409);
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
		enterRule(_localctx, 46, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(Lt);
			setState(412);
			match(Img);
			setState(413);
			src();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36700160L) != 0)) {
				{
				{
				setState(414);
				props();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(Slash);
			setState(421);
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
		enterRule(_localctx, 48, RULE_button);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(Lt);
			setState(424);
			match(Button);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36700160L) != 0)) {
				{
				{
				setState(425);
				props();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(Gt);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) {
				{
				{
				setState(432);
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
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(Lt);
			setState(439);
			match(Slash);
			setState(440);
			match(Button);
			setState(441);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LBrack);
			setState(444);
			match(ARRAY_STRING_VALUES);
			setState(445);
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
		enterRule(_localctx, 52, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Width:
				{
				setState(447);
				width();
				}
				break;
			case Height:
				{
				setState(448);
				height();
				}
				break;
			case OnClick:
				{
				setState(449);
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
		enterRule(_localctx, 54, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(Width);
			setState(453);
			match(Equal);
			setState(454);
			match(ARRAY_NUMERIC_VALUES);
			setState(455);
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
		enterRule(_localctx, 56, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Height);
			setState(458);
			match(Equal);
			setState(459);
			match(ARRAY_NUMERIC_VALUES);
			setState(460);
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
		enterRule(_localctx, 58, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(Src);
			setState(463);
			match(Equal);
			setState(464);
			match(LBrack);
			setState(465);
			match(ARRAY_STRING_VALUES);
			setState(466);
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
		enterRule(_localctx, 60, RULE_onClick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(OnClick);
			setState(469);
			match(Equal);
			setState(470);
			match(LBrack);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LParen) {
				{
				{
				setState(471);
				callFunction();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		enterRule(_localctx, 62, RULE_javaScriptValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LBrack);
			setState(480);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_STRING_VALUES || _la==ARRAY_NUMERIC_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(481);
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
		enterRule(_localctx, 64, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(LParen);
			setState(484);
			match(RParen);
			setState(485);
			match(Equal);
			setState(486);
			match(Gt);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_STRING_VALUES) {
				{
				{
				setState(487);
				match(ARRAY_STRING_VALUES);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(LParen);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916966077687660544L) != 0)) {
				{
				{
				setState(494);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916966077687660544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(RParen);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEIMIE_QO) {
				{
				{
				setState(501);
				match(SEIMIE_QO);
				}
				}
				setState(506);
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
		"\u0004\u0001?\u01fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000K\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000\n\u0000\f\u0000X\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001f\b\u0001\n\u0001\f\u0001i\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0002\u0005\u0002"+
		"r\b\u0002\n\u0002\f\u0002u\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002{\b\u0002\n\u0002\f\u0002~\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u0083\b\u0002\n\u0002\f\u0002\u0086"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008b\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u008f\b\u0003\n\u0003\f\u0003\u0092"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u009a\b\u0005\u0005\u0005\u009c\b\u0005\n\u0005\f\u0005"+
		"\u009f\t\u0005\u0001\u0005\u0005\u0005\u00a2\b\u0005\n\u0005\f\u0005\u00a5"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ab"+
		"\b\u0006\u0001\u0006\u0005\u0006\u00ae\b\u0006\n\u0006\f\u0006\u00b1\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b6\b\u0007\u0004"+
		"\u0007\u00b8\b\u0007\u000b\u0007\f\u0007\u00b9\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00be\b\u0007\n\u0007\f\u0007\u00c1\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c8\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d0\b\n\u0001\n\u0005\n\u00d3\b\n\n\n\f\n"+
		"\u00d6\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00de\b\u000b\n\u000b\f\u000b\u00e1\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e8"+
		"\b\u000b\n\u000b\f\u000b\u00eb\t\u000b\u0001\u000b\u0003\u000b\u00ee\b"+
		"\u000b\u0003\u000b\u00f0\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f4"+
		"\b\u000b\n\u000b\f\u000b\u00f7\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0103\b\f\n\f"+
		"\f\f\u0106\t\f\u0001\f\u0001\f\u0005\f\u010a\b\f\n\f\f\f\u010d\t\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0115\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u011a\b"+
		"\u000f\n\u000f\f\u000f\u011d\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012b\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0144\b\u0013"+
		"\n\u0013\f\u0013\u0147\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u014c\b\u0014\n\u0014\f\u0014\u014f\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0154\b\u0014\n\u0014\f\u0014\u0157\t\u0014\u0001"+
		"\u0014\u0005\u0014\u015a\b\u0014\n\u0014\f\u0014\u015d\t\u0014\u0003\u0014"+
		"\u015f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0169\b\u0015\n\u0015"+
		"\f\u0015\u016c\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0171\b\u0015\n\u0015\f\u0015\u0174\t\u0015\u0001\u0015\u0005\u0015\u0177"+
		"\b\u0015\n\u0015\f\u0015\u017a\t\u0015\u0003\u0015\u017c\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0186\b\u0016\n\u0016\f\u0016\u0189\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0190\b\u0016\n\u0016\f\u0016\u0193\t\u0016\u0003\u0016\u0195\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01a0\b\u0017\n\u0017"+
		"\f\u0017\u01a3\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u01ab\b\u0018\n\u0018\f\u0018\u01ae"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01b2\b\u0018\n\u0018\f\u0018"+
		"\u01b5\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01c3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01d9\b\u001e\n\u001e\f\u001e\u01dc\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u01e9\b \n \f \u01ec\t \u0001 \u0001 \u0005 \u01f0\b "+
		"\n \f \u01f3\t \u0001 \u0001 \u0005 \u01f7\b \n \f \u01fa\t \u0001 \u0000"+
		"\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\n\u0004\u0000\u001b\u001b#"+
		"$66==\u0002\u000055==\u0001\u000089\u0003\u0000;;==??\u0003\u0000\u001a"+
		"\u001a\u001f\u001f01\u0002\u0000;;==\u0002\u000099==\u0002\u0000==??\u0001"+
		"\u0000\u0016\u0017\u0003\u000011==??\u0223\u0000E\u0001\u0000\u0000\u0000"+
		"\u0002]\u0001\u0000\u0000\u0000\u0004j\u0001\u0000\u0000\u0000\u0006\u0087"+
		"\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u0095\u0001"+
		"\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e\u00b2\u0001\u0000"+
		"\u0000\u0000\u0010\u00c7\u0001\u0000\u0000\u0000\u0012\u00c9\u0001\u0000"+
		"\u0000\u0000\u0014\u00cc\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000"+
		"\u0000\u0000\u0018\u00f8\u0001\u0000\u0000\u0000\u001a\u010e\u0001\u0000"+
		"\u0000\u0000\u001c\u0110\u0001\u0000\u0000\u0000\u001e\u0114\u0001\u0000"+
		"\u0000\u0000 \u0121\u0001\u0000\u0000\u0000\"\u012a\u0001\u0000\u0000"+
		"\u0000$\u0132\u0001\u0000\u0000\u0000&\u0145\u0001\u0000\u0000\u0000("+
		"\u0148\u0001\u0000\u0000\u0000*\u0165\u0001\u0000\u0000\u0000,\u0182\u0001"+
		"\u0000\u0000\u0000.\u019b\u0001\u0000\u0000\u00000\u01a7\u0001\u0000\u0000"+
		"\u00002\u01bb\u0001\u0000\u0000\u00004\u01c2\u0001\u0000\u0000\u00006"+
		"\u01c4\u0001\u0000\u0000\u00008\u01c9\u0001\u0000\u0000\u0000:\u01ce\u0001"+
		"\u0000\u0000\u0000<\u01d4\u0001\u0000\u0000\u0000>\u01df\u0001\u0000\u0000"+
		"\u0000@\u01e3\u0001\u0000\u0000\u0000BD\u0003\u0006\u0003\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FJ\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HK\u0003\"\u0011\u0000IK\u0003 \u0010\u0000JH\u0001\u0000\u0000"+
		"\u0000JI\u0001\u0000\u0000\u0000KV\u0001\u0000\u0000\u0000LU\u0003\n\u0005"+
		"\u0000MU\u0003\f\u0006\u0000NU\u0003\u000e\u0007\u0000OU\u0003\u0004\u0002"+
		"\u0000PU\u0003\u001e\u000f\u0000QU\u0003\u0018\f\u0000RU\u0003\u0004\u0002"+
		"\u0000SU\u0003\u0002\u0001\u0000TL\u0001\u0000\u0000\u0000TM\u0001\u0000"+
		"\u0000\u0000TN\u0001\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001"+
		"\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000YZ\u0003\u0014\n\u0000Z[\u0005&\u0000\u0000[\\\u0003\u0012"+
		"\t\u0000\\\u0001\u0001\u0000\u0000\u0000]^\u0005\u0002\u0000\u0000^_\u0003"+
		"\u001a\r\u0000_`\u0005\u001d\u0000\u0000`a\u0005\u0004\u0000\u0000ab\u0005"+
		"#\u0000\u0000bc\u0005=\u0000\u0000cg\u0005$\u0000\u0000df\u0005\u001b"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0003\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0003\u0000\u0000kn\u0005#\u0000"+
		"\u0000lo\u0003\"\u0011\u0000mo\u0003 \u0010\u0000nl\u0001\u0000\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000os\u0001\u0000\u0000\u0000pr\u0007\u0000"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vw\u0005&\u0000\u0000wx\u00055\u0000\u0000x"+
		"|\u0005\'\u0000\u0000y{\u0007\u0001\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005(\u0000\u0000\u0080\u0084\u0005$\u0000\u0000\u0081\u0083\u0005"+
		"\u001b\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0005\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0005\b\u0000\u0000\u0088\u0089\u0005="+
		"\u0000\u0000\u0089\u008b\u0005\u0007\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u0090\u0003\b\u0004\u0000\u008d\u008f\u0005\u001b\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0007\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0007\u0002\u0000\u0000\u0094\t\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005=\u0000\u0000\u0096\u009d\u0005\u001d\u0000\u0000\u0097"+
		"\u0099\u0007\u0003\u0000\u0000\u0098\u009a\u0007\u0004\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u001b\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u000b\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u000b\u0000\u0000\u00a7\u00aa\u0005=\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001d\u0000\u0000\u00a9\u00ab\u0003\u0010\b\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00af\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0005\u001b\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\r\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b7\u0005\r\u0000"+
		"\u0000\u00b3\u00b5\u0007\u0005\u0000\u0000\u00b4\u00b6\u00051\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bf\u0005$\u0000\u0000\u00bc\u00be\u0005\u001b\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u000f\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c8\u0005;\u0000\u0000\u00c3\u00c8\u0005?\u0000\u0000\u00c4\u00c8\u0005"+
		"9\u0000\u0000\u00c5\u00c8\u0005:\u0000\u0000\u00c6\u00c8\u0005\f\u0000"+
		"\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u0011\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cb\u0005=\u0000\u0000"+
		"\u00cb\u0013\u0001\u0000\u0000\u0000\u00cc\u00cf\u0005\u000e\u0000\u0000"+
		"\u00cd\u00d0\u0003$\u0012\u0000\u00ce\u00d0\u0003\u0016\u000b\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005\u001b\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u0015\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0005\u0000\u0000\u00d8\u00d9\u0005#\u0000\u0000\u00d9\u00da"+
		"\u0007\u0006\u0000\u0000\u00da\u00db\u00055\u0000\u0000\u00db\u00df\u0005"+
		"%\u0000\u0000\u00dc\u00de\u00034\u001a\u0000\u00dd\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00ef\u0005&\u0000\u0000"+
		"\u00e3\u00ed\u00055\u0000\u0000\u00e4\u00ee\u0003\u0016\u000b\u0000\u00e5"+
		"\u00e9\u0005<\u0000\u0000\u00e6\u00e8\u0005=\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ee\u0005"+
		"<\u0000\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00e3\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f5\u0005$\u0000\u0000\u00f2\u00f4\u0005\u001b\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u0017\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u0002\u0000\u0000\u00f9\u00fa\u0005\'\u0000\u0000"+
		"\u00fa\u00fb\u0003\u001a\r\u0000\u00fb\u00fc\u00055\u0000\u0000\u00fc"+
		"\u00fd\u0003\u001c\u000e\u0000\u00fd\u00fe\u0005(\u0000\u0000\u00fe\u00ff"+
		"\u0005\u001d\u0000\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0104\u0005"+
		"#\u0000\u0000\u0101\u0103\u0007\u0007\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010b\u0005$\u0000"+
		"\u0000\u0108\u010a\u0005\u001b\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0019\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005=\u0000\u0000"+
		"\u010f\u001b\u0001\u0000\u0000\u0000\u0110\u0111\u0005=\u0000\u0000\u0111"+
		"\u001d\u0001\u0000\u0000\u0000\u0112\u0115\u0003 \u0010\u0000\u0113\u0115"+
		"\u0003\"\u0011\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u011b\u0001\u0000\u0000\u0000\u0116\u011a\u0003"+
		"\u000e\u0007\u0000\u0117\u011a\u0003\f\u0006\u0000\u0118\u011a\u0003\n"+
		"\u0005\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0003\u0014\n\u0000\u011f\u0120\u0005&\u0000"+
		"\u0000\u0120\u001f\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0006\u0000"+
		"\u0000\u0122\u0123\u0005=\u0000\u0000\u0123\u0124\u0005#\u0000\u0000\u0124"+
		"\u0125\u0005$\u0000\u0000\u0125\u0126\u0005%\u0000\u0000\u0126!\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005\u0002\u0000\u0000\u0128\u0129\u0005"+
		"=\u0000\u0000\u0129\u012b\u0005\u001d\u0000\u0000\u012a\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005#\u0000\u0000\u012d\u012e\u0005$\u0000\u0000"+
		"\u012e\u012f\u0005\u001d\u0000\u0000\u012f\u0130\u0005+\u0000\u0000\u0130"+
		"\u0131\u0005%\u0000\u0000\u0131#\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"#\u0000\u0000\u0133\u0134\u0005*\u0000\u0000\u0134\u0135\u0005\u000f\u0000"+
		"\u0000\u0135\u0136\u0005+\u0000\u0000\u0136\u0137\u0003&\u0013\u0000\u0137"+
		"\u0138\u0005*\u0000\u0000\u0138\u0139\u0005\u001f\u0000\u0000\u0139\u013a"+
		"\u0005\u000f\u0000\u0000\u013a\u013b\u0005+\u0000\u0000\u013b\u013c\u0005"+
		"$\u0000\u0000\u013c%\u0001\u0000\u0000\u0000\u013d\u0144\u0003(\u0014"+
		"\u0000\u013e\u0144\u00030\u0018\u0000\u013f\u0144\u0003*\u0015\u0000\u0140"+
		"\u0144\u0003.\u0017\u0000\u0141\u0144\u0003,\u0016\u0000\u0142\u0144\u0003"+
		">\u001f\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0143\u013e\u0001\u0000"+
		"\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0143\u0140\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\'\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005*\u0000\u0000"+
		"\u0149\u014d\u0005\u000f\u0000\u0000\u014a\u014c\u00034\u001a\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u015e\u0005+\u0000\u0000\u0151\u015f\u0003&\u0013\u0000\u0152\u0154\u0005"+
		"=\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u015f\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0005?\u0000\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0151\u0001\u0000\u0000"+
		"\u0000\u015e\u0155\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005*\u0000\u0000"+
		"\u0161\u0162\u0005\u001f\u0000\u0000\u0162\u0163\u0005\u000f\u0000\u0000"+
		"\u0163\u0164\u0005+\u0000\u0000\u0164)\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0005*\u0000\u0000\u0166\u016a\u0005\u0010\u0000\u0000\u0167\u0169\u0003"+
		"4\u001a\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000"+
		"\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016d\u017b\u0005+\u0000\u0000\u016e\u017c\u0003&\u0013\u0000"+
		"\u016f\u0171\u0005=\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u017c\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u0005?\u0000\u0000\u0176\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017c"+
		"\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u016e"+
		"\u0001\u0000\u0000\u0000\u017b\u0172\u0001\u0000\u0000\u0000\u017b\u0178"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0005*\u0000\u0000\u017e\u017f\u0005\u001f\u0000\u0000\u017f\u0180\u0005"+
		"\u0010\u0000\u0000\u0180\u0181\u0005+\u0000\u0000\u0181+\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005*\u0000\u0000\u0183\u0187\u0005\u0012\u0000\u0000"+
		"\u0184\u0186\u00034\u001a\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u018a\u0194\u0005+\u0000\u0000\u018b\u0195"+
		"\u0003&\u0013\u0000\u018c\u0190\u00032\u0019\u0000\u018d\u0190\u0005="+
		"\u0000\u0000\u018e\u0190\u0005?\u0000\u0000\u018f\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u018b\u0001\u0000\u0000"+
		"\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005*\u0000\u0000\u0197\u0198\u0005\u001f\u0000\u0000"+
		"\u0198\u0199\u0005\u0012\u0000\u0000\u0199\u019a\u0005+\u0000\u0000\u019a"+
		"-\u0001\u0000\u0000\u0000\u019b\u019c\u0005*\u0000\u0000\u019c\u019d\u0005"+
		"\u0011\u0000\u0000\u019d\u01a1\u0003:\u001d\u0000\u019e\u01a0\u00034\u001a"+
		"\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0005\u001f\u0000\u0000\u01a5\u01a6\u0005+\u0000\u0000"+
		"\u01a6/\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005*\u0000\u0000\u01a8\u01ac"+
		"\u0005\u0013\u0000\u0000\u01a9\u01ab\u00034\u001a\u0000\u01aa\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b3\u0005"+
		"+\u0000\u0000\u01b0\u01b2\u0007\u0007\u0000\u0000\u01b1\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005*\u0000"+
		"\u0000\u01b7\u01b8\u0005\u001f\u0000\u0000\u01b8\u01b9\u0005\u0013\u0000"+
		"\u0000\u01b9\u01ba\u0005+\u0000\u0000\u01ba1\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0005%\u0000\u0000\u01bc\u01bd\u0005=\u0000\u0000\u01bd\u01be\u0005"+
		"&\u0000\u0000\u01be3\u0001\u0000\u0000\u0000\u01bf\u01c3\u00036\u001b"+
		"\u0000\u01c0\u01c3\u00038\u001c\u0000\u01c1\u01c3\u0003<\u001e\u0000\u01c2"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c35\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005\u0014\u0000\u0000\u01c5\u01c6\u0005\u001d\u0000\u0000\u01c6\u01c7"+
		"\u0005?\u0000\u0000\u01c7\u01c8\u0007\b\u0000\u0000\u01c87\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0005\u0015\u0000\u0000\u01ca\u01cb\u0005\u001d"+
		"\u0000\u0000\u01cb\u01cc\u0005?\u0000\u0000\u01cc\u01cd\u0007\b\u0000"+
		"\u0000\u01cd9\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u0018\u0000\u0000"+
		"\u01cf\u01d0\u0005\u001d\u0000\u0000\u01d0\u01d1\u0005%\u0000\u0000\u01d1"+
		"\u01d2\u0005=\u0000\u0000\u01d2\u01d3\u0005&\u0000\u0000\u01d3;\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0005\u0019\u0000\u0000\u01d5\u01d6\u0005"+
		"\u001d\u0000\u0000\u01d6\u01da\u0005%\u0000\u0000\u01d7\u01d9\u0003@ "+
		"\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0005&\u0000\u0000\u01de=\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0005%\u0000\u0000\u01e0\u01e1\u0007\u0007\u0000\u0000\u01e1\u01e2"+
		"\u0005&\u0000\u0000\u01e2?\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005#"+
		"\u0000\u0000\u01e4\u01e5\u0005$\u0000\u0000\u01e5\u01e6\u0005\u001d\u0000"+
		"\u0000\u01e6\u01ea\u0005+\u0000\u0000\u01e7\u01e9\u0005=\u0000\u0000\u01e8"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed"+
		"\u01f1\u0005#\u0000\u0000\u01ee\u01f0\u0007\t\u0000\u0000\u01ef\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f8"+
		"\u0005$\u0000\u0000\u01f5\u01f7\u0005\u001b\u0000\u0000\u01f6\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9A\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u00007EJTVgns|\u0084\u008a"+
		"\u0090\u0099\u009d\u00a3\u00aa\u00af\u00b5\u00b9\u00bf\u00c7\u00cf\u00d4"+
		"\u00df\u00e9\u00ed\u00ef\u00f5\u0104\u010b\u0114\u0119\u011b\u012a\u0143"+
		"\u0145\u014d\u0155\u015b\u015e\u016a\u0172\u0178\u017b\u0187\u018f\u0191"+
		"\u0194\u01a1\u01ac\u01b3\u01c2\u01da\u01ea\u01f1\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}