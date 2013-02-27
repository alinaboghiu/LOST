/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeBinaryRelNode extends LogicTreeNode{
    
    BinaryRel rel;

    public LogicTreeBinaryRelNode(BinaryRel rel) {
        this.rel = rel;
    }
    
    
    
    boolean evaluate(Structure s) throws UnboundException{
        return rel.trueIn(s);
    }

    @Override
    Signature generateElements(Signature builder) {
        builder.binaryRelations.add(rel);
        if (rel.arg1 instanceof Constant) { 
            Constant c = (Constant) rel.arg1;
            builder.constants.add(c); 
        }
        if (rel.arg2 instanceof Constant) { 
            Constant c = (Constant) rel.arg2;
            builder.constants.add(c); 
        }
        return builder;
    }
}
