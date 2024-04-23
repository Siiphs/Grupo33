abstract class Moneda{
    private int serie;
    public Moneda(){
    }
    public int getSerie(){
        return serie;
    }
    public abstract int getValor();
}