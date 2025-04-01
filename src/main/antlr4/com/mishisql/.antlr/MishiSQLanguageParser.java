// Generated from c:/Users/carlo/Documents/CompilersAntlr/mishsql/src/main/antlr4/com/mishisql/MishiSQLanguage.g4 by ANTLR 4.13.1
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
		FROM=8, WHERE=9, AND=10, OR=11, NOT=12, IN=13, LIKE=14, BETWEEN=15, IS=16, 
		NULL=17, ORDER=18, BY=19, ASC=20, DESC=21, LIMIT=22, OFFSET=23, INSERT=24, 
		INTO=25, VALUES=26, UPDATE=27, SET=28, DELETE=29, CREATE=30, USE=31, TABLE=32, 
		ALTER=33, DROP=34, ADD=35, COLUMN=36, PRIMARY=37, ID=38, INT=39, DOUBLE=40, 
		VARCHAR=41, BOOLEAN=42, WS=43;
	public static final int
		RULE_start = 0, RULE_query = 1, RULE_selectQuery = 2, RULE_condition = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "query", "selectQuery", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'MISHI'", "'MUESTRAME'", "'TODOS LOS MISHI DATOS'", 
			"'LOS MISHICAMPOS'", "'DE'", "'DONDE'", "'AND'", "'OR'", "'NOT'", "'IN'", 
			"'LIKE'", "'BETWEEN'", "'IS'", "'VACIO'", "'ORDENAR'", "'POR'", "'ASCENDENTE'", 
			"'DESCENDENTE'", "'LIMIT'", "'OFFSET'", "'AGREGA A'", "'INTO'", "'LOS VALORES'", 
			"'ACTUALIZA LA'", "'ASIGNA'", "'ELIMINA'", "'HAZME UNA'", "'USA LA BD'", 
			"'TABLA'", "'MODIFICA'", "'BORRA'", "'AGREGA'", "'COLUMNA'", "'PRIMARIA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IMP_ORDER", "SELECT", "ALL", "SPECIFIC_COL", 
			"FROM", "WHERE", "AND", "OR", "NOT", "IN", "LIKE", "BETWEEN", "IS", "NULL", 
			"ORDER", "BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", 
			"UPDATE", "SET", "DELETE", "CREATE", "USE", "TABLE", "ALTER", "DROP", 
			"ADD", "COLUMN", "PRIMARY", "ID", "INT", "DOUBLE", "VARCHAR", "BOOLEAN", 
			"WS"
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MishiSQLanguageParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			query();
			setState(9);
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
		public TerminalNode EOF() { return getToken(MishiSQLanguageParser.EOF, 0); }
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
			setState(11);
			selectQuery();
			setState(12);
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
	public static class SelectQueryContext extends ParserRuleContext {
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode SELECT() { return getToken(MishiSQLanguageParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(MishiSQLanguageParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
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
		public TerminalNode ALL() { return getToken(MishiSQLanguageParser.ALL, 0); }
		public TerminalNode SPECIFIC_COL() { return getToken(MishiSQLanguageParser.SPECIFIC_COL, 0); }
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
			setState(14);
			match(IMP_ORDER);
			setState(15);
			match(SELECT);
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==SPECIFIC_COL) {
				{
				setState(16);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==SPECIFIC_COL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(19);
			match(FROM);
			setState(20);
			match(ID);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(21);
				match(WHERE);
				setState(22);
				condition();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(25);
				match(ORDER);
				setState(26);
				match(BY);
				setState(27);
				match(ID);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(28);
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

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(33);
				match(LIMIT);
				setState(34);
				match(INT);
				}
			}

			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(37);
				match(OFFSET);
				setState(38);
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
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public TerminalNode IN() { return getToken(MishiSQLanguageParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(MishiSQLanguageParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(MishiSQLanguageParser.BETWEEN, 0); }
		public TerminalNode VARCHAR() { return getToken(MishiSQLanguageParser.VARCHAR, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MishiSQLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(MishiSQLanguageParser.OR, 0); }
		public TerminalNode NULL() { return getToken(MishiSQLanguageParser.NULL, 0); }
		public TerminalNode IS() { return getToken(MishiSQLanguageParser.IS, 0); }
		public TerminalNode NOT() { return getToken(MishiSQLanguageParser.NOT, 0); }
		public TerminalNode INT() { return getToken(MishiSQLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MishiSQLanguageParser.DOUBLE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==VARCHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(44);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==ID) {
					{
					setState(47);
					condition();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(ID);
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				match(NULL);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(53);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==ID) {
					{
					setState(56);
					condition();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(ID);
				setState(60);
				match(T__0);
				setState(61);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(62);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==ID) {
					{
					setState(65);
					condition();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__1);
				setState(69);
				condition();
				setState(70);
				match(T__2);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(71);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==ID) {
					{
					setState(74);
					condition();
					}
				}

				}
				break;
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
		"\u0004\u0001+P\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0012\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0018\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u001e\b\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001"+
		"\u0003\u0003\u00031\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00037\b\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0003"+
		"\u0003\u0003C\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003I\b\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0003\u0003N\b"+
		"\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0007"+
		"\u0001\u0000\u0006\u0007\u0001\u0000\u0014\u0015\u0001\u0000\r\u000f\u0002"+
		"\u0000&&))\u0001\u0000\n\u000b\u0002\u0000\f\f\u0010\u0010\u0001\u0000"+
		"&)\\\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000"+
		"\u0004\u000e\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\b"+
		"\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000"+
		"\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000\f\r\u0005\u0000\u0000\u0001"+
		"\r\u0003\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0004\u0000\u0000\u000f"+
		"\u0011\u0005\u0005\u0000\u0000\u0010\u0012\u0007\u0000\u0000\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0005\b\u0000\u0000\u0014\u0017"+
		"\u0005&\u0000\u0000\u0015\u0016\u0005\t\u0000\u0000\u0016\u0018\u0003"+
		"\u0006\u0003\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001f\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0012\u0000\u0000\u001a\u001b\u0005\u0013\u0000\u0000\u001b\u001d\u0005"+
		"&\u0000\u0000\u001c\u001e\u0007\u0001\u0000\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f\u0019\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\"\u0005\u0016\u0000\u0000\"$\u0005\'\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0017\u0000\u0000&(\u0005\'\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000"+
		"\u0000)*\u0005&\u0000\u0000*+\u0007\u0002\u0000\u0000+-\u0007\u0003\u0000"+
		"\u0000,.\u0007\u0004\u0000\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0001\u0000\u0000\u0000/1\u0003\u0006\u0003\u00000/\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001N\u0001\u0000\u0000\u0000"+
		"23\u0005&\u0000\u000034\u0007\u0005\u0000\u000046\u0005\u0011\u0000\u0000"+
		"57\u0007\u0004\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u00008:\u0003\u0006\u0003\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:N\u0001\u0000\u0000\u0000;<\u0005"+
		"&\u0000\u0000<=\u0005\u0001\u0000\u0000=?\u0007\u0006\u0000\u0000>@\u0007"+
		"\u0004\u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CN\u0001\u0000\u0000\u0000DE\u0005\u0002"+
		"\u0000\u0000EF\u0003\u0006\u0003\u0000FH\u0005\u0003\u0000\u0000GI\u0007"+
		"\u0004\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IK\u0001\u0000\u0000\u0000JL\u0003\u0006\u0003\u0000KJ\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000M)\u0001\u0000"+
		"\u0000\u0000M2\u0001\u0000\u0000\u0000M;\u0001\u0000\u0000\u0000MD\u0001"+
		"\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000\u000f\u0011\u0017\u001d"+
		"\u001f#\'-069?BHKM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}