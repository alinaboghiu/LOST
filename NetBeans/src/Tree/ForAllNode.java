package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class ForAllNode extends LogicTreeNode {

    Variable var;

    ForAllNode(Variable var, LogicTreeNode next)
            throws DuplicateDefinitionException {
        if (var.forAllBound || var.existsBound) {
            throw new DuplicateDefinitionException(var.name);
        }
        var.forAllBound = true;
        this.var = var;
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s){
        ArrayList<Assignment> assignments = new ArrayList<>();
        return evaluate(s, assignments);
    }

    @Override
    boolean evaluate(Structure s,
                      ArrayList<Assignment> assignments){
        boolean outcome = true;
        for (Term t : s.terms) {
            Assignment a = new Assignment(t, var);
            assignments.add(a);
            outcome &= next.evaluate(s, assignments);
            assignments.remove(a);
        }
        return outcome;
    }
}
