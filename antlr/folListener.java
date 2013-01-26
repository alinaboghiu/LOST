// Generated from fol.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface folListener extends ParseTreeListener {
	void enterNegation(folParser.NegationContext ctx);
	void exitNegation(folParser.NegationContext ctx);

	void enterImplication(folParser.ImplicationContext ctx);
	void exitImplication(folParser.ImplicationContext ctx);

	void enterEquivalence(folParser.EquivalenceContext ctx);
	void exitEquivalence(folParser.EquivalenceContext ctx);

	void enterCondition(folParser.ConditionContext ctx);
	void exitCondition(folParser.ConditionContext ctx);

	void enterDisjunction(folParser.DisjunctionContext ctx);
	void exitDisjunction(folParser.DisjunctionContext ctx);

	void enterUnaryarg(folParser.UnaryargContext ctx);
	void exitUnaryarg(folParser.UnaryargContext ctx);

	void enterRelation(folParser.RelationContext ctx);
	void exitRelation(folParser.RelationContext ctx);

	void enterConjunction(folParser.ConjunctionContext ctx);
	void exitConjunction(folParser.ConjunctionContext ctx);

	void enterBinaryarg(folParser.BinaryargContext ctx);
	void exitBinaryarg(folParser.BinaryargContext ctx);

	void enterSentence(folParser.SentenceContext ctx);
	void exitSentence(folParser.SentenceContext ctx);
}