package Tree;

/*
 * @author alina
 * 
 */
public class Const extends Term {

    Const(String name) {
        super(name);
    }
    
    @Override
    public boolean equals(Object o){
        Const c = (Const) o; 
        return c.name.equals(name);
    }
}
