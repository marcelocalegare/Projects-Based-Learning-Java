package org.example.ex08;
import java.util.Scanner;

public class evenAvarages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVetor;
        double mediaVetor = 0;
        double result = 0;
        int contadorPar = 0;
        boolean confirmaPar = false;

        System.out.print("Digite o tamanho do vetor: ");
        tamVetor = scanner.nextInt();

        double[] numeros = new double[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < tamVetor; i++) {
           if (numeros[i] % 2 == 0){
                confirmaPar = true;
           }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

        if (!confirmaPar){
            System.out.println("NENHUM NUMERO É PAR!");
        }
        else{
            for (int i = 0; i < tamVetor; i++) {
                if (numeros[i] % 2 == 0){
                    mediaVetor += numeros[i];
                    contadorPar += 1;
                }
            }
            result = mediaVetor / contadorPar;

            System.out.printf("MEDIA DOS PARES: %.2f", result);
        }








    }
}
