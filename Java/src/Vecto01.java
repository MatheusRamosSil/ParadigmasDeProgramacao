import exemples.Vector;

public class Vecto01{
    private static Vector vector  = new Vector(8);
    private static InputKeyboard inputKeyboard = new InputKeyboard();

    public static void main(String[] args) throws Exception {

        int positionElementX = 0;
        int positionElementY = 0;

        for( int i = 0; i < vector.getVectorSize(); i++ ) {
            System.out.print("Digite um valor para a  posição "+ i+": ");
            int value = inputKeyboard.readInt();
            vector.setElementInVector(value, i);
        }

        try {
        System.out.println("Digite um valor para a posição X: ");
        positionElementX = inputKeyboard.readInt();
        System.out.println("Digite um valor para a posição Y: ");
        positionElementY = inputKeyboard.readInt();

        int sumElementsXAndY = vector.getElementInVector(positionElementX) + vector.getElementInVector(positionElementY);

        System.out.println("A soma das posições X: "+positionElementX+" e Y: "+positionElementY+" é igual a "+ sumElementsXAndY);

        } catch (Exception e) {
            System.out.println("Valo invalido posições X: "+positionElementX+" e Y: "+positionElementY);
        }
  
    }
}
