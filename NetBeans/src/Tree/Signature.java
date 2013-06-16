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
        for (Term t : activeStruct.terms) {
            if (t instanceof Constant) {
                constNames.add(t.name);
            }
        }
        for (NullaryRel n : activeStruct.nullaryRels) {
                nullaryNames.add(n.name);
        }
        for (UnaryRel u : activeStruct.unaryRels) {
            // removes duplicates as the same relation name
            // can have different parameters in the structure
            if (!unaryNames.contains(u.name)) {
                unaryNames.add(u.name);
            }
        }
        for (BinaryRel b : activeStruct.binaryRels) {
            if (!binaryNames.contains(b.name)) {
                binaryNames.add(b.name);
            }
        }
    }
}
