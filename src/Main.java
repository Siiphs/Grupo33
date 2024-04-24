public class Main{
    public static void main(String[] args) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        
        
        try{
            Expendedor exp = new Expendedor(3,1000);
            Moneda m = null;
            Comprador c=null;

            m = new Moneda1000();
            c = new Comprador(m,Expendedor.COCA,exp);
            System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.COCA,exp);
            System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.COCA,exp);
            System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());

            // // -----con MENOS dinero que el precio-----
            m = new Moneda500();
            c = new Comprador(m,Expendedor.SPRITE,exp);
            System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,Expendedor.SPRITE,exp);
            System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,Expendedor.SPRITE,exp);
            System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
        }
        catch(Exception e){
            
        }
    }
}