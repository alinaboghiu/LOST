/**
 *
 * @author alina
 */
package lost.LogicTree;

public class LogicTreeExistsNode extends LogicTreeNode{

    LogicTreeNode next;
    Variable var;
    
    LogicTreeExistsNode(Variable var, LogicTreeNode next){
        this.var.existsBound = true;
        this.next = next;
        this.name = "∃"+var.name;
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
