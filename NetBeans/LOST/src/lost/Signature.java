/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

import java.util.ArrayList;

/**
 *
 * @author alina
 */
public class Signature {

    protected String name;
    protected SignatureBuilder builder;
    protected ArrayList<NullaryRel> nullaryRelations;
    protected ArrayList<UnaryRel> unaryRelations;
    protected ArrayList<BinaryRel> binaryRelations;
    protected ArrayList<Arguement> objects;
    
    public void addNularyRel(NullaryRel newNularyRel) {
        nullaryRelations.add(newNularyRel);
    }

    public void addUnaryRel(UnaryRel newUnaryRel) {
        unaryRelations.add(newUnaryRel);
    }

    public void addBinaryRel(BinaryRel newBinaryRel) {
        binaryRelations.add(newBinaryRel);
    }

    public void removeNularyRel(NullaryRel oldNularyRel) {
        nullaryRelations.remove(oldNularyRel);
    }

    public void removeUnaryRel(UnaryRel oldUnaryRel) {
        unaryRelations.remove(oldUnaryRel);
    }

    public void removeBinaryRel(BinaryRel oldBinaryRel) {
        binaryRelations.remove(oldBinaryRel);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
