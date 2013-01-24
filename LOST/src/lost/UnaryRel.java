/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alina
 */
class UnaryRel {
   
    String name;
    Arguement arguement;

    UnaryRel(String name, Arguement arg) {
        this.arguement = arg;
        this.name = name;
    }

    boolean trueIn(Signature s) throws UnboundException{
        if(arguement instanceof Constant){
            for(UnaryRel currRel:s.unaryRelations){
                if (currRel.sameName(this) && currRel.arguement.equals(arguement)){
                    return true;
                };
            }
            return false;
        }else{
            Variable var = (Variable) arguement;
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
