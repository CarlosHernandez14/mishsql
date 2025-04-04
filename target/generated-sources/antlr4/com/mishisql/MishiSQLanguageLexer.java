// Generated from com\mishisql\MishiSQLanguage.g4 by ANTLR 4.9.2
package com.mishisql;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MishiSQLanguageLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IMP_ORDER", "SELECT", "ALL", "SPECIFIC_COL", "SPECIFIC_ATTR", 
			"FROM", "WHERE", "AND", "OR", "NOT", "IN", "LIKE", "IS", "NULL", "ORDER", 
			"BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", "UPDATE", 
			"SET", "DELETE", "CREATE", "USE", "TABLE", "ALTER", "DROP", "ADD", "COLUMN", 
			"PRIMARY", "EQUAL", "NOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", 
			"GREATER_THAN_EQUAL", "BETWEEN", "COMMA", "LPAREN", "RPAREN", "ID", "INT", 
			"DOUBLE", "VARCHAR", "BOOLEAN", "WS"
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


	public MishiSQLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MishiSQLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0203\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\6/\u01d5\n/\r/\16/\u01d6\3\60\6\60\u01da\n\60\r\60"+
		"\16\60\u01db\3\61\6\61\u01df\n\61\r\61\16\61\u01e0\3\61\3\61\6\61\u01e5"+
		"\n\61\r\61\16\61\u01e6\3\62\3\62\7\62\u01eb\n\62\f\62\16\62\u01ee\13\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01fb\n\63"+
		"\3\64\6\64\u01fe\n\64\r\64\16\64\u01ff\3\64\3\64\2\2\65\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\6\4\2C\\c|\3\2\62;"+
		"\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0209\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\3i\3\2\2\2\5m\3\2\2\2\7s\3\2\2\2\t}\3\2\2\2\13\u0093\3\2\2\2"+
		"\r\u00a3\3\2\2\2\17\u00ac\3\2\2\2\21\u00af\3\2\2\2\23\u00b5\3\2\2\2\25"+
		"\u00b7\3\2\2\2\27\u00b9\3\2\2\2\31\u00bd\3\2\2\2\33\u00c0\3\2\2\2\35\u00c5"+
		"\3\2\2\2\37\u00c8\3\2\2\2!\u00ce\3\2\2\2#\u00d6\3\2\2\2%\u00da\3\2\2\2"+
		"\'\u00e5\3\2\2\2)\u00f1\3\2\2\2+\u00f7\3\2\2\2-\u00fe\3\2\2\2/\u0107\3"+
		"\2\2\2\61\u010c\3\2\2\2\63\u0118\3\2\2\2\65\u0125\3\2\2\2\67\u012c\3\2"+
		"\2\29\u0134\3\2\2\2;\u013e\3\2\2\2=\u0148\3\2\2\2?\u014e\3\2\2\2A\u0157"+
		"\3\2\2\2C\u015d\3\2\2\2E\u0164\3\2\2\2G\u016c\3\2\2\2I\u0175\3\2\2\2K"+
		"\u017d\3\2\2\2M\u018a\3\2\2\2O\u0194\3\2\2\2Q\u01a6\3\2\2\2S\u01b0\3\2"+
		"\2\2U\u01c2\3\2\2\2W\u01cd\3\2\2\2Y\u01cf\3\2\2\2[\u01d1\3\2\2\2]\u01d4"+
		"\3\2\2\2_\u01d9\3\2\2\2a\u01de\3\2\2\2c\u01e8\3\2\2\2e\u01fa\3\2\2\2g"+
		"\u01fd\3\2\2\2ij\7U\2\2jk\7G\2\2kl\7C\2\2l\4\3\2\2\2mn\7O\2\2no\7K\2\2"+
		"op\7U\2\2pq\7J\2\2qr\7K\2\2r\6\3\2\2\2st\7O\2\2tu\7W\2\2uv\7G\2\2vw\7"+
		"U\2\2wx\7V\2\2xy\7T\2\2yz\7C\2\2z{\7O\2\2{|\7G\2\2|\b\3\2\2\2}~\7V\2\2"+
		"~\177\7Q\2\2\177\u0080\7F\2\2\u0080\u0081\7Q\2\2\u0081\u0082\7U\2\2\u0082"+
		"\u0083\7\"\2\2\u0083\u0084\7N\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7U\2"+
		"\2\u0086\u0087\7\"\2\2\u0087\u0088\7O\2\2\u0088\u0089\7K\2\2\u0089\u008a"+
		"\7U\2\2\u008a\u008b\7J\2\2\u008b\u008c\7K\2\2\u008c\u008d\7\"\2\2\u008d"+
		"\u008e\7F\2\2\u008e\u008f\7C\2\2\u008f\u0090\7V\2\2\u0090\u0091\7Q\2\2"+
		"\u0091\u0092\7U\2\2\u0092\n\3\2\2\2\u0093\u0094\7N\2\2\u0094\u0095\7Q"+
		"\2\2\u0095\u0096\7U\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7O\2\2\u0098\u0099"+
		"\7K\2\2\u0099\u009a\7U\2\2\u009a\u009b\7J\2\2\u009b\u009c\7K\2\2\u009c"+
		"\u009d\7E\2\2\u009d\u009e\7C\2\2\u009e\u009f\7O\2\2\u009f\u00a0\7R\2\2"+
		"\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7U\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7G"+
		"\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7E\2\2\u00a7\u00a8"+
		"\7C\2\2\u00a8\u00a9\7O\2\2\u00a9\u00aa\7R\2\2\u00aa\u00ab\7Q\2\2\u00ab"+
		"\16\3\2\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7G\2\2\u00ae\20\3\2\2\2\u00af"+
		"\u00b0\7F\2\2\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7F\2\2"+
		"\u00b3\u00b4\7G\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\7[\2\2\u00b6\24\3\2\2"+
		"\2\u00b7\u00b8\7Q\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7P\2\2\u00ba\u00bb"+
		"\7Q\2\2\u00bb\u00bc\7V\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7K\2\2\u00be\u00bf"+
		"\7P\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7N\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3"+
		"\7M\2\2\u00c3\u00c4\7G\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7K\2\2\u00c6\u00c7"+
		"\7U\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7X\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb"+
		"\7E\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7Q\2\2\u00cd \3\2\2\2\u00ce\u00cf"+
		"\7Q\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d2\7G\2\2\u00d2"+
		"\u00d3\7P\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7T\2\2\u00d5\"\3\2\2\2\u00d6"+
		"\u00d7\7R\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7T\2\2\u00d9$\3\2\2\2\u00da"+
		"\u00db\7C\2\2\u00db\u00dc\7U\2\2\u00dc\u00dd\7E\2\2\u00dd\u00de\7G\2\2"+
		"\u00de\u00df\7P\2\2\u00df\u00e0\7F\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2"+
		"\7P\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7G\2\2\u00e4&\3\2\2\2\u00e5\u00e6"+
		"\7F\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7U\2\2\u00e8\u00e9\7E\2\2\u00e9"+
		"\u00ea\7G\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec\7F\2\2\u00ec\u00ed\7G\2\2"+
		"\u00ed\u00ee\7P\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f0\7G\2\2\u00f0(\3\2\2"+
		"\2\u00f1\u00f2\7N\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7O\2\2\u00f4\u00f5"+
		"\7K\2\2\u00f5\u00f6\7V\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9"+
		"\7H\2\2\u00f9\u00fa\7H\2\2\u00fa\u00fb\7U\2\2\u00fb\u00fc\7G\2\2\u00fc"+
		"\u00fd\7V\2\2\u00fd,\3\2\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7I\2\2\u0100"+
		"\u0101\7T\2\2\u0101\u0102\7G\2\2\u0102\u0103\7I\2\2\u0103\u0104\7C\2\2"+
		"\u0104\u0105\7\"\2\2\u0105\u0106\7C\2\2\u0106.\3\2\2\2\u0107\u0108\7K"+
		"\2\2\u0108\u0109\7P\2\2\u0109\u010a\7V\2\2\u010a\u010b\7Q\2\2\u010b\60"+
		"\3\2\2\2\u010c\u010d\7N\2\2\u010d\u010e\7Q\2\2\u010e\u010f\7U\2\2\u010f"+
		"\u0110\7\"\2\2\u0110\u0111\7X\2\2\u0111\u0112\7C\2\2\u0112\u0113\7N\2"+
		"\2\u0113\u0114\7Q\2\2\u0114\u0115\7T\2\2\u0115\u0116\7G\2\2\u0116\u0117"+
		"\7U\2\2\u0117\62\3\2\2\2\u0118\u0119\7C\2\2\u0119\u011a\7E\2\2\u011a\u011b"+
		"\7V\2\2\u011b\u011c\7W\2\2\u011c\u011d\7C\2\2\u011d\u011e\7N\2\2\u011e"+
		"\u011f\7K\2\2\u011f\u0120\7\\\2\2\u0120\u0121\7C\2\2\u0121\u0122\7\"\2"+
		"\2\u0122\u0123\7N\2\2\u0123\u0124\7C\2\2\u0124\64\3\2\2\2\u0125\u0126"+
		"\7C\2\2\u0126\u0127\7U\2\2\u0127\u0128\7K\2\2\u0128\u0129\7I\2\2\u0129"+
		"\u012a\7P\2\2\u012a\u012b\7C\2\2\u012b\66\3\2\2\2\u012c\u012d\7G\2\2\u012d"+
		"\u012e\7N\2\2\u012e\u012f\7K\2\2\u012f\u0130\7O\2\2\u0130\u0131\7K\2\2"+
		"\u0131\u0132\7P\2\2\u0132\u0133\7C\2\2\u01338\3\2\2\2\u0134\u0135\7J\2"+
		"\2\u0135\u0136\7C\2\2\u0136\u0137\7\\\2\2\u0137\u0138\7O\2\2\u0138\u0139"+
		"\7G\2\2\u0139\u013a\7\"\2\2\u013a\u013b\7W\2\2\u013b\u013c\7P\2\2\u013c"+
		"\u013d\7C\2\2\u013d:\3\2\2\2\u013e\u013f\7W\2\2\u013f\u0140\7U\2\2\u0140"+
		"\u0141\7C\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7N\2\2\u0143\u0144\7C\2"+
		"\2\u0144\u0145\7\"\2\2\u0145\u0146\7D\2\2\u0146\u0147\7F\2\2\u0147<\3"+
		"\2\2\2\u0148\u0149\7V\2\2\u0149\u014a\7C\2\2\u014a\u014b\7D\2\2\u014b"+
		"\u014c\7N\2\2\u014c\u014d\7C\2\2\u014d>\3\2\2\2\u014e\u014f\7O\2\2\u014f"+
		"\u0150\7Q\2\2\u0150\u0151\7F\2\2\u0151\u0152\7K\2\2\u0152\u0153\7H\2\2"+
		"\u0153\u0154\7K\2\2\u0154\u0155\7E\2\2\u0155\u0156\7C\2\2\u0156@\3\2\2"+
		"\2\u0157\u0158\7D\2\2\u0158\u0159\7Q\2\2\u0159\u015a\7T\2\2\u015a\u015b"+
		"\7T\2\2\u015b\u015c\7C\2\2\u015cB\3\2\2\2\u015d\u015e\7C\2\2\u015e\u015f"+
		"\7I\2\2\u015f\u0160\7T\2\2\u0160\u0161\7G\2\2\u0161\u0162\7I\2\2\u0162"+
		"\u0163\7C\2\2\u0163D\3\2\2\2\u0164\u0165\7E\2\2\u0165\u0166\7Q\2\2\u0166"+
		"\u0167\7N\2\2\u0167\u0168\7W\2\2\u0168\u0169\7O\2\2\u0169\u016a\7P\2\2"+
		"\u016a\u016b\7C\2\2\u016bF\3\2\2\2\u016c\u016d\7R\2\2\u016d\u016e\7T\2"+
		"\2\u016e\u016f\7K\2\2\u016f\u0170\7O\2\2\u0170\u0171\7C\2\2\u0171\u0172"+
		"\7T\2\2\u0172\u0173\7K\2\2\u0173\u0174\7C\2\2\u0174H\3\2\2\2\u0175\u0176"+
		"\7K\2\2\u0176\u0177\7I\2\2\u0177\u0178\7W\2\2\u0178\u0179\7C\2\2\u0179"+
		"\u017a\7N\2\2\u017a\u017b\7\"\2\2\u017b\u017c\7C\2\2\u017cJ\3\2\2\2\u017d"+
		"\u017e\7F\2\2\u017e\u017f\7K\2\2\u017f\u0180\7H\2\2\u0180\u0181\7G\2\2"+
		"\u0181\u0182\7T\2\2\u0182\u0183\7G\2\2\u0183\u0184\7P\2\2\u0184\u0185"+
		"\7V\2\2\u0185\u0186\7G\2\2\u0186\u0187\7\"\2\2\u0187\u0188\7F\2\2\u0188"+
		"\u0189\7G\2\2\u0189L\3\2\2\2\u018a\u018b\7O\2\2\u018b\u018c\7G\2\2\u018c"+
		"\u018d\7P\2\2\u018d\u018e\7Q\2\2\u018e\u018f\7T\2\2\u018f\u0190\7\"\2"+
		"\2\u0190\u0191\7S\2\2\u0191\u0192\7W\2\2\u0192\u0193\7G\2\2\u0193N\3\2"+
		"\2\2\u0194\u0195\7O\2\2\u0195\u0196\7G\2\2\u0196\u0197\7P\2\2\u0197\u0198"+
		"\7Q\2\2\u0198\u0199\7T\2\2\u0199\u019a\7\"\2\2\u019a\u019b\7Q\2\2\u019b"+
		"\u019c\7\"\2\2\u019c\u019d\7K\2\2\u019d\u019e\7I\2\2\u019e\u019f\7W\2"+
		"\2\u019f\u01a0\7C\2\2\u01a0\u01a1\7N\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a3"+
		"\7S\2\2\u01a3\u01a4\7W\2\2\u01a4\u01a5\7G\2\2\u01a5P\3\2\2\2\u01a6\u01a7"+
		"\7O\2\2\u01a7\u01a8\7C\2\2\u01a8\u01a9\7[\2\2\u01a9\u01aa\7Q\2\2\u01aa"+
		"\u01ab\7T\2\2\u01ab\u01ac\7\"\2\2\u01ac\u01ad\7S\2\2\u01ad\u01ae\7W\2"+
		"\2\u01ae\u01af\7G\2\2\u01afR\3\2\2\2\u01b0\u01b1\7O\2\2\u01b1\u01b2\7"+
		"C\2\2\u01b2\u01b3\7[\2\2\u01b3\u01b4\7Q\2\2\u01b4\u01b5\7T\2\2\u01b5\u01b6"+
		"\7\"\2\2\u01b6\u01b7\7Q\2\2\u01b7\u01b8\7\"\2\2\u01b8\u01b9\7K\2\2\u01b9"+
		"\u01ba\7I\2\2\u01ba\u01bb\7W\2\2\u01bb\u01bc\7C\2\2\u01bc\u01bd\7N\2\2"+
		"\u01bd\u01be\7\"\2\2\u01be\u01bf\7S\2\2\u01bf\u01c0\7W\2\2\u01c0\u01c1"+
		"\7G\2\2\u01c1T\3\2\2\2\u01c2\u01c3\7G\2\2\u01c3\u01c4\7U\2\2\u01c4\u01c5"+
		"\7V\2\2\u01c5\u01c6\7G\2\2\u01c6\u01c7\7\"\2\2\u01c7\u01c8\7G\2\2\u01c8"+
		"\u01c9\7P\2\2\u01c9\u01ca\7V\2\2\u01ca\u01cb\7T\2\2\u01cb\u01cc\7G\2\2"+
		"\u01ccV\3\2\2\2\u01cd\u01ce\7.\2\2\u01ceX\3\2\2\2\u01cf\u01d0\7*\2\2\u01d0"+
		"Z\3\2\2\2\u01d1\u01d2\7+\2\2\u01d2\\\3\2\2\2\u01d3\u01d5\t\2\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7^\3\2\2\2\u01d8\u01da\t\3\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc`\3\2\2\2\u01dd"+
		"\u01df\t\3\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\7\60\2\2\u01e3"+
		"\u01e5\t\3\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7b\3\2\2\2\u01e8\u01ec\7)\2\2\u01e9\u01eb"+
		"\t\4\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7)"+
		"\2\2\u01f0d\3\2\2\2\u01f1\u01f2\7V\2\2\u01f2\u01f3\7T\2\2\u01f3\u01f4"+
		"\7W\2\2\u01f4\u01fb\7G\2\2\u01f5\u01f6\7H\2\2\u01f6\u01f7\7C\2\2\u01f7"+
		"\u01f8\7N\2\2\u01f8\u01f9\7U\2\2\u01f9\u01fb\7G\2\2\u01fa\u01f1\3\2\2"+
		"\2\u01fa\u01f5\3\2\2\2\u01fbf\3\2\2\2\u01fc\u01fe\t\5\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\b\64\2\2\u0202h\3\2\2\2\n\2\u01d6\u01db\u01e0"+
		"\u01e6\u01ec\u01fa\u01ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}