/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

package org.example;
import java.util.Scanner;

public class exEstruturaCondicional03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int resultado;

        System.out.print("Digite o valor A: ");
        A = scanner.nextInt();
        System.out.print("Digite o valor B: ");
        B = scanner.nextInt();

        resultado = A / B;

        System.out.println(resultado);

        if (resultado == 0){
            System.out.println("São Multiplos!");
        }
        else{
            System.out.println("Não são Multiplos!");
        }

    }
}
