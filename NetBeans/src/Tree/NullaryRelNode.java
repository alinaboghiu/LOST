package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class NullaryRelNode extends LogicTreeNode{    

    NullaryRel rel;
        
    @Override
    boolean evaluate(Structure s) {
        return rel.value;
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2){
        return rel.value;
    }
    
}
