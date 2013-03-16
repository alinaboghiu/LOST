package Tree;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;


/*
 * @author alina
 * 
 */
public class LogicTree {

    LogicTreeNode head;

    public LogicTree(ParseTree t, Structure struct, Signature sig, ArrayList<Variable> sentenceScope)
            throws DuplicateDefinitionException,
                   UnboundException,
                   UndefinedRelationException {

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

        head = toLogicTreeNode(thisNodeInfo, struct, sig, sentenceScope);

        int size = nextNodeInfo.size();
        if (size == 1) {
            head.next = new LogicTree(nextNodeInfo.get(0), struct, sig, sentenceScope).head;
        } else if (size == 2) {
            BinOpNode b = (BinOpNode) head;
            b.left = new LogicTree(nextNodeInfo.get(0), struct, sig, sentenceScope).head;
            b.right = new LogicTree(nextNodeInfo.get(1), struct, sig, sentenceScope).head;
        }

    }

    private LogicTreeNode toLogicTreeNode(ArrayList<ParseTree> info,
            Structure struct, Signature sig, ArrayList<Variable> sentenceScope) throws DuplicateDefinitionException,
            UnboundException,
            UndefinedRelationException {

        if (info.isEmpty()) {
            return new DummyNode();
        }

        // Equals node case
        if (info.size() > 1) {
            String t1Name = info.get(0).getChild(0).getText();
            String t2Name = info.get(2).getChild(0).getText();
            EqualsNode eq = new EqualsNode(null, null);

            if (struct.inConstScope(t1Name) != null) {
                eq.leftTerm = struct.inConstScope(t1Name);
            } else if (inSentenceScope(t1Name, sentenceScope) != null) {
                eq.leftTerm = struct.inConstScope(t1Name);
            } else {
                throw new UnboundException(t1Name);
            }

            if (struct.inConstScope(t2Name) != null) {
                eq.rightTerm = struct.inConstScope(t2Name);
            } else if (inSentenceScope(t2Name, sentenceScope) != null) {
                eq.rightTerm = inSentenceScope(t2Name, sentenceScope);
            } else {
                throw new UnboundException(t2Name);
            }

            return eq;
        }

        ParseTree thisInfo = info.get(0);
        String relType = thisInfo.getClass().getSimpleName();

        //Create Quantifier Node
        switch (relType) {
            case "QuantifierContext":
                relType = thisInfo.getChild(0).getText();
                String varName = thisInfo.getChild(1).getText();
                if (struct.inConstScope(varName) != null
                        || inSentenceScope(varName, sentenceScope) != null) {
                    throw new DuplicateDefinitionException();
                }
                Variable var = new Variable(varName);
                sentenceScope.add(var);

                switch (relType) {
                    case "∀":
                        ForAllNode f = new ForAllNode(var, null);
                        return f;
                    case "∃":
                        ExistsNode e = new ExistsNode(var, null);
                        return e;
                }

            case "RelationContext":
                String relName = thisInfo.getChild(0).getText();

                // Create Nullary Relation Node
                if (thisInfo.getChildCount() == 1) {
                    if (!sig.nullaryNames.contains(relName)) {
                        sig.nullaryNames.add(relName);
                        throw new UndefinedRelationException(relName);
                    } else {
                        return new NullaryRelNode(struct.inNullaryScope(relName));
                    }

                } else {
                    relType = thisInfo.getChild(1).getClass().getSimpleName();

                    //Create Unary Relation Node
                    if (relType.equals("UnaryargContext")) {
                        if (!sig.unaryNames.contains(relName)) {
                            sig.unaryNames.add(relName);
                            throw new UndefinedRelationException(relName);
                        } else {
                            String argName = thisInfo.getChild(1).getChild(1).getText();
                            UnaryRel rel = new UnaryRel(relName, null);
                            if (struct.inConstScope(argName) != null) {
                                rel.arg = struct.inConstScope(argName);
                            } else if (inSentenceScope(argName, sentenceScope) != null) {
                                rel.arg = inSentenceScope(argName, sentenceScope);
                            } else {
                                throw new UnboundException(argName);
                            }
                            return new UnaryRelNode(rel, rel.arg);
                        }

                        //Create Binary Relation Node
                    } else {
                        if (!sig.binaryNames.contains(relName)) {
                            sig.binaryNames.add(relName);
                            throw new UndefinedRelationException(relName);
                        } else {
                            String a1Name = thisInfo.getChild(1).getChild(1).getText();
                            String a2Name = thisInfo.getChild(1).getChild(3).getText();
                            BinaryRel rel = new BinaryRel(relName, null, null);

                            if (struct.inConstScope(a1Name) != null) {
                                rel.arg1 = struct.inConstScope(a1Name);
                            } else if (inSentenceScope(a1Name, sentenceScope) != null) {
                                rel.arg1 = inSentenceScope(a1Name, sentenceScope);
                            } else {
                                throw new UnboundException(a1Name);
                            }

                            if (struct.inConstScope(a2Name) != null) {
                                rel.arg1 = struct.inConstScope(a2Name);
                            } else if (inSentenceScope(a2Name, sentenceScope) != null) {
                                rel.arg1 = inSentenceScope(a2Name, sentenceScope);
                            } else {
                                throw new UnboundException(a2Name);
                            }

                            return new BinaryRelNode(rel, rel.arg1, rel.arg2);
                        }
                    }
                }
            default: //Terminal node implementation
                relType = thisInfo.getText();
                switch (relType) {
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

    public boolean evaluate(Structure s) {
        try {
            return head.evaluate(s);
        } catch (ThisUnboundException ex) {
            // should not reach here
            System.out.println("This exception should have been caught by now");
            return false;
        }
    }

    private Variable inSentenceScope(String varName, ArrayList<Variable> sentenceScope) {
        for (Variable v : sentenceScope) {
            if (v.name.equals(varName)) {
                return v;
            }
        }
        return null;
    }
}
