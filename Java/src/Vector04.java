/*
# Faça um programa em Python que receba 6 numeros inteiros e mostre: ´
#  • Os numeros pares digitados; 
#  • A soma dos numeros pares digitados; 
#  • Os numeros   ımpares digitados;
#  • A quantidade de numeros  ımpares 
 */

import exemples.Vector;

public class Vector04 {
    static int sizeVectors = 4;
    public static Vector vector = new Vector(sizeVectors);
    public static Vector vectorPares = new Vector(sizeVectors);
    public static Vector vectorImpares = new Vector(sizeVectors);
    
    public static InputKeyboard input = new InputKeyboard();
    public static int somaPares = 0;

    public static void main(String[] args) {

      

        for (int i =0; i<vector.getVectorSize(); i++) {
            System.out.println("Digite um numero: ");
            int value = input.readInt();
            vector.setElementInVector(value, i);
        }

        for (int i =0; i<vector.getVectorSize(); i++) {
            if (vector.getElementInVector(i) % 2 == 0) {
                vectorPares.setElementInVector(vector.getElementInVector(i), i);
                somaPares += vector.getElementInVector(i);
            }else{
                vectorImpares.setElementInVector(vector.getElementInVector(i), i);
            }
        }

        System.out.println("A soma dos pares digitados são: "+ somaPares);
        System.out.print("Os numeros pares digitados são: ");
        for (int i =0; i<vectorPares.getVectorSize(); i++) {
            if(vector.getElementInVector(i) != 0){
                System.out.print(vectorPares.getElementInVector(i));
            }   
        }
      
        System.out.println("\n\nA quantidade de impares digitados é: "+ vectorImpares.getVectorSize());


    }
    
}
