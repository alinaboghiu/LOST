/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
public class LogicTreeUnaryNode extends LogicTreeNode{
    
    UnaryRel rel;
    
    boolean evaluate(Signature s) throws UnboundException{
        return rel.trueIn(s);
    }
}
