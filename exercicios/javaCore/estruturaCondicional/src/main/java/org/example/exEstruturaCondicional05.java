/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

package org.example;
import java.util.Scanner;

public class exEstruturaCondicional05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int quantidade;
        double valorTotal = 0;

        System.out.print("""
                MENU\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n1- Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada Simples\n5 - Refrigerante\n\nEscolha uma opção: """);
        opcao = scanner.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Digite a quantidade desse produto: ");
        quantidade = scanner.nextInt();

        if (opcao == 1){
            valorTotal = quantidade * 4;
        }
        else if (opcao == 2){
            valorTotal = quantidade * 4.5;
        }
        else if (opcao == 3) {
            valorTotal = quantidade * 5;
        }
        else if (opcao == 4){
            valorTotal = quantidade * 2;
        }
        else if (opcao == 5){
            valorTotal = quantidade * 1.5;
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("O VALOR TOTAL FICOU: %.2f", valorTotal);


    }
}
