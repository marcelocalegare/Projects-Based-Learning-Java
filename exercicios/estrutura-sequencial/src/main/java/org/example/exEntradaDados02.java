/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/
package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class exEntradaDados02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio;
        double pi = 3.14159;
        double area;

        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        area = pi*(raio*2);

        System.out.println("AREA DO CIRCULO");
        System.out.printf("ENTRADA: %.2f | SAIDA: %.4f",raio, area);

    }

}
