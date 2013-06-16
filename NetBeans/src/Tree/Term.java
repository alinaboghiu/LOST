package Tree;

import GUI.Arrow;
import GUI.Blob;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * @author alina
 * 
 */
public class Term implements Serializable {

    public String name;
    public boolean displayed = false;

    public Term() {}

    public Term(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Term v = (Term) o;
        return v.name.equals(name);
    }
}
