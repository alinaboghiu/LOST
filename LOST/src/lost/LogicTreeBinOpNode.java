/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
public class LogicTreeBinOpNode extends LogicTreeNode{
    
    BinOp op;
    LogicTreeNode left;
    LogicTreeNode right;

    @Override
    boolean evaluate(Signature s) throws UnboundException {
        return op.evaluate(left.evaluate(s),right.evaluate(s)); 
    }
    
}
