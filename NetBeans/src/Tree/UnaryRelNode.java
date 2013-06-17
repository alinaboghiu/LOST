package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class UnaryRelNode extends LogicTreeNode {

    UnaryRel rel;

    public UnaryRelNode(UnaryRel rel) {
        this.rel = rel;
    }

    @Override
    boolean evaluate(Structure s) {
        return s.unaryRels.contains(rel);
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts) {
        if (rel.arg instanceof Variable) {
            for (Assignment a : assignemnts) {
                if (rel.arg.equals(a.boundVar)) {
                    UnaryRel r = new UnaryRel(rel.name, a.assignedTerm);
                    return s.unaryRels.contains(r);
                }
            }
        }
        return this.evaluate(s);
    }
}
