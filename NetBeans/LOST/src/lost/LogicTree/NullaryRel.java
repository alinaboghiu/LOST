/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class NullaryRel {
    
    public String name;
    boolean value = true;
    
    public NullaryRel(String name){
        this.name = name;
    }
    
    public void changeValue(){
        this.value = !value;
    }
}
