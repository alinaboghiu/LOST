package Tree;

/*
 * @author alina
 * 
 */
class Term {

    String name;

    public Term(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        Term v = (Term) o; 
        return v.name.equals(name);
    }
    
}
