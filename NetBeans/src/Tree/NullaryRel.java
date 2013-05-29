/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.io.Serializable;

/**
 *
 * @author alina
 */
public class NullaryRel  implements Serializable {
    
    String name;
    boolean value = false;
    
    public NullaryRel(){}
    
    public NullaryRel(String name) {
        this.name = name;
    }
    
    public void makeTrue() {
        this.value = true;
    }
    
    public void makeFalse() {
        this.value = false;
    }
    
    @Override
    public boolean equals(Object obj) {
        NullaryRel n = (NullaryRel) obj;
        return this.name.equals(n.name);
    }
    
}