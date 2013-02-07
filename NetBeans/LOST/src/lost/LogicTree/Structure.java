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

    String name;
    Signature builder;
    ArrayList<NullaryRel> nullaryRelations;
    ArrayList<UnaryRel> unaryRelations;
    ArrayList<BinaryRel> binaryRelations;
    ArrayList<Arguement> objects;
    
    void addObject(Arguement a){
        objects.add(a);
    }
        
    void addNularyRel(NullaryRel newNularyRel) {
        nullaryRelations.add(newNularyRel);
    }

    void addUnaryRel(UnaryRel newUnaryRel) {
        unaryRelations.add(newUnaryRel);
    }

    void addBinaryRel(BinaryRel newBinaryRel) {
        binaryRelations.add(newBinaryRel);
    }

    void removeObject(Arguement a){
        objects.remove(a);
    }
    
    void removeNularyRel(NullaryRel oldNularyRel) {
        nullaryRelations.remove(oldNularyRel);
    }

    void removeUnaryRel(UnaryRel oldUnaryRel) {
        unaryRelations.remove(oldUnaryRel);
    }

    void removeBinaryRel(BinaryRel oldBinaryRel) {
        binaryRelations.remove(oldBinaryRel);
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }
}
