/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int opcao;

        while (true){
            System.out.print("1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - EXIT\n\nDIGITE O COMBUSTIVEL ABASTECIDO: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                alcool += 1;
            }

            if (opcao == 2){
                gasolina += 1;
            }

            if (opcao == 3){
                diesel += 1;
            }

            if (opcao == 4){
                System.out.printf("MUITO OBRIGADO!\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
                break;
            }

            if (opcao != 1 && opcao != 2 && opcao != 3){
                System.out.println("Opção Invalida!");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            }
        }
        scanner.close();

    }
}
