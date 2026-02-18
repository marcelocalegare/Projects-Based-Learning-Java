/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int quadrado;
        int cubo;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            quadrado = i * i;
            cubo = i * i * i;

            System.out.printf("%d %d %d\n", i, quadrado, cubo);

        }

    }
}
