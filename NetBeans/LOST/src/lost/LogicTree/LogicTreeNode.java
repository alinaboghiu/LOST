/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
abstract class LogicTreeNode {
    
    String name;
    Signature builder;
    
    abstract Signature generateElements(Signature builder);      
    abstract boolean evaluate(Structure s) throws UnboundException;

}
