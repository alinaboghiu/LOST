/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeUnaryRelNode extends LogicTreeNode{
    
    UnaryRel rel;
    
    boolean evaluate(Structure s) throws UnboundException{
        return rel.trueIn(s);
    }
    
        @Override
    Signature generateElements(Signature builder) {
        builder.unaryRelations.add(rel);
        if (rel.arg instanceof Constant) { 
            Constant c = (Constant) rel.arg;
            builder.constants.add(c); 
        }
        return builder;
    }
}
