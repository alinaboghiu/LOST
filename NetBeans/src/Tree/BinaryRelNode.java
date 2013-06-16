package Tree;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author alina
 * 
 */
public class BinaryRelNode extends LogicTreeNode {

    BinaryRel rel;

    public BinaryRelNode(BinaryRel rel) {
        this.rel = rel;
    }

    @Override
    boolean evaluate(Structure s) {
        return s.binaryRels.contains(rel);
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts) {
        Term newArg1 = rel.arg1;
        Term newArg2 = rel.arg2;
        
        if (rel.arg1 instanceof Variable){
            for (Assignment a : assignemnts) {
                if (rel.arg1.equals(a.boundVar)) {
                    newArg1 = a.assignedTerm;
                    break;
                }
            }
        }
        
        if (rel.arg2 instanceof Variable){
            for (Assignment a : assignemnts) {
                if (rel.arg2.equals(a.boundVar)) {
                    newArg2 = a.assignedTerm;
                    break;
                }
            }
        }
        BinaryRel r = new BinaryRel(rel.name, newArg1, newArg2);
        return s.binaryRels.contains(r);
    }

}
