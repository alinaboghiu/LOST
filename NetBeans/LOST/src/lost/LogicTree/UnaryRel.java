/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class UnaryRel {
   
    String name;
//    StructObject arg;

    public UnaryRel(String name) {
//        this.arg = arg;
        this.name = name;
    }
    
    boolean evaluate(Structure s, StructObject assignedArg){
        return assignedArg.unaryRel.contains(this);
    }
    
    boolean evaluate(Structure s) throws UnboundException{
        throw new UnboundException(null);
    }

//    boolean trueIn(Structure s) throws UnboundException{
//        if(arg instanceof Constant){
//            for(UnaryRel currRel:s.unaryRelations){
//                if (currRel.sameName(this) && currRel.arg.equals(arg)){
//                    return true;
//                };
//            }
//            return false;
//        }else{
//            Variable var = (Variable) arg;
//            if(var.existsBound){
//                for(UnaryRel currRel:s.unaryRelations){
//                    return currRel.sameName(this);
//                }
//                return false;
//            }else if(var.forAllBound){
//                int count = 0;
//                for(UnaryRel currRel:s.unaryRelations){
//                    if (currRel.sameName(this)){
//                        count++;
//                    }
//                }
//                return count == s.objects.size();
//            }else{
//                throw new UnboundException(var);
//            }
//        }
//    }
//
//    private boolean sameName(UnaryRel rel) {
//        return this.name.equals(rel.name);
//    }
    
}
