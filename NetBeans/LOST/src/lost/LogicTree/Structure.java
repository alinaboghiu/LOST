/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

import java.util.ArrayList;

/**
 *
 * @author alina
 */
public class Structure {

    public String name;
    public Signature builder;
    public ArrayList<NullaryRel> nullaryRelations = new ArrayList<NullaryRel>();
    public ArrayList<UnaryRel> unaryRelations = new ArrayList<UnaryRel>();
    public ArrayList<BinaryRel> binaryRelations = new ArrayList<BinaryRel>();
    public ArrayList<StructObject> objects = new ArrayList<StructObject>();

    public Structure(String name) {
        this.name = name;
        
    }
    
}
