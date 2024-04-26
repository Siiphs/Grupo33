import java.util.ArrayList;

/**
 * @author Felipe Tilleria
 * @author Joseph Matamala
 * @since 22 de abril de 2024
 *        La clase Deposito representa un deposito que almacena productos y
 *        monedas.
 */
public class Deposito {
    private ArrayList<Producto> pro; // Lista de productos
    private ArrayList<Moneda> mon; // Lista de monedas

    /**
     * Constructor de la clase Deposito.
     * Inicializa las listas de productos y monedas como vacias.
     */
    public Deposito() {
        mon = new ArrayList<Moneda>();
        pro = new ArrayList<>();
    }

    /**
     * Agrega un producto al deposito.
     *
     * @param producto El producto a agregar.
     */
    public void addProducto(Producto producto) {
        pro.add(producto);
    }

    /**
     * Agrega una moneda al deposito.
     *
     * @param moneda La moneda a agregar.
     */
    public void addMoneda(Moneda moneda) {
        mon.add(moneda);
    }

    /**
     * Obtiene el primer producto del deposito y lo elimina de la lista.
     *
     * @return El producto obtenido o null si la lista esta vacia.
     */
    public Producto getProducto() {
        if (pro.isEmpty()) {
            return null;
        }
        return pro.remove(0);
    }

    /**
     * Obtiene la primera moneda del deposito y la elimina de la lista.
     *
     * @return La moneda obtenida o null si la lista esta vacia.
     */
    public Moneda getMoneda() {
        if (mon.isEmpty()) {
            return null;
        }
        return mon.remove(0);
    }
}
