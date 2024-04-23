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

        public Bebida comprarBebida(Moneda m, int tipo) {
            if (m == null) {
                return null;
            }

            if (m.getValor() < precio) {
                monVu.addMoneda(m);
                return null;
            }

            Bebida b = null;
            if (tipo == COCA) {
                b = coca.getBebida();
            } else if (tipo == SPRITE) {
                b = sprite.getBebida();
            }

            if (b == null) {
                monVu.addMoneda(m);
            } else {
                int vuelto = m.getValor() - precio;

                while (vuelto > 0) {
                    if (vuelto >= 1000) {
                        monVu.addMoneda(new Moneda1000());
                        vuelto -= 1000;
                        continue;
                    }

                    if (vuelto >= 500) {
                        monVu.addMoneda(new Moneda500());
                        vuelto -= 500;
                        continue;

                    }

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