/*
 * A class to represent a token stream
 */
package lost;

/**
 *
 * @author alina
 */
abstract class TokenStream {
    
    final static int NAME   = -98;
    final static int STRING = -99;
    final static int EOF    = -100;
    
    public int currTok; // Holds the current token
    public String sval; // Holds the value of a word token
    
    // Reads the next token in the input stream
    abstract public void next();
  
    // Raises exception in case of parse error
    public IllegalArgumentException parserError(String msg){
        return new ParserError (msg + " but found " + this);
    }

    private static class ParserError extends IllegalArgumentException {

        public ParserError(String string) {
            super(string);
        }
    }
            
}
