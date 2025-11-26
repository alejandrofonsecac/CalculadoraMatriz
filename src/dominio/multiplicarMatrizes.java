package dominio;

public class multiplicarMatrizes {
    public static void multiplicaMatriz(int[][] matriz1, int[][] matriz2,
                                        int linhas1, int colunas1,
                                        int linhas2, int colunas2) {

        if (colunas1 != linhas2) {
            System.out.println("Esta operação não é possível.");
            return;
        }

        System.out.println("Esta operação é possível. Resultado:");

        int[][] resultado = new int[linhas1][colunas2]; // {1}

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
