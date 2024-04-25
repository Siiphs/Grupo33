public class Comprador {
    private String sabor;
    private int vuelto = 0;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        try{
            
            Producto p = exp.comprarProducto(m, cualProducto);
            if(p != null ){
                sabor = p.sabor();
            }
            else {
                sabor = null;
            }
        }
        catch(NoHayProductoException nhpe){
            System.out.println(nhpe.getMessage());
        }
        catch(PagoIncorrectoException pinc){
            System.out.println(pinc.getMessage());
        }
        catch(PagoInsuficienteException pins){
            System.out.println(pins.getMessage());
        }
        catch(Exception e){
            System.out.println("error generico");
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
    public String queConsumiste(){
        return sabor;
    }
}