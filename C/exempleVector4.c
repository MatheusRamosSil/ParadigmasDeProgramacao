/*
# Faça um programa em Python que receba 6 numeros inteiros e mostre: ´
#  • Os numeros pares digitados; 
#  • A soma dos numeros pares digitados; 
#  • Os numeros   ımpares digitados;
#  • A quantidade de numeros  ımpares 
*/
#include <stdio.h>
#include <stdlib.h>

void main(){

    int vector[6];
    int numerosPares[6];
    int numerosImpares[6];
    int somaPares =0;
    int contadorPares = 0;
    int contadorImpares = 0;

    for(int i = 0; i < 6; i++){
        printf("Digite um numero: ");
        scanf("%d", &vector[i]);

        if(vector[i] % 2 == 0){
            numerosPares[contadorPares] = vector[i];
            somaPares += vector[i];
            contadorPares++;

        }else{
            numerosImpares[contadorImpares] = vector[i];
            contadorImpares++;
        }
    }
    
    printf("\nNumeros pares: \n");
    for(int i = 0; i < contadorPares; i++){
        printf("%i ", numerosPares[i]);
    }

    printf("\nSoma dos numeros pares: %i\n", somaPares);
    printf("\nNumeros impares: \n");
    for(int i = 0; i < contadorImpares; i++){
        printf("%i ", numerosImpares[i]);
    }

    printf("\nA quantidade de numeros impares: %i\n\n", contadorImpares);
}