/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost;

/**
 *
 * @author alina
 */
enum BinOp {
    
    AND{
        @Override
        boolean evaluate(boolean left, boolean right) {
            return left && right;
        }
    },
    
    OR{
        @Override
        boolean evaluate(boolean left, boolean right) {
            return left || right;
        }
    },
    
    IMPLIES{
        @Override
        boolean evaluate(boolean left, boolean right) {
            return !left || right;
        }
    },
        
    EQUIVALENCE{
        @Override
        boolean evaluate(boolean left, boolean right) {
            return left == right;
        }
    };

    abstract boolean evaluate(boolean evaluate, boolean evaluate0);

}
