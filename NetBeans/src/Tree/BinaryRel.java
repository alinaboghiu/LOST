package Tree;

/*
 * @author alina
 * 
 */
public class BinaryRel {

    String name;
    Term arg1;
    Term arg2;

    public BinaryRel(String name) {
        this.name = name;
    }

    public BinaryRel(String name, Term agr1, Term arg2) {
        this.name = name;
        this.arg1 = agr1;
        this.arg2 = arg2;
    }

    @Override
    public boolean equals(Object obj) {
        BinaryRel b = (BinaryRel) obj;
        return this.name.equals(b.name)
                && this.arg1.equals(b.arg1)
                && this.arg2.equals(b.arg2);
    }
}
