/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.ArrayList;

/*
 * @author alina
 *
 */
public class Signature {

    public ArrayList<String> constNames = new ArrayList<>();
    public ArrayList<String> nullaryNames = new ArrayList<>();
    public ArrayList<String> unaryNames = new ArrayList<>();
    public ArrayList<String> binaryNames = new ArrayList<>();

    public Signature(Structure activeStruct) {
        for (Term t:activeStruct.terms){
            if (t instanceof Const && !constNames.contains(t.name)) {
                constNames.add(t.name);
            }
        }
        for (NullaryRel n:activeStruct.nullaryRels){
//            if (!nullaryNames.contains(n.name)){
                nullaryNames.add(n.name);
//            }
        }
        for (UnaryRel u:activeStruct.unaryRels){
//            if (!unaryNames.contains(u.name)){
                unaryNames.add(u.name + " (" + u.arg.name + ")");
//            }
        }
        for (BinaryRel b:activeStruct.binaryRels){
//            if (!binaryNames.contains(b.name)){
                binaryNames.add(b.name  + " (" + b.arg1.name + ", " + b.arg2.name + ")");
//            }
        }
    }
    
}
