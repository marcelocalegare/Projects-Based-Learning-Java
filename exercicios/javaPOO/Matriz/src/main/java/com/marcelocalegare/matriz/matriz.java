package com.marcelocalegare.matriz;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.print("Digite o valor de X: ");
        x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        y = scanner.nextInt();

        int[][] matriz = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("=-=-=-=-=-=");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=");

        System.out.print("Digite um numero que exista dentro da matriz: ");
        int temNum = scanner.nextInt();

        // Encontra a posição do numero
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (temNum == matriz[i][j]){
                    System.out.printf("Posição: [%d][%d]\n", i, j);
                    if (j > 0){
                        System.out.printf("Numero a esquerda: %d\n", matriz[i][j-1]);
                    }
                    if (i > 0){
                        System.out.printf("Numero acima: %d\n", matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1){
                        System.out.printf("Numero a direita: %d\n", matriz[i][j+1]);
                    }
                    if (i < matriz.length-1){
                        System.out.printf("Numero abaixo: %d\n", matriz[i+1][j]);
                    }
                }
            }
        }

    }
}
