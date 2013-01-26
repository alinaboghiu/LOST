/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
public class LogicTreeUnaryNode extends LogicTreeNode{
    
    UnaryRel rel;
    
    boolean evaluate(Signature s) throws UnboundException{
        return rel.trueIn(s);
    }
    
        @Override
    SignatureBuilder generateElements(SignatureBuilder builder) {
        builder.unaryRelations.add(rel);
        if (rel.arg instanceof Constant) { 
            Constant c = (Constant) rel.arg;
            builder.constants.add(c); 
        }
        return builder;
    }
}
