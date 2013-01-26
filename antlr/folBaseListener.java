// Generated from fol.g4 by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class folBaseListener implements folListener {
	@Override public void enterNegation(folParser.NegationContext ctx) { }
	@Override public void exitNegation(folParser.NegationContext ctx) { }

	@Override public void enterImplication(folParser.ImplicationContext ctx) { }
	@Override public void exitImplication(folParser.ImplicationContext ctx) { }

	@Override public void enterEquivalence(folParser.EquivalenceContext ctx) { }
	@Override public void exitEquivalence(folParser.EquivalenceContext ctx) { }

	@Override public void enterCondition(folParser.ConditionContext ctx) { }
	@Override public void exitCondition(folParser.ConditionContext ctx) { }

	@Override public void enterDisjunction(folParser.DisjunctionContext ctx) { }
	@Override public void exitDisjunction(folParser.DisjunctionContext ctx) { }

	@Override public void enterUnaryarg(folParser.UnaryargContext ctx) { }
	@Override public void exitUnaryarg(folParser.UnaryargContext ctx) { }

	@Override public void enterRelation(folParser.RelationContext ctx) { }
	@Override public void exitRelation(folParser.RelationContext ctx) { }

	@Override public void enterConjunction(folParser.ConjunctionContext ctx) { }
	@Override public void exitConjunction(folParser.ConjunctionContext ctx) { }

	@Override public void enterBinaryarg(folParser.BinaryargContext ctx) { }
	@Override public void exitBinaryarg(folParser.BinaryargContext ctx) { }

	@Override public void enterSentence(folParser.SentenceContext ctx) { }
	@Override public void exitSentence(folParser.SentenceContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}