package Tree;

/*
 * @author alina
 *
 */
public class TruthNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return true;
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException {
        return true;
    }

}
