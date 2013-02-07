/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeForAllNode extends LogicTreeNode {
    
    LogicTreeNode next;
    Variable var;
    
    LogicTreeForAllNode(Variable var, LogicTreeNode next){
        this.var.forAllBound = true;
        this.name = "∀"+var.name;
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        return next.evaluate(s);
    }

    @Override
    Signature generateElements(Signature builder) {
        return builder;
    }
    
}
