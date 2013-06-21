package Tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * @author alina
 * 
 */
public class Structure implements Serializable {

    public ArrayList<Term> terms = new ArrayList<>();
    public ArrayList<NullaryRel> nullaryRels = new ArrayList<>();
    public ArrayList<UnaryRel> unaryRels = new ArrayList<>();
    public ArrayList<BinaryRel> binaryRels = new ArrayList<>();
    public String name = "Untitled";

    public Structure() {
        generate();
    }

    private enum ConstantNames {

        Alina, Stephen, Lukas, James,
        Cara, Giovanni, Gary, Alistair,
        Alice, Andy, Maria, John;
        private static final List<ConstantNames> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static ConstantNames randomName() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    private enum NullaryNames {

        cold, hot, sunny, windy, rainy,
        foggy, safe, dagerous, dark;
        private static final List<NullaryNames> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static NullaryNames randomName() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    private enum UnaryNames {

        happy, clever, dead, funny, lecturer, human,
        sad, bored, lazy, young, fat;
        private static final List<UnaryNames> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static boolean[] chosen = new boolean[SIZE];
        private static final Random RANDOM = new Random();

        public static UnaryNames randomName() {
            int index = RANDOM.nextInt(SIZE);
            while (chosen[index]) {
                index = RANDOM.nextInt(SIZE);
            }
            chosen[index] = true;
            return VALUES.get(index);
        }
    }

    private enum BinaryNames {

        loves, knows, trusts, believes_in, eats,
        owns, hates, sees, touches;
        private static final List<BinaryNames> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static boolean[] chosen = new boolean[SIZE];
        private static final Random RANDOM = new Random();

        public static BinaryNames randomName() {
            int index = RANDOM.nextInt(SIZE);
            while (chosen[index]) {
                index = RANDOM.nextInt(SIZE);
            }
            chosen[index] = true;
            return VALUES.get(index);
        }
    }

    private void generate() {

        int noOfTerms = (int) Math.round(Math.random() * 10) % 6 + 1;
        int noOfNullaryRels = (int) Math.round(Math.random() * 10) % 5;
        int noOfUnaryRels = (int) Math.round(Math.random() * 10) % 6;
        int noOfBinaryRels = (int) Math.round(Math.random() * 10) % 5;

        for (int i = 0; i < noOfTerms; i++) {
            int isConst = (int) Math.round(Math.random() * 10) % 2;
            if (isConst == 1) {
                Term t = new Constant(ConstantNames.randomName().name());
                while (terms.contains(t)) {
                    t = new Constant(ConstantNames.randomName().name());
                }
                terms.add(t);
            } else {
                Term t = new Term();
                t.name = String.valueOf(t.hashCode());
                terms.add(t);
            }
        }

        for (int i = 0; i < noOfNullaryRels; i++) {
            NullaryRel r = new NullaryRel(NullaryNames.randomName().name());
            while (nullaryRels.contains(r)) {
                r = new NullaryRel(NullaryNames.randomName().name());
            }
            nullaryRels.add(r);
        }

        for (int i = 0; i < noOfUnaryRels; i++) {
            UnaryRel r = new UnaryRel(UnaryNames.randomName().name(), terms.get(i % terms.size()));
            unaryRels.add(r);
        }

        for (int i = 0; i < noOfBinaryRels; i++) {
            binaryRels.add(new BinaryRel(BinaryNames.randomName().name(), terms.get(i % terms.size()), terms.get((i + 3) % terms.size())));
        }
    }

    NullaryRel inNullaryScope(String name) {
        for (NullaryRel n : nullaryRels) {
            if (n.name.equals(name)) {
                return n;
            }
        }
        return null;
    }

    Term inConstScope(String name) {
        for (Term t : terms) {
            if (t.name.equals(name)) {
                return t;
            }
        }
        return null;
    }
}
