/*
 # Faça um programa em Python que receba do usuario dois vetores, 
#´ A e B, com 10 numeros inteiros cada. 
# Crie um novo vetor denominado C calculando C = A - B. 
# Mostre na tela os dados
# do vetor C.
 */

import exemples.Vector;

public class Vetor03 {
    public static int sizesVectors = 4;
    public static Vector vectorA = new Vector(sizesVectors);
    public static Vector vectorB = new Vector(sizesVectors);
    public static Vector vectorC = new Vector(sizesVectors);
    public static InputKeyboard input = new InputKeyboard();

    public static void main(String[] args) {

        for( int i =0; i < sizesVectors; i++ ){
            System.out.print("Digite um valor para a posição " + i+" do vetor A: ");
            int valueVetorA = input.readInt();
            vectorA.setElementInVector(valueVetorA, i);
            System.out.print("Digite um valor para a posição " + i+" do vetor B: ");
            int valueVetorB = input.readInt();
            vectorB.setElementInVector(valueVetorB, i);
        }

        for(int i =0; i < vectorC.getVectorSize(); i++) {
            int operationVectorsAB = vectorA.getElementInVector(i) - vectorB.getElementInVector(i);
            vectorC.setElementInVector(operationVectorsAB, i);
        }

        for (int i =0; i < vectorC.getVectorSize(); i++){
            System.out.print(vectorC.getElementInVector(i)+"\t");
        }
    }

}
