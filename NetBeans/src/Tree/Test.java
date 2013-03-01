package Tree;

import Parser.folLexer;
import Parser.folParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/*
 * @author alina
 * 
 */
public class Test { 

    public static void main(String[] args) throws UnboundException, DuplicateQuantifierException {

        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Variable z = new Variable("z");
        Variable w = new Variable("w");

        Const fred = new Const("Fred");
        Const tina = new Const("Tina");

        UnaryRel happy = new UnaryRel("happy");
        BinaryRel loves = new BinaryRel("loves");
//        UnaryRelNode happyX = new UnaryRelNode(happy, x);
        UnaryRelNode happyY = new UnaryRelNode(happy, y);
//        UnaryRelNode happyFred = new UnaryRelNode(happy, fred);

//        NotNode notHappyFred = new NotNode(happyFred);
        
        BinaryRelNode lovesXY = new BinaryRelNode(loves, x, y);
        BinaryRelNode lovesFredX = new BinaryRelNode(loves, fred, x);
//        BinaryRelNode lovesXFred = new BinaryRelNode(loves, x, fred);

//        ForAllNode allW = new ForAllNode(w, happyX);
//        ForAllNode allZ = new ForAllNode(z, allW);
        BinOpNode impliesLovesHappyY = new BinOpNode(BinOp.IMPLIES, lovesXY, happyY);
        ForAllNode allY = new ForAllNode(y, impliesLovesHappyY);
        BinOpNode impliesLovesAllY = new BinOpNode(BinOp.IMPLIES, lovesFredX, allY);
        ForAllNode allX = new ForAllNode(x, impliesLovesAllY);

//        ExistsNode existsW = new ExistsNode(w, allX);
//        ExistsNode existsZ = new ExistsNode(z, allX);
//        ExistsNode existsY = new ExistsNode(y, lovesXY);
//        ExistsNode existsX = new ExistsNode(x, allY);

        LogicTree sentence = new LogicTree(allX);

//        ∀x(R(Fred,x) →  ∀y(R(x,y) → P(y)))
        
        Structure makeTrue = new Structure();

        
        
//        Term t1 = new Term("t1");
//        Term t2 = new Term("t2");
//        Term t3 = new Term("t3");
//
        UnaryRel happy1 = new UnaryRel("happy", tina);
//        UnaryRel happy2 = new UnaryRel("happy", t2);
//        UnaryRel happy3 = new UnaryRel("happy", t3);
//        UnaryRel happy4 = new UnaryRel("happy", fred);
//
        BinaryRel loves1 = new BinaryRel("loves", fred, tina);
        BinaryRel loves2 = new BinaryRel("loves", tina, tina);
//        BinaryRel loves3 = new BinaryRel("loves", t3, fred);
//        BinaryRel loves4 = new BinaryRel("loves", t2, fred);
//
//        BinaryRel loves5 = new BinaryRel("loves", t1, t1);
//        BinaryRel loves6 = new BinaryRel("loves", fred, t1);
//        BinaryRel loves7 = new BinaryRel("loves", t3, t1);
//        BinaryRel loves8 = new BinaryRel("loves", t2, t1);
//
//        BinaryRel loves9 = new BinaryRel("loves", t1, t2);
//        BinaryRel loves10 = new BinaryRel("loves", fred, t2);
//        BinaryRel loves11 = new BinaryRel("loves", t3, t2);
//        BinaryRel loves12 = new BinaryRel("loves", t2, t2);
//        
//        BinaryRel loves13 = new BinaryRel("loves", t1, t3);
//        BinaryRel loves14 = new BinaryRel("loves", fred, t3);
//        BinaryRel loves15 = new BinaryRel("loves", t3, t3);
//        BinaryRel loves16 = new BinaryRel("loves", t2, t3);
//
//        makeTrue.terms.add(t1);
//        makeTrue.terms.add(t2);
//        makeTrue.terms.add(t3);
        makeTrue.terms.add(fred);
        makeTrue.terms.add(tina);
//
//        makeTrue.unaryRels.add(happy1);
//        makeTrue.unaryRels.add(happy2);
//        makeTrue.unaryRels.add(happy3);
//        makeTrue.unaryRels.add(happy4);
//
//        makeTrue.binaryRels.add(loves1);
        makeTrue.binaryRels.add(loves2);
//        makeTrue.binaryRels.add(loves3);
//        makeTrue.binaryRels.add(loves4);
//        makeTrue.binaryRels.add(loves5);
//        makeTrue.binaryRels.add(loves6);
//        makeTrue.binaryRels.add(loves7);
//        makeTrue.binaryRels.add(loves8);
//        makeTrue.binaryRels.add(loves9);
//        makeTrue.binaryRels.add(loves10);
//        makeTrue.binaryRels.add(loves11);
//        makeTrue.binaryRels.add(loves12);
//        makeTrue.binaryRels.add(loves13);
//        makeTrue.binaryRels.add(loves14);
//        makeTrue.binaryRels.add(loves15);
//        makeTrue.binaryRels.add(loves16);

        ANTLRInputStream input = new ANTLRInputStream("∀x(R(Fred,x) →  ∀y(R(x,y) → P(y)))");
        folLexer lexer = new folLexer(input);
        TokenStream tk = new CommonTokenStream(lexer);
        folParser parser = new folParser(tk);

        System.out.println(parser.condition().toStringTree());
        System.out.println(" class"+parser.condition().getClass());
        
        LogicTree sentence2 = new LogicTree(parser.condition());  

        System.out.println(sentence.evaluate(makeTrue));
    }
    
}
