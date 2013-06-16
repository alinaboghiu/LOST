package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
class Assignment {

    ArrayList<Term> assignedTerms = new ArrayList<>();
    Variable boundVar;

    public Assignment(Structure s, Variable var) {
        this.boundVar = var;
        for (Term t : s.terms){
            assignedTerms.add(t);
        }
    }
    
    
}
