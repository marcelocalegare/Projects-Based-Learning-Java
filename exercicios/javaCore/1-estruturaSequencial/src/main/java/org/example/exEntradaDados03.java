/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
package org.example;
import java.util.Scanner;

public class exEntradaDados03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[4];
        int v1;
        int v2;
        int diferenca;

        for (int i = 0; i < 4; i++){
            System.out.printf("Digite o numero %d: ", i+1);
            numeros[i] = scanner.nextInt();
        }

        v1 = numeros[0]*numeros[1];
        v2 = numeros[2]*numeros[3];
        diferenca = v1 - v2;

        System.out.println("NUMEROS E SUAS DIFERENÇAS:");
        for (int i = 0; i < 4; i++){
            System.out.printf("Numero %d: %d | ",i+1,numeros[i]);
        }
        System.out.println("\nDiferença: " + diferenca);

    }
}
