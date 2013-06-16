package Tree;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author alina
 * 
 */
public class BinaryRelNode extends LogicTreeNode {

    BinaryRel rel;
    Term arg1;
    Term arg2;

    public BinaryRelNode(BinaryRel rel, Term arg1, Term arg2) {
        this.rel = rel;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        if (this.arg1 instanceof Constant && this.arg2 instanceof Constant) {
            BinaryRel thisAssignment = new BinaryRel(rel.name, arg1, arg2);
            return s.binaryRels.contains(thisAssignment);
            // check if unbound
        } else if (arg1 instanceof Variable && arg2 instanceof Variable) {
            Variable var1 = (Variable) arg1;
            Variable var2 = (Variable) arg2;
            if (!(var1.existsBound || var1.forAllBound)) {
                try {
                    throw new UnboundException(var1.name);
                } catch (UnboundException ex) {
                    Logger.getLogger(BinaryRelNode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (!(var2.existsBound || var2.forAllBound)) {
                try {
                    throw new UnboundException(var2.name);
                } catch (UnboundException ex) {
                    Logger.getLogger(BinaryRelNode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //this was not the right assignment, ignore and proceed
        throw new ThisUnboundException();
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        //if both arguements are variables
        if (arg1.equals(a1.boundVar) && arg2.equals(a2.boundVar)) {
            BinaryRel newAssignment = new BinaryRel(rel.name, a1.assignedTerm, a2.assignedTerm);
            return s.binaryRels.contains(newAssignment);

            //if arg1 is a variable and arg2 is a constant
        } else if (arg1.equals(a1.boundVar) && arg2 instanceof Constant) {
            BinaryRel newAssignment = new BinaryRel(rel.name, a1.assignedTerm, arg2);
            return s.binaryRels.contains(newAssignment);

            //if arg1 is a constant and arg2 is a variable
        } else if (arg1 instanceof Constant && arg2.equals(a2.boundVar)) {
            BinaryRel newAssignment = new BinaryRel(rel.name, arg1, a2.assignedTerm);
            return s.binaryRels.contains(newAssignment);

            //if both arguements are constants
        } else {
            return evaluate(s);
        }
    }
}
