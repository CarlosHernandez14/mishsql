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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IMP_ORDER=13, SELECT=14, CREATE=15, ALL=16, 
		SPECIFIC_COL=17, SPECIFIC_ATTR=18, FROM=19, WHERE=20, ON=21, WITH=22, 
		INNER_JOIN=23, LEFT_JOIN=24, RIGHT_JOIN=25, FULL_JOIN=26, AND=27, OR=28, 
		NOT=29, IN=30, LIKE=31, IS=32, NULL=33, ORDER=34, BY=35, ASC=36, DESC=37, 
		LIMIT=38, OFFSET=39, INSERT=40, INTO=41, VALUES=42, UPDATE=43, SET=44, 
		DELETE=45, USE=46, TABLE=47, ALTER=48, DROP=49, ADD=50, COLUMN=51, PRIMARY=52, 
		EQUAL=53, NOT_EQUAL=54, LESS_THAN=55, LESS_THAN_EQUAL=56, GREATER_THAN=57, 
		GREATER_THAN_EQUAL=58, BETWEEN=59, COMMA=60, LPAREN=61, RPAREN=62, ID=63, 
		INT=64, DOUBLE=65, VARCHAR=66, BOOLEAN=67, WS=68;
	public static final int
		RULE_start = 0, RULE_query = 1, RULE_selectQuery = 2, RULE_from_join = 3, 
		RULE_createDatabaseQuery = 4, RULE_useDatabaseQuery = 5, RULE_createTableQuery = 6, 
		RULE_tableFields = 7, RULE_tableField = 8, RULE_sqlType = 9, RULE_fieldConstraint = 10, 
		RULE_foreignKeyClause = 11, RULE_insertQuery = 12, RULE_valueTuples = 13, 
		RULE_valueTuple = 14, RULE_condition = 15, RULE_join_condition = 16, RULE_value = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "query", "selectQuery", "from_join", "createDatabaseQuery", 
			"useDatabaseQuery", "createTableQuery", "tableFields", "tableField", 
			"sqlType", "fieldConstraint", "foreignKeyClause", "insertQuery", "valueTuples", 
			"valueTuple", "condition", "join_condition", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'REGISTROS'", "'DE LA'", "' BASE DE DATOS '", "'QUE'", "'ENTERO'", 
			"'TEXTO'", "'DECIMAL'", "'SEA MISHILLAVE PRIMARIA'", "'NO SEA NULO'", 
			"'Y CON LA MISHILLAVE FORANEA'", "'QUE APUNTA A'", "'SEA'", "'MISHI'", 
			"'MUESTRAME'", "'HAZME UNA'", "'TODOS LOS MISHI DATOS'", "'LOS MISHICAMPOS'", 
			"'EL CAMPO'", "'DE'", "'FILTRANDO DONDE'", "'DONDE'", "'CON'", "'UNION INTERNA'", 
			"'UNION IZQUIERDA'", "'UNION DERECHA'", "'UNION COMPLETA'", "'Y'", "'O'", 
			"'NOT'", "'IN'", "'LIKE'", "'IS'", "'VACIO'", "'ORDENAMELO'", "'POR'", 
			"'ASCENDENTE'", "'DESCENDENTE'", "'PERO SOLO DAME'", "'OFFSET'", "'AGREGA A'", 
			"'INTO'", "'LOS VALORES'", "'ACTUALIZA LA'", "'ASIGNA'", "'ELIMINA'", 
			"'USA LA BD'", "'TABLA'", "'MODIFICA'", "'BORRA'", "'AGREGA'", "'COLUMNA'", 
			"'PRIMARIA'", "'IGUAL A'", "'DIFERENTE DE'", "'MENOR QUE'", "'MENOR O IGUAL QUE'", 
			"'MAYOR QUE'", "'MAYOR O IGUAL QUE'", "'ESTE ENTRE'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IMP_ORDER", "SELECT", "CREATE", "ALL", "SPECIFIC_COL", "SPECIFIC_ATTR", 
			"FROM", "WHERE", "ON", "WITH", "INNER_JOIN", "LEFT_JOIN", "RIGHT_JOIN", 
			"FULL_JOIN", "AND", "OR", "NOT", "IN", "LIKE", "IS", "NULL", "ORDER", 
			"BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", "UPDATE", 
			"SET", "DELETE", "USE", "TABLE", "ALTER", "DROP", "ADD", "COLUMN", "PRIMARY", 
			"EQUAL", "NOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", 
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				query();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMP_ORDER );
			setState(41);
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
		public CreateDatabaseQueryContext createDatabaseQuery() {
			return getRuleContext(CreateDatabaseQueryContext.class,0);
		}
		public UseDatabaseQueryContext useDatabaseQuery() {
			return getRuleContext(UseDatabaseQueryContext.class,0);
		}
		public CreateTableQueryContext createTableQuery() {
			return getRuleContext(CreateTableQueryContext.class,0);
		}
		public InsertQueryContext insertQuery() {
			return getRuleContext(InsertQueryContext.class,0);
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				selectQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				createDatabaseQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				useDatabaseQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				createTableQuery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				insertQuery();
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
			setState(50);
			match(IMP_ORDER);
			setState(51);
			match(SELECT);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(52);
				match(ALL);
				}
				break;
			case SPECIFIC_COL:
				{
				{
				setState(53);
				match(SPECIFIC_COL);
				setState(54);
				((SelectQueryContext)_localctx).ID = match(ID);
				((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(55);
					match(COMMA);
					setState(56);
					((SelectQueryContext)_localctx).ID = match(ID);
					((SelectQueryContext)_localctx).ids.add(((SelectQueryContext)_localctx).ID);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				{
				{
				setState(64);
				match(FROM);
				setState(65);
				((SelectQueryContext)_localctx).tableId = match(ID);
				}
				}
				break;
			case T__1:
				{
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					from_join();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(73);
				match(WHERE);
				setState(74);
				condition(0);
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(77);
				match(ORDER);
				setState(78);
				match(BY);
				setState(79);
				((SelectQueryContext)_localctx).orderID = match(ID);
				setState(80);
				match(FROM);
				setState(81);
				((SelectQueryContext)_localctx).tableidOrder = match(ID);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(82);
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

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(87);
				match(LIMIT);
				setState(88);
				((SelectQueryContext)_localctx).limitValue = match(INT);
				setState(89);
				match(T__0);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(92);
				match(OFFSET);
				setState(93);
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
			setState(96);
			match(T__1);
			setState(97);
			((From_joinContext)_localctx).joinType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
				((From_joinContext)_localctx).joinType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(FROM);
			setState(99);
			((From_joinContext)_localctx).tableIdJoin = match(ID);
			setState(100);
			match(WITH);
			setState(101);
			((From_joinContext)_localctx).joinTable = match(ID);
			setState(102);
			match(ON);
			setState(103);
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
	public static class CreateDatabaseQueryContext extends ParserRuleContext {
		public Token dbName;
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode CREATE() { return getToken(MishiSQLanguageParser.CREATE, 0); }
		public TerminalNode ID() { return getToken(MishiSQLanguageParser.ID, 0); }
		public CreateDatabaseQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseQuery; }
	}

	public final CreateDatabaseQueryContext createDatabaseQuery() throws RecognitionException {
		CreateDatabaseQueryContext _localctx = new CreateDatabaseQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDatabaseQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IMP_ORDER);
			setState(106);
			match(CREATE);
			setState(107);
			match(T__2);
			setState(108);
			((CreateDatabaseQueryContext)_localctx).dbName = match(ID);
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
	public static class UseDatabaseQueryContext extends ParserRuleContext {
		public Token dbName;
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode USE() { return getToken(MishiSQLanguageParser.USE, 0); }
		public TerminalNode ID() { return getToken(MishiSQLanguageParser.ID, 0); }
		public UseDatabaseQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabaseQuery; }
	}

	public final UseDatabaseQueryContext useDatabaseQuery() throws RecognitionException {
		UseDatabaseQueryContext _localctx = new UseDatabaseQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_useDatabaseQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IMP_ORDER);
			setState(111);
			match(USE);
			setState(112);
			((UseDatabaseQueryContext)_localctx).dbName = match(ID);
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
	public static class CreateTableQueryContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode CREATE() { return getToken(MishiSQLanguageParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MishiSQLanguageParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(MishiSQLanguageParser.WITH, 0); }
		public TerminalNode SPECIFIC_COL() { return getToken(MishiSQLanguageParser.SPECIFIC_COL, 0); }
		public TableFieldsContext tableFields() {
			return getRuleContext(TableFieldsContext.class,0);
		}
		public TerminalNode ID() { return getToken(MishiSQLanguageParser.ID, 0); }
		public ForeignKeyClauseContext foreignKeyClause() {
			return getRuleContext(ForeignKeyClauseContext.class,0);
		}
		public CreateTableQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableQuery; }
	}

	public final CreateTableQueryContext createTableQuery() throws RecognitionException {
		CreateTableQueryContext _localctx = new CreateTableQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createTableQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IMP_ORDER);
			setState(115);
			match(CREATE);
			setState(116);
			match(TABLE);
			setState(117);
			((CreateTableQueryContext)_localctx).tableName = match(ID);
			setState(118);
			match(WITH);
			setState(119);
			match(SPECIFIC_COL);
			setState(120);
			tableFields();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(121);
				foreignKeyClause();
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
	public static class TableFieldsContext extends ParserRuleContext {
		public List<TableFieldContext> tableField() {
			return getRuleContexts(TableFieldContext.class);
		}
		public TableFieldContext tableField(int i) {
			return getRuleContext(TableFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MishiSQLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MishiSQLanguageParser.COMMA, i);
		}
		public TableFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFields; }
	}

	public final TableFieldsContext tableFields() throws RecognitionException {
		TableFieldsContext _localctx = new TableFieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			tableField();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					tableField();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(132);
				match(COMMA);
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
	public static class TableFieldContext extends ParserRuleContext {
		public Token fieldName;
		public SqlTypeContext fieldType;
		public FieldConstraintContext fieldConstraint;
		public List<FieldConstraintContext> constraints = new ArrayList<FieldConstraintContext>();
		public TerminalNode ID() { return getToken(MishiSQLanguageParser.ID, 0); }
		public SqlTypeContext sqlType() {
			return getRuleContext(SqlTypeContext.class,0);
		}
		public List<FieldConstraintContext> fieldConstraint() {
			return getRuleContexts(FieldConstraintContext.class);
		}
		public FieldConstraintContext fieldConstraint(int i) {
			return getRuleContext(FieldConstraintContext.class,i);
		}
		public TableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableField; }
	}

	public final TableFieldContext tableField() throws RecognitionException {
		TableFieldContext _localctx = new TableFieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((TableFieldContext)_localctx).fieldName = match(ID);
			setState(136);
			((TableFieldContext)_localctx).fieldType = sqlType();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(137);
				match(T__3);
				setState(138);
				((TableFieldContext)_localctx).fieldConstraint = fieldConstraint();
				((TableFieldContext)_localctx).constraints.add(((TableFieldContext)_localctx).fieldConstraint);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__8) {
					{
					{
					setState(139);
					((TableFieldContext)_localctx).fieldConstraint = fieldConstraint();
					((TableFieldContext)_localctx).constraints.add(((TableFieldContext)_localctx).fieldConstraint);
					}
					}
					setState(144);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SqlTypeContext extends ParserRuleContext {
		public SqlTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlType; }
	}

	public final SqlTypeContext sqlType() throws RecognitionException {
		SqlTypeContext _localctx = new SqlTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sqlType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
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
	public static class FieldConstraintContext extends ParserRuleContext {
		public FieldConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldConstraint; }
	}

	public final FieldConstraintContext fieldConstraint() throws RecognitionException {
		FieldConstraintContext _localctx = new FieldConstraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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
	public static class ForeignKeyClauseContext extends ParserRuleContext {
		public Token fkField;
		public Token refField;
		public Token refTable;
		public TerminalNode FROM() { return getToken(MishiSQLanguageParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(MishiSQLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MishiSQLanguageParser.ID, i);
		}
		public ForeignKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyClause; }
	}

	public final ForeignKeyClauseContext foreignKeyClause() throws RecognitionException {
		ForeignKeyClauseContext _localctx = new ForeignKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreignKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__9);
			setState(152);
			((ForeignKeyClauseContext)_localctx).fkField = match(ID);
			setState(153);
			match(T__10);
			setState(154);
			((ForeignKeyClauseContext)_localctx).refField = match(ID);
			setState(155);
			match(FROM);
			setState(156);
			((ForeignKeyClauseContext)_localctx).refTable = match(ID);
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
	public static class InsertQueryContext extends ParserRuleContext {
		public TerminalNode IMP_ORDER() { return getToken(MishiSQLanguageParser.IMP_ORDER, 0); }
		public TerminalNode INSERT() { return getToken(MishiSQLanguageParser.INSERT, 0); }
		public TerminalNode ID() { return getToken(MishiSQLanguageParser.ID, 0); }
		public TerminalNode VALUES() { return getToken(MishiSQLanguageParser.VALUES, 0); }
		public ValueTuplesContext valueTuples() {
			return getRuleContext(ValueTuplesContext.class,0);
		}
		public InsertQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertQuery; }
	}

	public final InsertQueryContext insertQuery() throws RecognitionException {
		InsertQueryContext _localctx = new InsertQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insertQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IMP_ORDER);
			setState(159);
			match(INSERT);
			setState(160);
			match(ID);
			setState(161);
			match(VALUES);
			setState(162);
			valueTuples();
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
	public static class ValueTuplesContext extends ParserRuleContext {
		public List<ValueTupleContext> valueTuple() {
			return getRuleContexts(ValueTupleContext.class);
		}
		public ValueTupleContext valueTuple(int i) {
			return getRuleContext(ValueTupleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MishiSQLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MishiSQLanguageParser.COMMA, i);
		}
		public ValueTuplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueTuples; }
	}

	public final ValueTuplesContext valueTuples() throws RecognitionException {
		ValueTuplesContext _localctx = new ValueTuplesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valueTuples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			valueTuple();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				valueTuple();
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
	public static class ValueTupleContext extends ParserRuleContext {
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
		public ValueTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueTuple; }
	}

	public final ValueTupleContext valueTuple() throws RecognitionException {
		ValueTupleContext _localctx = new ValueTupleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LPAREN);
			setState(173);
			value();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(175);
				value();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(RPAREN);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(184);
				match(NOT);
				setState(185);
				condition(7);
				}
				break;
			case 2:
				{
				setState(186);
				match(LPAREN);
				setState(187);
				condition(0);
				setState(188);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(190);
				match(SPECIFIC_ATTR);
				setState(191);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(192);
				match(FROM);
				setState(193);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(194);
				match(T__11);
				setState(195);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 567453553048682496L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				value();
				}
				break;
			case 4:
				{
				setState(197);
				match(SPECIFIC_ATTR);
				setState(198);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(199);
				match(FROM);
				setState(200);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(201);
				match(IN);
				setState(202);
				match(LPAREN);
				setState(203);
				value();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(204);
					match(COMMA);
					setState(205);
					value();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(213);
				match(SPECIFIC_ATTR);
				setState(214);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(215);
				match(FROM);
				setState(216);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(217);
				match(LIKE);
				setState(218);
				value();
				}
				break;
			case 6:
				{
				setState(219);
				match(SPECIFIC_ATTR);
				setState(220);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(221);
				match(FROM);
				setState(222);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(223);
				match(IS);
				setState(224);
				match(NULL);
				}
				break;
			case 7:
				{
				setState(225);
				match(SPECIFIC_ATTR);
				setState(226);
				((ConditionContext)_localctx).attrName = match(ID);
				setState(227);
				match(FROM);
				setState(228);
				((ConditionContext)_localctx).tableName = match(ID);
				setState(229);
				match(BETWEEN);
				setState(230);
				value();
				setState(231);
				match(AND);
				setState(232);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(236);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(238);
					condition(9);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 32, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(SPECIFIC_ATTR);
			setState(245);
			((Join_conditionContext)_localctx).attrName = match(ID);
			setState(246);
			match(FROM);
			setState(247);
			((Join_conditionContext)_localctx).tableName = match(ID);
			setState(248);
			match(T__11);
			setState(249);
			match(EQUAL);
			setState(250);
			((Join_conditionContext)_localctx).attrJoin = match(ID);
			setState(251);
			match(FROM);
			setState(252);
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
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(VARCHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(BOOLEAN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(LPAREN);
				setState(260);
				value();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261);
					match(COMMA);
					setState(262);
					value();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
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
		case 15:
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
		"\u0004\u0001D\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0003\u0002?\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002D\b\u0002\u000b\u0002"+
		"\f\u0002E\u0003\u0002H\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002L\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002T\b\u0002\u0003\u0002V\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"_\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0080\b\u0007\n\u0007\f\u0007\u0083"+
		"\t\u0007\u0001\u0007\u0003\u0007\u0086\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u008d\b\b\n\b\f\b\u0090\t\b\u0003\b\u0092\b\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a8\b\r\n\r\f\r\u00ab"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b1"+
		"\b\u000e\n\u000e\f\u000e\u00b4\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00cf\b\u000f"+
		"\n\u000f\f\u000f\u00d2\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00eb\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00f0\b\u000f\n\u000f\f\u000f\u00f3\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0108\b\u0011\n\u0011\f\u0011\u010b\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u010f\b\u0011\u0001\u0011\u0000\u0001\u001e\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0006\u0001\u0000$%\u0001\u0000\u0017\u001a\u0001\u0000"+
		"\u0005\u0007\u0001\u0000\b\t\u0001\u00005:\u0001\u0000\u001b\u001c\u0121"+
		"\u0000%\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00042"+
		"\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\bi\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e"+
		"|\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u0093"+
		"\u0001\u0000\u0000\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016\u0097"+
		"\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u00a4"+
		"\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00ea"+
		"\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u010e\u0001"+
		"\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001"+
		"\u0001\u0000\u0000\u0000+1\u0003\u0004\u0002\u0000,1\u0003\b\u0004\u0000"+
		"-1\u0003\n\u0005\u0000.1\u0003\f\u0006\u0000/1\u0003\u0018\f\u00000+\u0001"+
		"\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000"+
		"\u0000\u000023\u0005\r\u0000\u00003>\u0005\u000e\u0000\u00004?\u0005\u0010"+
		"\u0000\u000056\u0005\u0011\u0000\u00006;\u0005?\u0000\u000078\u0005<\u0000"+
		"\u00008:\u0005?\u0000\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>4\u0001\u0000\u0000\u0000>5\u0001"+
		"\u0000\u0000\u0000?G\u0001\u0000\u0000\u0000@A\u0005\u0013\u0000\u0000"+
		"AH\u0005?\u0000\u0000BD\u0003\u0006\u0003\u0000CB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000GC\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IJ\u0005\u0014\u0000\u0000JL\u0003"+
		"\u001e\u000f\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LU\u0001\u0000\u0000\u0000MN\u0005\"\u0000\u0000NO\u0005#\u0000\u0000"+
		"OP\u0005?\u0000\u0000PQ\u0005\u0013\u0000\u0000QS\u0005?\u0000\u0000R"+
		"T\u0007\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VZ\u0001\u0000\u0000\u0000WX\u0005&\u0000\u0000XY\u0005@\u0000"+
		"\u0000Y[\u0005\u0001\u0000\u0000ZW\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\]\u0005\'\u0000\u0000]_\u0005"+
		"@\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0005"+
		"\u0001\u0000\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0007\u0001\u0000"+
		"\u0000bc\u0005\u0013\u0000\u0000cd\u0005?\u0000\u0000de\u0005\u0016\u0000"+
		"\u0000ef\u0005?\u0000\u0000fg\u0005\u0015\u0000\u0000gh\u0003 \u0010\u0000"+
		"h\u0007\u0001\u0000\u0000\u0000ij\u0005\r\u0000\u0000jk\u0005\u000f\u0000"+
		"\u0000kl\u0005\u0003\u0000\u0000lm\u0005?\u0000\u0000m\t\u0001\u0000\u0000"+
		"\u0000no\u0005\r\u0000\u0000op\u0005.\u0000\u0000pq\u0005?\u0000\u0000"+
		"q\u000b\u0001\u0000\u0000\u0000rs\u0005\r\u0000\u0000st\u0005\u000f\u0000"+
		"\u0000tu\u0005/\u0000\u0000uv\u0005?\u0000\u0000vw\u0005\u0016\u0000\u0000"+
		"wx\u0005\u0011\u0000\u0000xz\u0003\u000e\u0007\u0000y{\u0003\u0016\u000b"+
		"\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\r\u0001\u0000"+
		"\u0000\u0000|\u0081\u0003\u0010\b\u0000}~\u0005<\u0000\u0000~\u0080\u0003"+
		"\u0010\b\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0005<\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u000f\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005?\u0000\u0000\u0088\u0091\u0003\u0012\t\u0000"+
		"\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008e\u0003\u0014\n\u0000\u008b"+
		"\u008d\u0003\u0014\n\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0007\u0002\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0007\u0003\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\n\u0000\u0000\u0098\u0099\u0005?\u0000\u0000\u0099\u009a\u0005"+
		"\u000b\u0000\u0000\u009a\u009b\u0005?\u0000\u0000\u009b\u009c\u0005\u0013"+
		"\u0000\u0000\u009c\u009d\u0005?\u0000\u0000\u009d\u0017\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\r\u0000\u0000\u009f\u00a0\u0005(\u0000\u0000"+
		"\u00a0\u00a1\u0005?\u0000\u0000\u00a1\u00a2\u0005*\u0000\u0000\u00a2\u00a3"+
		"\u0003\u001a\r\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4\u00a9\u0003"+
		"\u001c\u000e\u0000\u00a5\u00a6\u0005<\u0000\u0000\u00a6\u00a8\u0003\u001c"+
		"\u000e\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad\u00b2\u0003\"\u0011"+
		"\u0000\u00ae\u00af\u0005<\u0000\u0000\u00af\u00b1\u0003\"\u0011\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005>\u0000\u0000\u00b6\u001d\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0006\u000f\uffff\uffff\u0000\u00b8\u00b9\u0005\u001d\u0000\u0000"+
		"\u00b9\u00eb\u0003\u001e\u000f\u0007\u00ba\u00bb\u0005=\u0000\u0000\u00bb"+
		"\u00bc\u0003\u001e\u000f\u0000\u00bc\u00bd\u0005>\u0000\u0000\u00bd\u00eb"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c0"+
		"\u0005?\u0000\u0000\u00c0\u00c1\u0005\u0013\u0000\u0000\u00c1\u00c2\u0005"+
		"?\u0000\u0000\u00c2\u00c3\u0005\f\u0000\u0000\u00c3\u00c4\u0007\u0004"+
		"\u0000\u0000\u00c4\u00eb\u0003\"\u0011\u0000\u00c5\u00c6\u0005\u0012\u0000"+
		"\u0000\u00c6\u00c7\u0005?\u0000\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000"+
		"\u00c8\u00c9\u0005?\u0000\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca"+
		"\u00cb\u0005=\u0000\u0000\u00cb\u00d0\u0003\"\u0011\u0000\u00cc\u00cd"+
		"\u0005<\u0000\u0000\u00cd\u00cf\u0003\"\u0011\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		">\u0000\u0000\u00d4\u00eb\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0012"+
		"\u0000\u0000\u00d6\u00d7\u0005?\u0000\u0000\u00d7\u00d8\u0005\u0013\u0000"+
		"\u0000\u00d8\u00d9\u0005?\u0000\u0000\u00d9\u00da\u0005\u001f\u0000\u0000"+
		"\u00da\u00eb\u0003\"\u0011\u0000\u00db\u00dc\u0005\u0012\u0000\u0000\u00dc"+
		"\u00dd\u0005?\u0000\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00df"+
		"\u0005?\u0000\u0000\u00df\u00e0\u0005 \u0000\u0000\u00e0\u00eb\u0005!"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0012\u0000\u0000\u00e2\u00e3\u0005?\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0013\u0000\u0000\u00e4\u00e5\u0005?\u0000\u0000"+
		"\u00e5\u00e6\u0005;\u0000\u0000\u00e6\u00e7\u0003\"\u0011\u0000\u00e7"+
		"\u00e8\u0005\u001b\u0000\u0000\u00e8\u00e9\u0003\"\u0011\u0000\u00e9\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ea\u00b7\u0001\u0000\u0000\u0000\u00ea\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ea\u00be\u0001\u0000\u0000\u0000\u00ea\u00c5"+
		"\u0001\u0000\u0000\u0000\u00ea\u00d5\u0001\u0000\u0000\u0000\u00ea\u00db"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00eb\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\n\b\u0000\u0000\u00ed\u00ee\u0007"+
		"\u0005\u0000\u0000\u00ee\u00f0\u0003\u001e\u000f\t\u00ef\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u001f\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0012"+
		"\u0000\u0000\u00f5\u00f6\u0005?\u0000\u0000\u00f6\u00f7\u0005\u0013\u0000"+
		"\u0000\u00f7\u00f8\u0005?\u0000\u0000\u00f8\u00f9\u0005\f\u0000\u0000"+
		"\u00f9\u00fa\u00055\u0000\u0000\u00fa\u00fb\u0005?\u0000\u0000\u00fb\u00fc"+
		"\u0005\u0013\u0000\u0000\u00fc\u00fd\u0005?\u0000\u0000\u00fd!\u0001\u0000"+
		"\u0000\u0000\u00fe\u010f\u0005@\u0000\u0000\u00ff\u010f\u0005A\u0000\u0000"+
		"\u0100\u010f\u0005B\u0000\u0000\u0101\u010f\u0005C\u0000\u0000\u0102\u010f"+
		"\u0005?\u0000\u0000\u0103\u0104\u0005=\u0000\u0000\u0104\u0109\u0003\""+
		"\u0011\u0000\u0105\u0106\u0005<\u0000\u0000\u0106\u0108\u0003\"\u0011"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005>\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000"+
		"\u010e\u00fe\u0001\u0000\u0000\u0000\u010e\u00ff\u0001\u0000\u0000\u0000"+
		"\u010e\u0100\u0001\u0000\u0000\u0000\u010e\u0101\u0001\u0000\u0000\u0000"+
		"\u010e\u0102\u0001\u0000\u0000\u0000\u010e\u0103\u0001\u0000\u0000\u0000"+
		"\u010f#\u0001\u0000\u0000\u0000\u0017\'0;>EGKSUZ^z\u0081\u0085\u008e\u0091"+
		"\u00a9\u00b2\u00d0\u00ea\u00f1\u0109\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}