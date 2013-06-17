package Tree;

import java.util.ArrayList;

/*
 * @author alina
 * 
 */
abstract class LogicTreeNode{

    LogicTreeNode next;

    abstract boolean evaluate(Structure s);
    
    abstract boolean evaluate(Structure s, 
                               ArrayList<Assignment> assignemnts);
    
}
