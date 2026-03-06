/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
package org.example;
import java.util.Scanner;

public class exEntradaDados01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;
        int resultado;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();

        resultado = valor1 + valor2;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("Valor 1: %d\n", valor1);
        System.out.printf("Valor 2: %d\n", valor2);
        System.out.printf("Resultado: %d", resultado);

    }

}
