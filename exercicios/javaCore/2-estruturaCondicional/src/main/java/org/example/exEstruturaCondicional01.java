/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

package org.example;
import java.util.Scanner;

public class exEstruturaCondicional01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero negativo ou positivo: ");
        numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO!");
        }
        else{
            System.out.println("POSITIVO!");
        }

    }
}
