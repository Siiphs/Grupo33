public enum DatosProducto {
    COCACOLA(1, 500),
    FANTA(2, 400),
    SPRITE(3, 300),
    SNICKERS(4, 800),
    SUPER8(5, 600);

    private int cualProducto;
    private int precioProducto;

    private DatosProducto(int cualProducto, int precioProducto) {
        this.cualProducto = cualProducto;
        this.precioProducto = precioProducto;
    }

    public int getCualProducto() { return cualProducto; }
    public int getPrecioProducto() { return precioProducto; }
}