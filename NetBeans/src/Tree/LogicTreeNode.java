package Tree;

/*
 * @author alina
 * 
 */
abstract class LogicTreeNode {

    LogicTreeNode next;

    abstract boolean evaluate(Structure s)
            throws UnboundException;

    //evaluates leaf nodes according to the assignments set by quantifiers
    abstract boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException;

}
