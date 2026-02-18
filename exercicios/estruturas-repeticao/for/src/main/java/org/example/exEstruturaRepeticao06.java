/*Ler um número inteiro N e calcular todos os seus divisores*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0){
                System.out.println(i);
            }
        }
        scanner.close();

    }
}
