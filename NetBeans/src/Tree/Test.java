package Tree;

import Parser.folLexer;
import Parser.folParser;
import java.util.ArrayList;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/*
 * @author alina
 * 
 */
public class Test {

    static ArrayList<Term> sentenceTerms = new ArrayList<>();

    public static void main(String[] args)
            throws UnboundException,
            ThisUnboundException,
            DuplicateDefinitionException {

//        Variable x = new Variable("x");
//        Variable y = new Variable("y");
//        Variable z = new Variable("z");
//        Variable w = new Variable("w");
//
        Const fred = new Const("Fred");
        Const tina = new Const("Tina");
//
//        UnaryRel happy = new UnaryRel("happy");
//        BinaryRel loves = new BinaryRel("loves");
//        UnaryRelNode happyX = new UnaryRelNode(happy, x);
//        UnaryRelNode happyY = new UnaryRelNode(happy, y);
//        UnaryRelNode happyFred = new UnaryRelNode(happy, fred);

//        NotNode notHappyFred = new NotNode(happyFred);

//        BinaryRelNode lovesXY = new BinaryRelNode(loves, x, y);
//        BinaryRelNode lovesFredX = new BinaryRelNode(loves, fred, x);
//        BinaryRelNode lovesXFred = new BinaryRelNode(loves, x, fred);

//        ForAllNode allW = new ForAllNode(w, happyX);
//        ForAllNode allZ = new ForAllNode(z, allW);

//        ExistsNode existsW = new ExistsNode(w, allX);
//        ExistsNode existsZ = new ExistsNode(z, allX);
//        ExistsNode existsY = new ExistsNode(y, and);

//        ∀x∃y(P(y) ∧ ¬(x=y))
//        EqualsNode equalsYX = new EqualsNode(y, x);
//        NotNode not = new NotNode(equalsYX);
//        BinOpNode and = new BinOpNode(BinOp.AND, happyY, not);
//        ForAllNode allX = new ForAllNode(x, and);
//        ExistsNode existsY = new ExistsNode(y, allX);
//        LogicTree sentence = new LogicTree(existsY);

//        ∀x(R(Fred,x) →  ∀y(R(x,y) → P(y)))
//        BinOpNode impliesLovesHappyY = new BinOpNode(BinOp.IMPLIES, lovesXY, happyY);
//        ForAllNode allY = new ForAllNode(y, impliesLovesHappyY);
//        BinOpNode impliesLovesFredXallY = new BinOpNode(BinOp.IMPLIES, lovesFredX, allY);
//        ForAllNode allX = new ForAllNode(x, impliesLovesFredXallY);
//        LogicTree sentence = new LogicTree(allX);


        Structure makeTrue = new Structure();

//        Term t1 = new Term("t1");
//        Term t2 = new Term("t2");
//        Term t3 = new Term("t3");
//
        UnaryRel happy1 = new UnaryRel("happy", tina);
//        UnaryRel happy2 = new UnaryRel("happy", t2);
//        UnaryRel happy3 = new UnaryRel("happy", t3);
        UnaryRel happy4 = new UnaryRel("happy", fred);
//
        BinaryRel loves1 = new BinaryRel("loves", fred, tina);
//        BinaryRel loves2 = new BinaryRel("loves", tina, tina);
//        BinaryRel loves3 = new BinaryRel("loves", t3, fred);
//        BinaryRel loves4 = new BinaryRel("loves", t2, fred);
//
//        BinaryRel loves5 = new BinaryRel("loves", t1, t1);
//        BinaryRel loves6 = new BinaryRel("loves", fred, t1);
//        BinaryRel loves7 = new BinaryRel("loves", t3, t1);
//        BinaryRel loves8 = new BinaryRel("loves", t2, t1);
//
//        BinaryRel loves9 = new BinaryRel("loves", t1, t2);
//        BinaryRel loves10 = new BinaryRel("loves", fred, t2);
//        BinaryRel loves11 = new BinaryRel("loves", t3, t2);
//        BinaryRel loves12 = new BinaryRel("loves", t2, t2);
//        
//        BinaryRel loves13 = new BinaryRel("loves", t1, t3);
//        BinaryRel loves14 = new BinaryRel("loves", fred, t3);
//        BinaryRel loves15 = new BinaryRel("loves", t3, t3);
//        BinaryRel loves16 = new BinaryRel("loves", t2, t3);
//
//        makeTrue.terms.add(t1);
//        makeTrue.terms.add(t2);
//        makeTrue.terms.add(t3);
        makeTrue.terms.add(fred);
        makeTrue.terms.add(tina);
//
//        makeTrue.unaryRels.add(happy1);
//        makeTrue.unaryRels.add(happy2);
//        makeTrue.unaryRels.add(happy3);
//        makeTrue.unaryRels.add(happy4);
//
        makeTrue.binaryRels.add(loves1);
//        makeTrue.binaryRels.add(loves2);
//        makeTrue.binaryRels.add(loves3);
//        makeTrue.binaryRels.add(loves4);
//        makeTrue.binaryRels.add(loves5);
//        makeTrue.binaryRels.add(loves6);
//        makeTrue.binaryRels.add(loves7);
//        makeTrue.binaryRels.add(loves8);
//        makeTrue.binaryRels.add(loves9);
//        makeTrue.binaryRels.add(loves10);
//        makeTrue.binaryRels.add(loves11);
//        makeTrue.binaryRels.add(loves12);
//        makeTrue.binaryRels.add(loves13);
//        makeTrue.binaryRels.add(loves14);
//        makeTrue.binaryRels.add(loves15);
//        makeTrue.binaryRels.add(loves16);

        //∀x(R(Fred,x) →  ∀y(R(x,y) → P(y)))
        ANTLRInputStream input = new ANTLRInputStream("happy(Fred)");
        Lexer lexer = new folLexer(input);
        TokenStream tk = new CommonTokenStream(lexer);
        folParser p = new folParser(tk);
        ParseTree condition = p.condition();

        System.out.println(condition.getChild(0).getChild(0).getChild(1).getClass());
        LogicTree sentence = toLogicTree(condition.getChild(0));
        
        System.out.println(sentence.evaluate(makeTrue));

//        System.out.println(condition.getChild(0).getChild(1).getChild(0).getClass().getSimpleName());

    }

    private static LogicTreeNode toLogicTreeNode(ArrayList<ParseTree> info)
            throws DuplicateDefinitionException {
        if (info.isEmpty()) {
            return new DummyNode();
        }

        if (info.size() > 1) {
            String t1Name = info.get(0).getChild(0).getText();
            String t2Name = info.get(0).getChild(0).getText();
            EqualsNode eq = new EqualsNode(null, null);

            if (inScope(t1Name) == null) {
                Const t1 = new Const(t1Name);
                sentenceTerms.add(t1);
                eq.leftTerm = t1;
            } else {
                eq.leftTerm = inScope(t1Name);
            }

            if (inScope(t2Name) == null) {
                Const t2 = new Const(t1Name);
                sentenceTerms.add(t2);
                eq.leftTerm = t2;
            } else {
                eq.leftTerm = inScope(t2Name);
            }

            return eq;
        }

        ParseTree thisInfo = info.get(0);
        String nodeType = thisInfo.getClass().getSimpleName();

        //Create Quantifier Node
        switch (nodeType) {
            case "QuantifierContext":
                nodeType = thisInfo.getChild(0).getText();
                String varName = thisInfo.getChild(1).getText();
                if (inScope(varName) != null) {
                    throw new DuplicateDefinitionException();
                }
                Variable var = new Variable(varName);

                switch (nodeType) {
                    case "∀":
                        var.forAllBound = true;
                        return new ForAllNode(var, null);
                    case "∃":
                        var.forAllBound = true;
                        return new ForAllNode(var, null);
                }

            case "RelationContext":
                String relName;

                // Create Nullary Relation Node
                if (thisInfo.getChildCount() == 1) {
                    relName = thisInfo.getChild(0).getChild(0).getText();
                    return new NullaryRelNode(new NullaryRel(relName));

                } else {
                    nodeType = thisInfo.getChild(1).getClass().getSimpleName();
                    relName = thisInfo.getChild(0).getText();

                    //Create Unary Relation Node
                    if (nodeType.equals("UnaryargContext")) {
                        String argName = thisInfo.getChild(1).getChild(1).getText();
                        UnaryRel rel = new UnaryRel(relName, null);

                        //if arguement not in scope, assume it is a constant
                        if (inScope(argName) == null) {
                            Const arg = new Const(argName);
                            sentenceTerms.add(arg);
                            rel.arg = arg;
                        } else {
                            rel.arg = inScope(argName);
                        }

                        return new UnaryRelNode(rel, rel.arg);

                        //Create Binary Relation Node
                    } else {
                        String a1Name = thisInfo.getChild(1).getChild(1).getText();
                        String a2Name = thisInfo.getChild(1).getChild(3).getText();
                        BinaryRel rel = new BinaryRel(relName, null, null);

                        if (inScope(a1Name) == null) {
                            Const a1 = new Const(a1Name);
                            sentenceTerms.add(a1);
                            rel.arg1 = a1;
                        } else {
                            rel.arg1 = inScope(a1Name);
                        }

                        if (inScope(a2Name) == null) {
                            Const a2 = new Const(a1Name);
                            sentenceTerms.add(a2);
                            rel.arg2 = a2;
                        } else {
                            rel.arg2 = inScope(a1Name);
                        }

                        return new BinaryRelNode(rel, rel.arg1, rel.arg2);
                    }
                }
            default:
                //if(nodeType.equals("TerminalNodeImpl"))
                nodeType = thisInfo.getText();
                switch (nodeType) {
                    case "¬":
                        return new NotNode(null);
                    case "→":
                        return new BinOpNode(BinOp.IMPLIES, null, null);
                    case "↔":
                        return new BinOpNode(BinOp.EQUIVALENCE, null, null);
                    case "∧":
                        return new BinOpNode(BinOp.AND, null, null);
                    case "∨":
                        return new BinOpNode(BinOp.OR, null, null);
                    case "⊤":
                        return new TruthNode();
                    case "⊥":
                        return new FalsityNode();
                }
        }

        //should not reach here
        System.out.println(" Could not identify node ");
        return null;
    }

    private static LogicTree toLogicTree(ParseTree t) 
            throws DuplicateDefinitionException {
        ParseTree iterator;
        ArrayList<ParseTree> thisNodeInfo = new ArrayList<>();
        ArrayList<ParseTree> nextNodeInfo = new ArrayList<>();

        for (int i = 0; i < t.getChildCount(); i++) {
            iterator = t.getChild(i);
            if (iterator.getClass().getSimpleName().equals("FormulaContext")) {
                nextNodeInfo.add(iterator);
            } else if (!(iterator.getText().equals("(") || iterator.getText().equals(")"))) {
                thisNodeInfo.add(iterator);
            }
        }

        LogicTreeNode head = toLogicTreeNode(thisNodeInfo);

        int size = nextNodeInfo.size();
        if (size == 1) {
            head.next = toLogicTree(nextNodeInfo.get(0)).head;
        } else if (size == 2) {
            BinOpNode b = (BinOpNode) head;
            b.left = toLogicTree(nextNodeInfo.get(0)).head;
            b.right = toLogicTree(nextNodeInfo.get(1)).head;
        }

        return new LogicTree(head);
    }

    private static Term inScope(String a1Name) {
        for (Term t : sentenceTerms) {
            if (t.name.equals(a1Name)) {
                return t;
            }
        }
        return null;
    }
}