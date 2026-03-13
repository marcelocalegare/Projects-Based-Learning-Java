package org.example.ex10.application;
import org.example.ex10.entities.approvedClass;
import java.util.Scanner;

public class approvedMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamVetor;

        System.out.print("Digite quantos alunos gostaria de digitar: ");
        tamVetor = scanner.nextInt();

        approvedClass[] client = new approvedClass[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.print("Digite o nome do % aluno: ");
            String name = scanner.nextLine();
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            client[i] = new approvedClass(name, nota1, nota2);

        }



    }
}
