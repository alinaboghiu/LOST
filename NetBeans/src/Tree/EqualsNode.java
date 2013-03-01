package Tree;

/*
 * @author alina
 * 
 */
public class EqualsNode extends LogicTreeNode{

    Term left;
    Term right;

    public EqualsNode(Term left, Term right) {
        this.left = left;
        this.right = right;
    }

@Override
    boolean evaluate(Structure s) throws UnboundException {
        if (this.left instanceof Const && this.right instanceof Const) {
            return left.name.equals(right.name);
        // check if unbound
        } else if (left instanceof Variable && right instanceof Variable) {
            Variable var1 = (Variable) left;
            Variable var2 = (Variable) right;
            if (!(var1.existsBound || var1.forAllBound)) {
                throw new UnboundException();
            }
            if (!(var2.existsBound || var2.forAllBound)) {
                throw new UnboundException();
            }
            // not the right assignment, ignore and continue
            if (var1.existsBound && var2.existsBound) {
                return false;
            }
        }
        //this was not the right assignment, ignore and proceed
        return true;

    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException {
        // check if unbound
        if (left instanceof Variable && right instanceof Variable) {
            Variable var1 = (Variable) left;
            Variable var2 = (Variable) right;
            if (!(var1.existsBound || var1.forAllBound)) {
                throw new UnboundException();
            }
            if (!(var2.existsBound || var2.forAllBound)) {
                throw new UnboundException();
            }
        }

        //if both terms are variables
        if (left == a1.boundVar && right == a2.boundVar) {
            return a1.assignedTerm.equals(a2.assignedTerm);
        //if left is a variable and right is a constant
        } else if (left == a1.boundVar && right instanceof Const) {
            return a1.assignedTerm.equals(right);
        //if left is a constant and right is a variable
        } else if (left instanceof Const && right == a2.boundVar) {
            return left.equals(a2.assignedTerm);
        //if both terms are constants
        } else {
            return evaluate(s);
        }
    }
    
}
