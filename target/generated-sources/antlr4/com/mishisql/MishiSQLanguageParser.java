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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << LIKE) | (1L << BETWEEN))) != 0)) ) {
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << VARCHAR))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.^\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\5\4 \n\4\3\4\3\4\3\4\3\4"+
		"\5\4&\n\4\3\4\3\4\3\4\3\4\5\4,\n\4\5\4.\n\4\3\4\3\4\5\4\62\n\4\3\4\3\4"+
		"\5\4\66\n\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\5\5"+
		"E\n\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\5\5Q\n\5\3\5\3\5\3\5\3"+
		"\5\5\5W\n\5\3\5\5\5Z\n\5\5\5\\\n\5\3\5\2\2\6\2\4\6\b\2\b\3\2\27\30\3\2"+
		"\20\22\4\2)),,\3\2\r\16\4\2\17\17\23\23\3\2),\2l\2\13\3\2\2\2\4\21\3\2"+
		"\2\2\6\23\3\2\2\2\b[\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13"+
		"\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\5"+
		"\6\4\2\22\5\3\2\2\2\23\24\7\7\2\2\24\37\7\b\2\2\25 \7\t\2\2\26\27\7\n"+
		"\2\2\27\34\7)\2\2\30\31\7\3\2\2\31\33\7)\2\2\32\30\3\2\2\2\33\36\3\2\2"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\37\25\3\2\2\2"+
		"\37\26\3\2\2\2 !\3\2\2\2!\"\7\13\2\2\"%\7)\2\2#$\7\f\2\2$&\5\b\5\2%#\3"+
		"\2\2\2%&\3\2\2\2&-\3\2\2\2\'(\7\25\2\2()\7\26\2\2)+\7)\2\2*,\t\2\2\2+"+
		"*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-\'\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/\60\7\31"+
		"\2\2\60\62\7*\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\64\7\32\2"+
		"\2\64\66\7*\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\678\7)\2\289"+
		"\t\3\2\29;\t\4\2\2:<\t\5\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\b\5\2>"+
		"=\3\2\2\2>?\3\2\2\2?\\\3\2\2\2@A\7)\2\2AB\t\6\2\2BD\7\24\2\2CE\t\5\2\2"+
		"DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\b\5\2GF\3\2\2\2GH\3\2\2\2H\\\3\2\2"+
		"\2IJ\7)\2\2JK\7\4\2\2KM\t\7\2\2LN\t\5\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OQ\5\b\5\2PO\3\2\2\2PQ\3\2\2\2Q\\\3\2\2\2RS\7\5\2\2ST\5\b\5\2TV\7\6"+
		"\2\2UW\t\5\2\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\5\b\5\2YX\3\2\2\2YZ\3\2"+
		"\2\2Z\\\3\2\2\2[\67\3\2\2\2[@\3\2\2\2[I\3\2\2\2[R\3\2\2\2\\\t\3\2\2\2"+
		"\23\r\34\37%+-\61\65;>DGMPVY[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}