package com.marcelocalegare.heranca.ex01.application;
import com.marcelocalegare.heranca.ex01.entities.Funcionario;
import com.marcelocalegare.heranca.ex01.entities.Gerente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tempNome;
        double tempSalario;

        // Funcionário
        System.out.print("Digite o nome do funcionario: ");
        tempNome = scanner.nextLine();
        System.out.print("Digite o salario do funcionario: ");
        tempSalario = scanner.nextDouble();
        Funcionario funcionario = new Funcionario(tempNome, tempSalario);

        // Gerente
        System.out.print("Digite o nome do Gerente: ");
        scanner.nextLine();
        tempNome = scanner.nextLine();
        System.out.print("Digite o salario do Gerente: ");
        tempSalario = scanner.nextDouble();
        Gerente gerente = new Gerente(tempNome, tempSalario);

        // Visualizar dados
        System.out.println("Funcionario:");
        funcionario.showData();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Gerente:");
        gerente.showData();


    }
}
