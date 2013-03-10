package Tree;

/*
 * @author alina
 *
 */
public class TruthNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        return true;
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        return true;
    }

}
