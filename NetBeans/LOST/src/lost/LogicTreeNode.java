/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
abstract class LogicTreeNode {
    
    String name;
    SignatureBuilder builder;
    
    abstract SignatureBuilder generateElements(SignatureBuilder builder);      
    abstract boolean evaluate(Signature s) throws UnboundException;

}
