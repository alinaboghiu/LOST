/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alina
 */
class UnaryRel {
   
    String name;
    Arguement arg;

    UnaryRel(String name, Arguement arg) {
        this.arg = arg;
        this.name = name;
    }

    boolean trueIn(Structure s) throws UnboundException{
        if(arg instanceof Constant){
            for(UnaryRel currRel:s.unaryRelations){
                if (currRel.sameName(this) && currRel.arg.equals(arg)){
                    return true;
                };
            }
            return false;
        }else{
            Variable var = (Variable) arg;
            if(var.existsBound){
                for(UnaryRel currRel:s.unaryRelations){
                    return currRel.sameName(this);
                }
                return false;
            }else if(var.forAllBound){
                int count = 0;
                for(UnaryRel currRel:s.unaryRelations){
                    if (currRel.sameName(this)){
                        count++;
                    }
                }
                return count == s.objects.size();
            }else{
                throw new UnboundException(var);
            }
        }
    }

    private boolean sameName(UnaryRel rel) {
        return this.name.equals(rel.name);
    }
    
}
