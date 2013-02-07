/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

import java.util.ArrayList;

/**
 *
 * @author alina
 */
class Variable extends Arguement{
    
    boolean existsBound = false;
    boolean forAllBound = false;
    
    Variable(String name){
        this.name = name;
    }
    
    public void setExistsBound(boolean b){
        existsBound = b;
    }
    
    public void setForAllBound(boolean b){
        forAllBound = b;
    }
}
