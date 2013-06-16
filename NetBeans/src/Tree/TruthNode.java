package Tree;

import java.util.ArrayList;

/*
 * @author alina
 *
 */
public class TruthNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s){
        return true;
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts){
        return true;
    }

}
