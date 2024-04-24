public class PagoIncorrectoException extends Exception {
    private String message;
    public PagoIncorrectoException(String message){
        super(message);
    }
}
