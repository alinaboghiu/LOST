/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class UnboundException extends Exception{

    UnboundException(Variable var) {
        System.out.println(var.name + " is not bound!");
        System.exit(1);
    }
    
}
