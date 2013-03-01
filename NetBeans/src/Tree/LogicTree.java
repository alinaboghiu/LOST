package Tree;

import org.antlr.v4.runtime.tree.ParseTree;

/*
 * @author alina
 * 
 */
class LogicTree {

    LogicTreeNode head;

    LogicTree(ParseTree t) {
        System.out.println("blah" + t.getText());
    }
    
    LogicTree(LogicTreeNode head) {
        this.head = head;
    }

    boolean evaluate(Structure s) throws UnboundException {
        return head.evaluate(s);
    }
}
