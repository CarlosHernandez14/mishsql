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
		T__0=1, T__1=2, T__2=3, T__3=4, IMP_ORDER=5, SELECT=6, ALL=7, SPECIFIC_COL=8, 
		FROM=9, WHERE=10, AND=11, OR=12, NOT=13, IN=14, LIKE=15, BETWEEN=16, IS=17, 
		NULL=18, ORDER=19, BY=20, ASC=21, DESC=22, LIMIT=23, OFFSET=24, INSERT=25, 
		INTO=26, VALUES=27, UPDATE=28, SET=29, DELETE=30, CREATE=31, USE=32, TABLE=33, 
		ALTER=34, DROP=35, ADD=36, COLUMN=37, PRIMARY=38, ID=39, INT=40, DOUBLE=41, 
		VARCHAR=42, BOOLEAN=43, WS=44;
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
			null, "','", "'='", "'('", "')'", "'MISHI'", "'MUESTRAME'", "'TODOS LOS MISHI DATOS'", 
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
			null, null, null, null, null, "IMP_ORDER", "SELECT", "ALL", "SPECIFIC_COL", 
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				query();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMP_ORDER );
			setState(13);
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
			setState(15);
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
			setState(17);
			match(IMP_ORDER);
			setState(18);
			match(SELECT);
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(19);
				match(ALL);
				}
				break;
			case SPECIFIC_COL:
				{
				{
				setState(20);
				match(SPECIFIC_COL);
				setState(21);
				((SelectQueryContext)_localctx).ID = match(ID);
				((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(22);
					match(T__0);
					setState(23);
					((SelectQueryContext)_localctx).ID = match(ID);
					((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(31);
			match(FROM);
			setState(32);
			((SelectQueryContext)_localctx).tableId = match(ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(33);
				match(WHERE);
				setState(34);
				condition();
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(37);
				match(ORDER);
				setState(38);
				match(BY);
				setState(39);
				((SelectQueryContext)_localctx).orderID = match(ID);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(40);
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

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(45);
				match(LIMIT);
				setState(46);
				match(INT);
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(49);
				match(OFFSET);
				setState(50);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(ID);
				setState(54);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==VARCHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(56);
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

				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==ID) {
					{
					setState(59);
					condition();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(ID);
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				match(NULL);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(65);
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

				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==ID) {
					{
					setState(68);
					condition();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__1);
				setState(73);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(74);
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

				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==ID) {
					{
					setState(77);
					condition();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__2);
				setState(81);
				condition();
				setState(82);
				match(T__3);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(83);
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

				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==ID) {
					{
					setState(86);
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
		"\u0004\u0001,\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c\t\u0002"+
		"\u0003\u0002\u001e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002*\b\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00020\b\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0003"+
		"\u0003\u0003=\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003C\b\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0003"+
		"\u0003O\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003U\b\u0003\u0001\u0003\u0003\u0003X\b\u0003\u0003\u0003Z\b\u0003"+
		"\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0006\u0001"+
		"\u0000\u0015\u0016\u0001\u0000\u000e\u0010\u0002\u0000\'\'**\u0001\u0000"+
		"\u000b\f\u0002\u0000\r\r\u0011\u0011\u0001\u0000\'*j\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0011\u0001\u0000"+
		"\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000"+
		"\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0003\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0005\u0005\u0000\u0000\u0012\u001d\u0005\u0006\u0000\u0000"+
		"\u0013\u001e\u0005\u0007\u0000\u0000\u0014\u0015\u0005\b\u0000\u0000\u0015"+
		"\u001a\u0005\'\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0019"+
		"\u0005\'\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001c\u0001"+
		"\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001d\u0013\u0001\u0000\u0000\u0000\u001d\u0014\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\t"+
		"\u0000\u0000 #\u0005\'\u0000\u0000!\"\u0005\n\u0000\u0000\"$\u0003\u0006"+
		"\u0003\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$+\u0001"+
		"\u0000\u0000\u0000%&\u0005\u0013\u0000\u0000&\'\u0005\u0014\u0000\u0000"+
		"\')\u0005\'\u0000\u0000(*\u0007\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+%\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0017\u0000\u0000.0\u0005(\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u000012\u0005\u0018\u0000\u0000"+
		"24\u0005(\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"4\u0005\u0001\u0000\u0000\u000056\u0005\'\u0000\u000067\u0007\u0001\u0000"+
		"\u000079\u0007\u0002\u0000\u00008:\u0007\u0003\u0000\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;=\u0003"+
		"\u0006\u0003\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=Z\u0001\u0000\u0000\u0000>?\u0005\'\u0000\u0000?@\u0007\u0004\u0000\u0000"+
		"@B\u0005\u0012\u0000\u0000AC\u0007\u0003\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DF\u0003\u0006"+
		"\u0003\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FZ\u0001"+
		"\u0000\u0000\u0000GH\u0005\'\u0000\u0000HI\u0005\u0002\u0000\u0000IK\u0007"+
		"\u0005\u0000\u0000JL\u0007\u0003\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MO\u0003\u0006\u0003"+
		"\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OZ\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0003\u0006\u0003\u0000RT\u0005"+
		"\u0004\u0000\u0000SU\u0007\u0003\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VX\u0003\u0006\u0003"+
		"\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000Y5\u0001\u0000\u0000\u0000Y>\u0001\u0000\u0000\u0000YG\u0001"+
		"\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000"+
		"\u0000\u0011\u000b\u001a\u001d#)+/39<BEKNTWY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}