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

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return !next.evaluate(s);
    }

    @Override
    Signature generateElements(Signature builder) {
        return builder;
    }
    
    

    
}
