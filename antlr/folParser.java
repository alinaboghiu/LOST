// Generated from fol.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class folParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TERM=2, LPAREN=3, RPAREN=4, AND=5, OR=6, NOT=7, IMPLIES=8, EXISTS=9, 
		FORALL=10, TRUTH=11, FALSITY=12, EQUALS=13, EQUIV=14, VARIABLE=15, CONSTANT=16, 
		RELNAME=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "TERM", "'('", "')'", "'∧'", "'∨'", "'¬'", "'→'", 
		"'∃'", "'∀'", "'T'", "'F'", "'='", "'↔'", "VARIABLE", "CONSTANT", "RELNAME", 
		"WS"
	};
	public static final int
		RULE_condition = 0, RULE_sentence = 1, RULE_equivalence = 2, RULE_implication = 3, 
		RULE_disjunction = 4, RULE_conjunction = 5, RULE_negation = 6, RULE_relation = 7, 
		RULE_binaryarg = 8, RULE_unaryarg = 9;
	public static final String[] ruleNames = {
		"condition", "sentence", "equivalence", "implication", "disjunction", 
		"conjunction", "negation", "relation", "binaryarg", "unaryarg"
	};

	@Override
	public String getGrammarFileName() { return "fol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public folParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(folParser.EOF, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); sentence();
			setState(21); match(EOF);
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

	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(folParser.FORALL, 0); }
		public List<TerminalNode> TERM() { return getTokens(folParser.TERM); }
		public TerminalNode TRUTH() { return getToken(folParser.TRUTH, 0); }
		public EquivalenceContext equivalence() {
			return getRuleContext(EquivalenceContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(folParser.EQUALS, 0); }
		public TerminalNode TERM(int i) {
			return getToken(folParser.TERM, i);
		}
		public TerminalNode EXISTS() { return getToken(folParser.EXISTS, 0); }
		public TerminalNode VARIABLE() { return getToken(folParser.VARIABLE, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode FALSITY() { return getToken(folParser.FALSITY, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); match(TRUTH);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); match(FALSITY);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); match(TERM);
				setState(26); match(EQUALS);
				setState(27); match(TERM);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(28); relation();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				_la = _input.LA(1);
				if (_la==EXISTS || _la==FORALL) {
					{
					setState(29);
					_la = _input.LA(1);
					if ( !(_la==EXISTS || _la==FORALL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(30); match(VARIABLE);
					}
				}

				setState(33); equivalence();
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

	public static class EquivalenceContext extends ParserRuleContext {
		public List<TerminalNode> EQUIV() { return getTokens(folParser.EQUIV); }
		public TerminalNode EQUIV(int i) {
			return getToken(folParser.EQUIV, i);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public List<EquivalenceContext> equivalence() {
			return getRuleContexts(EquivalenceContext.class);
		}
		public EquivalenceContext equivalence(int i) {
			return getRuleContext(EquivalenceContext.class,i);
		}
		public EquivalenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterEquivalence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitEquivalence(this);
		}
	}

	public final EquivalenceContext equivalence() throws RecognitionException {
		EquivalenceContext _localctx = new EquivalenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_equivalence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); implication();
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(37); match(EQUIV);
					setState(38); equivalence();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ImplicationContext extends ParserRuleContext {
		public TerminalNode IMPLIES(int i) {
			return getToken(folParser.IMPLIES, i);
		}
		public List<ImplicationContext> implication() {
			return getRuleContexts(ImplicationContext.class);
		}
		public List<TerminalNode> IMPLIES() { return getTokens(folParser.IMPLIES); }
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ImplicationContext implication(int i) {
			return getRuleContext(ImplicationContext.class,i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitImplication(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implication);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); disjunction();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(45); match(IMPLIES);
					setState(46); implication();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public TerminalNode OR(int i) {
			return getToken(folParser.OR, i);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(folParser.OR); }
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); conjunction();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(53); match(OR);
					setState(54); disjunction();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(folParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(folParser.AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); negation();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); match(AND);
					setState(62); conjunction();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(folParser.NOT, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_negation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(68); match(NOT);
				}
			}

			setState(71); relation();
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

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public TerminalNode RELNAME() { return getToken(folParser.RELNAME, 0); }
		public UnaryargContext unaryarg() {
			return getRuleContext(UnaryargContext.class,0);
		}
		public BinaryargContext binaryarg() {
			return getRuleContext(BinaryargContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(folParser.LPAREN, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation);
		int _la;
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(73); match(LPAREN);
					}
				}

				setState(76); match(RELNAME);
				setState(77); binaryarg();
				setState(78); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(80); match(LPAREN);
					}
				}

				setState(83); match(RELNAME);
				setState(84); unaryarg();
				setState(85); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); match(RELNAME);
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

	public static class BinaryargContext extends ParserRuleContext {
		public List<TerminalNode> TERM() { return getTokens(folParser.TERM); }
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public TerminalNode TERM(int i) {
			return getToken(folParser.TERM, i);
		}
		public TerminalNode LPAREN() { return getToken(folParser.LPAREN, 0); }
		public BinaryargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterBinaryarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitBinaryarg(this);
		}
	}

	public final BinaryargContext binaryarg() throws RecognitionException {
		BinaryargContext _localctx = new BinaryargContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binaryarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(LPAREN);
			setState(91); match(TERM);
			setState(92); match(1);
			setState(93); match(TERM);
			setState(94); match(RPAREN);
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

	public static class UnaryargContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(folParser.TERM, 0); }
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(folParser.LPAREN, 0); }
		public UnaryargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterUnaryarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitUnaryarg(this);
		}
	}

	public final UnaryargContext unaryarg() throws RecognitionException {
		UnaryargContext _localctx = new UnaryargContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(LPAREN);
			setState(97); match(TERM);
			setState(98); match(RPAREN);
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
		"\2\3\24g\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\""+
		"\n\3\3\3\5\3%\n\3\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\7\5"+
		"\62\n\5\f\5\16\5\65\13\5\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\3"+
		"\7\7\7B\n\7\f\7\16\7E\13\7\3\b\5\bH\n\b\3\b\3\b\3\t\5\tM\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tT\n\t\3\t\3\t\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\13\fj\2"+
		"\26\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b.\3\2\2\2\n\66\3\2\2\2\f>\3\2\2\2\16"+
		"G\3\2\2\2\20Z\3\2\2\2\22\\\3\2\2\2\24b\3\2\2\2\26\27\5\4\3\2\27\30\7\1"+
		"\2\2\30\3\3\2\2\2\31%\7\r\2\2\32%\7\16\2\2\33\34\7\4\2\2\34\35\7\17\2"+
		"\2\35%\7\4\2\2\36%\5\20\t\2\37 \t\2\2\2 \"\7\21\2\2!\37\3\2\2\2!\"\3\2"+
		"\2\2\"#\3\2\2\2#%\5\6\4\2$\31\3\2\2\2$\32\3\2\2\2$\33\3\2\2\2$\36\3\2"+
		"\2\2$!\3\2\2\2%\5\3\2\2\2&+\5\b\5\2\'(\7\20\2\2(*\5\6\4\2)\'\3\2\2\2*"+
		"-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2.\63\5\n\6\2/\60\7\n"+
		"\2\2\60\62\5\b\5\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\t\3\2\2\2\65\63\3\2\2\2\66;\5\f\7\2\678\7\b\2\28:\5\n\6\29\67\3"+
		"\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=;\3\2\2\2>C\5\16\b\2"+
		"?@\7\7\2\2@B\5\f\7\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\r\3\2\2"+
		"\2EC\3\2\2\2FH\7\t\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\5\20\t\2J\17\3"+
		"\2\2\2KM\7\5\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\23\2\2OP\5\22\n\2P"+
		"Q\7\6\2\2Q[\3\2\2\2RT\7\5\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\23\2\2"+
		"VW\5\24\13\2WX\7\6\2\2X[\3\2\2\2Y[\7\23\2\2ZL\3\2\2\2ZS\3\2\2\2ZY\3\2"+
		"\2\2[\21\3\2\2\2\\]\7\5\2\2]^\7\4\2\2^_\7\3\2\2_`\7\4\2\2`a\7\6\2\2a\23"+
		"\3\2\2\2bc\7\5\2\2cd\7\4\2\2de\7\6\2\2e\25\3\2\2\2\f!$+\63;CGLSZ";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}