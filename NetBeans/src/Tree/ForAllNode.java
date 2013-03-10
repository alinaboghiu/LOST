package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class ForAllNode extends LogicTreeNode {

    Variable var;

    public ForAllNode(Variable var, LogicTreeNode next)
            throws DuplicateDefinitionException {
        if (var.forAllBound || var.existsBound){
            throw new DuplicateDefinitionException();
        }
        var.forAllBound = true;
        this.var = var;
        this.next = next;
    }

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        ArrayList<Assignment> assignments = new ArrayList<>();
        return evaluate(s, assignments);
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(a1);
        return evaluate(s, assignments);
    }

    private boolean evaluate(Structure s, ArrayList<Assignment> assignments)
            throws ThisUnboundException {
        boolean outcome = true;
        
        // create assignments for this quantifier
        for (Term currTerm : s.terms) {
            Assignment a = new Assignment();
            a.assignedTerm = currTerm;
            a.boundVar = this.var;
            assignments.add(a);
        }          
        
        // iterate over assignments and pass two down in case 
        // a binary leaf node is encountered
        for (Assignment a1 : assignments){
            for (Assignment a2 : assignments){
                try {
                    if(a1.boundVar.equals(a2.boundVar)){
                        outcome &= this.next.evaluate(s, a1, a1);
                    } else {
                        outcome &= this.next.evaluate(s, a1, a2);
                    }
                } catch (ThisUnboundException e){
                    continue;                   
                }
            }
        }
        return outcome;
    }
  
}

