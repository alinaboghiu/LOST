package Tree;

import java.io.Serializable;

/*
 * @author alina
 * 
 */
public class Variable extends Term implements Serializable{

    boolean forAllBound = false;
    boolean existsBound = false;

    public Variable() {
    }

    Variable(String name) {
        super(name);
    }
}