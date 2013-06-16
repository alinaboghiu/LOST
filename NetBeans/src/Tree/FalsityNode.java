package Tree;

import java.util.ArrayList;

/*
 * @author alina
 *
 */
public class FalsityNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s){
        return false;
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts){
        return false;
    }

}
