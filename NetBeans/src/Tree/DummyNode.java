/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/*
 * @author alina
 *
 */
public class DummyNode extends LogicTreeNode {

    @Override
    boolean evaluate(Structure s) throws ThisUnboundException {
        return next.evaluate(s);
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws ThisUnboundException {
        return next.evaluate(s, a1, a2);
    }
}
