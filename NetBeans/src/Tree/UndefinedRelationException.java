package Tree;

/*
 * @author alina
 *
 */
public class UndefinedRelationException extends Exception {

    private final String notification;

    // Thrown by 
    public UndefinedRelationException(String relName) {
        notification = relName
                + " is not defined as a relation in the structure. "
                + "Use the signature to add it";
    }

    @Override
    public String getMessage() {
        return this.notification;
    }
}
