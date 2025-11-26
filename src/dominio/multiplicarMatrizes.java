package dominio;

public class multiplicarMatrizes {
    public static void multiplicaMatriz(int[][] matriz1, int[][] matriz2, int linhas1, int colunas1, int linhas2, int colunas2) {

        if (colunas1 == linhas2){
            System.out.println("Está operação é possível");
        }else {
            System.out.println("Está operação não é possível");
        }
    }
}