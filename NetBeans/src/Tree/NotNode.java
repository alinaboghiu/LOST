package Tree;

/*
 * @author alina
 * 
 */
public class NotNode extends LogicTreeNode {

    public NotNode(LogicTreeNode next) {
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return !next.evaluate(s);
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2) throws UnboundException {
        return !next.evaluate(s, a1, a2);
    }

    
    

    
}
