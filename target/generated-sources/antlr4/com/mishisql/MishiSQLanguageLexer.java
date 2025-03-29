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
		T__0=1, T__1=2, ID=3, INT=4, DOUBLE=5, VARCHAR=6, BOOLEAN=7, SELECT=8, 
		FROM=9, WHERE=10, AND=11, OR=12, NOT=13, IN=14, LIKE=15, BETWEEN=16, IS=17, 
		NULL=18, ORDER=19, BY=20, ASC=21, DESC=22, LIMIT=23, OFFSET=24, INSERT=25, 
		INTO=26, VALUES=27, UPDATE=28, SET=29, DELETE=30, CREATE=31, TABLE=32, 
		ALTER=33, DROP=34, ADD=35, COLUMN=36, PRIMARY=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ID", "INT", "DOUBLE", "VARCHAR", "BOOLEAN", "SELECT", 
			"FROM", "WHERE", "AND", "OR", "NOT", "IN", "LIKE", "BETWEEN", "IS", "NULL", 
			"ORDER", "BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", 
			"UPDATE", "SET", "DELETE", "CREATE", "TABLE", "ALTER", "DROP", "ADD", 
			"COLUMN", "PRIMARY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", "'world'", null, null, null, null, null, "'SELECT'", 
			"'FROM'", "'WHERE'", "'AND'", "'OR'", "'NOT'", "'IN'", "'LIKE'", "'BETWEEN'", 
			"'IS'", "'NULL'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", "'LIMIT'", "'OFFSET'", 
			"'INSERT'", "'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'DELETE'", "'CREATE'", 
			"'TABLE'", "'ALTER'", "'DROP'", "'ADD'", "'COLUMN'", "'PRIMARY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ID", "INT", "DOUBLE", "VARCHAR", "BOOLEAN", "SELECT", 
			"FROM", "WHERE", "AND", "OR", "NOT", "IN", "LIKE", "BETWEEN", "IS", "NULL", 
			"ORDER", "BY", "ASC", "DESC", "LIMIT", "OFFSET", "INSERT", "INTO", "VALUES", 
			"UPDATE", "SET", "DELETE", "CREATE", "TABLE", "ALTER", "DROP", "ADD", 
			"COLUMN", "PRIMARY", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4]\n\4\r\4\16\4^\3\5\6\5b\n\5\r\5\16\5c\3"+
		"\6\6\6g\n\6\r\6\16\6h\3\6\3\6\6\6m\n\6\r\6\16\6n\3\7\3\7\7\7s\n\7\f\7"+
		"\16\7v\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\6\'\u012a\n\'\r\'\16\'\u012b\3\'\3\'\2\2(\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(\3\2\6\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7"+
		"\\\3\2\2\2\ta\3\2\2\2\13f\3\2\2\2\rp\3\2\2\2\17\u0082\3\2\2\2\21\u0084"+
		"\3\2\2\2\23\u008b\3\2\2\2\25\u0090\3\2\2\2\27\u0096\3\2\2\2\31\u009a\3"+
		"\2\2\2\33\u009d\3\2\2\2\35\u00a1\3\2\2\2\37\u00a4\3\2\2\2!\u00a9\3\2\2"+
		"\2#\u00b1\3\2\2\2%\u00b4\3\2\2\2\'\u00b9\3\2\2\2)\u00bf\3\2\2\2+\u00c2"+
		"\3\2\2\2-\u00c6\3\2\2\2/\u00cb\3\2\2\2\61\u00d1\3\2\2\2\63\u00d8\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e4\3\2\2\29\u00eb\3\2\2\2;\u00f2\3\2\2\2=\u00f6"+
		"\3\2\2\2?\u00fd\3\2\2\2A\u0104\3\2\2\2C\u010a\3\2\2\2E\u0110\3\2\2\2G"+
		"\u0115\3\2\2\2I\u0119\3\2\2\2K\u0120\3\2\2\2M\u0129\3\2\2\2OP\7j\2\2P"+
		"Q\7g\2\2QR\7n\2\2RS\7n\2\2ST\7q\2\2T\4\3\2\2\2UV\7y\2\2VW\7q\2\2WX\7t"+
		"\2\2XY\7n\2\2YZ\7f\2\2Z\6\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\b\3\2\2\2`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2d\n\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"ij\3\2\2\2jl\7\60\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2o\f\3\2\2\2pt\7)\2\2qs\t\4\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uw\3\2\2\2vt\3\2\2\2wx\7)\2\2x\16\3\2\2\2yz\7V\2\2z{\7T\2\2{|\7W\2\2"+
		"|\u0083\7G\2\2}~\7H\2\2~\177\7C\2\2\177\u0080\7N\2\2\u0080\u0081\7U\2"+
		"\2\u0081\u0083\7G\2\2\u0082y\3\2\2\2\u0082}\3\2\2\2\u0083\20\3\2\2\2\u0084"+
		"\u0085\7U\2\2\u0085\u0086\7G\2\2\u0086\u0087\7N\2\2\u0087\u0088\7G\2\2"+
		"\u0088\u0089\7E\2\2\u0089\u008a\7V\2\2\u008a\22\3\2\2\2\u008b\u008c\7"+
		"H\2\2\u008c\u008d\7T\2\2\u008d\u008e\7Q\2\2\u008e\u008f\7O\2\2\u008f\24"+
		"\3\2\2\2\u0090\u0091\7Y\2\2\u0091\u0092\7J\2\2\u0092\u0093\7G\2\2\u0093"+
		"\u0094\7T\2\2\u0094\u0095\7G\2\2\u0095\26\3\2\2\2\u0096\u0097\7C\2\2\u0097"+
		"\u0098\7P\2\2\u0098\u0099\7F\2\2\u0099\30\3\2\2\2\u009a\u009b\7Q\2\2\u009b"+
		"\u009c\7T\2\2\u009c\32\3\2\2\2\u009d\u009e\7P\2\2\u009e\u009f\7Q\2\2\u009f"+
		"\u00a0\7V\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7P\2\2\u00a3"+
		"\36\3\2\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7K\2\2\u00a6\u00a7\7M\2\2\u00a7"+
		"\u00a8\7G\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7D\2\2\u00aa\u00ab\7G\2\2\u00ab"+
		"\u00ac\7V\2\2\u00ac\u00ad\7Y\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7G\2\2"+
		"\u00af\u00b0\7P\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7U"+
		"\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7W\2\2\u00b6\u00b7"+
		"\7N\2\2\u00b7\u00b8\7N\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00bb"+
		"\7T\2\2\u00bb\u00bc\7F\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be\7T\2\2\u00be"+
		"(\3\2\2\2\u00bf\u00c0\7D\2\2\u00c0\u00c1\7[\2\2\u00c1*\3\2\2\2\u00c2\u00c3"+
		"\7C\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7E\2\2\u00c5,\3\2\2\2\u00c6\u00c7"+
		"\7F\2\2\u00c7\u00c8\7G\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca\7E\2\2\u00ca"+
		".\3\2\2\2\u00cb\u00cc\7N\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7O\2\2\u00ce"+
		"\u00cf\7K\2\2\u00cf\u00d0\7V\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7Q\2\2\u00d2"+
		"\u00d3\7H\2\2\u00d3\u00d4\7H\2\2\u00d4\u00d5\7U\2\2\u00d5\u00d6\7G\2\2"+
		"\u00d6\u00d7\7V\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7"+
		"P\2\2\u00da\u00db\7U\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de"+
		"\7V\2\2\u00de\64\3\2\2\2\u00df\u00e0\7K\2\2\u00e0\u00e1\7P\2\2\u00e1\u00e2"+
		"\7V\2\2\u00e2\u00e3\7Q\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7X\2\2\u00e5\u00e6"+
		"\7C\2\2\u00e6\u00e7\7N\2\2\u00e7\u00e8\7W\2\2\u00e8\u00e9\7G\2\2\u00e9"+
		"\u00ea\7U\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7R\2\2\u00ed"+
		"\u00ee\7F\2\2\u00ee\u00ef\7C\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7G\2\2"+
		"\u00f1:\3\2\2\2\u00f2\u00f3\7U\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7V\2"+
		"\2\u00f5<\3\2\2\2\u00f6\u00f7\7F\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9\7"+
		"N\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7V\2\2\u00fb\u00fc\7G\2\2\u00fc>"+
		"\3\2\2\2\u00fd\u00fe\7E\2\2\u00fe\u00ff\7T\2\2\u00ff\u0100\7G\2\2\u0100"+
		"\u0101\7C\2\2\u0101\u0102\7V\2\2\u0102\u0103\7G\2\2\u0103@\3\2\2\2\u0104"+
		"\u0105\7V\2\2\u0105\u0106\7C\2\2\u0106\u0107\7D\2\2\u0107\u0108\7N\2\2"+
		"\u0108\u0109\7G\2\2\u0109B\3\2\2\2\u010a\u010b\7C\2\2\u010b\u010c\7N\2"+
		"\2\u010c\u010d\7V\2\2\u010d\u010e\7G\2\2\u010e\u010f\7T\2\2\u010fD\3\2"+
		"\2\2\u0110\u0111\7F\2\2\u0111\u0112\7T\2\2\u0112\u0113\7Q\2\2\u0113\u0114"+
		"\7R\2\2\u0114F\3\2\2\2\u0115\u0116\7C\2\2\u0116\u0117\7F\2\2\u0117\u0118"+
		"\7F\2\2\u0118H\3\2\2\2\u0119\u011a\7E\2\2\u011a\u011b\7Q\2\2\u011b\u011c"+
		"\7N\2\2\u011c\u011d\7W\2\2\u011d\u011e\7O\2\2\u011e\u011f\7P\2\2\u011f"+
		"J\3\2\2\2\u0120\u0121\7R\2\2\u0121\u0122\7T\2\2\u0122\u0123\7K\2\2\u0123"+
		"\u0124\7O\2\2\u0124\u0125\7C\2\2\u0125\u0126\7T\2\2\u0126\u0127\7[\2\2"+
		"\u0127L\3\2\2\2\u0128\u012a\t\5\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\b\'\2\2\u012eN\3\2\2\2\n\2^chnt\u0082\u012b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}