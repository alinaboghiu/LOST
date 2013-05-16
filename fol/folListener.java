// Generated from fol.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface folListener extends ParseTreeListener {
	void enterQuantifier(folParser.QuantifierContext ctx);
	void exitQuantifier(folParser.QuantifierContext ctx);

	void enterTerm(folParser.TermContext ctx);
	void exitTerm(folParser.TermContext ctx);

	void enterCondition(folParser.ConditionContext ctx);
	void exitCondition(folParser.ConditionContext ctx);

	void enterUnaryarg(folParser.UnaryargContext ctx);
	void exitUnaryarg(folParser.UnaryargContext ctx);

	void enterRelation(folParser.RelationContext ctx);
	void exitRelation(folParser.RelationContext ctx);

	void enterBinaryarg(folParser.BinaryargContext ctx);
	void exitBinaryarg(folParser.BinaryargContext ctx);

	void enterFormula(folParser.FormulaContext ctx);
	void exitFormula(folParser.FormulaContext ctx);
}