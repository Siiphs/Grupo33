public class Expendedor {
        
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private Deposito coca, sprite, fanta, super8, snickers;
    private Deposito monVu;
    private int precio;

    public Expendedor(int numProductos, int precioProductos) {
        precio = precioProductos;
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

    public Producto comprarProducto(Moneda m, int tipo) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{
        if (m == null) {
            throw new PagoIncorrectoException("No has insertado monedas en el expendedor");
        }

        if (m.getValor() < precio) {
            monVu.addMoneda(m);
            throw new PagoInsuficienteException("El saldo es insuficiente para comprar el producto"); //este va para ver si funciona
        }

            Producto b = null;
            if (tipo == COCA) {
                b = coca.getProducto();
            } else if (tipo == SPRITE) {
                b = sprite.getProducto();
            } else if (tipo == SPRITE) {
                b = fanta.getProducto();
            } else if (tipo == SPRITE) {
                b = super8.getProducto();
            } else if (tipo == SPRITE) {
                b = snickers.getProducto();
            }

            if (b == null) {
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan productos en el expendedor");
            } else {
                int vuelto = m.getValor() - precio;

                while (vuelto > 0) {
                    if (vuelto >= 100) {
                        monVu.addMoneda(new Moneda100());
                        vuelto -= 100;
                        continue;
                    }
                }
            }
            return b;
        }
        public Moneda getVuelto() {
            return monVu.getMoneda();
        }
    }