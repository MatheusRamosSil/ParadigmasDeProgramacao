/*
# Faça um programa em Python que receba do usuario 
# um vetor com 10 posições. Em seguida devera ser 
# impresso o maior e o menor elemento do vetor.
*/

#include <stdio.h>
#include <stdlib.h>

int searchMaxElement (int vector[]){
    int max = vector[0];
    for (int i = 1; i < 10; i++){
        if (vector[i] > max){
            max = vector[i];
        }
    }
    return max;
}

int searchMinElement (int vector[]){
    int min = vector[0];
    for (int i = 1; i < 10; i++){
        if (min > vector[i]){
            min = vector[i];
        }
    }
    return min;
}


void main(){
    int vector[10];
    int maxValueVector =vector[0];
    int minValueVector = vector[0];

    for(int i = 0; i < 10; i++){
        printf("Digite o elemento %i: ", i);
        scanf("%d", &vector[i]);
    }

    maxValueVector = searchMaxElement(vector);
    minValueVector = searchMinElement(vector);
 
    printf("\n\n");
    printf("O maior elemento do vetor %i", maxValueVector);
    printf("\n\nO menor elemento do vetor %i", minValueVector);


}