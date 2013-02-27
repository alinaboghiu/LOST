/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

import java.util.ArrayList;

/**
 *
 * @author alina
 */
public class BinaryRel {

    String name;
    StructObject arg1;
    StructObject arg2;

    public BinaryRel(String name, StructObject arg1, StructObject arg2) {
        this.name = name;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    
    boolean trueIn(Structure s) throws UnboundException {
        if (arg1 instanceof Constant && arg2 instanceof Constant) {
            for (BinaryRel currRel : s.binaryRelations) {
                if (currRel.sameName(this)
                    && currRel.arg1.equals(this.arg1)
                    && currRel.arg2.equals(this.arg2)) {
                        return true;
                }
            }
            return false;
            
        } else if (arg1 instanceof Constant && arg2 instanceof Variable) {
            Variable var = (Variable) arg2;
            
            if (var.existsBound){
                for (BinaryRel currRel : s.binaryRelations) {
                    if (currRel.sameName(this)
                        && currRel.arg1.equals(this.arg1)
                        && currRel.arg2.equals(var)) {
                            return true;
                    }
                }
                return false;
            } else if (var.forAllBound){
                int count = 0;
                System.out.print(count);
                System.out.println(s.binaryRelations.size());
                for(BinaryRel currRel:s.binaryRelations) {
                    if (currRel.sameName(this)
                        && currRel.arg1.equals(arg1)) {
                            count++;
                    }
                }
                return count == s.objects.size();
            } else {
                throw new UnboundException(var);
            }
            
        } else if (arg1 instanceof Variable && arg2 instanceof Constant) {
            Variable var = (Variable) arg1;
            if (var.existsBound){
                    for (BinaryRel currRel : s.binaryRelations) {
                    if (currRel.sameName(this)
                        && currRel.arg2.equals(this.arg2)
                        && currRel.arg1.equals(var)) {
                            return true;
                    }
                }
                return false;
            } else if (var.forAllBound){
                int count = 0;
                for(BinaryRel currRel:s.binaryRelations) {
                    if (currRel.sameName(this)
                        && currRel.arg2.equals(this.arg2)) {
                            count++;
                    }
                }
                return count == s.objects.size();
            } else {
                throw new UnboundException(var);
            }
        } else {
            Variable var1 = (Variable) arg1;
            Variable var2 = (Variable) arg2;
            
            if (var1.existsBound && var2.existsBound){
                for (BinaryRel currRel : s.binaryRelations) {
                    if (currRel.sameName(this)) {
                            return true;
                    }
                }
                return false;
                
            } else if (var1.forAllBound && var2.existsBound) {
                ArrayList<StructObject> tempObjects = s.objects;
                for(BinaryRel currRel : s.binaryRelations) {
                    if (currRel.sameName(this)) {
                        tempObjects.remove(currRel.arg1);
                    }
                }
                return tempObjects.isEmpty();
                
            } else if (var1.existsBound && var2.forAllBound){
                ArrayList<StructObject> tempObjects = s.objects;
                for(BinaryRel currRel : s.binaryRelations) {
                    if (currRel.sameName(this)) {
                        tempObjects.remove(currRel.arg2);
                    }
                }
                return tempObjects.isEmpty();
            } else if (var1.forAllBound && var2.forAllBound){
                ArrayList<StructObject> tempObjects1 = s.objects;
                ArrayList<StructObject> tempObjects2 = s.objects;
                for(BinaryRel currRel : s.binaryRelations) {
                    if (currRel.sameName(this)) {
                        tempObjects1.remove(currRel.arg1);
                        tempObjects2.remove(currRel.arg2);
                    }
                }
                return tempObjects1.isEmpty() && tempObjects2.isEmpty();
                
            } else if (!var1.forAllBound && !var1.existsBound){
                throw new UnboundException(var1);
            } else {
                throw new UnboundException(var2);
            }
            
        }

    }

    private boolean sameName(BinaryRel rel) {
        return rel.name.equals(this.name);
    }
}