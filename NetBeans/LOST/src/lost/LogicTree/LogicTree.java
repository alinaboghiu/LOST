/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author alina
 */
public final class LogicTree {

    LogicTreeNode head;
    Signature signatureBuilder;

    public LogicTree(LogicTreeNode head){
        this.head = head;
 //       generateSignatureBuilder();
    }
    
//    public LogicTree(ParseTree c) {
//        int childCount = c.getChildCount();
// 
//        while (childCount == 1) {
//            c = c.getChild(childCount);
//            childCount = c.getChildCount();
//        }
//
//        head = makeLogicNode(c);
//
//    }

    public boolean evaluate(Structure s) throws UnboundException {
        return head.evaluate(s);
    }

    void generateSignatureBuilder() {
        signatureBuilder = head.generateElements(signatureBuilder);
    }

//    private LogicTreeNode makeLogicNode(ParseTree c) {
//        String className = c.getClass().toString();
//        return null;
//
//    }
//        if (className.equals("class lost.Parser.folParser$FormulaContext")) {
//            Variable var = null;
//            LogicTreeNode next = null;
//            for (int i=0; i<c.getChildCount(); i++){
//                ParseTree child = c.getChild(i);
//                String childClass = child.getClass().toString();
//                if (childClass.equals("class lost.Parser.folParser$ExistsContext")){
//                    var = new Variable(c.getChild(i+1).getText());
//                    var.setExistsBound(true);
//                } else if (childClass.equals("class lost.Parser.folParser$ExistsContext")){
//                    var = new Variable(c.getChild(i+1).getText());
//                    var.setForAllBound(true);
//                } else if (childClass.equals("class lost.Parser.folParser$FormulaContext")){
//                    next = makeNodeOrLeaf(child);
//                }
//                
//            }
//            if (var.existsBound){
//                return new LogicTreeExistsNode(var, next);
//            } else {
//                return new LogicTreeForAllNode(var, next);
//            }
//          
//            
//        } else if (className.equals("class lost.Parser.folParser$EquivalenceContext")) {
//            int i = 0; 
//            String childClass = c.getChild(i).getClass().toString();
//            while(!childClass.equals("class lost.Parser.folParser$FormulaContext")){
//                i++;
//            }
//            
//            
//            
//        } else if (className.equals("class lost.Parser.folParser$ImplicationContext")) {
//        } else if (className.equals("class lost.Parser.folParser$DisjunctionContext")) {
//        } else if (className.equals("class lost.Parser.folParser$ConjunctionContext")) {
//        } else if (className.equals("class lost.Parser.folParser$NegationContext")) {
//            //handle not case
//        } else if (className.equals("class lost.Parser.folParser$NonRecursiveFormulaContext")) {
//            //handle term equals term case
//        } else if (className.equals("class lost.Parser.folParser$RelationContext")) {
//            
//        }

//    public void displayTree() {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
}
