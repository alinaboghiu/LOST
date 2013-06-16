package Tree;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author alina
 * 
 */
public class EqualsNode extends LogicTreeNode {

    Term leftTerm;
    Term rightTerm;

    public EqualsNode(Term left, Term right) {
        this.leftTerm = left;
        this.rightTerm = right;
    }

    @Override
    boolean evaluate(Structure s){
        return leftTerm.equals(rightTerm);
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts) {
        Term newLeftTerm = leftTerm;
        Term newRightTerm = rightTerm;
        
        if (leftTerm instanceof Variable){
            for (Assignment a : assignemnts) {
                if (leftTerm.equals(a.boundVar)) {
                    newLeftTerm = a.assignedTerm;
                    break;
                }
            }
        }
        
        if (rightTerm instanceof Variable){
            for (Assignment a : assignemnts) {
                if (rightTerm.equals(a.boundVar)) {
                    newRightTerm = a.assignedTerm;
                    break;
                }
            }
        }
        
        return newLeftTerm.equals(newRightTerm);
    }

}
