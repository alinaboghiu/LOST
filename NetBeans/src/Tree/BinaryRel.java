package Tree;

import java.awt.Color;
import java.io.Serializable;

/*
 * @author alina
 * 
 */
public class BinaryRel implements Serializable {

    public String name;
    public Term arg1;
    public Term arg2;
    public Color colour;

    public BinaryRel() {}

    public BinaryRel(String name, Term agr1, Term arg2) {
        this.name = name;
        this.arg1 = agr1;
        this.arg2 = arg2;
        this.colour = new Color(name.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        BinaryRel b = (BinaryRel) obj;
        return this.name.equals(b.name)
            && this.arg1.equals(b.arg1)
            && this.arg2.equals(b.arg2);
    }
}
