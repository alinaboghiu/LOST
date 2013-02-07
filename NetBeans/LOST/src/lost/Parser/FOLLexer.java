// Generated from FOL.g4 by ANTLR 4.0
package lost.Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, AND=4, OR=5, NOT=6, IMPLIES=7, EXISTS=8, FORALL=9, 
		TRUTH=10, FALSITY=11, EQUALS=12, EQUIV=13, VARIABLE=14, RELNAME=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'('", "')'", "'∧'", "'∨'", "'¬'", "'→'", "'∃'", "'∀'", "'⊤'", 
		"'⊥'", "'='", "'↔'", "VARIABLE", "RELNAME", "WS"
	};
	public static final String[] ruleNames = {
		"T__0", "LPAREN", "RPAREN", "AND", "OR", "NOT", "IMPLIES", "EXISTS", "FORALL", 
		"TRUTH", "FALSITY", "EQUALS", "EQUIV", "VARIABLE", "RELNAME", "WS"
	};


	public FOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FOL.g4"; }

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
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\22U\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17@\n\17"+
		"\3\17\7\17C\n\17\f\17\16\17F\13\17\3\20\3\20\7\20J\n\20\f\20\16\20M\13"+
		"\20\3\21\6\21P\n\21\r\21\16\21Q\3\21\3\21\2\22\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\2\3\2\7\3c|\3\62;\4C\\c|\7))\62;C\\aac|\5\13\f\17\17\""+
		"\"X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3"+
		"\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3"+
		"\2\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25\65\3\2\2\2\27\67\3\2\2\2\319\3\2"+
		"\2\2\33;\3\2\2\2\35=\3\2\2\2\37G\3\2\2\2!O\3\2\2\2#$\7.\2\2$\4\3\2\2\2"+
		"%&\7*\2\2&\6\3\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7\u2229\2\2*\n\3\2\2\2+,\7"+
		"\u222a\2\2,\f\3\2\2\2-.\7\u00ae\2\2.\16\3\2\2\2/\60\7\u2194\2\2\60\20"+
		"\3\2\2\2\61\62\7\u2205\2\2\62\22\3\2\2\2\63\64\7\u2202\2\2\64\24\3\2\2"+
		"\2\65\66\7\u22a6\2\2\66\26\3\2\2\2\678\7\u22a7\2\28\30\3\2\2\29:\7?\2"+
		"\2:\32\3\2\2\2;<\7\u2196\2\2<\34\3\2\2\2=?\t\2\2\2>@\7u\2\2?>\3\2\2\2"+
		"?@\3\2\2\2@D\3\2\2\2AC\t\3\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"E\36\3\2\2\2FD\3\2\2\2GK\t\4\2\2HJ\t\5\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2L \3\2\2\2MK\3\2\2\2NP\t\6\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2"+
		"\2QR\3\2\2\2RS\3\2\2\2ST\b\21\2\2T\"\3\2\2\2\7\2?DKQ";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}