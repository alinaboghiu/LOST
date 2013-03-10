/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author alina
 */
public class NullaryRel {
    
    String name;
    boolean value = false;
    
    public NullaryRel(String name) {
        this.name = name;
    }
    
    public void makeTrue() {
        this.value = true;
    }
    
    public void makeFalse() {
        this.value = false;
    }
}
