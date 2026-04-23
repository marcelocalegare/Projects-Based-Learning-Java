/*Crie uma função chamada ehPar.*/
package org.example;
import java.util.Scanner;

public class exFuncao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        boolean resultado = ehPar(numero);
        if (resultado == true){
            System.out.printf("O NUMERO %d É PAR!", numero);
        }
        else {
            System.out.printf("O NUMERO %d É IMPAR!", numero);
        }

        scanner.close();

    }
    public static boolean ehPar(int numero){
        if (numero % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
