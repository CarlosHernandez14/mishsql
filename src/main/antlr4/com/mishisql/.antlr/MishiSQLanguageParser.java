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
		T__0=1, T__1=2, T__2=3, IMP_ORDER=4, SELECT=5, ALL=6, SPECIFIC_COL=7, 
		SPECIFIC_ATTR=8, FROM=9, WHERE=10, ON=11, WITH=12, INNER_JOIN=13, LEFT_JOIN=14, 
		RIGHT_JOIN=15, FULL_JOIN=16, AND=17, OR=18, NOT=19, IN=20, LIKE=21, IS=22, 
		NULL=23, ORDER=24, BY=25, ASC=26, DESC=27, LIMIT=28, OFFSET=29, INSERT=30, 
		INTO=31, VALUES=32, UPDATE=33, SET=34, DELETE=35, CREATE=36, USE=37, TABLE=38, 
		ALTER=39, DROP=40, ADD=41, COLUMN=42, PRIMARY=43, EQUAL=44, NOT_EQUAL=45, 
		LESS_THAN=46, LESS_THAN_EQUAL=47, GREATER_THAN=48, GREATER_THAN_EQUAL=49, 
		BETWEEN=50, COMMA=51, LPAREN=52, RPAREN=53, ID=54, INT=55, DOUBLE=56, 
		VARCHAR=57, BOOLEAN=58, WS=59;
	public static final int
		RULE_start = 0, RULE_query = 1, RULE_selectQuery = 2, RULE_from_join = 3, 
		RULE_condition = 4, RULE_join_condition = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "query", "selectQuery", "from_join", "condition", "join_condition", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'REGISTROS'", "'DE LA'", "'SEA'", "'MISHI'", "'MUESTRAME'", "'TODOS LOS MISHI DATOS'", 
			"'LOS MISHICAMPOS'", "'EL CAMPO'", "'DE'", "'FILTRANDO DONDE'", "'DONDE'", 
			"'CON'", "'UNION INTERNA'", "'UNION IZQUIERDA'", "'UNION DERECHA'", "'UNION COMPLETA'", 
			"'Y'", "'O'", "'NOT'", "'IN'", "'LIKE'", "'IS'", "'VACIO'", "'ORDENAMELO'", 
			"'POR'", "'ASCENDENTE'", "'DESCENDENTE'", "'PERO SOLO DAME'", "'OFFSET'", 
			"'AGREGA A'", "'INTO'", "'LOS VALORES'", "'ACTUALIZA LA'", "'ASIGNA'", 
			"'ELIMINA'", "'HAZME UNA'", "'USA LA BD'", "'TABLA'", "'MODIFICA'", "'BORRA'", 
			"'AGREGA'", "'COLUMNA'", "'PRIMARIA'", "'IGUAL A'", "'DIFERENTE DE'", 
			"'MENOR QUE'", "'MENOR O IGUAL QUE'", "'MAYOR QUE'", "'MAYOR O IGUAL QUE'", 
			"'ESTE ENTRE'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IMP_ORDER", "SELECT", "ALL", "SPECIFIC_COL", 
			"SPECIFIC_ATTR", "FROM", "WHERE", "ON", "WITH", "INNER_JOIN", "LEFT_JOIN", 
			"RIGHT_JOIN", "FULL_JOIN", "AND", "OR", "NOT", "IN", "LIKE", "IS", "NULL", 
			"ORDER", "BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", 
			"UPDATE", "SET", "DELETE", "CREATE", "USE", "TABLE", "ALTER", "DROP", 
			"ADD", "COLUMN", "PRIMARY", "EQUAL", "NOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL", 
			"GREATER_THAN", "GREATER_THAN_EQUAL", "BETWEEN", "COMMA", "LPAREN", "RPAREN", 
			"ID", "INT", "DOUBLE", "VARCHAR", "BOOLEAN", "WS"
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				query();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMP_ORDER );
			setState(19);
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
			setState(21);
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
		public Token limitValue;
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode SELECT() { return getToken(MishiSQLanguageParser.SELECT, 0); }
		public TerminalNode ALL() { return getToken(MishiSQLanguageParser.ALL, 0); }
		public TerminalNode WHERE() { return getToken(MishiSQLanguageParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(MishiSQLanguageParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MishiSQLanguageParser.BY, 0); }
		public List<TerminalNode> FROM() { return getTokens(MishiSQLanguageParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(MishiSQLanguageParser.FROM, i);
		}
		public TerminalNode LIMIT() { return getToken(MishiSQLanguageParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(MishiSQLanguageParser.OFFSET, 0); }
		public List<TerminalNode> INT() { return getTokens(MishiSQLanguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MishiSQLanguageParser.INT, i);
		}
		public TerminalNode SPECIFIC_COL() { return getToken(MishiSQLanguageParser.SPECIFIC_COL, 0); }
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public List<From_joinContext> from_join() {
			return getRuleContexts(From_joinContext.class);
		}
		public From_joinContext from_join(int i) {
			return getRuleContext(From_joinContext.class,i);
		}
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
			setState(23);
			match(IMP_ORDER);
			setState(24);
			match(SELECT);
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(25);
				match(ALL);
				}
				break;
			case SPECIFIC_COL:
				{
				{
				setState(26);
				match(SPECIFIC_COL);
				setState(27);
				((SelectQueryContext)_localctx).ID = match(ID);
				((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(28);
					match(COMMA);
					setState(29);
					((SelectQueryContext)_localctx).ID = match(ID);
					((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				{
				{
				setState(37);
				match(FROM);
				setState(38);
				((SelectQueryContext)_localctx).tableId = match(ID);
				}
				}
				break;
			case T__1:
				{
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					from_join();
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(46);
				match(WHERE);
				setState(47);
				condition(0);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(50);
				match(ORDER);
				setState(51);
				match(BY);
				setState(52);
				((SelectQueryContext)_localctx).orderID = match(ID);
				setState(53);
				match(FROM);
				setState(54);
				((SelectQueryContext)_localctx).tableidOrder = match(ID);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(55);
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

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(60);
				match(LIMIT);
				setState(61);
				((SelectQueryContext)_localctx).limitValue = match(INT);
				setState(62);
				match(T__0);
				}
			}

			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(65);
				match(OFFSET);
				setState(66);
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
	public static class From_joinContext extends ParserRuleContext {
		public Token joinType;
		public Token tableIdJoin;
		public Token joinTable;
		public TerminalNode FROM() { return getToken(MishiSQLanguageParser.FROM, 0); }
		public TerminalNode WITH() { return getToken(MishiSQLanguageParser.WITH, 0); }
		public TerminalNode ON() { return getToken(MishiSQLanguageParser.ON, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public TerminalNode INNER_JOIN() { return getToken(MishiSQLanguageParser.INNER_JOIN, 0); }
		public TerminalNode LEFT_JOIN() { return getToken(MishiSQLanguageParser.LEFT_JOIN, 0); }
		public TerminalNode RIGHT_JOIN() { return getToken(MishiSQLanguageParser.RIGHT_JOIN, 0); }
		public TerminalNode FULL_JOIN() { return getToken(MishiSQLanguageParser.FULL_JOIN, 0); }
		public From_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join; }
	}

	public final From_joinContext from_join() throws RecognitionException {
		From_joinContext _localctx = new From_joinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(70);
			((From_joinContext)_localctx).joinType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
				((From_joinContext)_localctx).joinType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			match(FROM);
			setState(72);
			((From_joinContext)_localctx).tableIdJoin = match(ID);
			setState(73);
			match(WITH);
			setState(74);
			((From_joinContext)_localctx).joinTable = match(ID);
			setState(75);
			match(ON);
			setState(76);
			join_condition();
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(79);
				match(NOT);
				setState(80);
				condition(7);
				}
				break;
			case 2:
				{
				setState(81);
				match(LPAREN);
				setState(82);
				condition(0);
				setState(83);
				match(RPAREN);
				}
				break;
			case 3:
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
				match(T__2);
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307720798208L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				value();
				}
				break;
			case 4:
				{
				setState(92);
				match(SPECIFIC_ATTR);
				setState(93);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(94);
				match(FROM);
				setState(95);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(96);
				match(IN);
				setState(97);
				match(LPAREN);
				setState(98);
				value();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					value();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(108);
				match(SPECIFIC_ATTR);
				setState(109);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(110);
				match(FROM);
				setState(111);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(112);
				match(LIKE);
				setState(113);
				value();
				}
				break;
			case 6:
				{
				setState(114);
				match(SPECIFIC_ATTR);
				setState(115);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(116);
				match(FROM);
				setState(117);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(118);
				match(IS);
				setState(119);
				match(NULL);
				}
				break;
			case 7:
				{
				setState(120);
				match(SPECIFIC_ATTR);
				setState(121);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(122);
				match(FROM);
				setState(123);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(124);
				match(BETWEEN);
				setState(125);
				value();
				setState(126);
				match(AND);
				setState(127);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(131);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(132);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(133);
					condition(9);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class Join_conditionContext extends ParserRuleContext {
		public Token attrName;
		public Token tableName;
		public Token attrJoin;
		public Token tableJoin;
		public TerminalNode SPECIFIC_ATTR() { return getToken(MishiSQLanguageParser.SPECIFIC_ATTR, 0); }
		public List<TerminalNode> FROM() { return getTokens(MishiSQLanguageParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(MishiSQLanguageParser.FROM, i);
		}
		public TerminalNode EQUAL() { return getToken(MishiSQLanguageParser.EQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(SPECIFIC_ATTR);
			setState(140);
			((Join_conditionContext)_localctx).attrName = match(ID);
			setState(141);
			match(FROM);
			setState(142);
			((Join_conditionContext)_localctx).tableName = match(ID);
			setState(143);
			match(T__2);
			setState(144);
			match(EQUAL);
			setState(145);
			((Join_conditionContext)_localctx).attrJoin = match(ID);
			setState(146);
			match(FROM);
			setState(147);
			((Join_conditionContext)_localctx).tableJoin = match(ID);
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
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(VARCHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(BOOLEAN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(LPAREN);
				setState(155);
				value();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(156);
					match(COMMA);
					setState(157);
					value();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
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
		case 4:
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
		"\u0004\u0001;\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t"+
		"\u0002\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002)\b\u0002\u000b\u0002\f\u0002*\u0003\u0002-\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00021\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00029\b\u0002\u0003\u0002"+
		";\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u009f\b\u0006\n\u0006\f\u0006\u00a2\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00a6\b\u0006\u0001\u0006\u0000\u0001\b"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0004\u0001\u0000\u001a\u001b"+
		"\u0001\u0000\r\u0010\u0001\u0000,1\u0001\u0000\u0011\u0012\u00b8\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004"+
		"\u0017\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\b\u0081"+
		"\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u00a5\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0003\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u0004\u0000\u0000\u0018#\u0005\u0005"+
		"\u0000\u0000\u0019$\u0005\u0006\u0000\u0000\u001a\u001b\u0005\u0007\u0000"+
		"\u0000\u001b \u00056\u0000\u0000\u001c\u001d\u00053\u0000\u0000\u001d"+
		"\u001f\u00056\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\""+
		"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#\u0019"+
		"\u0001\u0000\u0000\u0000#\u001a\u0001\u0000\u0000\u0000$,\u0001\u0000"+
		"\u0000\u0000%&\u0005\t\u0000\u0000&-\u00056\u0000\u0000\')\u0003\u0006"+
		"\u0003\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000"+
		",%\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000./\u0005\n\u0000\u0000/1\u0003\b\u0004\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001:\u0001\u0000\u0000\u000023\u0005\u0018"+
		"\u0000\u000034\u0005\u0019\u0000\u000045\u00056\u0000\u000056\u0005\t"+
		"\u0000\u000068\u00056\u0000\u000079\u0007\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:2\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;?\u0001\u0000\u0000\u0000"+
		"<=\u0005\u001c\u0000\u0000=>\u00057\u0000\u0000>@\u0005\u0001\u0000\u0000"+
		"?<\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000AB\u0005\u001d\u0000\u0000BD\u00057\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0002\u0000\u0000FG\u0007\u0001\u0000\u0000GH\u0005\t\u0000\u0000HI\u0005"+
		"6\u0000\u0000IJ\u0005\f\u0000\u0000JK\u00056\u0000\u0000KL\u0005\u000b"+
		"\u0000\u0000LM\u0003\n\u0005\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0006"+
		"\u0004\uffff\uffff\u0000OP\u0005\u0013\u0000\u0000P\u0082\u0003\b\u0004"+
		"\u0007QR\u00054\u0000\u0000RS\u0003\b\u0004\u0000ST\u00055\u0000\u0000"+
		"T\u0082\u0001\u0000\u0000\u0000UV\u0005\b\u0000\u0000VW\u00056\u0000\u0000"+
		"WX\u0005\t\u0000\u0000XY\u00056\u0000\u0000YZ\u0005\u0003\u0000\u0000"+
		"Z[\u0007\u0002\u0000\u0000[\u0082\u0003\f\u0006\u0000\\]\u0005\b\u0000"+
		"\u0000]^\u00056\u0000\u0000^_\u0005\t\u0000\u0000_`\u00056\u0000\u0000"+
		"`a\u0005\u0014\u0000\u0000ab\u00054\u0000\u0000bg\u0003\f\u0006\u0000"+
		"cd\u00053\u0000\u0000df\u0003\f\u0006\u0000ec\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u00055\u0000"+
		"\u0000k\u0082\u0001\u0000\u0000\u0000lm\u0005\b\u0000\u0000mn\u00056\u0000"+
		"\u0000no\u0005\t\u0000\u0000op\u00056\u0000\u0000pq\u0005\u0015\u0000"+
		"\u0000q\u0082\u0003\f\u0006\u0000rs\u0005\b\u0000\u0000st\u00056\u0000"+
		"\u0000tu\u0005\t\u0000\u0000uv\u00056\u0000\u0000vw\u0005\u0016\u0000"+
		"\u0000w\u0082\u0005\u0017\u0000\u0000xy\u0005\b\u0000\u0000yz\u00056\u0000"+
		"\u0000z{\u0005\t\u0000\u0000{|\u00056\u0000\u0000|}\u00052\u0000\u0000"+
		"}~\u0003\f\u0006\u0000~\u007f\u0005\u0011\u0000\u0000\u007f\u0080\u0003"+
		"\f\u0006\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081N\u0001\u0000"+
		"\u0000\u0000\u0081Q\u0001\u0000\u0000\u0000\u0081U\u0001\u0000\u0000\u0000"+
		"\u0081\\\u0001\u0000\u0000\u0000\u0081l\u0001\u0000\u0000\u0000\u0081"+
		"r\u0001\u0000\u0000\u0000\u0081x\u0001\u0000\u0000\u0000\u0082\u0088\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\n\b\u0000\u0000\u0084\u0085\u0007\u0003"+
		"\u0000\u0000\u0085\u0087\u0003\b\u0004\t\u0086\u0083\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\t\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c"+
		"\u008d\u00056\u0000\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u008f"+
		"\u00056\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0005"+
		",\u0000\u0000\u0091\u0092\u00056\u0000\u0000\u0092\u0093\u0005\t\u0000"+
		"\u0000\u0093\u0094\u00056\u0000\u0000\u0094\u000b\u0001\u0000\u0000\u0000"+
		"\u0095\u00a6\u00057\u0000\u0000\u0096\u00a6\u00058\u0000\u0000\u0097\u00a6"+
		"\u00059\u0000\u0000\u0098\u00a6\u0005:\u0000\u0000\u0099\u00a6\u00056"+
		"\u0000\u0000\u009a\u009b\u00054\u0000\u0000\u009b\u00a0\u0003\f\u0006"+
		"\u0000\u009c\u009d\u00053\u0000\u0000\u009d\u009f\u0003\f\u0006\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u00055\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u0095\u0001\u0000\u0000\u0000\u00a5\u0096\u0001\u0000\u0000\u0000\u00a5"+
		"\u0097\u0001\u0000\u0000\u0000\u00a5\u0098\u0001\u0000\u0000\u0000\u00a5"+
		"\u0099\u0001\u0000\u0000\u0000\u00a5\u009a\u0001\u0000\u0000\u0000\u00a6"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0011 #*,08:?Cg\u0081\u0088\u00a0\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}