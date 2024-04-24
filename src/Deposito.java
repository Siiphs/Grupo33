import java.util.ArrayList;

public class Deposito {
        private ArrayList<Producto> pro;
        private ArrayList<Moneda> mon;
        public Deposito(){
            mon = new ArrayList<Moneda>();
            pro = new ArrayList<>();
        }
        public void addProducto(Producto producto){
            pro.add(producto);
        }
        public void addMoneda(Moneda moneda){
            mon.add(moneda);
        }
        public Producto getProducto(){
            if(pro.isEmpty()) {
                return null;
            }
            return pro.remove(0);
        }
        public Moneda getMoneda(){
            if(mon.isEmpty()){
                return null;
            }
            return mon.remove(0);
    }
}
