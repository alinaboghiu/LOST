package Tree;

/*
 * @author alina
 *
 */
public class FalsityNode extends LogicTreeNode{

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return false;
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException {
        return false;
    }
}
