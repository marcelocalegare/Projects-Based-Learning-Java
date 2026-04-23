/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
package org.example;
import java.util.Scanner;

public class exEntradaDados06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double[] numeros = new double[3];
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o numero %d: ", i+1);
            numeros[i] = scanner.nextDouble();
        }

        areaTriangulo = (numeros[0]*numeros[2])/2;
        areaCirculo = (numeros[2] * numeros[2]) * 3.14159;
        areaTrapezio = ((numeros[0] + numeros[1]) * numeros[2]) / 2;
        areaQuadrado = (numeros[1] * numeros[1]);
        areaRetangulo = (numeros[0] * numeros[1]);

        System.out.println("AREAS CALCULADAS");
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("TRIANGULO: %f\n", areaTriangulo);
        System.out.printf("CIRCULO: %f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %f\n", areaTrapezio);
        System.out.printf("QUADRADO: %f\n", areaQuadrado);
        System.out.printf("RETANGULO: %f\n", areaRetangulo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-");

    }
}
