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
        double[] media = new double[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Digite o nome do %d aluno: ", i + 1);
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            client[i] = new approvedClass(name, nota1, nota2);

        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

        // Aprovados
        for (int i = 0; i < tamVetor; i++) {
            media[i] = (client[i].getNota1() + client[i].getNota2()) / 2;
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < tamVetor; i++) {
            if (media[i] >= 6){
                System.out.println(client[i].getName());
            }
        }



    }
}
