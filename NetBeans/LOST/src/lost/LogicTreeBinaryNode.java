/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
public class LogicTreeBinaryNode extends LogicTreeNode{
    
    BinaryRel rel;
    
    boolean evaluate(Signature s) throws UnboundException{
        return rel.trueIn(s);
    }

    @Override
    SignatureBuilder generateElements(SignatureBuilder builder) {
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
