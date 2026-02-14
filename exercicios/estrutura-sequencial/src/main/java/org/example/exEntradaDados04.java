/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
package org.example;
import java.util.Scanner;

public class exEntradaDados04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroFuncionario;
        int horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.print("Digite o numero do Funcionario: ");
        numeroFuncionario = scanner.nextInt();
        System.out.print("Digite as horas trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o salário hora do Funcionario: ");
        valorHora = scanner.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("DADOS DO FUNCIONARIO\n");
        System.out.printf("NUMERO: %d\n", numeroFuncionario);
        System.out.printf("SALÁRIO: %.2f", salario);

    }
}
