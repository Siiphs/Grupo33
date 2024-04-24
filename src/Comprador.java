public class Comprador {
    private String sabor;
    private int vuelto = 0;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        try{
            Producto b = exp.comprarProducto(m, cualProducto);
            if(b != null ){
                sabor = b.sabor();
            }
            else {
                sabor = null;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
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
