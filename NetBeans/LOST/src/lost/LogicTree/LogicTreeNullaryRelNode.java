/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeNullaryRelNode extends LogicTreeNode{    

    NullaryRel rel;
        
    @Override
    boolean evaluate(Structure s) {
        return rel.value;
    }
    
    @Override
    Signature generateElements(Signature builder) {
        builder.nullaryRelations.add(rel);
        return builder;
    }
    
}
