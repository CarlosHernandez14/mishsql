// Generated from com\mishisql\MishiSQLanguage.g4 by ANTLR 4.9.2
package com.mishisql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MishiSQLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IMP_ORDER=2, SELECT=3, ALL=4, SPECIFIC_COL=5, SPECIFIC_ATTR=6, 
		FROM=7, WHERE=8, AND=9, OR=10, NOT=11, IN=12, LIKE=13, IS=14, NULL=15, 
		ORDER=16, BY=17, ASC=18, DESC=19, LIMIT=20, OFFSET=21, INSERT=22, INTO=23, 
		VALUES=24, UPDATE=25, SET=26, DELETE=27, CREATE=28, USE=29, TABLE=30, 
		ALTER=31, DROP=32, ADD=33, COLUMN=34, PRIMARY=35, EQUAL=36, NOT_EQUAL=37, 
		LESS_THAN=38, LESS_THAN_EQUAL=39, GREATER_THAN=40, GREATER_THAN_EQUAL=41, 
		BETWEEN=42, COMMA=43, LPAREN=44, RPAREN=45, ID=46, INT=47, DOUBLE=48, 
		VARCHAR=49, BOOLEAN=50, WS=51;
	public static final int
		RULE_start = 0, RULE_query = 1, RULE_selectQuery = 2, RULE_condition = 3, 
		RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "query", "selectQuery", "condition", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SEA'", "'MISHI'", "'MUESTRAME'", "'TODOS LOS MISHI DATOS'", "'LOS MISHICAMPOS'", 
			"'EL CAMPO'", "'DE'", "'DONDE'", "'Y'", "'O'", "'NOT'", "'IN'", "'LIKE'", 
			"'IS'", "'VACIO'", "'ORDENAR'", "'POR'", "'ASCENDENTE'", "'DESCENDENTE'", 
			"'LIMIT'", "'OFFSET'", "'AGREGA A'", "'INTO'", "'LOS VALORES'", "'ACTUALIZA LA'", 
			"'ASIGNA'", "'ELIMINA'", "'HAZME UNA'", "'USA LA BD'", "'TABLA'", "'MODIFICA'", 
			"'BORRA'", "'AGREGA'", "'COLUMNA'", "'PRIMARIA'", "'IGUAL A'", "'DIFERENTE DE'", 
			"'MENOR QUE'", "'MENOR O IGUAL QUE'", "'MAYOR QUE'", "'MAYOR O IGUAL QUE'", 
			"'ESTE ENTRE'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IMP_ORDER", "SELECT", "ALL", "SPECIFIC_COL", "SPECIFIC_ATTR", 
			"FROM", "WHERE", "AND", "OR", "NOT", "IN", "LIKE", "IS", "NULL", "ORDER", 
			"BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", "UPDATE", 
			"SET", "DELETE", "CREATE", "USE", "TABLE", "ALTER", "DROP", "ADD", "COLUMN", 
			"PRIMARY", "EQUAL", "NOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", 
			"GREATER_THAN_EQUAL", "BETWEEN", "COMMA", "LPAREN", "RPAREN", "ID", "INT", 
			"DOUBLE", "VARCHAR", "BOOLEAN", "WS"
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
	public String getGrammarFileName() { return "MishiSQLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MishiSQLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MishiSQLanguageParser.EOF, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MishiSQLanguageVisitor ) return ((MishiSQLanguageVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				query();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMP_ORDER );
			setState(15);
			match(EOF);
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

	public static class QueryContext extends ParserRuleContext {
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MishiSQLanguageVisitor ) return ((MishiSQLanguageVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			selectQuery();
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

	public static class SelectQueryContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public Token tableId;
		public Token orderID;
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode SELECT() { return getToken(MishiSQLanguageParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(MishiSQLanguageParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public TerminalNode ALL() { return getToken(MishiSQLanguageParser.ALL, 0); }
		public TerminalNode WHERE() { return getToken(MishiSQLanguageParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(MishiSQLanguageParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MishiSQLanguageParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(MishiSQLanguageParser.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(MishiSQLanguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MishiSQLanguageParser.INT, i);
		}
		public TerminalNode OFFSET() { return getToken(MishiSQLanguageParser.OFFSET, 0); }
		public TerminalNode SPECIFIC_COL() { return getToken(MishiSQLanguageParser.SPECIFIC_COL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MishiSQLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MishiSQLanguageParser.COMMA, i);
		}
		public TerminalNode ASC() { return getToken(MishiSQLanguageParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MishiSQLanguageParser.DESC, 0); }
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).exitSelectQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MishiSQLanguageVisitor ) return ((MishiSQLanguageVisitor<? extends T>)visitor).visitSelectQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(IMP_ORDER);
			setState(20);
			match(SELECT);
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(21);
				match(ALL);
				}
				break;
			case SPECIFIC_COL:
				{
				{
				setState(22);
				match(SPECIFIC_COL);
				setState(23);
				((SelectQueryContext)_localctx).ID = match(ID);
				((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(24);
					match(COMMA);
					setState(25);
					((SelectQueryContext)_localctx).ID = match(ID);
					((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(33);
			match(FROM);
			setState(34);
			((SelectQueryContext)_localctx).tableId = match(ID);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(35);
				match(WHERE);
				setState(36);
				condition(0);
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(39);
				match(ORDER);
				setState(40);
				match(BY);
				setState(41);
				((SelectQueryContext)_localctx).orderID = match(ID);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(42);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
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

			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(47);
				match(LIMIT);
				setState(48);
				match(INT);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(51);
				match(OFFSET);
				setState(52);
				match(INT);
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

	public static class ConditionContext extends ParserRuleContext {
		public Token attrName;
		public Token tableName;
		public TerminalNode NOT() { return getToken(MishiSQLanguageParser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MishiSQLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MishiSQLanguageParser.RPAREN, 0); }
		public TerminalNode SPECIFIC_ATTR() { return getToken(MishiSQLanguageParser.SPECIFIC_ATTR, 0); }
		public TerminalNode FROM() { return getToken(MishiSQLanguageParser.FROM, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(MishiSQLanguageParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(MishiSQLanguageParser.NOT_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(MishiSQLanguageParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(MishiSQLanguageParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(MishiSQLanguageParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(MishiSQLanguageParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode IN() { return getToken(MishiSQLanguageParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MishiSQLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MishiSQLanguageParser.COMMA, i);
		}
		public TerminalNode LIKE() { return getToken(MishiSQLanguageParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(MishiSQLanguageParser.IS, 0); }
		public TerminalNode NULL() { return getToken(MishiSQLanguageParser.NULL, 0); }
		public TerminalNode BETWEEN() { return getToken(MishiSQLanguageParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MishiSQLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(MishiSQLanguageParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MishiSQLanguageVisitor ) return ((MishiSQLanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(56);
				match(NOT);
				setState(57);
				condition(7);
				}
				break;
			case 2:
				{
				setState(58);
				match(LPAREN);
				setState(59);
				condition(0);
				setState(60);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(62);
				match(SPECIFIC_ATTR);
				setState(63);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(64);
				match(FROM);
				setState(65);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(66);
				match(T__0);
				setState(67);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LESS_THAN) | (1L << LESS_THAN_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				value();
				}
				break;
			case 4:
				{
				setState(69);
				match(SPECIFIC_ATTR);
				setState(70);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(71);
				match(FROM);
				setState(72);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(73);
				match(IN);
				setState(74);
				match(LPAREN);
				setState(75);
				value();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(76);
					match(COMMA);
					setState(77);
					value();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(85);
				match(SPECIFIC_ATTR);
				setState(86);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(87);
				match(FROM);
				setState(88);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(89);
				match(LIKE);
				setState(90);
				value();
				}
				break;
			case 6:
				{
				setState(91);
				match(SPECIFIC_ATTR);
				setState(92);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(93);
				match(FROM);
				setState(94);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(95);
				match(IS);
				setState(96);
				match(NULL);
				}
				break;
			case 7:
				{
				setState(97);
				match(SPECIFIC_ATTR);
				setState(98);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(99);
				match(FROM);
				setState(100);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(101);
				match(BETWEEN);
				setState(102);
				value();
				setState(103);
				match(AND);
				setState(104);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(108);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(109);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					condition(9);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MishiSQLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MishiSQLanguageParser.DOUBLE, 0); }
		public TerminalNode VARCHAR() { return getToken(MishiSQLanguageParser.VARCHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(MishiSQLanguageParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(MishiSQLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MishiSQLanguageParser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MishiSQLanguageParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MishiSQLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MishiSQLanguageParser.COMMA, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MishiSQLanguageListener ) ((MishiSQLanguageListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MishiSQLanguageVisitor ) return ((MishiSQLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(VARCHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(BOOLEAN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(LPAREN);
				setState(122);
				value();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					value();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\5\4\"\n\4"+
		"\3\4\3\4\3\4\3\4\5\4(\n\4\3\4\3\4\3\4\3\4\5\4.\n\4\5\4\60\n\4\3\4\3\4"+
		"\5\4\64\n\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13"+
		"\6\3\6\3\6\5\6\u0087\n\6\3\6\2\3\b\7\2\4\6\b\n\2\5\3\2\24\25\3\2&+\3\2"+
		"\13\f\2\u0099\2\r\3\2\2\2\4\23\3\2\2\2\6\25\3\2\2\2\bl\3\2\2\2\n\u0086"+
		"\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\5\6\4\2\24\5\3\2\2"+
		"\2\25\26\7\4\2\2\26!\7\5\2\2\27\"\7\6\2\2\30\31\7\7\2\2\31\36\7\60\2\2"+
		"\32\33\7-\2\2\33\35\7\60\2\2\34\32\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2!\27\3\2\2\2!\30\3\2\2\2\"#\3\2\2"+
		"\2#$\7\t\2\2$\'\7\60\2\2%&\7\n\2\2&(\5\b\5\2\'%\3\2\2\2\'(\3\2\2\2(/\3"+
		"\2\2\2)*\7\22\2\2*+\7\23\2\2+-\7\60\2\2,.\t\2\2\2-,\3\2\2\2-.\3\2\2\2"+
		".\60\3\2\2\2/)\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61\62\7\26\2\2\62\64"+
		"\7\61\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\66\7\27\2\2\66"+
		"8\7\61\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\b\5\1\2:;\7\r\2\2;m"+
		"\5\b\5\t<=\7.\2\2=>\5\b\5\2>?\7/\2\2?m\3\2\2\2@A\7\b\2\2AB\7\60\2\2BC"+
		"\7\t\2\2CD\7\60\2\2DE\7\3\2\2EF\t\3\2\2Fm\5\n\6\2GH\7\b\2\2HI\7\60\2\2"+
		"IJ\7\t\2\2JK\7\60\2\2KL\7\16\2\2LM\7.\2\2MR\5\n\6\2NO\7-\2\2OQ\5\n\6\2"+
		"PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7/\2\2"+
		"Vm\3\2\2\2WX\7\b\2\2XY\7\60\2\2YZ\7\t\2\2Z[\7\60\2\2[\\\7\17\2\2\\m\5"+
		"\n\6\2]^\7\b\2\2^_\7\60\2\2_`\7\t\2\2`a\7\60\2\2ab\7\20\2\2bm\7\21\2\2"+
		"cd\7\b\2\2de\7\60\2\2ef\7\t\2\2fg\7\60\2\2gh\7,\2\2hi\5\n\6\2ij\7\13\2"+
		"\2jk\5\n\6\2km\3\2\2\2l9\3\2\2\2l<\3\2\2\2l@\3\2\2\2lG\3\2\2\2lW\3\2\2"+
		"\2l]\3\2\2\2lc\3\2\2\2ms\3\2\2\2no\f\n\2\2op\t\4\2\2pr\5\b\5\13qn\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t\3\2\2\2us\3\2\2\2v\u0087\7\61\2"+
		"\2w\u0087\7\62\2\2x\u0087\7\63\2\2y\u0087\7\64\2\2z\u0087\7\60\2\2{|\7"+
		".\2\2|\u0081\5\n\6\2}~\7-\2\2~\u0080\5\n\6\2\177}\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0087\3\2\2\2\u0086v\3\2\2\2\u0086"+
		"w\3\2\2\2\u0086x\3\2\2\2\u0086y\3\2\2\2\u0086z\3\2\2\2\u0086{\3\2\2\2"+
		"\u0087\13\3\2\2\2\17\17\36!\'-/\63\67Rls\u0081\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}