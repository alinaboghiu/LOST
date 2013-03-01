package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class ExistsNode extends LogicTreeNode {

    Variable var;

    public ExistsNode(Variable var, LogicTreeNode next)
            throws DuplicateQuantifierException {
        if (var.existsBound || var.forAllBound) {
            throw new DuplicateQuantifierException();
        }
        var.existsBound = true;
        this.var = var;
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        ArrayList<Assignment> assignments = new ArrayList<>();
        return evaluate(s, assignments);
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException {
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(a1);
        return evaluate(s, assignments);
    }
    
    private boolean evaluate(Structure s, ArrayList<Assignment> assignments)
            throws UnboundException {
        // create assignments for this quantifier
        for (Term currTerm : s.terms) {
            Assignment a = new Assignment();
            a.assignedTerm = currTerm;
            a.boundVar = this.var;
            assignments.add(a);
        }
        
        boolean outcome = false;
        // iterate over assignments and pass two down in case 
        // a binary leaf node is encountered
        // TODO: check subtree and pass the minimum number of assignments
        for (Assignment a1 : assignments) {
            for (Assignment a2 : assignments) {
                try {
                    outcome |= this.next.evaluate(s, a1, a2);
                } catch (UnboundException e){
                    continue;                   
                }
            }
        }
        return outcome;
    }
    
}
