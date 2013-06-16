package Tree;

import java.io.Serializable;

/**
 *
 * @author alina
 */
public class NullaryRel implements Serializable {

    public String name;
    public boolean value = false;

    public NullaryRel() {}

    public NullaryRel(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        NullaryRel n = (NullaryRel) obj;
        return this.name.equals(n.name);
    }
}