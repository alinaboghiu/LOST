package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class NullaryRelNode extends LogicTreeNode {

    NullaryRel rel;

    NullaryRelNode(NullaryRel rel) {
        this.rel = rel;
    }

    @Override
    boolean evaluate(Structure s) {
        return rel.value;
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts){
        return rel.value;
    }

    
}
