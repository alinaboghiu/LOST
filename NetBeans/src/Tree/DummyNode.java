package Tree;

import java.util.ArrayList;

/*
 * @author alina
 *
 */
public class DummyNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s){
        return next.evaluate(s);
    }

    @Override
    boolean evaluate(Structure s, ArrayList<Assignment> assignemnts){
        return next.evaluate(s, assignemnts);
    }
}
