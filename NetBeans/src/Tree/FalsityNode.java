package Tree;

/*
 * @author alina
 *
 */
public class FalsityNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        return false;
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        return false;
    }
}
