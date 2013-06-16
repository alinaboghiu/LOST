// Generated from fol.g4 by ANTLR 4.0
package Parser;

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
    public static final int T__0 = 1, LPAREN = 2, RPAREN = 3, AND = 4, OR = 5, NOT = 6, IMPLIES = 7, EXISTS = 8, FORALL = 9,
            TRUTH = 10, FALSITY = 11, EQUALS = 12, EQUIV = 13, VARIABLE = 14, NAME = 15, WS = 16;
    public static final String[] tokenNames = {
        "<INVALID>", "','", "'('", "')'", "'∧'", "'∨'", "'¬'", "'→'", "'∃'", "'∀'",
        "'⊤'", "'⊥'", "'='", "'↔'", "VARIABLE", "NAME", "WS"
    };
    public static final int RULE_condition = 0, RULE_formula = 1, RULE_term = 2, RULE_quantifier = 3,
            RULE_relation = 4, RULE_binaryarg = 5, RULE_unaryarg = 6;
    public static final String[] ruleNames = {
        "condition", "formula", "term", "quantifier", "relation", "binaryarg",
        "unaryarg"
    };

    @Override
    public String getGrammarFileName() {
        return "fol.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public folParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ConditionContext extends ParserRuleContext {

        public TerminalNode EOF() {
            return getToken(folParser.EOF, 0);
        }

        public FormulaContext formula() {
            return getRuleContext(FormulaContext.class, 0);
        }

        public ConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_condition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterCondition(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitCondition(this);
            }
        }
    }

    public final ConditionContext condition() throws RecognitionException {
        ConditionContext _localctx = new ConditionContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_condition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(14);
                formula(0);
                setState(15);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FormulaContext extends ParserRuleContext {

        public int _p;

        public TerminalNode EQUIV() {
            return getToken(folParser.EQUIV, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(folParser.RPAREN, 0);
        }

        public TerminalNode IMPLIES() {
            return getToken(folParser.IMPLIES, 0);
        }

        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TerminalNode FALSITY() {
            return getToken(folParser.FALSITY, 0);
        }

        public TerminalNode OR() {
            return getToken(folParser.OR, 0);
        }

        public QuantifierContext quantifier() {
            return getRuleContext(QuantifierContext.class, 0);
        }

        public TerminalNode TRUTH() {
            return getToken(folParser.TRUTH, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(folParser.EQUALS, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TerminalNode NOT() {
            return getToken(folParser.NOT, 0);
        }

        public TerminalNode AND() {
            return getToken(folParser.AND, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(folParser.LPAREN, 0);
        }

        public List<FormulaContext> formula() {
            return getRuleContexts(FormulaContext.class);
        }

        public FormulaContext formula(int i) {
            return getRuleContext(FormulaContext.class, i);
        }

        public FormulaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FormulaContext(ParserRuleContext parent, int invokingState, int _p) {
            super(parent, invokingState);
            this._p = _p;
        }

        @Override
        public int getRuleIndex() {
            return RULE_formula;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterFormula(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitFormula(this);
            }
        }
    }

    public final FormulaContext formula(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        FormulaContext _localctx = new FormulaContext(_ctx, _parentState, _p);
        FormulaContext _prevctx = _localctx;
        int _startState = 2;
        enterRecursionRule(_localctx, RULE_formula);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(34);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(18);
                        quantifier();
                        setState(19);
                        formula(7);
                    }
                    break;

                    case 2: {
                        setState(21);
                        match(NOT);
                        setState(22);
                        formula(6);
                    }
                    break;

                    case 3: {
                        setState(23);
                        match(TRUTH);
                    }
                    break;

                    case 4: {
                        setState(24);
                        match(FALSITY);
                    }
                    break;

                    case 5: {
                        setState(25);
                        term();
                        setState(26);
                        match(EQUALS);
                        setState(27);
                        term();
                    }
                    break;

                    case 6: {
                        setState(29);
                        relation();
                    }
                    break;

                    case 7: {
                        setState(30);
                        match(LPAREN);
                        setState(31);
                        formula(0);
                        setState(32);
                        match(RPAREN);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(50);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != -1) {
                    if (_alt == 1) {
                        if (_parseListeners != null) {
                            triggerExitRuleEvent();
                        }
                        _prevctx = _localctx;
                        {
                            setState(48);
                            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                                case 1: {
                                    _localctx = new FormulaContext(_parentctx, _parentState, _p);
                                    pushNewRecursionContext(_localctx, _startState, RULE_formula);
                                    setState(36);
                                    if (!(5 >= _localctx._p)) {
                                        throw new FailedPredicateException(this, "5 >= $_p");
                                    }
                                    setState(37);
                                    match(AND);
                                    setState(38);
                                    formula(6);
                                }
                                break;

                                case 2: {
                                    _localctx = new FormulaContext(_parentctx, _parentState, _p);
                                    pushNewRecursionContext(_localctx, _startState, RULE_formula);
                                    setState(39);
                                    if (!(4 >= _localctx._p)) {
                                        throw new FailedPredicateException(this, "4 >= $_p");
                                    }
                                    setState(40);
                                    match(OR);
                                    setState(41);
                                    formula(5);
                                }
                                break;

                                case 3: {
                                    _localctx = new FormulaContext(_parentctx, _parentState, _p);
                                    pushNewRecursionContext(_localctx, _startState, RULE_formula);
                                    setState(42);
                                    if (!(3 >= _localctx._p)) {
                                        throw new FailedPredicateException(this, "3 >= $_p");
                                    }
                                    setState(43);
                                    match(IMPLIES);
                                    setState(44);
                                    formula(4);
                                }
                                break;

                                case 4: {
                                    _localctx = new FormulaContext(_parentctx, _parentState, _p);
                                    pushNewRecursionContext(_localctx, _startState, RULE_formula);
                                    setState(45);
                                    if (!(2 >= _localctx._p)) {
                                        throw new FailedPredicateException(this, "2 >= $_p");
                                    }
                                    setState(46);
                                    match(EQUIV);
                                    setState(47);
                                    formula(3);
                                }
                                break;
                            }
                        }
                    }
                    setState(52);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class TermContext extends ParserRuleContext {

        public TerminalNode NAME() {
            return getToken(folParser.NAME, 0);
        }

        public TerminalNode VARIABLE() {
            return getToken(folParser.VARIABLE, 0);
        }

        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_term;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterTerm(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitTerm(this);
            }
        }
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_term);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                _la = _input.LA(1);
                if (!(_la == VARIABLE || _la == NAME)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QuantifierContext extends ParserRuleContext {

        public TerminalNode FORALL() {
            return getToken(folParser.FORALL, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(folParser.EXISTS, 0);
        }

        public TerminalNode VARIABLE() {
            return getToken(folParser.VARIABLE, 0);
        }

        public QuantifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_quantifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterQuantifier(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitQuantifier(this);
            }
        }
    }

    public final QuantifierContext quantifier() throws RecognitionException {
        QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_quantifier);
        try {
            setState(59);
            switch (_input.LA(1)) {
                case FORALL:
                    enterOuterAlt(_localctx, 1); {
                    setState(55);
                    match(FORALL);
                    setState(56);
                    match(VARIABLE);
                }
                break;
                case EXISTS:
                    enterOuterAlt(_localctx, 2); {
                    setState(57);
                    match(EXISTS);
                    setState(58);
                    match(VARIABLE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RelationContext extends ParserRuleContext {

        public TerminalNode NAME() {
            return getToken(folParser.NAME, 0);
        }

        public UnaryargContext unaryarg() {
            return getRuleContext(UnaryargContext.class, 0);
        }

        public BinaryargContext binaryarg() {
            return getRuleContext(BinaryargContext.class, 0);
        }

        public RelationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterRelation(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitRelation(this);
            }
        }
    }

    public final RelationContext relation() throws RecognitionException {
        RelationContext _localctx = new RelationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_relation);
        try {
            setState(66);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(61);
                    match(NAME);
                    setState(62);
                    binaryarg();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(63);
                    match(NAME);
                    setState(64);
                    unaryarg();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(65);
                    match(NAME);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BinaryargContext extends ParserRuleContext {

        public TerminalNode RPAREN() {
            return getToken(folParser.RPAREN, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TerminalNode LPAREN() {
            return getToken(folParser.LPAREN, 0);
        }

        public BinaryargContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_binaryarg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterBinaryarg(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitBinaryarg(this);
            }
        }
    }

    public final BinaryargContext binaryarg() throws RecognitionException {
        BinaryargContext _localctx = new BinaryargContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_binaryarg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                match(LPAREN);
                setState(69);
                term();
                setState(70);
                match(1);
                setState(71);
                term();
                setState(72);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UnaryargContext extends ParserRuleContext {

        public TerminalNode RPAREN() {
            return getToken(folParser.RPAREN, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(folParser.LPAREN, 0);
        }

        public UnaryargContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unaryarg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).enterUnaryarg(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof folListener) {
                ((folListener) listener).exitUnaryarg(this);
            }
        }
    }

    public final UnaryargContext unaryarg() throws RecognitionException {
        UnaryargContext _localctx = new UnaryargContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_unaryarg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(74);
                match(LPAREN);
                setState(75);
                term();
                setState(76);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 1:
                return formula_sempred((FormulaContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return 5 >= _localctx._p;

            case 1:
                return 4 >= _localctx._p;

            case 2:
                return 3 >= _localctx._p;

            case 3:
                return 2 >= _localctx._p;
        }
        return true;
    }
    public static final String _serializedATN =
            "\2\3\22Q\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3"
            + "\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"
            + "\3\3\5\3%\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n"
            + "\3\f\3\16\3\66\13\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3"
            + "\6\5\6E\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\2\t\2\4\6\b\n"
            + "\f\16\2\3\3\20\21V\2\20\3\2\2\2\4$\3\2\2\2\6\67\3\2\2\2\b=\3\2\2\2\nD"
            + "\3\2\2\2\fF\3\2\2\2\16L\3\2\2\2\20\21\5\4\3\2\21\22\7\1\2\2\22\3\3\2\2"
            + "\2\23\24\b\3\1\2\24\25\5\b\5\2\25\26\5\4\3\2\26%\3\2\2\2\27\30\7\b\2\2"
            + "\30%\5\4\3\2\31%\7\f\2\2\32%\7\r\2\2\33\34\5\6\4\2\34\35\7\16\2\2\35\36"
            + "\5\6\4\2\36%\3\2\2\2\37%\5\n\6\2 !\7\4\2\2!\"\5\4\3\2\"#\7\5\2\2#%\3\2"
            + "\2\2$\23\3\2\2\2$\27\3\2\2\2$\31\3\2\2\2$\32\3\2\2\2$\33\3\2\2\2$\37\3"
            + "\2\2\2$ \3\2\2\2%\64\3\2\2\2&\'\6\3\2\3\'(\7\6\2\2(\63\5\4\3\2)*\6\3\3"
            + "\3*+\7\7\2\2+\63\5\4\3\2,-\6\3\4\3-.\7\t\2\2.\63\5\4\3\2/\60\6\3\5\3\60"
            + "\61\7\17\2\2\61\63\5\4\3\2\62&\3\2\2\2\62)\3\2\2\2\62,\3\2\2\2\62/\3\2"
            + "\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2"
            + "\2\2\678\t\2\2\28\7\3\2\2\29:\7\13\2\2:>\7\20\2\2;<\7\n\2\2<>\7\20\2\2"
            + "=9\3\2\2\2=;\3\2\2\2>\t\3\2\2\2?@\7\21\2\2@E\5\f\7\2AB\7\21\2\2BE\5\16"
            + "\b\2CE\7\21\2\2D?\3\2\2\2DA\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FG\7\4\2\2GH"
            + "\5\6\4\2HI\7\3\2\2IJ\5\6\4\2JK\7\5\2\2K\r\3\2\2\2LM\7\4\2\2MN\5\6\4\2"
            + "NO\7\5\2\2O\17\3\2\2\2\7$\62\64=D";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }
}