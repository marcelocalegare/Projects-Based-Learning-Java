/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.printf("FATORIAL DE %d: %d", numero, fatorial);

        scanner.close();
    }
}
