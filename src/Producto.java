/**
 * @author Joseph Matamala
 * @since 22 de abril de 2024
 * 
 * 
 * @param serie cada objeto Producto tiene una serie asociada para poder diferenciar entre cada uno
 * 
 * el metodo abstracto sabor() es una plantilla para poder almacenar el nombre de cualquier producto
 */
abstract class Producto{
    private int serie;
    public Producto(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String sabor();
}