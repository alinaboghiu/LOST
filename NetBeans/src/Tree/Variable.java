package Tree;

/*
 * @author alina
 * 
 */
class Variable extends Term {

    boolean forAllBound = false;
    boolean existsBound = false;

    public Variable(String name) {
        super(name);
    }
    
    @Override
    public boolean equals(Object o){
        Variable v = (Variable) o; 
        return v.name.equals(name);
    }
}