package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class BinOpNode extends LogicTreeNode {

    BinOp op;
    LogicTreeNode left;
    LogicTreeNode right;

    BinOpNode(BinOp op, LogicTreeNode left, LogicTreeNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    @Override
    boolean evaluate(Structure s){
        return op.evaluate(left.evaluate(s), right.evaluate(s));
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts){
        return op.evaluate(left.evaluate(s, assignemnts),
                           right.evaluate(s, assignemnts));
    }
}
