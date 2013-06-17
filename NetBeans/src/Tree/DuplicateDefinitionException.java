package Tree;

/*
 * @author alina
 * 
 */
public class DuplicateDefinitionException extends Exception {
    
    private final String notification;

    public DuplicateDefinitionException(String varName) {
        notification = "You have used two quantifiers on " + varName +
                       ". Please revise your sentence";
    }

    @Override
    public String getMessage() {
        return this.notification;
    }
}
