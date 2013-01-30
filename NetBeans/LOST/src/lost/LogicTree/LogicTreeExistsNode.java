/**
 *
 * @author alina
 */
package lost.LogicTree;

public class LogicTreeExistsNode extends LogicTreeNode{

    LogicTreeNode next;
    Variable var;
    
    LogicTreeExistsNode(Variable var){
        var.existsBound = true;
        name = "∃"+var.name;
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
