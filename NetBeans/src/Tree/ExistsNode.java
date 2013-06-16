package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class ExistsNode extends LogicTreeNode {

    Variable var;

    ExistsNode(Variable var, LogicTreeNode next)
            throws DuplicateDefinitionException {
        if (var.existsBound || var.forAllBound) {
            throw new DuplicateDefinitionException(var.name);
        }
        var.existsBound = true;
        this.var = var;
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s){
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Term> activeTerms = new ArrayList<>();
        return evaluate(s, assignments);
    }

        
    @Override
    boolean evaluate(Structure s,
                      ArrayList<Assignment> assignments){
        boolean outcome = false;
        for (Term t : s.terms) {
            Assignment a = new Assignment(t, var);
            assignments.add(a);
            outcome |= next.evaluate(s, assignments);
            assignments.remove(a);
        }
        return outcome;
    }
}
