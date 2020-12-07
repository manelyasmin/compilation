// Generated from C:/Users/hammo/IdeaProjects/tpCompil3\SmallLanguage.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmallLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IMPORT=4, KWCLASS=5, KWMAIN=6, KWPUB=7, KWPRT=8, 
		KWINT=9, KWFLOAT=10, KWSTRING=11, KWREAD=12, KWWRITE=13, KWSI=14, KWALORS=15, 
		KWSINON=16, KWLANG=17, KWIO=18, OR=19, AND=20, NOT=21, EQ=22, EQQ=23, 
		NEQ=24, GT=25, LT=26, GTEQ=27, LTEQ=28, PLUS=29, MINUS=30, MULT=31, DIV=32, 
		VR=33, PVR=34, PARF=35, PARO=36, ACF=37, ACO=38, ID=39, INTEGER=40, FLOAT=41, 
		STRING=42, STR=43, WHITESPACE=44, ONELINE=45, MULLINE=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IMPORT", "KWCLASS", "KWMAIN", "KWPUB", "KWPRT", 
			"KWINT", "KWFLOAT", "KWSTRING", "KWREAD", "KWWRITE", "KWSI", "KWALORS", 
			"KWSINON", "KWLANG", "KWIO", "OR", "AND", "NOT", "EQ", "EQQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "VR", "PVR", 
			"PARF", "PARO", "ACF", "ACO", "ID", "INTEGER", "FLOAT", "STRING", "STR", 
			"WHITESPACE", "ONELINE", "MULLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%d'", "'%f'", "'%s'", "'import'", "'class_sj'", "'main_SJ'", 
			"'public'", "'protected'", "'int_SJ'", "'float_SJ'", "'string_SJ'", "'In_SJ'", 
			"'Out_SJ'", "'Si'", "'Alors'", "'Sinon'", "'Small_Java.lang'", "'Small_Java.io'", 
			"'|'", "'&'", "'!'", "':='", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "','", "';'", "')'", "'('", "'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IMPORT", "KWCLASS", "KWMAIN", "KWPUB", "KWPRT", 
			"KWINT", "KWFLOAT", "KWSTRING", "KWREAD", "KWWRITE", "KWSI", "KWALORS", 
			"KWSINON", "KWLANG", "KWIO", "OR", "AND", "NOT", "EQ", "EQQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "VR", "PVR", 
			"PARF", "PARO", "ACF", "ACO", "ID", "INTEGER", "FLOAT", "STRING", "STR", 
			"WHITESPACE", "ONELINE", "MULLINE"
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


	public SmallLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SmallLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0171\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\7(\u0114\n(\f(\16"+
		"(\u0117\13(\3)\3)\5)\u011b\n)\3)\3)\7)\u011f\n)\f)\16)\u0122\13)\5)\u0124"+
		"\n)\3*\3*\5*\u0128\n*\3*\3*\7*\u012c\n*\f*\16*\u012f\13*\3*\3*\7*\u0133"+
		"\n*\f*\16*\u0136\13*\5*\u0138\n*\3+\3+\3+\3+\7+\u013e\n+\f+\16+\u0141"+
		"\13+\3+\3+\3,\3,\3,\3,\7,\u0149\n,\f,\16,\u014c\13,\3,\3,\6,\u0150\n,"+
		"\r,\16,\u0151\3,\3,\3-\3-\3-\3-\3.\3.\3.\7.\u015d\n.\f.\16.\u0160\13."+
		"\3.\3.\3/\3/\3/\3/\7/\u0168\n/\f/\16/\u016b\13/\3/\3/\3/\3/\3/\3\u0169"+
		"\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\n\4\2C\\c|\5\2\62;C\\c"+
		"|\4\2--//\3\2\63;\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\3\2\f\f\2\u017f\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5b\3\2\2"+
		"\2\7e\3\2\2\2\th\3\2\2\2\13o\3\2\2\2\rx\3\2\2\2\17\u0080\3\2\2\2\21\u0087"+
		"\3\2\2\2\23\u0091\3\2\2\2\25\u0098\3\2\2\2\27\u00a1\3\2\2\2\31\u00ab\3"+
		"\2\2\2\33\u00b1\3\2\2\2\35\u00b8\3\2\2\2\37\u00bb\3\2\2\2!\u00c1\3\2\2"+
		"\2#\u00c7\3\2\2\2%\u00d7\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9"+
		"\3\2\2\2-\u00eb\3\2\2\2/\u00ee\3\2\2\2\61\u00f0\3\2\2\2\63\u00f3\3\2\2"+
		"\2\65\u00f5\3\2\2\2\67\u00f7\3\2\2\29\u00fa\3\2\2\2;\u00fd\3\2\2\2=\u00ff"+
		"\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E\u0107\3\2\2\2G"+
		"\u0109\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2\2\2M\u010f\3\2\2\2O\u0111\3\2"+
		"\2\2Q\u0123\3\2\2\2S\u0137\3\2\2\2U\u0139\3\2\2\2W\u0144\3\2\2\2Y\u0155"+
		"\3\2\2\2[\u0159\3\2\2\2]\u0163\3\2\2\2_`\7\'\2\2`a\7f\2\2a\4\3\2\2\2b"+
		"c\7\'\2\2cd\7h\2\2d\6\3\2\2\2ef\7\'\2\2fg\7u\2\2g\b\3\2\2\2hi\7k\2\2i"+
		"j\7o\2\2jk\7r\2\2kl\7q\2\2lm\7t\2\2mn\7v\2\2n\n\3\2\2\2op\7e\2\2pq\7n"+
		"\2\2qr\7c\2\2rs\7u\2\2st\7u\2\2tu\7a\2\2uv\7u\2\2vw\7l\2\2w\f\3\2\2\2"+
		"xy\7o\2\2yz\7c\2\2z{\7k\2\2{|\7p\2\2|}\7a\2\2}~\7U\2\2~\177\7L\2\2\177"+
		"\16\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7w\2\2\u0082\u0083\7d\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7k\2\2\u0085\u0086\7e\2\2\u0086\20\3\2\2\2\u0087"+
		"\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7q\2\2\u008a\u008b\7v\2\2"+
		"\u008b\u008c\7g\2\2\u008c\u008d\7e\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7f\2\2\u0090\22\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7a\2\2\u0095\u0096\7U\2\2\u0096"+
		"\u0097\7L\2\2\u0097\24\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7n\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7c\2\2\u009c\u009d\7v\2\2\u009d\u009e\7a\2\2"+
		"\u009e\u009f\7U\2\2\u009f\u00a0\7L\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7"+
		"u\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7i\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7U\2\2\u00a9"+
		"\u00aa\7L\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7a\2\2\u00ae\u00af\7U\2\2\u00af\u00b0\7L\2\2\u00b0\32\3\2\2\2\u00b1"+
		"\u00b2\7Q\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7a\2\2"+
		"\u00b5\u00b6\7U\2\2\u00b6\u00b7\7L\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7"+
		"U\2\2\u00b9\u00ba\7k\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd"+
		"\7n\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		" \3\2\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5\u00c6\7p\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7U\2\2\u00c8"+
		"\u00c9\7o\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7n\2\2"+
		"\u00cc\u00cd\7a\2\2\u00cd\u00ce\7L\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7x\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7i\2\2\u00d6$\3\2\2\2\u00d7"+
		"\u00d8\7U\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2"+
		"\u00db\u00dc\7n\2\2\u00dc\u00dd\7a\2\2\u00dd\u00de\7L\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7x\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7\60\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7q\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7~\2\2\u00e6"+
		"(\3\2\2\2\u00e7\u00e8\7(\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea,"+
		"\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec\u00ed\7?\2\2\u00ed.\3\2\2\2\u00ee\u00ef"+
		"\7?\2\2\u00ef\60\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\7?\2\2\u00f2\62"+
		"\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6"+
		"\66\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f98\3\2\2\2\u00fa"+
		"\u00fb\7>\2\2\u00fb\u00fc\7?\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe"+
		"<\3\2\2\2\u00ff\u0100\7/\2\2\u0100>\3\2\2\2\u0101\u0102\7,\2\2\u0102@"+
		"\3\2\2\2\u0103\u0104\7\61\2\2\u0104B\3\2\2\2\u0105\u0106\7.\2\2\u0106"+
		"D\3\2\2\2\u0107\u0108\7=\2\2\u0108F\3\2\2\2\u0109\u010a\7+\2\2\u010aH"+
		"\3\2\2\2\u010b\u010c\7*\2\2\u010cJ\3\2\2\2\u010d\u010e\7\177\2\2\u010e"+
		"L\3\2\2\2\u010f\u0110\7}\2\2\u0110N\3\2\2\2\u0111\u0115\t\2\2\2\u0112"+
		"\u0114\t\3\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116P\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0124"+
		"\7\62\2\2\u0119\u011b\t\4\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u0120\t\5\2\2\u011d\u011f\t\6\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0118\3\2\2\2\u0123\u011a\3\2"+
		"\2\2\u0124R\3\2\2\2\u0125\u0138\7\62\2\2\u0126\u0128\t\4\2\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\t\5\2\2\u012a"+
		"\u012c\t\6\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0134\7\60\2\2\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0125\3\2\2\2\u0137\u0127\3\2\2\2\u0138T\3\2\2\2"+
		"\u0139\u013f\7$\2\2\u013a\u013e\n\7\2\2\u013b\u013c\7^\2\2\u013c\u013e"+
		"\7$\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0143\7$\2\2\u0143V\3\2\2\2\u0144\u014a\7$\2\2\u0145\u0149"+
		"\n\7\2\2\u0146\u0147\7^\2\2\u0147\u0149\7$\2\2\u0148\u0145\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014f\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\'\2\2\u014e"+
		"\u0150\7f\2\2\u014f\u014d\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7$\2\2\u0154"+
		"X\3\2\2\2\u0155\u0156\t\b\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b-\2\2\u0158"+
		"Z\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015e\7\61\2\2\u015b\u015d\n\t\2"+
		"\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\b.\2\2\u0162"+
		"\\\3\2\2\2\u0163\u0164\7\61\2\2\u0164\u0165\7,\2\2\u0165\u0169\3\2\2\2"+
		"\u0166\u0168\13\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\7,\2\2\u016d\u016e\7\61\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b/"+
		"\2\2\u0170^\3\2\2\2\22\2\u0115\u011a\u0120\u0123\u0127\u012d\u0134\u0137"+
		"\u013d\u013f\u0148\u014a\u0151\u015e\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}