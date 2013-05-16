package Tree;

import GUI.Blob;

/*
 * @author alina
 * 
 */
public class Term {

    public String name;
    public Blob blob;
    
    public Term(String name){
        this.name = name;
    }
    
    public Term(String name, int limit){
        this.name = name;
        blob = new Blob(limit);
    }

    @Override
    public boolean equals(Object o){
        Term v = (Term) o; 
        return v.name.equals(name);
    }
    
}
