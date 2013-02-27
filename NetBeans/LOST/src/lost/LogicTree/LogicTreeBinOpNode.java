/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeBinOpNode extends LogicTreeNode{
    
    BinOp op;
    LogicTreeNode left;
    LogicTreeNode right;

    public LogicTreeBinOpNode(BinOp op, LogicTreeNode left, LogicTreeNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }
    
    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return op.evaluate(left.evaluate(s),right.evaluate(s)); 
    }

    @Override
    boolean evaluate(Structure s, StructObject assignment, Variable boundVar) throws UnboundException{
        return op.evaluate(left.evaluate(s, assignment, boundVar), right.evaluate(s, assignment, boundVar));
    }

    @Override
    Signature generateElements(Signature builder) {
        return builder;
    }

}
