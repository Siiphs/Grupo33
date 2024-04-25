public class Main{
    public static void main(String[] args) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        
        
        try{
            Expendedor exp = new Expendedor(3);
            Moneda m = null;
            Comprador c=null;
                
            // -----Bebida que NO vende-----
            m = new Moneda500();
            c = new Comprador(m,664,exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,664,exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,664,exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
                
            // // -----trata de comprar SIN Moneda-----
            m = null;
            c = new Comprador(m,DatosProducto.SPRITE.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = null;
            c = new Comprador(m,DatosProducto.SPRITE.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = null;
            c = new Comprador(m,DatosProducto.SPRITE.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
                
            // // // -----con dinero JUSTO para el precio-----
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.FANTA.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.FANTA.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.FANTA.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
                
            // // -----con MENOS dinero que el precio-----
            m = new Moneda500();
            c = new Comprador(m,DatosProducto.SUPER8.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,DatosProducto.SUPER8.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,DatosProducto.SUPER8.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
                
                
            // // // -----Deposito VACIO-----
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println(c.queConsumiste()+", "+ c.cuantoVuelto());
        }
        catch(Exception e){
            
        }
    }
}