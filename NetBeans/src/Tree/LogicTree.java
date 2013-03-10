package Tree;

import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;


/*
 * @author alina
 * 
 */
public class LogicTree {

    LogicTreeNode head;

    LogicTree(LogicTreeNode head) {
        this.head = head;
    }

    boolean evaluate(Structure s) throws ThisUnboundException {
        return head.evaluate(s);
    }

}
