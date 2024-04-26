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
            // Se crea un objeto de la clase Expendedor con capacidad para 3 productos
            Expendedor exp = new Expendedor(3);

            // Se declaran variables para manejar monedas y compradores
            Moneda m = null;
            Comprador c = null;

            // Transaccion 1: Moneda de 500, compra de producto numero 664
            m = new Moneda500();
            c = new Comprador(m, 664, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 2: Moneda de 500, compra de producto numerode 664
            m = new Moneda500();
            c = new Comprador(m, 664, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 3: Moneda de 500, compra de producto numerode 664
            m = new Moneda500();
            c = new Comprador(m, 664, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 4: Compra SPRITE sin Moneda
            m = null;
            c = new Comprador(m, DatosProducto.SPRITE.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 5: Compra SPRITE sin Moneda
            m = null;
            c = new Comprador(m, DatosProducto.SPRITE.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 6: Compra SPRITE sin Moneda
            m = null;
            c = new Comprador(m, DatosProducto.SPRITE.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 7: Moneda de 1000, compra de producto FANTA
            m = new Moneda1000();
            c = new Comprador(m, DatosProducto.FANTA.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 8: Moneda de 1000, compra de producto FANTA
            m = new Moneda1000();
            c = new Comprador(m, DatosProducto.FANTA.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 9: Moneda de 1000, compra de producto FANTA
            m = new Moneda1000();
            c = new Comprador(m, DatosProducto.FANTA.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 10: Moneda de 500, compra de producto SUPER8
            m = new Moneda500();
            c = new Comprador(m, DatosProducto.SUPER8.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 11: Moneda de 500, compra de producto SUPER8
            m = new Moneda500();
            c = new Comprador(m, DatosProducto.SUPER8.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 12: Moneda de 500, compra de producto SUPER8
            m = new Moneda500();
            c = new Comprador(m, DatosProducto.SUPER8.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 13: Moneda de 1000, compra de producto SNICKERS
            m = new Moneda1000();
            c = new Comprador(m, DatosProducto.SNICKERS.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 14: Moneda de 1000, compra de producto SNICKERS
            m = new Moneda1000();
            c = new Comprador(m, DatosProducto.SNICKERS.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 15: Moneda de 1000, compra de producto SNICKERS
            m = new Moneda1000();
            c = new Comprador(m, DatosProducto.SNICKERS.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

            // Transaccion 16: Moneda de 1000, compra de producto SNICKERS
            c = new Comprador(m, DatosProducto.SNICKERS.getCualProducto(), exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        } catch (Exception e) {

        }
    }
}
