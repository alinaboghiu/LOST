package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class UnaryRelNode extends LogicTreeNode {

    UnaryRel rel;
    Term arg;

    public UnaryRelNode(UnaryRel rel, Term arg) throws UnboundException {
        this.rel = rel;
        this.arg = arg;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        if (this.arg instanceof Const) {
            UnaryRel thisAssignment = new UnaryRel(rel.name, arg);
            return s.unaryRels.contains(thisAssignment);
            // check if argument is bound
        } else if (arg instanceof Variable) {
            Variable var = (Variable) arg;
            if (!(var.existsBound || var.forAllBound)) {
                throw new UnboundException();
            }
        }
        // not the right assignment, ignore and continue
        throw new UnboundException();
    }

    private boolean evaluate(Structure s, Assignment a)
            throws UnboundException {
        if (arg instanceof Variable) {
            Variable var = (Variable) arg;
            if (!(var.existsBound || var.forAllBound)) {
                throw new UnboundException();
            }
        }
        if (arg == a.boundVar) {
            UnaryRel thisAssignment = new UnaryRel(rel.name, a.assignedTerm);
            return s.unaryRels.contains(thisAssignment);
        }
        return evaluate(s);
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException {
        return evaluate(s, a2);
    }
    
}
