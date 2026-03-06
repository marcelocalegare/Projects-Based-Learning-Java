/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

package org.example;
import java.util.Scanner;

public class exEstruturaCondicional02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero inteiro: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("É PAR!");
        }
        else{
            System.out.println("É IMPAR!");
        }
    }
}
