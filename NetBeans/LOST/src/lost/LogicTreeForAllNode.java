/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
public class LogicTreeForAllNode extends LogicTreeNode {
    
    LogicTreeNode next;
    Variable var;
    
    LogicTreeForAllNode(Variable var){
        var.forAllBound = true;
        name = "∀"+var.name;
    }

    @Override
    boolean evaluate(Signature s) throws UnboundException {
        return next.evaluate(s);
    }

    @Override
    SignatureBuilder generateElements(SignatureBuilder builder) {
        return builder;
    }
    
}
