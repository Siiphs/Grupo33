public class PagoInsuficienteException extends Exception {
    private String message;
    public PagoInsuficienteException(String message){
        super(message);
    }
}