/*Crie uma função chamada calcularMedia.
 */
package org.example;
import java.util.Scanner;

public class exFuncao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3;

        System.out.print("Digite a nota 1: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        n3 = scanner.nextDouble();

        double media = calcularMedia(n1, n2, n3);

        System.out.printf("A MEDIA DO ALUNO É: %.2f", media);

        scanner.close();

    }

    public static double calcularMedia(double n1, double n2, double n3){
        double media;
        return media = (n1 + n2 + n3) / 3;
    }

}
