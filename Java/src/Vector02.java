/*
# Faça um programa em Python que receba do usuario 
# um vetor com 10 posições. Em seguida devera ser 
# impresso o maior e o menor elemento do vetor.
 */

import exemples.Vector;

public class Vector02 {
    
    public static Vector vector = new Vector(10);
    private static InputKeyboard inputKeyboard = new InputKeyboard();

    public static void main(String[] args) {

      for (int i = 0; i < vector.getVectorSize(); i++) {
      
        System.out.print("Digite um valor para a posição "+i+": ");
        int value = inputKeyboard.readInt();
        vector.setElementInVector(value, i);
        }

        int maxElementValue = 0;
        int minElementValue = 0;

        for (int i = 0; i < vector.getVectorSize(); i++) {
            if (vector.getElementInVector(i) > maxElementValue) {
                maxElementValue = vector.getElementInVector(i);
            }
            if (vector.getElementInVector(i) < minElementValue) {
                minElementValue = vector.getElementInVector(i);
            }
        }

        System.out.println("O maior elemento do vetor: " + maxElementValue);
        System.out.println("O menor elemento do vetor: " + minElementValue);
    }
}
