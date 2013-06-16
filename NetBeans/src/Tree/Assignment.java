package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
class Assignment {
    Term assignedTerm;
    Variable boundVar;

    public Assignment(Term t, Variable var) {
        this.boundVar = var;
        this.assignedTerm = t;
    }
}
