// Generated from FOL.g4 by ANTLR 4.0
package lost.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, AND=4, OR=5, NOT=6, IMPLIES=7, EXISTS=8, FORALL=9, 
		TRUTH=10, FALSITY=11, EQUALS=12, EQUIV=13, VARIABLE=14, RELNAME=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'('", "')'", "'∧'", "'∨'", "'¬'", "'→'", "'∃'", "'∀'", 
		"'⊤'", "'⊥'", "'='", "'↔'", "VARIABLE", "RELNAME", "WS"
	};
	public static final int
		RULE_condition = 0, RULE_formula = 1, RULE_equivalence = 2, RULE_implication = 3, 
		RULE_disjunction = 4, RULE_conjunction = 5, RULE_negation = 6, RULE_relation = 7, 
		RULE_binaryarg = 8, RULE_unaryarg = 9, RULE_quantifier = 10, RULE_term = 11, 
		RULE_constant = 12, RULE_nonRecursiveFormula = 13;
	public static final String[] ruleNames = {
		"condition", "formula", "equivalence", "implication", "disjunction", "conjunction", 
		"negation", "relation", "binaryarg", "unaryarg", "quantifier", "term", 
		"constant", "nonRecursiveFormula"
	};

	@Override
	public String getGrammarFileName() { return "FOL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public TerminalNode EOF() { return getToken(FOLParser.EOF, 0); }
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(28); match(LPAREN);
				setState(29); formula();
				setState(30); match(RPAREN);
				}
				break;

			case 2:
				{
				setState(32); formula();
				}
				break;
			}
			setState(35); match(EOF);
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
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public EquivalenceContext equivalence() {
			return getRuleContext(EquivalenceContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37); match(LPAREN);
				setState(38); equivalence();
				setState(39); match(RPAREN);
				}
				break;

			case 2:
				{
				setState(41); equivalence();
				}
				break;
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

	public static class EquivalenceContext extends ParserRuleContext {
		public List<TerminalNode> EQUIV() { return getTokens(FOLParser.EQUIV); }
		public List<TerminalNode> RPAREN() { return getTokens(FOLParser.RPAREN); }
		public TerminalNode EQUIV(int i) {
			return getToken(FOLParser.EQUIV, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(FOLParser.RPAREN, i);
		}
		public List<ImplicationContext> implication() {
			return getRuleContexts(ImplicationContext.class);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(FOLParser.LPAREN, i);
		}
		public ImplicationContext implication(int i) {
			return getRuleContext(ImplicationContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(FOLParser.LPAREN); }
		public EquivalenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterEquivalence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitEquivalence(this);
		}
	}

	public final EquivalenceContext equivalence() throws RecognitionException {
		EquivalenceContext _localctx = new EquivalenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_equivalence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(44); match(LPAREN);
						setState(45); implication();
						setState(46); match(RPAREN);
						}
						break;

					case 2:
						{
						setState(48); implication();
						}
						break;
					}
					setState(51); match(EQUIV);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58); match(LPAREN);
				setState(59); implication();
				setState(60); match(RPAREN);
				}
				break;

			case 2:
				{
				setState(62); implication();
				}
				break;
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
			return getToken(FOLParser.IMPLIES, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(FOLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(FOLParser.RPAREN, i);
		}
		public List<TerminalNode> IMPLIES() { return getTokens(FOLParser.IMPLIES); }
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(FOLParser.LPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(FOLParser.LPAREN); }
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitImplication(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implication);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(65); match(LPAREN);
						setState(66); disjunction();
						setState(67); match(RPAREN);
						}
						break;

					case 2:
						{
						setState(69); disjunction();
						}
						break;
					}
					setState(72); match(IMPLIES);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(79); match(LPAREN);
				setState(80); disjunction();
				setState(81); match(RPAREN);
				}
				break;

			case 2:
				{
				setState(83); disjunction();
				}
				break;
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
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(FOLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(FOLParser.RPAREN, i);
		}
		public TerminalNode OR(int i) {
			return getToken(FOLParser.OR, i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(FOLParser.LPAREN, i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(FOLParser.LPAREN); }
		public List<TerminalNode> OR() { return getTokens(FOLParser.OR); }
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(86); match(LPAREN);
						setState(87); conjunction();
						setState(88); match(RPAREN);
						}
						break;

					case 2:
						{
						setState(90); conjunction();
						}
						break;
					}
					setState(93); match(OR);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(100); match(LPAREN);
				setState(101); conjunction();
				setState(102); match(RPAREN);
				}
				break;

			case 2:
				{
				setState(104); conjunction();
				}
				break;
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
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public List<TerminalNode> RPAREN() { return getTokens(FOLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(FOLParser.RPAREN, i);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(FOLParser.LPAREN, i);
		}
		public List<TerminalNode> AND() { return getTokens(FOLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FOLParser.AND, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(FOLParser.LPAREN); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(107); match(LPAREN);
						setState(108); negation();
						setState(109); match(RPAREN);
						}
						break;

					case 2:
						{
						setState(111); negation();
						}
						break;
					}
					setState(114); match(AND);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(121); match(LPAREN);
				setState(122); negation();
				setState(123); match(RPAREN);
				}
				break;

			case 2:
				{
				setState(125); negation();
				}
				break;
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
		public List<QuantifierContext> quantifier() {
			return getRuleContexts(QuantifierContext.class);
		}
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public NonRecursiveFormulaContext nonRecursiveFormula() {
			return getRuleContext(NonRecursiveFormulaContext.class,0);
		}
		public List<TerminalNode> NOT() { return getTokens(FOLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(FOLParser.NOT, i);
		}
		public QuantifierContext quantifier(int i) {
			return getRuleContext(QuantifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_negation);
		int _la;
		try {
			int _alt;
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128); match(NOT);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOT );
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXISTS || _la==FORALL) {
					{
					{
					setState(133); quantifier();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(139); match(LPAREN);
					setState(140); nonRecursiveFormula();
					setState(141); match(RPAREN);
					}
					break;
				case TRUTH:
				case FALSITY:
				case VARIABLE:
				case RELNAME:
					{
					setState(143); nonRecursiveFormula();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(146); match(NOT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(149); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(151); quantifier();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(162);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(157); match(LPAREN);
					setState(158); formula();
					setState(159); match(RPAREN);
					}
					break;

				case 2:
					{
					setState(161); formula();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164); quantifier();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXISTS || _la==FORALL );
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(169); match(NOT);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(175); match(LPAREN);
					setState(176); nonRecursiveFormula();
					setState(177); match(RPAREN);
					}
					break;
				case TRUTH:
				case FALSITY:
				case VARIABLE:
				case RELNAME:
					{
					setState(179); nonRecursiveFormula();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182); quantifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(187); match(NOT);
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(198);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(193); match(LPAREN);
					setState(194); formula();
					setState(195); match(RPAREN);
					}
					break;

				case 2:
					{
					setState(197); formula();
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				switch (_input.LA(1)) {
				case TRUTH:
				case FALSITY:
				case VARIABLE:
				case RELNAME:
					{
					setState(200); nonRecursiveFormula();
					}
					break;
				case LPAREN:
					{
					setState(201); match(LPAREN);
					setState(202); nonRecursiveFormula();
					setState(203); match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode RELNAME() { return getToken(FOLParser.RELNAME, 0); }
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
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(RELNAME);
				setState(210); binaryarg();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(RELNAME);
				setState(212); unaryarg();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); match(RELNAME);
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
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public BinaryargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterBinaryarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitBinaryarg(this);
		}
	}

	public final BinaryargContext binaryarg() throws RecognitionException {
		BinaryargContext _localctx = new BinaryargContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binaryarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(LPAREN);
			setState(217); term();
			setState(218); match(1);
			setState(219); term();
			setState(220); match(RPAREN);
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
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public UnaryargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterUnaryarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitUnaryarg(this);
		}
	}

	public final UnaryargContext unaryarg() throws RecognitionException {
		UnaryargContext _localctx = new UnaryargContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(LPAREN);
			setState(223); term();
			setState(224); match(RPAREN);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(FOLParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(FOLParser.EXISTS, 0); }
		public TerminalNode VARIABLE() { return getToken(FOLParser.VARIABLE, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==EXISTS || _la==FORALL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(227); match(VARIABLE);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(FOLParser.VARIABLE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(VARIABLE);
				}
				break;
			case RELNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); constant();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode RELNAME() { return getToken(FOLParser.RELNAME, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(RELNAME);
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
		public TerminalNode TRUTH() { return getToken(FOLParser.TRUTH, 0); }
		public TerminalNode EQUALS() { return getToken(FOLParser.EQUALS, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode FALSITY() { return getToken(FOLParser.FALSITY, 0); }
		public NonRecursiveFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonRecursiveFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).enterNonRecursiveFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOLListener ) ((FOLListener)listener).exitNonRecursiveFormula(this);
		}
	}

	public final NonRecursiveFormulaContext nonRecursiveFormula() throws RecognitionException {
		NonRecursiveFormulaContext _localctx = new NonRecursiveFormulaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonRecursiveFormula);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); relation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); term();
				setState(237); match(EQUALS);
				setState(238); term();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(TRUTH);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241); match(FALSITY);
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
		"\2\3\22\u00f7\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2"+
		"\3\2\3\2\3\2\5\2$\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\64\n\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4B\n\4\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\7"+
		"\6b\n\6\f\6\16\6e\13\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7s\n\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081"+
		"\n\7\3\b\6\b\u0084\n\b\r\b\16\b\u0085\3\b\7\b\u0089\n\b\f\b\16\b\u008c"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n\b\3\b\6\b\u0096\n\b\r\b\16\b\u0097"+
		"\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a5\n"+
		"\b\3\b\6\b\u00a8\n\b\r\b\16\b\u00a9\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b7\n\b\3\b\6\b\u00ba\n\b\r\b\16\b\u00bb"+
		"\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c9\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d0\n\b\5\b\u00d2\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\5\r\u00ea\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00f5\n\17\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\n\13"+
		"\u010d\2#\3\2\2\2\4,\3\2\2\2\69\3\2\2\2\bN\3\2\2\2\nc\3\2\2\2\fx\3\2\2"+
		"\2\16\u00d1\3\2\2\2\20\u00d8\3\2\2\2\22\u00da\3\2\2\2\24\u00e0\3\2\2\2"+
		"\26\u00e4\3\2\2\2\30\u00e9\3\2\2\2\32\u00eb\3\2\2\2\34\u00f4\3\2\2\2\36"+
		"\37\7\4\2\2\37 \5\4\3\2 !\7\5\2\2!$\3\2\2\2\"$\5\4\3\2#\36\3\2\2\2#\""+
		"\3\2\2\2$%\3\2\2\2%&\7\1\2\2&\3\3\2\2\2\'(\7\4\2\2()\5\6\4\2)*\7\5\2\2"+
		"*-\3\2\2\2+-\5\6\4\2,\'\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\4\2\2/\60\5\b"+
		"\5\2\60\61\7\5\2\2\61\64\3\2\2\2\62\64\5\b\5\2\63.\3\2\2\2\63\62\3\2\2"+
		"\2\64\65\3\2\2\2\65\66\7\17\2\2\668\3\2\2\2\67\63\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:A\3\2\2\2;9\3\2\2\2<=\7\4\2\2=>\5\b\5\2>?\7\5\2\2?"+
		"B\3\2\2\2@B\5\b\5\2A<\3\2\2\2A@\3\2\2\2B\7\3\2\2\2CD\7\4\2\2DE\5\n\6\2"+
		"EF\7\5\2\2FI\3\2\2\2GI\5\n\6\2HC\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7\t\2\2"+
		"KM\3\2\2\2LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2PN\3\2\2\2"+
		"QR\7\4\2\2RS\5\n\6\2ST\7\5\2\2TW\3\2\2\2UW\5\n\6\2VQ\3\2\2\2VU\3\2\2\2"+
		"W\t\3\2\2\2XY\7\4\2\2YZ\5\f\7\2Z[\7\5\2\2[^\3\2\2\2\\^\5\f\7\2]X\3\2\2"+
		"\2]\\\3\2\2\2^_\3\2\2\2_`\7\7\2\2`b\3\2\2\2a]\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2dk\3\2\2\2ec\3\2\2\2fg\7\4\2\2gh\5\f\7\2hi\7\5\2\2il\3\2"+
		"\2\2jl\5\f\7\2kf\3\2\2\2kj\3\2\2\2l\13\3\2\2\2mn\7\4\2\2no\5\16\b\2op"+
		"\7\5\2\2ps\3\2\2\2qs\5\16\b\2rm\3\2\2\2rq\3\2\2\2st\3\2\2\2tu\7\6\2\2"+
		"uw\3\2\2\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0080\3\2\2\2zx\3"+
		"\2\2\2{|\7\4\2\2|}\5\16\b\2}~\7\5\2\2~\u0081\3\2\2\2\177\u0081\5\16\b"+
		"\2\u0080{\3\2\2\2\u0080\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0084\7\b\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u008a\3\2\2\2\u0087\u0089\5\26\f\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0092"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\4\2\2\u008e\u008f\5\34\17\2"+
		"\u008f\u0090\7\5\2\2\u0090\u0093\3\2\2\2\u0091\u0093\5\34\17\2\u0092\u008d"+
		"\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u00d2\3\2\2\2\u0094\u0096\7\b\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009c\3\2\2\2\u0099\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a4\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5\4\3\2\u00a1"+
		"\u00a2\7\5\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\5\4\3\2\u00a4\u009f\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00d2\3\2\2\2\u00a6\u00a8\5\26\f\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\7\b\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b6\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\34\17\2\u00b3"+
		"\u00b4\7\5\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\5\34\17\2\u00b6\u00b1\3"+
		"\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00d2\3\2\2\2\u00b8\u00ba\5\26\f\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\7\b\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c8\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\5\4\3\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5\4\3\2\u00c8\u00c3\3\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00d2\3\2\2\2\u00ca\u00d0\5\34\17\2\u00cb"+
		"\u00cc\7\4\2\2\u00cc\u00cd\5\34\17\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\3"+
		"\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u0083\3\2\2\2\u00d1\u0095\3\2\2\2\u00d1\u00a7\3\2\2\2\u00d1\u00b9\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\17\3\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d9"+
		"\5\22\n\2\u00d5\u00d6\7\21\2\2\u00d6\u00d9\5\24\13\2\u00d7\u00d9\7\21"+
		"\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\21\3\2\2\2\u00da\u00db\7\4\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd\7\3\2"+
		"\2\u00dd\u00de\5\30\r\2\u00de\u00df\7\5\2\2\u00df\23\3\2\2\2\u00e0\u00e1"+
		"\7\4\2\2\u00e1\u00e2\5\30\r\2\u00e2\u00e3\7\5\2\2\u00e3\25\3\2\2\2\u00e4"+
		"\u00e5\t\2\2\2\u00e5\u00e6\7\20\2\2\u00e6\27\3\2\2\2\u00e7\u00ea\7\20"+
		"\2\2\u00e8\u00ea\5\32\16\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\31\3\2\2\2\u00eb\u00ec\7\21\2\2\u00ec\33\3\2\2\2\u00ed\u00f5\5\20\t\2"+
		"\u00ee\u00ef\5\30\r\2\u00ef\u00f0\7\16\2\2\u00f0\u00f1\5\30\r\2\u00f1"+
		"\u00f5\3\2\2\2\u00f2\u00f5\7\f\2\2\u00f3\u00f5\7\r\2\2\u00f4\u00ed\3\2"+
		"\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\35\3\2\2\2!#,\639AHNV]ckrx\u0080\u0085\u008a\u0092\u0097\u009c\u00a4"+
		"\u00a9\u00ae\u00b6\u00bb\u00c0\u00c8\u00cf\u00d1\u00d8\u00e9\u00f4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}