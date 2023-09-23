/*
# Faça um Programa em Python que 
Leia uma matriz 10 x 3 com as notas 
de 10 alunos em 3 provas. 
Em seguida, escreva o numero de alunos cuja pior nota foi na prova 1, o número de alunos cuja pior nota foi na prova 2, e o numero de alunos cuja pior nota foi na prova 3. Em caso de empate das piores notas de um aluno, o critério de desempate  e arbitrário, mas o aluno deve ser contabilizado apenas uma vez.
*/

#include<stdio.h>
#include<stdlib.h>

void main(){
    int vectorAlunoProva[3][10];
    int numerosDeAluonosPiorNotaProva01 =0;
    int numerosDeAluonosPiorNotaProva02 =0;
    int numerosDeAluonosPiorNotaProva03 =0;
    int piorNota =0;
    int alunos = 1;

    for(int indexProva=0; indexProva<3; indexProva++){
        for(int indexAluno=0; indexAluno<10; indexAluno++){
            printf("Digite a nota do %i aluno da prova %i: ", alunos,indexProva);
            scanf("%d", &vectorAlunoProva[indexProva][indexAluno]);
            alunos++;

        }
    }

    piorNota = vectorAlunoProva[0][0];

    
    for(int indexAluno=0; indexAluno<10; indexAluno++){
           
       piorNota = vectorAlunoProva[0][indexAluno];
       if( piorNota >= vectorAlunoProva[1][indexAluno] ){
            piorNota = vectorAlunoProva[1][indexAluno];
        }
        if(piorNota >= vectorAlunoProva[2][indexAluno]){
            piorNota = vectorAlunoProva[2][indexAluno];
        }
        
        if(piorNota == vectorAlunoProva[0][indexAluno]){
            numerosDeAluonosPiorNotaProva01++;
        }
        if(piorNota == vectorAlunoProva[1][indexAluno]){
            numerosDeAluonosPiorNotaProva02++;
        }
        else{
            numerosDeAluonosPiorNotaProva03++;
        }
    }
    
    printf("\n O numero de alunos com pior nota na 1ª prova: %i",numerosDeAluonosPiorNotaProva01);
    printf("\n O numero de alunos com pior nota na 2ª prova: %i",numerosDeAluonosPiorNotaProva02);
    printf("\n O numero de alunos com pior nota na 3ª prova: %i",numerosDeAluonosPiorNotaProva03);
    

}