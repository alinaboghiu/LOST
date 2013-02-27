/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeForAllNode extends LogicTreeNode {
    
    static LogicTreeNode next ;
    static Variable var;
    
    public LogicTreeForAllNode(Variable var, LogicTreeNode next){
//        var.forAllBound = true;
//        this.name = "∀"+var.name;
        this.next = next;
        this.var = var;
    }

    @Override
    boolean evaluate(Structure s, StructObject assignment) {
        return this.evaluate(s);
    }
    
    @Override   
    boolean evaluate(Structure s){
        for(StructObject currObj:s.objects){
            boolean outcome = next.evaluate(s, currObj);
            if(!outcome){
                return false;
            }
        }
        return true;
    }

    @Override
    Signature generateElements(Signature builder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
