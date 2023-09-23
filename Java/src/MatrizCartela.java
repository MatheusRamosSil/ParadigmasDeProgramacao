import java.util.ArrayList;
import java.util.Random;

public class MatrizCartela{

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int sizeMatiz = 5;
       
        int[][] matriz = new int[sizeMatiz][sizeMatiz];

        for(int i = 0; i < sizeMatiz; i++){
            for(int j = 0; j < sizeMatiz; j++){

                int randomNumber  = randomInRange(0, 99);
                if(matriz[i][j] != randomNumber){
                    matriz[i][j] = randomNumber;
                }
            }
        }
        for(int i = 0; i < sizeMatiz; i++){
            for(int j = 0; j < sizeMatiz; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }

    public static int randomInRange(int min, int max)
    {
       return rand.nextInt(max - min) + min;
    }
}