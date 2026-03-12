package org.example.ex08;
import java.util.Scanner;

public class evenAvarages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVetor;
        double mediaVetor = 0;

        System.out.print("Digite o tamanho do vetor: ");
        tamVetor = scanner.nextInt();

        double[] numeros = new double[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < tamVetor; i++) {
           if (numeros[i] % 2 == 0){
               mediaVetor += numeros[i];
           }
           else if(numeros[i] % 2 != 0){
               System.out.println("NENHUM PAR!");
           }
        }
        mediaVetor = mediaVetor / tamVetor;
        System.out.println("MEDIA DOS PARES: " + mediaVetor);





    }
}
