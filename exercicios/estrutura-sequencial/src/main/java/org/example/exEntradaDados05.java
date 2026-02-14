/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/
package org.example;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exEntradaDados05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoPeca1;
        int codigoPeca2;
        int quantidadePeca1;
        int quantidadePeca2;
        double valorUnitario1;
        double valorUnitario2;
        double valorTotal;

        System.out.print("Digite o numero da peça 1: ");
        codigoPeca1 = scanner.nextInt();
        System.out.print("Digite a quantidade da peça 1: ");
        quantidadePeca1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        valorUnitario1 = scanner.nextDouble();

        //-------------------------------------------------------//

        System.out.print("Digite o numero da peça 2: ");
        codigoPeca2 = scanner.nextInt();
        System.out.print("Digite a quantidade da peça 2: ");
        quantidadePeca2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        valorUnitario2 = scanner.nextDouble();

        valorTotal = (quantidadePeca1 * valorUnitario1) + (quantidadePeca2 * valorUnitario2);

        System.out.println("DADOS COLETADOS:");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("PEÇA 01");
        System.out.printf("CÓDIGO: %d\n", codigoPeca1);
        System.out.printf("QUANTIDADE: %d\n", quantidadePeca1);
        System.out.printf("VALOR UNITÁRIO: %.2f\n", valorUnitario1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("PEÇA 02");
        System.out.printf("CÓDIGO: %d\n", codigoPeca2);
        System.out.printf("QUANTIDADE: %d\n", quantidadePeca2);
        System.out.printf("VALOR UNITÁRIO: %.2f\n", valorUnitario2);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("VALOR A PAGAR: %.2f", valorTotal);
    }
}
