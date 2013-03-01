
package Tree;

/*
 * @author alina
 * 
 */
public class UnaryRel {

    public String name;
    public Term arg;

    public UnaryRel(String name) {
        this.name = name;
    }
    
    public UnaryRel(String name, Term arg){
        this.name = name;
        this.arg = arg;
    }
    
    @Override
    public boolean equals(Object obj){
        UnaryRel u = (UnaryRel) obj;
        return this.name.equals(u.name) && this.arg.equals(u.arg);
    }
    
}
