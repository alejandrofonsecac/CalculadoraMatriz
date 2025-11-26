package test;
import java.util.Scanner;

import dominio.somarMatrizes;
import dominio.subtrairMatrizes;
import dominio.multiplicarMatrizes;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("--- BEM VINDO A CALCULADORA DE MATRIZES--- ");

        System.out.println("Escreva a operação da matriz: ");
        System.out.println("Digite 1 para somar: \nDigite 2 para subtrair: \nDigite 3 para multiplicar: ");
        int operacao = input.nextInt();

        if (operacao == 1 ||  operacao == 2 ) {
            System.out.println("Digite o número de linhas da Matriz: ");
            int linhas = input.nextInt();
            System.out.println("Digite o número de colunas da Matriz: ");
            int colunas = input.nextInt();

            int[][] matriz1 = new int[linhas][colunas];
            int[][] matriz2 = new int[linhas][colunas];
        }

        System.out.println("Digite o número de linhas da 1 Matriz: ");
        int linhas = input.nextInt();
        System.out.println("Digite o número de colunas da 1 Matriz: ");
        int colunas = input.nextInt();

        System.out.println("Digite o número de linhas da 2 Matriz: ");
        int linhas2 = input.nextInt();
        System.out.println("Digite o número de colunas da 2 Matriz: ");
        int colunas2 = input.nextInt();


        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas2][colunas2];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        switch(operacao){
            case 1:
                somarMatrizes.somaMatriz(matriz1, matriz2, linhas, colunas);
                break;

            case 2:
                subtrairMatrizes.subtraiMatriz(matriz1, matriz2, linhas, colunas);
                break;

            case 3:
                multiplicarMatrizes.multiplicaMatriz(matriz1, matriz2, linhas, linhas2, colunas, colunas2);
                break;
        }
    }
}