package Tree;

import GUI.Blob;
import java.io.Serializable;

/*
 * @author alina
 * 
 */
public class Term implements Serializable {

    public String name;
    public Blob blob;
    
    public Term(){}
    
    public Term(String name){
        this.name = name;
    }
    
    public Term(String name, int limit){
        this.name = name;
        blob = new Blob();
    }

    @Override
    public boolean equals(Object o){
        Term v = (Term) o; 
        return v.name.equals(name);
    }
    
}
