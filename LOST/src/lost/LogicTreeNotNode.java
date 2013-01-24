/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
public class LogicTreeNotNode extends LogicTreeNode {
    
    LogicTreeNode next;

    @Override
    boolean evaluate(Signature s) throws UnboundException {
        return !next.evaluate(s);
    }
    
    

    
}
