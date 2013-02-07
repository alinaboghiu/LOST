/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.LogicTree;

/**
 *
 * @author alina
 */
public class LogicTreeEquals extends LogicTreeNode{

    Arguement left;
    Arguement right;

    public LogicTreeEquals(Arguement left, Arguement right) {
        this.name = "=";
        this.left = left;
        this.right = right;
    }

    @Override
    Signature generateElements(Signature builder) {
        if (left instanceof Constant){
            Constant c = (Constant) left;
            builder.constants.add(c);
        }
        if (right instanceof Constant){
            Constant c = (Constant) right;
            builder.constants.add(c);
        }
        return builder;
    }

    @Override
   	boolean evaluate(Structure s) throws UnboundException {
        if (left instanceof Constant) {
			if (right instanceof Constant) {
            	return left.equals(right);

			} else {
            	Variable c = (Variable) right;
		        if (c.existsBound){
					return s.objects.contains(left);
				} else if (c.forAllBound){
					return s.objects.size() == 1 && s.objects.contains(left);
				} else {
					throw new UnboundException(c);
				}
			}
		} else {
			Variable c = (Variable) left;
			if (right instanceof Constant) {
				if (c.existsBound){
					return s.objects.contains(right);
				} else if (c.forAllBound){
					return s.objects.size() == 1 && s.objects.contains(right);
				} else {
					throw new UnboundException(c);
				}
			} else {
				return s.objects.size() <= 1;
			}
			
		}
	}
    
}
