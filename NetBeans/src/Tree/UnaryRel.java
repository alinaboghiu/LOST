
package Tree;

import java.awt.Color;
import java.io.Serializable;
import java.util.Random;

/*
 * @author alina
 * 
 */
public class UnaryRel implements Serializable{

    public String name;
    public Term arg;
    public Color colour;

    public UnaryRel(){
    }

    public UnaryRel(String name){
        this.name = name;
    }
    
    public UnaryRel(String name, Term arg) {
        this.name = name;
        this.arg = arg;
    }
    
    public UnaryRel(String name, Color colour) {
        this.name = name;
        this.colour = colour;
    }
    
    public UnaryRel(String name, Term arg, Color colour){
        this.name = name;
        this.arg = arg;
        this.colour = colour;
    }
    
    public void setArg(Term arg){
        this.arg = arg;
    }
    
    @Override
    public boolean equals(Object obj){
        UnaryRel u = (UnaryRel) obj;
        return this.name.equals(u.name) && this.arg.equals(u.arg);
    }
    
}

