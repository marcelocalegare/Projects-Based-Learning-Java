/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeTentativas;
        double numerador;
        double denominador;
        double resultado;

        System.out.print("Digite quantas tentativas deseja realizar: ");
        quantidadeTentativas = scanner.nextInt();

        for (int i = 0; i < quantidadeTentativas; i++){
            System.out.print("DIGITE O NUMERADOR: ");
            numerador = scanner.nextDouble();

            System.out.print("DIGITE O DENOMINADOR: ");
            denominador = scanner.nextDouble();

            if (denominador == 0){
                System.out.println("DIVISÃO IMPOSSIVEL!");
                System.out.println("=-=-=-=-=-=-=-=-=-=");
            }
            else {
                resultado = numerador / denominador;
                System.out.printf("Resultado: %.1f\n", resultado);
                System.out.println("=-=-=-=-=-=-=-=-=-=");
            }



        }
        scanner.close();
    }
}
