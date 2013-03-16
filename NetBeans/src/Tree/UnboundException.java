package Tree;

/*
 * @author alina
 * 
 */
public class UnboundException extends Exception {
    
    private final String message;
    
    public UnboundException(String termName) {
        message = termName + " is not defined in the structure. "
                + "Add as constant or quantify and try again";
    }
    
    @Override
    public String getMessage(){
        return this.message;
    }
    
}
