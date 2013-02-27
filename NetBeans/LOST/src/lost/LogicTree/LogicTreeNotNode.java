/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeNotNode extends LogicTreeNode {
    
    LogicTreeNode next;

    public LogicTreeNotNode(LogicTreeNode next) {
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return !next.evaluate(s);
    }

    @Override
    boolean evaluate(Structure s, StructObject assignment) {
        return !next.evaluate(s, assignment);
    }

    @Override
    Signature generateElements(Signature builder) {
        return builder;
    }

    
    

    
}
