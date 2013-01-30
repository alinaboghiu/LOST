/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeNullaryNode extends LogicTreeNode{    

    NullaryRel rel;
        
    @Override
    boolean evaluate(Signature s) {
        return rel.value;
    }
    
    @Override
    SignatureBuilder generateElements(SignatureBuilder builder) {
        builder.nullaryRelations.add(rel);
        return builder;
    }
    
}
