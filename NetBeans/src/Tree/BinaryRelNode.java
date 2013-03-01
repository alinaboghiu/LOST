package Tree;

/*
 * @author alina
 * 
 */
public class BinaryRelNode extends LogicTreeNode {

    BinaryRel rel;
    Term arg1;
    Term arg2;

    public BinaryRelNode(BinaryRel rel, Term arg1, Term arg2) {
        this.rel = rel;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    boolean evaluate(Structure s) throws UnboundException {
        if (this.arg1 instanceof Const && this.arg2 instanceof Const) {
            BinaryRel thisAssignment = new BinaryRel(rel.name, arg1, arg2);
            return s.binaryRels.contains(thisAssignment);
            // check if unbound
        } else if (arg1 instanceof Variable && arg2 instanceof Variable) {
            Variable var1 = (Variable) arg1;
            Variable var2 = (Variable) arg2;
            if (!(var1.existsBound || var1.forAllBound)) {
                throw new UnboundException();
            }
            if (!(var2.existsBound || var2.forAllBound)) {
                throw new UnboundException();
            }
        }
        //this was not the right assignment, ignore and proceed
        throw new UnboundException();
    }

    @Override
    boolean evaluate(Structure s, Assignment a1, Assignment a2)
            throws UnboundException {
        // check if unbound
        if (arg1 instanceof Variable && arg2 instanceof Variable) {
            Variable var1 = (Variable) arg1;
            Variable var2 = (Variable) arg2;
            if (!(var1.existsBound || var1.forAllBound)) {
                throw new UnboundException();
            }
            if (!(var2.existsBound || var2.forAllBound)) {
                throw new UnboundException();
            }
        }

        //if both arguements are variables
        if (arg1.equals(a1.boundVar) && arg2.equals(a2.boundVar)) {
            BinaryRel newAssignment = new BinaryRel(rel.name, a1.assignedTerm, a2.assignedTerm);
            if (a1.assignedTerm.name.equals("Tina")){
                System.out.println("here");
            }
            return s.binaryRels.contains(newAssignment);
            
        //if arg1 is a variable and arg2 is a constant
        } else if (arg1.equals(a1.boundVar) && arg2 instanceof Const) {
            BinaryRel newAssignment = new BinaryRel(rel.name, a1.assignedTerm, arg2);
            return s.binaryRels.contains(newAssignment);
            
        //if arg1 is a constant and arg2 is a variable
        } else if (arg1 instanceof Const && arg2.equals(a2.boundVar)) {
            BinaryRel newAssignment = new BinaryRel(rel.name, arg1, a2.assignedTerm);
            if (a2.assignedTerm.name.equals("Tina")){
                System.out.println("here");
                System.out.println(a2.boundVar.name);
            }
            return s.binaryRels.contains(newAssignment);
            
        //if both arguements are constants
        } else {
            return evaluate(s);
        }
    }

}
