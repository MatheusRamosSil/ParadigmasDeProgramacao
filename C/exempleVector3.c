/*
# Faça um programa em Python que receba do usuario dois vetores, 
#´ A e B, com 10 numeros inteiros cada. 
# Crie um novo vetor denominado C calculando C = A - B. 
# Mostre na tela os dados
# do vetor C.
*/

#include <stdio.h>
#include <stdlib.h>

void main(){
    int vectorA[3];
    int vectorB[3];
    int vectorC[3];

    for(int index=0; index<3; index++){
        printf("Digite um valor para a posicao %i do vector A: ",index);
        scanf("%d", &vectorA[index]);
        printf("Digite um valor para a posicao %i do vector B: ",index);
        scanf("%d", &vectorB[index]);
    }

    for (int index=0; index<3; index++){
        int operationVector = vectorA[index] - vectorB[index];
        vectorC[index] = operationVector;
    }

    for(int index=0; index<3; index++){
        printf("%i \t", vectorC[index]);
    }
}