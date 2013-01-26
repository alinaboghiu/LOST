// Generated from fol.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class folLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TERM=2, LPAREN=3, RPAREN=4, AND=5, OR=6, NOT=7, IMPLIES=8, EXISTS=9, 
		FORALL=10, TRUTH=11, FALSITY=12, EQUALS=13, EQUIV=14, VARIABLE=15, CONSTANT=16, 
		RELNAME=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "TERM", "'('", "')'", "'∧'", "'∨'", "'¬'", "'→'", "'∃'", "'∀'", 
		"'T'", "'F'", "'='", "'↔'", "VARIABLE", "CONSTANT", "RELNAME", "WS"
	};
	public static final String[] ruleNames = {
		"T__0", "TERM", "LPAREN", "RPAREN", "AND", "OR", "NOT", "IMPLIES", "EXISTS", 
		"FORALL", "TRUTH", "FALSITY", "EQUALS", "EQUIV", "VARIABLE", "CONSTANT", 
		"RELNAME", "WS"
	};


	public folLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\24a\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\3\3\3\5\3,\n\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\7\20H\n\20\f\20\16\20K\13\20\3\21\3\21\7"+
		"\21O\n\21\f\21\16\21R\13\21\3\22\3\22\7\22V\n\22\f\22\16\22Y\13\22\3\23"+
		"\6\23\\\n\23\r\23\16\23]\3\23\3\23\2\24\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\2\3\2\t\3u|\3\62;\4C\\c|\7))\62;C\\aac|\4C\\c|\7"+
		"))\62;C\\aac|\5\13\f\17\17\"\"e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5+\3\2\2\2"+
		"\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67"+
		"\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31?\3\2\2\2\33A\3\2\2\2\35"+
		"C\3\2\2\2\37E\3\2\2\2!L\3\2\2\2#S\3\2\2\2%[\3\2\2\2\'(\7.\2\2(\4\3\2\2"+
		"\2),\5\37\20\2*,\5!\21\2+)\3\2\2\2+*\3\2\2\2,\6\3\2\2\2-.\7*\2\2.\b\3"+
		"\2\2\2/\60\7+\2\2\60\n\3\2\2\2\61\62\7\u2229\2\2\62\f\3\2\2\2\63\64\7"+
		"\u222a\2\2\64\16\3\2\2\2\65\66\7\u00ae\2\2\66\20\3\2\2\2\678\7\u2194\2"+
		"\28\22\3\2\2\29:\7\u2205\2\2:\24\3\2\2\2;<\7\u2202\2\2<\26\3\2\2\2=>\7"+
		"V\2\2>\30\3\2\2\2?@\7H\2\2@\32\3\2\2\2AB\7?\2\2B\34\3\2\2\2CD\7\u2196"+
		"\2\2D\36\3\2\2\2EI\t\2\2\2FH\t\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2J \3\2\2\2KI\3\2\2\2LP\t\4\2\2MO\t\5\2\2NM\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2PQ\3\2\2\2Q\"\3\2\2\2RP\3\2\2\2SW\t\6\2\2TV\t\7\2\2UT\3\2\2\2VY"+
		"\3\2\2\2WU\3\2\2\2WX\3\2\2\2X$\3\2\2\2YW\3\2\2\2Z\\\t\b\2\2[Z\3\2\2\2"+
		"\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\23\2\2`&\3\2\2\2\b\2+IP"+
		"W]";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}