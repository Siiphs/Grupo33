public class Expendedor {
        
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private Deposito coca, sprite;
    private Deposito monVu;
    private int precio;

    public Expendedor(int numBebidas, int precioBebidas) {
        precio = precioBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new Deposito();

        for (int i = 0; i < numBebidas; i++) {
            coca.addBebida(new CocaCola(i));
            sprite.addBebida(new Sprite(i));
        }
    }
    /*aqui va el comprarProducto() throws PagoIncorrectoException, PagoInsuficiente Exception, NoHayProductoException{
        if (m == null) {
            throw new PagoIncorrectoException("No tienes saldo para comprar");
        }
        if (m.getValor() < precio) {
            monVu.addMoneda(m);
            throw new PagoInsuficienteException("El saldo es insuficiente para comprar el producto");
        if (b == null) {
            monVu.addMoneda(m);
            throw new NoHayProductoException("No quedan productos en el expendedor");
        }

    }*/
    public Bebida comprarBebida(Moneda m, int tipo) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{
        if (m == null) {
            //return null;
            throw new PagoIncorrectoException("No has insertado monedas en el expendedor");
        }

        if (m.getValor() < precio) {
            monVu.addMoneda(m);
            throw new PagoInsuficienteException("El saldo es insuficiente para comprar el producto"); //este va para ver si funciona
        }

            Bebida b = null;
            if (tipo == COCA) {
                b = coca.getBebida();
            } else if (tipo == SPRITE) {
                b = sprite.getBebida();
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