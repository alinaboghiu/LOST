// Generated from FOL.g4 by ANTLR 4.0
package lost.Parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface FOLListener extends ParseTreeListener {
	void enterNonRecursiveFormula(FOLParser.NonRecursiveFormulaContext ctx);
	void exitNonRecursiveFormula(FOLParser.NonRecursiveFormulaContext ctx);

	void enterConstant(FOLParser.ConstantContext ctx);
	void exitConstant(FOLParser.ConstantContext ctx);

	void enterImplication(FOLParser.ImplicationContext ctx);
	void exitImplication(FOLParser.ImplicationContext ctx);

	void enterCondition(FOLParser.ConditionContext ctx);
	void exitCondition(FOLParser.ConditionContext ctx);

	void enterDisjunction(FOLParser.DisjunctionContext ctx);
	void exitDisjunction(FOLParser.DisjunctionContext ctx);

	void enterConjunction(FOLParser.ConjunctionContext ctx);
	void exitConjunction(FOLParser.ConjunctionContext ctx);

	void enterRelation(FOLParser.RelationContext ctx);
	void exitRelation(FOLParser.RelationContext ctx);

	void enterNegation(FOLParser.NegationContext ctx);
	void exitNegation(FOLParser.NegationContext ctx);

	void enterQuantifier(FOLParser.QuantifierContext ctx);
	void exitQuantifier(FOLParser.QuantifierContext ctx);

	void enterEquivalence(FOLParser.EquivalenceContext ctx);
	void exitEquivalence(FOLParser.EquivalenceContext ctx);

	void enterTerm(FOLParser.TermContext ctx);
	void exitTerm(FOLParser.TermContext ctx);

	void enterUnaryarg(FOLParser.UnaryargContext ctx);
	void exitUnaryarg(FOLParser.UnaryargContext ctx);

	void enterBinaryarg(FOLParser.BinaryargContext ctx);
	void exitBinaryarg(FOLParser.BinaryargContext ctx);

	void enterFormula(FOLParser.FormulaContext ctx);
	void exitFormula(FOLParser.FormulaContext ctx);
}