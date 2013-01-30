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
		T__0=1, LPAREN=2, RPAREN=3, AND=4, OR=5, NOT=6, IMPLIES=7, EXISTS=8, FORALL=9, 
		TRUTH=10, FALSITY=11, EQUALS=12, EQUIV=13, VARIABLE=14, NAME=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'('", "')'", "'∧'", "'∨'", "'¬'", "'→'", "'∃'", "'∀'", 
		"'⊤'", "'⊥'", "'='", "'↔'", "VARIABLE", "NAME", "WS"
	};
	public static final int
		RULE_condition = 0, RULE_formula = 1, RULE_equivalence = 2, RULE_implication = 3, 
		RULE_disjunction = 4, RULE_conjunction = 5, RULE_negation = 6, RULE_relation = 7, 
		RULE_binaryarg = 8, RULE_unaryarg = 9, RULE_term = 10, RULE_nonRecursiveFormula = 11;
	public static final String[] ruleNames = {
		"condition", "formula", "equivalence", "implication", "disjunction", "conjunction", 
		"negation", "relation", "binaryarg", "unaryarg", "term", "nonRecursiveFormula"
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
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
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
			setState(24); formula();
			setState(25); match(EOF);
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

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(folParser.FORALL, 0); }
		public NonRecursiveFormulaContext nonRecursiveFormula() {
			return getRuleContext(NonRecursiveFormulaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public EquivalenceContext equivalence() {
			return getRuleContext(EquivalenceContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(folParser.EXISTS, 0); }
		public TerminalNode VARIABLE() { return getToken(folParser.VARIABLE, 0); }
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(folParser.LPAREN, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formula);
		int _la;
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==EXISTS || _la==FORALL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(28); match(VARIABLE);
				}
				setState(31);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(30); match(LPAREN);
					}
				}

				setState(33); formula();
				setState(35);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(34); match(RPAREN);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); equivalence();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); implication();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39); disjunction();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40); conjunction();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41); nonRecursiveFormula();
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
		public TerminalNode EQUIV() { return getToken(folParser.EQUIV, 0); }
		public NonRecursiveFormulaContext nonRecursiveFormula() {
			return getRuleContext(NonRecursiveFormulaContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(44); nonRecursiveFormula();
			setState(45); match(EQUIV);
			setState(46); formula();
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
		public NonRecursiveFormulaContext nonRecursiveFormula() {
			return getRuleContext(NonRecursiveFormulaContext.class,0);
		}
		public TerminalNode IMPLIES() { return getToken(folParser.IMPLIES, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(48); nonRecursiveFormula();
			setState(49); match(IMPLIES);
			setState(50); formula();
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
		public NonRecursiveFormulaContext nonRecursiveFormula() {
			return getRuleContext(NonRecursiveFormulaContext.class,0);
		}
		public TerminalNode OR() { return getToken(folParser.OR, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(52); nonRecursiveFormula();
			setState(53); match(OR);
			setState(54); formula();
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
		public NonRecursiveFormulaContext nonRecursiveFormula() {
			return getRuleContext(NonRecursiveFormulaContext.class,0);
		}
		public TerminalNode AND() { return getToken(folParser.AND, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(56); nonRecursiveFormula();
			setState(57); match(AND);
			setState(58); formula();
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
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(NOT);
			setState(61); formula();
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
		public TerminalNode NAME() { return getToken(folParser.NAME, 0); }
		public UnaryargContext unaryarg() {
			return getRuleContext(UnaryargContext.class,0);
		}
		public BinaryargContext binaryarg() {
			return getRuleContext(BinaryargContext.class,0);
		}
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
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(NAME);
				setState(64); binaryarg();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(NAME);
				setState(66); unaryarg();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(NAME);
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
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
			setState(70); match(LPAREN);
			setState(71); term();
			setState(72); match(1);
			setState(73); term();
			setState(74); match(RPAREN);
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
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
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
			setState(76); match(LPAREN);
			setState(77); term();
			setState(78); match(RPAREN);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(folParser.NAME, 0); }
		public TerminalNode VARIABLE() { return getToken(folParser.VARIABLE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NonRecursiveFormulaContext extends ParserRuleContext {
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public TerminalNode TRUTH() { return getToken(folParser.TRUTH, 0); }
		public TerminalNode EQUALS() { return getToken(folParser.EQUALS, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode FALSITY() { return getToken(folParser.FALSITY, 0); }
		public NonRecursiveFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonRecursiveFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterNonRecursiveFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitNonRecursiveFormula(this);
		}
	}

	public final NonRecursiveFormulaContext nonRecursiveFormula() throws RecognitionException {
		NonRecursiveFormulaContext _localctx = new NonRecursiveFormulaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nonRecursiveFormula);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); negation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); term();
				setState(84); match(EQUALS);
				setState(85); term();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); relation();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); match(TRUTH);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89); match(FALSITY);
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
		"\2\3\22_\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\""+
		"\n\3\3\3\3\3\5\3&\n\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\tG\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r]\n\r\3\r\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\4\3\n\13\3\20\21_\2\32\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\62"+
		"\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20F\3\2\2\2\22H\3\2\2\2\24"+
		"N\3\2\2\2\26R\3\2\2\2\30\\\3\2\2\2\32\33\5\4\3\2\33\34\7\1\2\2\34\3\3"+
		"\2\2\2\35\36\t\2\2\2\36\37\7\20\2\2\37!\3\2\2\2 \"\7\4\2\2! \3\2\2\2!"+
		"\"\3\2\2\2\"#\3\2\2\2#%\5\4\3\2$&\7\5\2\2%$\3\2\2\2%&\3\2\2\2&-\3\2\2"+
		"\2\'-\5\6\4\2(-\5\b\5\2)-\5\n\6\2*-\5\f\7\2+-\5\30\r\2,\35\3\2\2\2,\'"+
		"\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\5\30\r\2"+
		"/\60\7\17\2\2\60\61\5\4\3\2\61\7\3\2\2\2\62\63\5\30\r\2\63\64\7\t\2\2"+
		"\64\65\5\4\3\2\65\t\3\2\2\2\66\67\5\30\r\2\678\7\7\2\289\5\4\3\29\13\3"+
		"\2\2\2:;\5\30\r\2;<\7\6\2\2<=\5\4\3\2=\r\3\2\2\2>?\7\b\2\2?@\5\4\3\2@"+
		"\17\3\2\2\2AB\7\21\2\2BG\5\22\n\2CD\7\21\2\2DG\5\24\13\2EG\7\21\2\2FA"+
		"\3\2\2\2FC\3\2\2\2FE\3\2\2\2G\21\3\2\2\2HI\7\4\2\2IJ\5\26\f\2JK\7\3\2"+
		"\2KL\5\26\f\2LM\7\5\2\2M\23\3\2\2\2NO\7\4\2\2OP\5\26\f\2PQ\7\5\2\2Q\25"+
		"\3\2\2\2RS\t\3\2\2S\27\3\2\2\2T]\5\16\b\2UV\5\26\f\2VW\7\16\2\2WX\5\26"+
		"\f\2X]\3\2\2\2Y]\5\20\t\2Z]\7\f\2\2[]\7\r\2\2\\T\3\2\2\2\\U\3\2\2\2\\"+
		"Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\31\3\2\2\2\7!%,F\\";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}