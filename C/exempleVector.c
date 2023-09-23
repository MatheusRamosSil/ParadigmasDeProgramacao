/*
# lê um vetor de 8 posições e, 
em seguida, lê dois valores X e Y quaisquer
correspondentes a duas posições no vetor.
O programa então imprime a soma dos valores encontrados nas respectivas posições X e Y.
*/
#include <stdio.h>
#include <stdlib.h>


int validatePositionVector(int positionInVector, char eixo){
   
    while (!(0<= positionInVector && positionInVector <=8))
    {
        if(!(0<= positionInVector && positionInVector <=8) ){
            printf("Valor invalido %i para a posição %c: ", positionInVector,eixo);
            scanf("%d",&positionInVector);
        }
       
    }
    return positionInVector;
}

void main()
{
    int vector [8];
    int positionElementVectorX = 0;
    int positionElementVectorY = 0;
    int index;

    for ( index =0 ;index < 8; index++){
        printf("Digite uma valor para a posicao %i do vetor ",index);
        scanf("%d", &vector[index]);
    }

    printf("\n\n");
    printf("Digite o valor de X: ");
    scanf("%d", &positionElementVectorX);
    printf("\n");
    printf("Digite o valor de Y: ");
    scanf("%d", &positionElementVectorY);

    positionElementVectorX = validatePositionVector(positionElementVectorX,'X');
    positionElementVectorY = validatePositionVector(positionElementVectorY,'Y');

   int sumElementsVecto= vector[positionElementVectorX] + vector[positionElementVectorY];
   int medianElementsVecto= sumElementsVecto / 2;

   printf("A soma dos valores encontrados nas respectivas posições %i e %i é igual a %i", positionElementVectorX,positionElementVectorY,sumElementsVecto);
   printf("\n\nA média dos elementos do vector %i",medianElementsVecto);
    
}
