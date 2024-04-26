/** 
 * @author Felipe Tilleria
 * @since 22 de abril de 2024
 * 
 * Subclase de bebida que se retorna a la hora de comprar el producto
 * 
 * @see Bebida
 * 
 * 
 * @param serie heredada de bebida, tiene el fin de distinguir entre cada sprite
 */
class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String sabor(){
        return "sprite";
    }
}