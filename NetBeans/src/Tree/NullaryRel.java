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
    boolean value = true;
    
    public NullaryRel(String name, boolean value){
        this.name = name;
        this.value = value;
    }
    
    public void changeValue(){
        this.value = !value;
    }
}
