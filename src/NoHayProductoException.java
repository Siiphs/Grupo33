public class NoHayProductoException extends Exception {
    private String message;
    public NoHayProductoException(String message){
        super(message);
    }
}
