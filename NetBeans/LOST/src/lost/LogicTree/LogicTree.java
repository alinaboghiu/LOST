/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
class LogicTree {
    
    LogicTreeNode head;
    SignatureBuilder builder;
    
    void generateSignatureBuilder(){
        builder = head.generateElements(builder);
    }
    
    boolean evaluate (Signature s) throws UnboundException{
        return head.evaluate(s);
    }

}
