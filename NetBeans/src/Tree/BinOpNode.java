package Tree;

/*
 * @author alina
 * 
 */
public class BinOpNode extends LogicTreeNode {

    BinOp op;
    LogicTreeNode left;
    LogicTreeNode right;

    public BinOpNode(BinOp op, LogicTreeNode left, LogicTreeNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        return op.evaluate(left.evaluate(s), right.evaluate(s));
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        return op.evaluate(left.evaluate(s, a1, a2), right.evaluate(s, a1, a2));
    }
}
