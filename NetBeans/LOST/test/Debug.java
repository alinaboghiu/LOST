/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import lost.LogicTree.Variable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alina
 */
public class Debug {
    
    public Debug() {
    }
    
    @Test
    public void blaah() {
        Variable x = new Variable();
        Variable y = new Variable();
        UnaryRel happy = new UnaryRel("happy");
        UnaryRelNode happyX = new UnaryRelNode(happy, x);
        ForAllNode allX = new ForAllNode(x, happyX);
        ForAllNode allY = new ForAllNode(y, allX);
        LogicTree sentence = new LogicTree(allY);
       
        Term t1 = new Term();
        Term t2 = new Term();
        Term t3 = new Term();
        t1.unaryRel.add(happy);
        t2.unaryRel.add(happy);
        t3.unaryRel.add(happy);
        
        Structure makeTrue = new Structure();
        makeTrue.terms.add(t1);
        makeTrue.terms.add(t2);
        makeTrue.terms.add(t3);
        
        System.out.println(sentence.evaluate(makeTrue));
    }
}
