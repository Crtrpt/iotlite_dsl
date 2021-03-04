// Generated from D:/private/iotdsl/src/main/antlr4\Iotlang.g4 by ANTLR 4.9.1
package com.dj.iot.dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IotlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		NUMBER=32, BINARY=33, HEX=34, INT=35, FLOAT=36, STRING=37, BOOL=38, ID=39, 
		NEWLINE=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_select_statement = 2, RULE_select_argv = 3, 
		RULE_from_argv = 4, RULE_group_argv = 5, RULE_order_argv = 6, RULE_order = 7, 
		RULE_limit = 8, RULE_assign = 9, RULE_expr = 10, RULE_obj_member = 11, 
		RULE_obj_method = 12, RULE_method_argv = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "select_statement", "select_argv", "from_argv", 
			"group_argv", "order_argv", "order", "limit", "assign", "expr", "obj_member", 
			"obj_method", "method_argv"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "'group'", "'by'", "'order'", 
			"'*'", "'('", "')'", "'desc'", "'asc'", "'limit'", "','", "'let'", "'='", 
			"'&&'", "'||'", "'/'", "'%'", "'+'", "'-'", "'<='", "'>='", "'>'", "'<'", 
			"'=='", "'<>'", "'!='", "'&'", "'|'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUMBER", "BINARY", "HEX", 
			"INT", "FLOAT", "STRING", "BOOL", "ID", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Iotlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IotlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public List<Select_statementContext> select_statement() {
			return getRuleContexts(Select_statementContext.class);
		}
		public Select_statementContext select_statement(int i) {
			return getRuleContext(Select_statementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(IotlangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(IotlangParser.NEWLINE, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << NUMBER) | (1L << STRING) | (1L << BOOL) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(30);
					select_statement();
					}
					break;
				case T__7:
				case NUMBER:
				case STRING:
				case BOOL:
				case ID:
					{
					setState(31);
					expr(0);
					}
					break;
				case NEWLINE:
					{
					setState(32);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37);
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

	public static class Select_statementContext extends ParserRuleContext {
		public Select_argvContext select_body;
		public From_argvContext from_body;
		public ExprContext where_body;
		public Group_argvContext group_body;
		public Order_argvContext order_body;
		public LimitContext limit_body;
		public Select_argvContext select_argv() {
			return getRuleContext(Select_argvContext.class,0);
		}
		public From_argvContext from_argv() {
			return getRuleContext(From_argvContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Group_argvContext> group_argv() {
			return getRuleContexts(Group_argvContext.class);
		}
		public Group_argvContext group_argv(int i) {
			return getRuleContext(Group_argvContext.class,i);
		}
		public List<Order_argvContext> order_argv() {
			return getRuleContexts(Order_argvContext.class);
		}
		public Order_argvContext order_argv(int i) {
			return getRuleContext(Order_argvContext.class,i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38);
			match(T__0);
			}
			setState(39);
			((Select_statementContext)_localctx).select_body = select_argv();
			{
			setState(40);
			match(T__1);
			}
			setState(41);
			((Select_statementContext)_localctx).from_body = from_argv();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(T__2);
				setState(43);
				((Select_statementContext)_localctx).where_body = expr(0);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(T__3);
				setState(49);
				match(T__4);
				setState(50);
				((Select_statementContext)_localctx).group_body = group_argv();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(T__5);
				setState(56);
				match(T__4);
				setState(57);
				((Select_statementContext)_localctx).order_body = order_argv();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(62);
			((Select_statementContext)_localctx).limit_body = limit();
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

	public static class Select_argvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IotlangParser.ID, 0); }
		public Obj_memberContext obj_member() {
			return getRuleContext(Obj_memberContext.class,0);
		}
		public Obj_methodContext obj_method() {
			return getRuleContext(Obj_methodContext.class,0);
		}
		public Select_argvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_argv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterSelect_argv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitSelect_argv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitSelect_argv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_argvContext select_argv() throws RecognitionException {
		Select_argvContext _localctx = new Select_argvContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_argv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(64);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(65);
				match(ID);
				}
				break;
			case 3:
				{
				setState(66);
				obj_member();
				}
				break;
			case 4:
				{
				setState(67);
				obj_method();
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

	public static class From_argvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IotlangParser.ID, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public From_argvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_argv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterFrom_argv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitFrom_argv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitFrom_argv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_argvContext from_argv() throws RecognitionException {
		From_argvContext _localctx = new From_argvContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from_argv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(70);
				match(T__6);
				}
				break;
			case ID:
				{
				setState(71);
				match(ID);
				}
				break;
			case T__7:
				{
				{
				setState(72);
				match(T__7);
				setState(73);
				select_statement();
				setState(74);
				match(T__8);
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

	public static class Group_argvContext extends ParserRuleContext {
		public List<Obj_memberContext> obj_member() {
			return getRuleContexts(Obj_memberContext.class);
		}
		public Obj_memberContext obj_member(int i) {
			return getRuleContext(Obj_memberContext.class,i);
		}
		public List<Obj_methodContext> obj_method() {
			return getRuleContexts(Obj_methodContext.class);
		}
		public Obj_methodContext obj_method(int i) {
			return getRuleContext(Obj_methodContext.class,i);
		}
		public Group_argvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_argv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterGroup_argv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitGroup_argv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitGroup_argv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_argvContext group_argv() throws RecognitionException {
		Group_argvContext _localctx = new Group_argvContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_group_argv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(78);
					obj_member();
					}
					break;
				case 2:
					{
					setState(79);
					obj_method();
					}
					break;
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(82);
						obj_member();
						}
						break;
					case 2:
						{
						setState(83);
						obj_method();
						}
						break;
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Order_argvContext extends ParserRuleContext {
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public Order_argvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_argv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterOrder_argv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitOrder_argv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitOrder_argv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_argvContext order_argv() throws RecognitionException {
		Order_argvContext _localctx = new Order_argvContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_order_argv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(91);
				order();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class OrderContext extends ParserRuleContext {
		public Obj_memberContext obj_member() {
			return getRuleContext(Obj_memberContext.class,0);
		}
		public Obj_methodContext obj_method() {
			return getRuleContext(Obj_methodContext.class,0);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(97);
				obj_member();
				}
				break;
			case 2:
				{
				setState(98);
				obj_method();
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
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

	public static class LimitContext extends ParserRuleContext {
		public ExprContext offset_argv;
		public ExprContext limit_argv;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				match(T__11);
				setState(105);
				((LimitContext)_localctx).offset_argv = expr(0);
				setState(106);
				match(T__12);
				setState(107);
				((LimitContext)_localctx).limit_argv = expr(0);
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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

	public static class AssignContext extends ParserRuleContext {
		public Token varname;
		public ExprContext val;
		public TerminalNode ID() { return getToken(IotlangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__13);
			{
			setState(114);
			((AssignContext)_localctx).varname = match(ID);
			}
			setState(115);
			match(T__14);
			{
			setState(116);
			((AssignContext)_localctx).val = expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ADDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GET_REF_OBJ_MEMBERContext extends ExprContext {
		public Obj_memberContext obj_member() {
			return getRuleContext(Obj_memberContext.class,0);
		}
		public GET_REF_OBJ_MEMBERContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterGET_REF_OBJ_MEMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitGET_REF_OBJ_MEMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitGET_REF_OBJ_MEMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GET_REF_STRINGContext extends ExprContext {
		public TerminalNode STRING() { return getToken(IotlangParser.STRING, 0); }
		public GET_REF_STRINGContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterGET_REF_STRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitGET_REF_STRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitGET_REF_STRING(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GET_REF_NUMBERContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(IotlangParser.NUMBER, 0); }
		public GET_REF_NUMBERContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterGET_REF_NUMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitGET_REF_NUMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitGET_REF_NUMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PARENContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterPAREN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitPAREN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitPAREN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GET_REF_BOOLContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(IotlangParser.BOOL, 0); }
		public GET_REF_BOOLContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterGET_REF_BOOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitGET_REF_BOOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitGET_REF_BOOL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GET_REF_IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(IotlangParser.ID, 0); }
		public GET_REF_IDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterGET_REF_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitGET_REF_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitGET_REF_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new GET_REF_NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new GET_REF_BOOLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new GET_REF_STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new GET_REF_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new GET_REF_OBJ_MEMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				obj_member();
				}
				break;
			case 6:
				{
				_localctx = new PARENContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__7);
				setState(125);
				expr(0);
				setState(126);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						((ADDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(131);
						((ADDContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((ADDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						((ADDContext)_localctx).right = expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						((ADDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(134);
						((ADDContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((ADDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						((ADDContext)_localctx).right = expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						((ADDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(137);
						((ADDContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ADDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						((ADDContext)_localctx).right = expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						((ADDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(140);
						((ADDContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ADDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						((ADDContext)_localctx).right = expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						((ADDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(143);
						((ADDContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((ADDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						((ADDContext)_localctx).right = expr(8);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Obj_memberContext extends ParserRuleContext {
		public Token instance;
		public Token member;
		public List<TerminalNode> ID() { return getTokens(IotlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IotlangParser.ID, i);
		}
		public Obj_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterObj_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitObj_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitObj_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_memberContext obj_member() throws RecognitionException {
		Obj_memberContext _localctx = new Obj_memberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_obj_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((Obj_memberContext)_localctx).instance = match(ID);
			setState(151);
			match(T__30);
			setState(152);
			((Obj_memberContext)_localctx).member = match(ID);
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

	public static class Obj_methodContext extends ParserRuleContext {
		public Token instance;
		public Token method;
		public Method_argvContext argv;
		public List<TerminalNode> ID() { return getTokens(IotlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IotlangParser.ID, i);
		}
		public Method_argvContext method_argv() {
			return getRuleContext(Method_argvContext.class,0);
		}
		public Obj_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterObj_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitObj_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitObj_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_methodContext obj_method() throws RecognitionException {
		Obj_methodContext _localctx = new Obj_methodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_obj_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((Obj_methodContext)_localctx).instance = match(ID);
			setState(155);
			match(T__30);
			setState(156);
			((Obj_methodContext)_localctx).method = match(ID);
			setState(157);
			match(T__7);
			setState(158);
			((Obj_methodContext)_localctx).argv = method_argv();
			setState(159);
			match(T__8);
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

	public static class Method_argvContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IotlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IotlangParser.ID, i);
		}
		public Method_argvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_argv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).enterMethod_argv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IotlangListener ) ((IotlangListener)listener).exitMethod_argv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IotlangVisitor ) return ((IotlangVisitor<? extends T>)visitor).visitMethod_argv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_argvContext method_argv() throws RecognitionException {
		Method_argvContext _localctx = new Method_argvContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_argv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(161);
				match(ID);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(162);
					match(T__12);
					setState(163);
					match(ID);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4/\n\4\r\4\16\4\60\3\4\3\4\3"+
		"\4\6\4\66\n\4\r\4\16\4\67\3\4\3\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\5\7S\n\7"+
		"\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\5\7\\\n\7\3\b\7\b_\n\b\f\b\16\bb\13\b"+
		"\3\t\3\t\5\tf\n\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\6\np\n\n\r\n\16\nq"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0083\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u0094\n\f\f\f\16\f\u0097\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17"+
		"\5\17\u00ac\n\17\3\17\2\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\b\3\2\f\r\3\2\22\23\4\2\t\t\24\25\3\2\26\27\3\2\30\36\3\2\37 \2\u00be"+
		"\2\36\3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\bF\3\2\2\2\nN\3\2\2\2\f[\3\2\2\2\16"+
		"`\3\2\2\2\20e\3\2\2\2\22o\3\2\2\2\24s\3\2\2\2\26\u0082\3\2\2\2\30\u0098"+
		"\3\2\2\2\32\u009c\3\2\2\2\34\u00ab\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2"+
		" $\5\6\4\2!$\5\26\f\2\"$\7*\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2()\7\3\2\2)*\5\b\5\2*+\7"+
		"\4\2\2+.\5\n\6\2,-\7\5\2\2-/\5\26\f\2.,\3\2\2\2/\60\3\2\2\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61\65\3\2\2\2\62\63\7\6\2\2\63\64\7\7\2\2\64\66\5\f\7"+
		"\2\65\62\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28<\3\2\2\29:\7"+
		"\b\2\2:;\7\7\2\2;=\5\16\b\2<9\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@"+
		"\3\2\2\2@A\5\22\n\2A\7\3\2\2\2BG\7\t\2\2CG\7)\2\2DG\5\30\r\2EG\5\32\16"+
		"\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HO\7\t\2\2IO\7)\2"+
		"\2JK\7\n\2\2KL\5\6\4\2LM\7\13\2\2MO\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2"+
		"\2\2O\13\3\2\2\2PS\5\30\r\2QS\5\32\16\2RP\3\2\2\2RQ\3\2\2\2SX\3\2\2\2"+
		"TW\5\30\r\2UW\5\32\16\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2[R\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2]_\5\20\t\2"+
		"^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\17\3\2\2\2b`\3\2\2\2cf\5\30"+
		"\r\2df\5\32\16\2ec\3\2\2\2ed\3\2\2\2fh\3\2\2\2gi\t\2\2\2hg\3\2\2\2hi\3"+
		"\2\2\2i\21\3\2\2\2jk\7\16\2\2kl\5\26\f\2lm\7\17\2\2mn\5\26\f\2np\3\2\2"+
		"\2oj\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\23\3\2\2\2st\7\20\2\2tu\7"+
		")\2\2uv\7\21\2\2vw\5\26\f\2w\25\3\2\2\2xy\b\f\1\2y\u0083\7\"\2\2z\u0083"+
		"\7(\2\2{\u0083\7\'\2\2|\u0083\7)\2\2}\u0083\5\30\r\2~\177\7\n\2\2\177"+
		"\u0080\5\26\f\2\u0080\u0081\7\13\2\2\u0081\u0083\3\2\2\2\u0082x\3\2\2"+
		"\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~"+
		"\3\2\2\2\u0083\u0095\3\2\2\2\u0084\u0085\f\r\2\2\u0085\u0086\t\3\2\2\u0086"+
		"\u0094\5\26\f\16\u0087\u0088\f\f\2\2\u0088\u0089\t\4\2\2\u0089\u0094\5"+
		"\26\f\r\u008a\u008b\f\13\2\2\u008b\u008c\t\5\2\2\u008c\u0094\5\26\f\f"+
		"\u008d\u008e\f\n\2\2\u008e\u008f\t\6\2\2\u008f\u0094\5\26\f\13\u0090\u0091"+
		"\f\t\2\2\u0091\u0092\t\7\2\2\u0092\u0094\5\26\f\n\u0093\u0084\3\2\2\2"+
		"\u0093\u0087\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\27\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7)\2\2\u0099\u009a\7!\2\2"+
		"\u009a\u009b\7)\2\2\u009b\31\3\2\2\2\u009c\u009d\7)\2\2\u009d\u009e\7"+
		"!\2\2\u009e\u009f\7)\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\5\34\17\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\33\3\2\2\2\u00a3\u00a8\7)\2\2\u00a4\u00a5\7\17\2"+
		"\2\u00a5\u00a7\7)\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\35\3\2\2\2\26#%\60\67>FNRVX["+
		"`ehq\u0082\u0093\u0095\u00a8\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}