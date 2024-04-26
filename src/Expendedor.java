/** 
 * @author Joseph Matamala
 * @author Felipe Tilleria
 * @author Dario Sepulveda
 * @since 18 de abril de 2024
 * 
 * La clase Expendedor se encarga principalmente de dos cosas: 
 * recibir una referencia a Moneda y entregar un producto a traves de el metodo comprarProducto() y
 * entregar el vuelto gracias al metodo getVuelto()
 * 
 * 
 */
public class Expendedor {
    private Deposito coca, sprite, fanta, super8, snickers;
    private Deposito monVu;

    /**El metodo constructor Expendedor es llamado por Main a la hora de probar su funcionamiento sumado a objetos Moneda y Comprador
     * @see Moneda
     * @see Comprador
     * Este metodo hace uso de la variable numProductos la cual, en un ciclo for, agrega dicha cantidad de productos a cada deposito de dulces o bebidas.
    */
    public Expendedor(int numProductos) { 
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        super8 = new Deposito();
        snickers = new Deposito();
        monVu = new Deposito();

        for (int i = 0; i < numProductos; i++) {
            coca.addProducto(new CocaCola(i));
            sprite.addProducto(new Sprite(i));
            fanta.addProducto(new Fanta(i));
            super8.addProducto(new Super8(i));
            snickers.addProducto(new Snickers(i));
        }
    }

    /**
     * El metodo comprarProducto recibe un objeto Moneda y el tipo de producto que se va a comprar,
     * 
     * @param m es la Moneda insertada a la maquina
     * @param tipo el tipo de producto (dulce o bebida) que se va a comprar
     * @return retorna el producto si todo sale bien, en caso contrario lanza una excepcion
     * 
     * 
     * Este tambien se encarga de manejar las excepciones que pueden ocurrir en casos particulares:
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException
     */
    public Producto comprarProducto(Moneda m, int tipo) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{

        if(tipo>5||tipo<1){
            monVu.addMoneda(m);
            throw new NoHayProductoException("El numero de producto no es valido");
        }

        DatosProducto[] arrProductos = DatosProducto.values();
        int precio = arrProductos[tipo-1].getPrecioProducto();

        if (m == null) {
            throw new PagoIncorrectoException("No has insertado monedas en el expendedor");
        }

        if (m.getValor() < precio) {
            monVu.addMoneda(m);
            throw new PagoInsuficienteException("El saldo es insuficiente para comprar el producto");
        }

            Producto p = null;
            if (tipo == DatosProducto.COCACOLA.getCualProducto()) {
                p = coca.getProducto();
            } else if (tipo == DatosProducto.SPRITE.getCualProducto()) {
                p = sprite.getProducto();
            } else if (tipo == DatosProducto.FANTA.getCualProducto()) {
                p = fanta.getProducto();
            } else if (tipo == DatosProducto.SUPER8.getCualProducto()) {
                p = super8.getProducto();
            } else if (tipo == DatosProducto.SNICKERS.getCualProducto()) {
                p = snickers.getProducto();
            }
            if (p == null) {
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan productos en el expendedor");
            } 
            
            else {
                int vuelto = m.getValor() - precio;

                while (vuelto > 0) {
                    if (vuelto >= 100) {
                        monVu.addMoneda(new Moneda100());
                        vuelto -= 100;
                        continue;
                    }
                }
            }
            return p;
        }
    /**
     * getVuelto() tiene una referencia a un objeto Deposito en el que se almacenan las monedas
     * 
     * @return la Moneda que se devuelve del Deposito
     */
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
}