package Tree;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author alina
 * 
 */
public class UnaryRelNode extends LogicTreeNode {

    UnaryRel rel;
    Term arg;

    public UnaryRelNode(UnaryRel rel, Term arg) {
        this.rel = rel;
        this.arg = arg;
    }

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        if (this.arg instanceof Constant) {
            UnaryRel thisAssignment = new UnaryRel(rel.name, arg);
            return s.unaryRels.contains(thisAssignment);
            // check if argument is bound
        } else if (arg instanceof Variable) {
            Variable var = (Variable) arg;
            if (!(var.existsBound || var.forAllBound)) {
                try {
                    throw new UnboundException(var.name);
                } catch (UnboundException ex) {
                    Logger.getLogger(UnaryRelNode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // not the right assignment, ignore and continue
        throw new ThisUnboundException();
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        if (arg.equals(a2.boundVar)) {
            UnaryRel thisAssignment = new UnaryRel(rel.name, a2.assignedTerm);
            return s.unaryRels.contains(thisAssignment);
        }
        return evaluate(s);
    }
}
