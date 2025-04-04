// Generated from c:/Users/carlo/Documents/CompilersAntlr/mishisql/src/main/antlr4/com/mishisql/MishiSQLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MishiSQLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
			"'IS'", "'VACIO'", "'ORDENAMELO'", "'POR'", "'ASCENDENTE'", "'DESCENDENTE'", 
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectQueryContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public Token tableId;
		public Token orderID;
		public Token tableidOrder;
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode SELECT() { return getToken(MishiSQLanguageParser.SELECT, 0); }
		public List<TerminalNode> FROM() { return getTokens(MishiSQLanguageParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(MishiSQLanguageParser.FROM, i);
		}
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

			setState(47);
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
				setState(42);
				match(FROM);
				setState(43);
				((SelectQueryContext)_localctx).tableidOrder = match(ID);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(44);
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

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(49);
				match(LIMIT);
				setState(50);
				match(INT);
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(53);
				match(OFFSET);
				setState(54);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(58);
				match(NOT);
				setState(59);
				condition(7);
				}
				break;
			case 2:
				{
				setState(60);
				match(LPAREN);
				setState(61);
				condition(0);
				setState(62);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(64);
				match(SPECIFIC_ATTR);
				setState(65);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(66);
				match(FROM);
				setState(67);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(68);
				match(T__0);
				setState(69);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(70);
				value();
				}
				break;
			case 4:
				{
				setState(71);
				match(SPECIFIC_ATTR);
				setState(72);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(73);
				match(FROM);
				setState(74);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(75);
				match(IN);
				setState(76);
				match(LPAREN);
				setState(77);
				value();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(78);
					match(COMMA);
					setState(79);
					value();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(87);
				match(SPECIFIC_ATTR);
				setState(88);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(89);
				match(FROM);
				setState(90);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(91);
				match(LIKE);
				setState(92);
				value();
				}
				break;
			case 6:
				{
				setState(93);
				match(SPECIFIC_ATTR);
				setState(94);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(95);
				match(FROM);
				setState(96);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(97);
				match(IS);
				setState(98);
				match(NULL);
				}
				break;
			case 7:
				{
				setState(99);
				match(SPECIFIC_ATTR);
				setState(100);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(101);
				match(FROM);
				setState(102);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(103);
				match(BETWEEN);
				setState(104);
				value();
				setState(105);
				match(AND);
				setState(106);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
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
					setState(110);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(111);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(112);
					condition(9);
					}
					} 
				}
				setState(117);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(VARCHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(BOOLEAN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(LPAREN);
				setState(124);
				value();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					value();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
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
		"\u0004\u00013\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001b\b\u0002\n\u0002"+
		"\f\u0002\u001e\t\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0003"+
		"\u00020\b\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00028\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003Q\b\u0003\n\u0003\f\u0003T\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"m\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003r\b\u0003\n\u0003"+
		"\f\u0003u\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0080"+
		"\b\u0004\n\u0004\f\u0004\u0083\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0087\b\u0004\u0001\u0004\u0000\u0001\u0006\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0003\u0001\u0000\u0012\u0013\u0001\u0000$)\u0001\u0000\t\n\u0099"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000"+
		"\u0004\u0013\u0001\u0000\u0000\u0000\u0006l\u0001\u0000\u0000\u0000\b"+
		"\u0086\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0003\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u001f\u0005\u0003\u0000\u0000"+
		"\u0015 \u0005\u0004\u0000\u0000\u0016\u0017\u0005\u0005\u0000\u0000\u0017"+
		"\u001c\u0005.\u0000\u0000\u0018\u0019\u0005+\u0000\u0000\u0019\u001b\u0005"+
		".\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001f\u0015\u0001\u0000\u0000\u0000\u001f\u0016\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0007\u0000\u0000\"%\u0005."+
		"\u0000\u0000#$\u0005\b\u0000\u0000$&\u0003\u0006\u0003\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&/\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u0010\u0000\u0000()\u0005\u0011\u0000\u0000)*\u0005.\u0000\u0000*+\u0005"+
		"\u0007\u0000\u0000+-\u0005.\u0000\u0000,.\u0007\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/\'\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u000012\u0005\u0014\u0000\u000024\u0005/\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000056\u0005\u0015"+
		"\u0000\u000068\u0005/\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0006\u0003\uffff\uffff"+
		"\u0000:;\u0005\u000b\u0000\u0000;m\u0003\u0006\u0003\u0007<=\u0005,\u0000"+
		"\u0000=>\u0003\u0006\u0003\u0000>?\u0005-\u0000\u0000?m\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0006\u0000\u0000AB\u0005.\u0000\u0000BC\u0005\u0007\u0000"+
		"\u0000CD\u0005.\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0007\u0001\u0000"+
		"\u0000Fm\u0003\b\u0004\u0000GH\u0005\u0006\u0000\u0000HI\u0005.\u0000"+
		"\u0000IJ\u0005\u0007\u0000\u0000JK\u0005.\u0000\u0000KL\u0005\f\u0000"+
		"\u0000LM\u0005,\u0000\u0000MR\u0003\b\u0004\u0000NO\u0005+\u0000\u0000"+
		"OQ\u0003\b\u0004\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000Vm\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0006\u0000\u0000XY\u0005.\u0000\u0000YZ\u0005\u0007\u0000"+
		"\u0000Z[\u0005.\u0000\u0000[\\\u0005\r\u0000\u0000\\m\u0003\b\u0004\u0000"+
		"]^\u0005\u0006\u0000\u0000^_\u0005.\u0000\u0000_`\u0005\u0007\u0000\u0000"+
		"`a\u0005.\u0000\u0000ab\u0005\u000e\u0000\u0000bm\u0005\u000f\u0000\u0000"+
		"cd\u0005\u0006\u0000\u0000de\u0005.\u0000\u0000ef\u0005\u0007\u0000\u0000"+
		"fg\u0005.\u0000\u0000gh\u0005*\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005"+
		"\t\u0000\u0000jk\u0003\b\u0004\u0000km\u0001\u0000\u0000\u0000l9\u0001"+
		"\u0000\u0000\u0000l<\u0001\u0000\u0000\u0000l@\u0001\u0000\u0000\u0000"+
		"lG\u0001\u0000\u0000\u0000lW\u0001\u0000\u0000\u0000l]\u0001\u0000\u0000"+
		"\u0000lc\u0001\u0000\u0000\u0000ms\u0001\u0000\u0000\u0000no\n\b\u0000"+
		"\u0000op\u0007\u0002\u0000\u0000pr\u0003\u0006\u0003\tqn\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\u0007\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"v\u0087\u0005/\u0000\u0000w\u0087\u00050\u0000\u0000x\u0087\u00051\u0000"+
		"\u0000y\u0087\u00052\u0000\u0000z\u0087\u0005.\u0000\u0000{|\u0005,\u0000"+
		"\u0000|\u0081\u0003\b\u0004\u0000}~\u0005+\u0000\u0000~\u0080\u0003\b"+
		"\u0004\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005-\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086v\u0001\u0000\u0000\u0000\u0086w\u0001\u0000\u0000\u0000\u0086x"+
		"\u0001\u0000\u0000\u0000\u0086y\u0001\u0000\u0000\u0000\u0086z\u0001\u0000"+
		"\u0000\u0000\u0086{\u0001\u0000\u0000\u0000\u0087\t\u0001\u0000\u0000"+
		"\u0000\r\r\u001c\u001f%-/37Rls\u0081\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}