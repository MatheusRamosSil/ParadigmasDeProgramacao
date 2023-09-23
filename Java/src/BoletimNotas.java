public class BoletimNotas {

    public static void main(String[] args) {
        int numberAlunos = 10;
        int numberProva = 3;
        int[][] matrizAlunoProva = new int[numberProva][numberAlunos]; 

        int piorNota = 100;
        int numerosDeAluonosPiorNotaProva01 = 0;
        int numerosDeAluonosPiorNotaProva02 = 0;
        int numerosDeAluonosPiorNotaProva03 = 0;

        int alunos = 1;

        InputKeyboard inputKeyboard = new InputKeyboard();

        for (int i = 0; i < matrizAlunoProva.length; i++) {
            for (int j = 0; j < matrizAlunoProva.length; j++) {
                System.out.print("Digite a nota do "+alunos+"aluno na prova "+i+" :");
                int notaProva = inputKeyboard.readInt();
                matrizAlunoProva[i][j] = notaProva;
                alunos++;
            }
            
        }

        for (int j = 0; j < matrizAlunoProva.length; j++) {
            
            piorNota = matrizAlunoProva[0][j];

            if(piorNota >= matrizAlunoProva[1][j]) { 
                piorNota = matrizAlunoProva[1][j];
            }
            if( piorNota >= matrizAlunoProva[2][j]) {
                piorNota = matrizAlunoProva[2][j];
            }

            if(piorNota == matrizAlunoProva[0][j]) {
                numerosDeAluonosPiorNotaProva01++;
            }
            if(piorNota == matrizAlunoProva[1][j]) {
                numerosDeAluonosPiorNotaProva02++;
            }
            else{
                numerosDeAluonosPiorNotaProva03++;
            }
        }

        System.out.println("\n\nO numero de alunos com pior nota na 1ª prova: "+numerosDeAluonosPiorNotaProva01);
        System.out.println("O numero de alunos com pior nota na 2ª prova: "+numerosDeAluonosPiorNotaProva02);
        System.out.println("O numero de alunos com pior nota na 3ª prova: "+numerosDeAluonosPiorNotaProva03);
        
    } 
    
}
