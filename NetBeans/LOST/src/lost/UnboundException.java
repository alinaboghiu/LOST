/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
class UnboundException extends Exception{

    public UnboundException() {
    }

    UnboundException(Variable var) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
