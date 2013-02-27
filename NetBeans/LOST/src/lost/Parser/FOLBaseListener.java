// Generated from FOL.g4 by ANTLR 4.0
package lost.Parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class FOLBaseListener implements FOLListener {
	@Override public void enterQuantifier(FOLParser.QuantifierContext ctx) { }
	@Override public void exitQuantifier(FOLParser.QuantifierContext ctx) { }

	@Override public void enterTerm(FOLParser.TermContext ctx) { }
	@Override public void exitTerm(FOLParser.TermContext ctx) { }

	@Override public void enterCondition(FOLParser.ConditionContext ctx) { }
	@Override public void exitCondition(FOLParser.ConditionContext ctx) { }

	@Override public void enterUnaryarg(FOLParser.UnaryargContext ctx) { }
	@Override public void exitUnaryarg(FOLParser.UnaryargContext ctx) { }

	@Override public void enterRelation(FOLParser.RelationContext ctx) { }
	@Override public void exitRelation(FOLParser.RelationContext ctx) { }

	@Override public void enterBinaryarg(FOLParser.BinaryargContext ctx) { }
	@Override public void exitBinaryarg(FOLParser.BinaryargContext ctx) { }

	@Override public void enterFormula(FOLParser.FormulaContext ctx) { }
	@Override public void exitFormula(FOLParser.FormulaContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}