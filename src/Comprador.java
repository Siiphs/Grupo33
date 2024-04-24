public class Comprador {
    private String sonido;
    private int vuelto = 0;
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        try{
            Bebida b = exp.comprarBebida(m, cualBebida);
            if(b != null ){
                sonido = b.sabor();
            }
            else {
                sonido = null;
            }

        }
        catch(PagoInsuficienteException pie){
            
            System.out.println("Error generico");
        }
        finally{
            while (true) {
                m = exp.getVuelto();

                if (m != null) {
                    vuelto = vuelto + m.getValor();
                } else {
                    break;
                }
            }
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}
