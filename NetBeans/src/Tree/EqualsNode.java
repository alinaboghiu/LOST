package Tree;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author alina
 * 
 */
public class EqualsNode extends LogicTreeNode{

    Term leftTerm;
    Term rightTerm;

    public EqualsNode(Term left, Term right) {
        this.leftTerm = left;
        this.rightTerm = right;
    }

@Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        if (this.leftTerm instanceof Const && this.rightTerm instanceof Const) {
            return leftTerm.equals(rightTerm);
        // check if unbound
        } else if (leftTerm instanceof Variable && rightTerm instanceof Variable) {
            Variable var1 = (Variable) leftTerm;
            Variable var2 = (Variable) rightTerm;
            if (!(var1.existsBound || var1.forAllBound)) {
                try {
                    throw new UnboundException();
                } catch (UnboundException ex) {
                    Logger.getLogger(EqualsNode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (!(var2.existsBound || var2.forAllBound)) {
                try {
                    throw new UnboundException();
                } catch (UnboundException ex) {
                    Logger.getLogger(EqualsNode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //this was not the right assignment, ignore and proceed
        throw new ThisUnboundException();

    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {

        //if both terms are variables
        if (leftTerm.equals(a1.boundVar) && rightTerm.equals(a2.boundVar)) {
            return a1.assignedTerm.equals(a2.assignedTerm);
            
        //if left is a variable and right is a constant
        } else if (leftTerm.equals(a1.boundVar) && rightTerm instanceof Const) {
            return a1.assignedTerm.equals(rightTerm);
            
        //if left is a constant and right is a variable
        } else if (leftTerm instanceof Const && rightTerm.equals(a2.boundVar)) {
            return leftTerm.equals(a2.assignedTerm);
            
        //if both terms are constants
        } else {
            return evaluate(s);
        }
    }
    
}
