/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2000*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 0;
        while (true){
            System.out.print("Digite sua senha: ");
            pin = scanner.nextInt();
            if (pin != 2000){
                System.out.println("Senha Incorreta!");
            }
            else if (pin == 2000){
                System.out.println("Senha Correta!");
                break;
            }

        }


        scanner.close();

    }

}
