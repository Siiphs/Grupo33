public class Main {
    /**
     * @author Joseph Matamala
     * @author Felipe Tilleria
     * @author Dario Sepulveda
     * @since 18 de abril de 2024
     * @throws PagoIncorrectoException
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     */
    // Metodo principal del programa
    public static void main(String[] args)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        try {
            Expendedor exp = new Expendedor(3);
            Moneda m = null;
            Comprador c=null;
                
            //Bebida que no vende
            System.out.println("\033[0;36m" +"Caso 1: Bebida que no vende" + "\033[0m");
            m = new Moneda100();
            c = new Comprador(m,664,exp);
            System.out.println("\033[0;33m" + "Moneda de 100: " + "\033[0m" + "Tipo: "+ c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,664,exp);
            System.out.println("\033[0;33m" + "Moneda de 500: " + "\033[0m" + "Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,664,exp);
            System.out.println("\033[0;33m" + "Moneda de 1000: " + "\033[0m" + "Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
                
            //Trata de comprar sin moneda
            System.out.println();
            System.out.println("\033[0;36m" +"Caso 2: Comprar sin moneda (moneda null)" + "\033[0m");
            m = null;
            c = new Comprador(m,DatosProducto.COCACOLA.getCualProducto(),exp);
            System.out.println("\033[0;33m" + "Comprando bebida: " + "\033[0m" + "Tipo: "+c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
            m = null;
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println("\033[0;33m" + "Comprando dulce: " + "\033[0m" + "Tipo: "+c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
                
            //Con dinero justo para el precio
            System.out.println();
            System.out.println("\033[0;36m" + "Caso 3: Comprar con dinero justo" + "\033[0m");
            m = new Moneda500();
            c = new Comprador(m,DatosProducto.COCACOLA.getCualProducto(),exp);
            System.out.println("Tipo: "+c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
                
            //Con menos dinero que el precio
            System.out.println();
            System.out.println("\033[0;36m" + "Caso 4: Comprar con menos dinero que el precio" + "\033[0m");
            m = new Moneda500();
            c = new Comprador(m,DatosProducto.SUPER8.getCualProducto(),exp);
            System.out.println("Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
                
            //Deposito vacio
            System.out.println();
            System.out.println("\033[0;36m" + "Caso 5: Deposito vacio (Expendedor tamaño 3)" + "\033[0m");
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println("1)Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println("2)Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println("3)Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto());
            c = new Comprador(m,DatosProducto.SNICKERS.getCualProducto(),exp);
            System.out.println("\033[0;35m" + "4)Tipo: " + c.queConsumiste()+", Vuelto: "+ c.cuantoVuelto() + "\033[0m");

            //Compra exitosa
            System.out.println();
            System.out.println("\033[36m" + "Caso 5: Comprar con la Moneda de mayor valor" + "\033[0m");
            m = new Moneda1000();
            c = new Comprador(m, 1, exp);
            System.out.println("\033[0;33m" + "Bebida: " + "\033[0m" + "Tipo: " + c.queConsumiste() + ", Vuelto: " + c.cuantoVuelto());

            m = new Moneda1000();
            c = new Comprador(m, 5, exp);
            System.out.println("\033[0;33m" + "Dulce: " + "\033[0m" + "Tipo: " + c.queConsumiste() + ", Vuelto: " + c.cuantoVuelto());
            System.out.println();

        } catch (Exception e) {

        }
    }
}
