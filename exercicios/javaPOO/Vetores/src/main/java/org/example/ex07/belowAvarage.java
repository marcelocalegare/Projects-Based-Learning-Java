package org.example.ex07;

import java.util.Scanner;

public class belowAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVetor;
        double mediaVetor = 0;

        System.out.print("Digite o tamanho do vetor: ");
        tamVetor = scanner.nextInt();

        double[] numeros = new double[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Digite o numero %d: ", i + 1);
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < tamVetor; i++) {
            mediaVetor += numeros[i];
        }
        mediaVetor = mediaVetor / tamVetor;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("Media do vetor: %.2f\n", mediaVetor);
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < tamVetor; i++) {
            if (numeros[i] < mediaVetor){
                System.out.println(numeros[i]);
            }
        }


    }
}
