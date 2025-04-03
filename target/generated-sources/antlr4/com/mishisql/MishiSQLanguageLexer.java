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
		T__0=1, T__1=2, T__2=3, T__3=4, IMP_ORDER=5, SELECT=6, ALL=7, SPECIFIC_COL=8, 
		FROM=9, WHERE=10, AND=11, OR=12, NOT=13, IN=14, LIKE=15, BETWEEN=16, IS=17, 
		NULL=18, ORDER=19, BY=20, ASC=21, DESC=22, LIMIT=23, OFFSET=24, INSERT=25, 
		INTO=26, VALUES=27, UPDATE=28, SET=29, DELETE=30, CREATE=31, USE=32, TABLE=33, 
		ALTER=34, DROP=35, ADD=36, COLUMN=37, PRIMARY=38, ID=39, INT=40, DOUBLE=41, 
		VARCHAR=42, BOOLEAN=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "IMP_ORDER", "SELECT", "ALL", "SPECIFIC_COL", 
			"FROM", "WHERE", "AND", "OR", "NOT", "IN", "LIKE", "BETWEEN", "IS", "NULL", 
			"ORDER", "BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", 
			"UPDATE", "SET", "DELETE", "CREATE", "USE", "TABLE", "ALTER", "DROP", 
			"ADD", "COLUMN", "PRIMARY", "ID", "INT", "DOUBLE", "VARCHAR", "BOOLEAN", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u019d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\6(\u016f\n(\r(\16(\u0170\3)\6)\u0174\n)\r)\16)\u0175\3*\6*\u0179"+
		"\n*\r*\16*\u017a\3*\3*\6*\u017f\n*\r*\16*\u0180\3+\3+\7+\u0185\n+\f+\16"+
		"+\u0188\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0195\n,\3-\6-\u0198\n"+
		"-\r-\16-\u0199\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\6\4\2C"+
		"\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u01a3\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2"+
		"\ri\3\2\2\2\17s\3\2\2\2\21\u0089\3\2\2\2\23\u0099\3\2\2\2\25\u009c\3\2"+
		"\2\2\27\u00a2\3\2\2\2\31\u00a6\3\2\2\2\33\u00a9\3\2\2\2\35\u00ad\3\2\2"+
		"\2\37\u00b0\3\2\2\2!\u00b5\3\2\2\2#\u00bd\3\2\2\2%\u00c0\3\2\2\2\'\u00c6"+
		"\3\2\2\2)\u00ce\3\2\2\2+\u00d2\3\2\2\2-\u00dd\3\2\2\2/\u00e9\3\2\2\2\61"+
		"\u00ef\3\2\2\2\63\u00f6\3\2\2\2\65\u00ff\3\2\2\2\67\u0104\3\2\2\29\u0110"+
		"\3\2\2\2;\u011d\3\2\2\2=\u0124\3\2\2\2?\u012c\3\2\2\2A\u0136\3\2\2\2C"+
		"\u0140\3\2\2\2E\u0146\3\2\2\2G\u014f\3\2\2\2I\u0155\3\2\2\2K\u015c\3\2"+
		"\2\2M\u0164\3\2\2\2O\u016e\3\2\2\2Q\u0173\3\2\2\2S\u0178\3\2\2\2U\u0182"+
		"\3\2\2\2W\u0194\3\2\2\2Y\u0197\3\2\2\2[\\\7.\2\2\\\4\3\2\2\2]^\7?\2\2"+
		"^\6\3\2\2\2_`\7*\2\2`\b\3\2\2\2ab\7+\2\2b\n\3\2\2\2cd\7O\2\2de\7K\2\2"+
		"ef\7U\2\2fg\7J\2\2gh\7K\2\2h\f\3\2\2\2ij\7O\2\2jk\7W\2\2kl\7G\2\2lm\7"+
		"U\2\2mn\7V\2\2no\7T\2\2op\7C\2\2pq\7O\2\2qr\7G\2\2r\16\3\2\2\2st\7V\2"+
		"\2tu\7Q\2\2uv\7F\2\2vw\7Q\2\2wx\7U\2\2xy\7\"\2\2yz\7N\2\2z{\7Q\2\2{|\7"+
		"U\2\2|}\7\"\2\2}~\7O\2\2~\177\7K\2\2\177\u0080\7U\2\2\u0080\u0081\7J\2"+
		"\2\u0081\u0082\7K\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7F\2\2\u0084\u0085"+
		"\7C\2\2\u0085\u0086\7V\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7U\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\7N\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7U\2\2\u008c"+
		"\u008d\7\"\2\2\u008d\u008e\7O\2\2\u008e\u008f\7K\2\2\u008f\u0090\7U\2"+
		"\2\u0090\u0091\7J\2\2\u0091\u0092\7K\2\2\u0092\u0093\7E\2\2\u0093\u0094"+
		"\7C\2\2\u0094\u0095\7O\2\2\u0095\u0096\7R\2\2\u0096\u0097\7Q\2\2\u0097"+
		"\u0098\7U\2\2\u0098\22\3\2\2\2\u0099\u009a\7F\2\2\u009a\u009b\7G\2\2\u009b"+
		"\24\3\2\2\2\u009c\u009d\7F\2\2\u009d\u009e\7Q\2\2\u009e\u009f\7P\2\2\u009f"+
		"\u00a0\7F\2\2\u00a0\u00a1\7G\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7C\2\2\u00a3"+
		"\u00a4\7P\2\2\u00a4\u00a5\7F\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7Q\2\2\u00a7"+
		"\u00a8\7T\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7P\2\2\u00aa\u00ab\7Q\2\2\u00ab"+
		"\u00ac\7V\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7P\2\2\u00af"+
		"\36\3\2\2\2\u00b0\u00b1\7N\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7M\2\2\u00b3"+
		"\u00b4\7G\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7D\2\2\u00b6\u00b7\7G\2\2\u00b7"+
		"\u00b8\7V\2\2\u00b8\u00b9\7Y\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7G\2\2"+
		"\u00bb\u00bc\7P\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7U"+
		"\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7X\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3"+
		"\7E\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7Q\2\2\u00c5&\3\2\2\2\u00c6\u00c7"+
		"\7Q\2\2\u00c7\u00c8\7T\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\7G\2\2\u00ca"+
		"\u00cb\7P\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\7T\2\2\u00cd(\3\2\2\2\u00ce"+
		"\u00cf\7R\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1\7T\2\2\u00d1*\3\2\2\2\u00d2"+
		"\u00d3\7C\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7G\2\2"+
		"\u00d6\u00d7\7P\2\2\u00d7\u00d8\7F\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da"+
		"\7P\2\2\u00da\u00db\7V\2\2\u00db\u00dc\7G\2\2\u00dc,\3\2\2\2\u00dd\u00de"+
		"\7F\2\2\u00de\u00df\7G\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7E\2\2\u00e1"+
		"\u00e2\7G\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\7G\2\2"+
		"\u00e5\u00e6\7P\2\2\u00e6\u00e7\7V\2\2\u00e7\u00e8\7G\2\2\u00e8.\3\2\2"+
		"\2\u00e9\u00ea\7N\2\2\u00ea\u00eb\7K\2\2\u00eb\u00ec\7O\2\2\u00ec\u00ed"+
		"\7K\2\2\u00ed\u00ee\7V\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1"+
		"\7H\2\2\u00f1\u00f2\7H\2\2\u00f2\u00f3\7U\2\2\u00f3\u00f4\7G\2\2\u00f4"+
		"\u00f5\7V\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7C\2\2\u00f7\u00f8\7I\2\2\u00f8"+
		"\u00f9\7T\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7I\2\2\u00fb\u00fc\7C\2\2"+
		"\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7C\2\2\u00fe\64\3\2\2\2\u00ff\u0100\7"+
		"K\2\2\u0100\u0101\7P\2\2\u0101\u0102\7V\2\2\u0102\u0103\7Q\2\2\u0103\66"+
		"\3\2\2\2\u0104\u0105\7N\2\2\u0105\u0106\7Q\2\2\u0106\u0107\7U\2\2\u0107"+
		"\u0108\7\"\2\2\u0108\u0109\7X\2\2\u0109\u010a\7C\2\2\u010a\u010b\7N\2"+
		"\2\u010b\u010c\7Q\2\2\u010c\u010d\7T\2\2\u010d\u010e\7G\2\2\u010e\u010f"+
		"\7U\2\2\u010f8\3\2\2\2\u0110\u0111\7C\2\2\u0111\u0112\7E\2\2\u0112\u0113"+
		"\7V\2\2\u0113\u0114\7W\2\2\u0114\u0115\7C\2\2\u0115\u0116\7N\2\2\u0116"+
		"\u0117\7K\2\2\u0117\u0118\7\\\2\2\u0118\u0119\7C\2\2\u0119\u011a\7\"\2"+
		"\2\u011a\u011b\7N\2\2\u011b\u011c\7C\2\2\u011c:\3\2\2\2\u011d\u011e\7"+
		"C\2\2\u011e\u011f\7U\2\2\u011f\u0120\7K\2\2\u0120\u0121\7I\2\2\u0121\u0122"+
		"\7P\2\2\u0122\u0123\7C\2\2\u0123<\3\2\2\2\u0124\u0125\7G\2\2\u0125\u0126"+
		"\7N\2\2\u0126\u0127\7K\2\2\u0127\u0128\7O\2\2\u0128\u0129\7K\2\2\u0129"+
		"\u012a\7P\2\2\u012a\u012b\7C\2\2\u012b>\3\2\2\2\u012c\u012d\7J\2\2\u012d"+
		"\u012e\7C\2\2\u012e\u012f\7\\\2\2\u012f\u0130\7O\2\2\u0130\u0131\7G\2"+
		"\2\u0131\u0132\7\"\2\2\u0132\u0133\7W\2\2\u0133\u0134\7P\2\2\u0134\u0135"+
		"\7C\2\2\u0135@\3\2\2\2\u0136\u0137\7W\2\2\u0137\u0138\7U\2\2\u0138\u0139"+
		"\7C\2\2\u0139\u013a\7\"\2\2\u013a\u013b\7N\2\2\u013b\u013c\7C\2\2\u013c"+
		"\u013d\7\"\2\2\u013d\u013e\7D\2\2\u013e\u013f\7F\2\2\u013fB\3\2\2\2\u0140"+
		"\u0141\7V\2\2\u0141\u0142\7C\2\2\u0142\u0143\7D\2\2\u0143\u0144\7N\2\2"+
		"\u0144\u0145\7C\2\2\u0145D\3\2\2\2\u0146\u0147\7O\2\2\u0147\u0148\7Q\2"+
		"\2\u0148\u0149\7F\2\2\u0149\u014a\7K\2\2\u014a\u014b\7H\2\2\u014b\u014c"+
		"\7K\2\2\u014c\u014d\7E\2\2\u014d\u014e\7C\2\2\u014eF\3\2\2\2\u014f\u0150"+
		"\7D\2\2\u0150\u0151\7Q\2\2\u0151\u0152\7T\2\2\u0152\u0153\7T\2\2\u0153"+
		"\u0154\7C\2\2\u0154H\3\2\2\2\u0155\u0156\7C\2\2\u0156\u0157\7I\2\2\u0157"+
		"\u0158\7T\2\2\u0158\u0159\7G\2\2\u0159\u015a\7I\2\2\u015a\u015b\7C\2\2"+
		"\u015bJ\3\2\2\2\u015c\u015d\7E\2\2\u015d\u015e\7Q\2\2\u015e\u015f\7N\2"+
		"\2\u015f\u0160\7W\2\2\u0160\u0161\7O\2\2\u0161\u0162\7P\2\2\u0162\u0163"+
		"\7C\2\2\u0163L\3\2\2\2\u0164\u0165\7R\2\2\u0165\u0166\7T\2\2\u0166\u0167"+
		"\7K\2\2\u0167\u0168\7O\2\2\u0168\u0169\7C\2\2\u0169\u016a\7T\2\2\u016a"+
		"\u016b\7K\2\2\u016b\u016c\7C\2\2\u016cN\3\2\2\2\u016d\u016f\t\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171P\3\2\2\2\u0172\u0174\t\3\2\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176R\3\2\2\2\u0177"+
		"\u0179\t\3\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7\60\2\2\u017d"+
		"\u017f\t\3\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181T\3\2\2\2\u0182\u0186\7)\2\2\u0183\u0185"+
		"\t\4\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7)"+
		"\2\2\u018aV\3\2\2\2\u018b\u018c\7V\2\2\u018c\u018d\7T\2\2\u018d\u018e"+
		"\7W\2\2\u018e\u0195\7G\2\2\u018f\u0190\7H\2\2\u0190\u0191\7C\2\2\u0191"+
		"\u0192\7N\2\2\u0192\u0193\7U\2\2\u0193\u0195\7G\2\2\u0194\u018b\3\2\2"+
		"\2\u0194\u018f\3\2\2\2\u0195X\3\2\2\2\u0196\u0198\t\5\2\2\u0197\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\b-\2\2\u019cZ\3\2\2\2\n\2\u0170\u0175\u017a"+
		"\u0180\u0186\u0194\u0199\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}