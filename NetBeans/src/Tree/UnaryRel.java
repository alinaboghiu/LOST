package Tree;

import java.awt.Color;
import java.io.Serializable;

/*
 * @author alina
 * 
 */
public class UnaryRel implements Serializable {

    public String name;
    public Term arg;
    public Color colour;

    public UnaryRel() {}

    public UnaryRel(String name) {
        this.name = name;
    }

    public UnaryRel(String name, Term arg) {
        this.name = name;
        this.arg = arg;
        this.colour = new Color(name.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        UnaryRel u = (UnaryRel) obj;
        return this.name.equals(u.name) && this.arg.equals(u.arg);
    }
}