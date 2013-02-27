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
    
    UnaryRel     rel;
    StructObject arg;

    public LogicTreeUnaryRelNode(UnaryRel rel, StructObject arg){
        this.rel = rel;
        this.arg = arg;
        this.arg.unaryRel.add(rel);
    }
    
    @Override
    boolean evaluate(Structure s) throws UnboundException{
        Variable var = (Variable) arg;
        throw new UnboundException(var);
    }

    @Override
    boolean evaluate(Structure s, StructObject assignment) {
        return rel.evaluate(s, assignment);
        
    }
    
//    public LogicTreeUnaryRelNode(UnaryRel rel) {
//        this.rel = rel;
//    } 
    
//    boolean evaluate(Structure s) throws UnboundException{
//        return rel.trueIn(s);
//    }
    
//        @Override
//    Signature generateElements(Signature builder) {
//        builder.unaryRelations.add(rel);
//        if (rel.arg instanceof Constant) { 
//            Constant c = (Constant) rel.arg;
//            builder.constants.add(c); 
//        }
//        return builder;
//    }

    @Override
    Signature generateElements(Signature builder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
