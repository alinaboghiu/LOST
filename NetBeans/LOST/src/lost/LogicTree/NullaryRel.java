/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
class NullaryRel {
    
    String name;
    boolean value = true;
    
    NullaryRel(String name){
        this.name = name;
    }
    
    void changeValue(){
        this.value = !value;
    }
}
