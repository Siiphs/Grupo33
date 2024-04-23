import java.util.ArrayList;

public class Deposito {
        private ArrayList<Bebida> beb;
        private ArrayList<Moneda> mon;
        public Deposito(){
            mon = new ArrayList<Moneda>();
            beb = new ArrayList<Bebida>();
        }
        public void addBebida(Bebida bebida){
            beb.add(bebida);
        }
        public void addMoneda(Moneda moneda){
            mon.add(moneda);
        }
        public Bebida getBebida(){
            if(beb.size()==0) {
                return null;
            }
            return (Bebida)beb.remove(0);
        }
        public Moneda getMoneda(){
            if(mon.size()==0){
                return null;
            }
            return (Moneda)mon.remove(0);
    }
}
