package Tree;

/*
 * @author alina
 * 
 */
class Variable extends Term {

    boolean forAllBound = false;
    boolean existsBound = false;

    public Variable(String name) {
//        this.name = name;
        super(name);
    }
    
}