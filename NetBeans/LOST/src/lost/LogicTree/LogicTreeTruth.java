/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeTruth extends LogicTreeNode {

    @Override
    Signature generateElements(Signature builder) {
        return builder;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return true;
    }
    
}
