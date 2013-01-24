/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

import java.util.ArrayList;

/**
 *
 * @author alina
 */
abstract class LogicTreeNode {
    
    String name;
    
    abstract boolean evaluate(Signature s) throws UnboundException;
    
}
