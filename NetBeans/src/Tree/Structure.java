package Tree;

import java.awt.Color;
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
//        Const fred = new Const("Fred");
//        Const tina = new Const("Tina");
//        Term t1 = new Term("t1");
////        Term t2 = new Term("t2");
////        Term t3 = new Term("t3");
////
//        NullaryRel cold = new NullaryRel("cold");
//        
//        UnaryRel happy1 = new UnaryRel("happy", tina);
//        UnaryRel happy2 = new UnaryRel("happy", t1);
////        UnaryRel happy3 = new UnaryRel("happy", t3, toColour(name));
//        UnaryRel happy4 = new UnaryRel("happy", fred);
////
//        BinaryRel loves1 = new BinaryRel("hates", fred, tina);
//        BinaryRel loves2 = new BinaryRel("hates", tina, tina);
////        BinaryRel loves3 = new BinaryRel("loves", tina, fred);
//        BinaryRel loves4 = new BinaryRel("knows", tina, fred);
////
////        BinaryRel loves5 = new BinaryRel("loves", t1, t1);
////        BinaryRel loves6 = new BinaryRel("loves", fred, t1);
////        BinaryRel loves7 = new BinaryRel("loves", t3, t1);
////        BinaryRel loves8 = new BinaryRel("loves", t2, t1);
////
////        BinaryRel loves9 = new BinaryRel("loves", t1, t2);
////        BinaryRel loves10 = new BinaryRel("loves", fred, t2);
////        BinaryRel loves11 = new BinaryRel("loves", t3, t2);
////        BinaryRel loves12 = new BinaryRel("loves", t2, t2);
////        
////        BinaryRel loves13 = new BinaryRel("loves", t1, t3);
////        BinaryRel loves14 = new BinaryRel("loves", fred, t3);
////        BinaryRel loves15 = new BinaryRel("loves", t3, t3);
////        BinaryRel loves16 = new BinaryRel("loves", t2, t3);
////
//        this.terms.add(t1);
////        this.terms.add(t2);
////        this.terms.add(t3);
//        this.terms.add(fred);
//        this.terms.add(tina);
////
//        
//        this.nullaryRels.add(cold);
//        
//        this.unaryRels.add(happy1);
//        this.unaryRels.add(happy2);
////        this.unaryRels.add(happy3);
//        this.unaryRels.add(happy4);
////
//        this.binaryRels.add(loves1);
//        this.binaryRels.add(loves2);
////        this.binaryRels.add(loves3);
//        this.binaryRels.add(loves4);
////        this.binaryRels.add(loves5);
////        this.binaryRels.add(loves6);
////        this.binaryRels.add(loves7);
////        this.binaryRels.add(loves8);
////        this.binaryRels.add(loves9);
////        this.binaryRels.add(loves10);
////        this.binaryRels.add(loves11);
////        this.binaryRels.add(loves12);
////        this.binaryRels.add(loves13);
////        this.binaryRels.add(loves14);
////        this.binaryRels.add(loves15);
////        this.binaryRels.add(loves16);
////------------------------------------------------------------------------------
//
//        Variable x = new Variable("x");
//        Variable y = new Variable("y");
//        Variable z = new Variable("z");
//        Variable w = new Variable("w");
////
////        UnaryRelNode happyX = new UnaryRelNode(happy, x);
////        UnaryRelNode happyFred = new UnaryRelNode(happy, fred);
////        NotNode notHappyFred = new NotNode(happyFred);
////        BinaryRelNode lovesXFred = new BinaryRelNode(loves, x, fred);
////        ForAllNode allW = new ForAllNode(w, happyX);
////        ForAllNode allZ = new ForAllNode(z, allW);
////        ExistsNode existsW = new ExistsNode(w, allX);
////        ExistsNode existsZ = new ExistsNode(z, allX);
////        ExistsNode existsY = new ExistsNode(y, and);
//
////        ∀x∃y(P(y) ∧ ¬(x=y))
////        EqualsNode equalsYX = new EqualsNode(y, x);
////        NotNode not = new NotNode(equalsYX);
////        BinOpNode and = new BinOpNode(BinOp.AND, happyY, not);
////        ForAllNode allX = new ForAllNode(x, and);
////        ExistsNode existsY = new ExistsNode(y, allX);
////        LogicTree sentence = new LogicTree(existsY);
////        
//////        ∀x(R(Fred,x) →  ∀y(R(x,y) → P(y)))
////        UnaryRel happy = new UnaryRel("happy");
////        BinaryRel loves = new BinaryRel("loves");
////        UnaryRelNode happyY = new UnaryRelNode(happy, y);
////        BinaryRelNode lovesXY = new BinaryRelNode(loves, x, y);
////        BinaryRelNode lovesFredX = new BinaryRelNode(loves, fred, x);
////        BinOpNode impliesLovesHappyY = new BinOpNode(BinOp.IMPLIES, lovesXY, happyY);
////        ForAllNode allY = new ForAllNode(y, impliesLovesHappyY);
////        BinOpNode impliesLovesFredXallY = new BinOpNode(BinOp.IMPLIES, lovesFredX, allY);
////        ForAllNode allX = new ForAllNode(x, impliesLovesFredXallY);
////        LogicTree sentence = new LogicTree(allX);
//
////        ANTLRInputStream input = new ANTLRInputStream("happy(Fred)");
////        Lexer lexer = new folLexer(input);
////        TokenStream tk = new CommonTokenStream(lexer);
////        folParser p = new folParser(tk);
////        ParseTree condition = p.condition();
////        LogicTree sentence = ParserTranslator.toLogicTree(condition.getChild(0));   
////
////        System.out.println(sentence.evaluate(this));     
        generate();
    }

    private enum ConstantNames {

        Alina, Stephen, Lukas, James,
        Cara, Giovanni, Gary, Alistair,
        Alice, Andy, Maria;
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

        Happy, clever, dead, funny, lecturer, human,
        sad, bored, lazy, young, fat;
        
        private static final List<UnaryNames> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static UnaryNames randomName() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    private enum BinaryNames {

        loves, knows, trusts, believes_in, eats,
        owns, hates, sees, touches;
        
        private static final List<BinaryNames> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static BinaryNames randomName() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }    
    
    private void generate() {

        int noOfTerms = (int) Math.round(Math.random() * 10);
        int noOfNullaryRels = (int) Math.round(Math.random() * 10) % 5;
        int noOfUnaryRels = (int) Math.round(Math.random() * 10) % 5;
        int noOfBinaryRels = (int) Math.round(Math.random() * 10) % 5;

        for (int i = 0; i < noOfTerms; i++) {
            int isConst = (int) Math.round(Math.random() * 10) % 2;
            if (isConst == 1) {
                //TODO fix generating the same name more than once
                terms.add(new Const(ConstantNames.randomName().name()));
            } else {
                terms.add(new Term("t" + terms.size() + 1));
            }
        }

        for (int i = 0; i < noOfNullaryRels; i++) {
            nullaryRels.add(new NullaryRel(NullaryNames.randomName().name()));
        }

        for (int i = 0; i < noOfUnaryRels; i++) {
            unaryRels.add(new UnaryRel(UnaryNames.randomName().name(), terms.get((i + 1) % Math.max(terms.size(),1))));
        }

        for (int i = 0; i < noOfBinaryRels; i++) {
            binaryRels.add(new BinaryRel(BinaryNames.randomName().name(), terms.get((i + 1) % terms.size()), terms.get((i + 3) % Math.max(terms.size(),1))));
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
