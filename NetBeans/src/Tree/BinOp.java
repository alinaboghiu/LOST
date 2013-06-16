package Tree;

/*
 * @author alina
 * 
 */
public enum BinOp {

    AND {
        @Override
        boolean evaluate(boolean left, boolean right) {
            return left && right;
        }
    },
    
    OR {
        @Override
        boolean evaluate(boolean left, boolean right) {
            return left || right;
        }
    },
    
    IMPLIES {
        @Override
        boolean evaluate(boolean left, boolean right) {
            return !left || right;
        }
    },
    
    EQUIVALENCE {
        @Override
        boolean evaluate(boolean left, boolean right) {
            return left == right;
        }
    };

    abstract boolean evaluate(boolean evaluate1, boolean evaluate2);
}
