package Tree;

/*
 * @author alina
 * 
 */
public class DuplicateDefinitionException extends Exception {
    
    private final String notification;

    public DuplicateDefinitionException(String relName) {
        notification = relName
                + " is not defined as a relation in the structure. "
                + "Use the signature to add it";
    }

    @Override
    public String getMessage() {
        return this.notification;
    }
}
