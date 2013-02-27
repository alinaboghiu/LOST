// Generated from FOL.g4 by ANTLR 4.0
package lost.Parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface FOLListener extends ParseTreeListener {
	void enterQuantifier(FOLParser.QuantifierContext ctx);
	void exitQuantifier(FOLParser.QuantifierContext ctx);

	void enterTerm(FOLParser.TermContext ctx);
	void exitTerm(FOLParser.TermContext ctx);

	void enterCondition(FOLParser.ConditionContext ctx);
	void exitCondition(FOLParser.ConditionContext ctx);

	void enterUnaryarg(FOLParser.UnaryargContext ctx);
	void exitUnaryarg(FOLParser.UnaryargContext ctx);

	void enterRelation(FOLParser.RelationContext ctx);
	void exitRelation(FOLParser.RelationContext ctx);

	void enterBinaryarg(FOLParser.BinaryargContext ctx);
	void exitBinaryarg(FOLParser.BinaryargContext ctx);

	void enterFormula(FOLParser.FormulaContext ctx);
	void exitFormula(FOLParser.FormulaContext ctx);
}