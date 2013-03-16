/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

/*
 * @author alina
 *
 */
public class UndefinedRelationException extends Exception {

    private final String notification;
    
    public UndefinedRelationException(String relName) {
        notification = relName
                + " is not defined as a relation in the structure. "
                + "Use the signature to it add and try again";
    }

    @Override
    public String getMessage(){
        return this.notification;
    }
    
}
