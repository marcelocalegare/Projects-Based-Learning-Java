package org.example.exPensionato.application;
import org.example.exPensionato.entities.pensionatoClass;
import java.util.Scanner;

public class pensionatoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pensionatoClass[] quartos = new pensionatoClass[10];
        int escolhaQuarto;
        int tamVetor;

        System.out.print("Digite quantos alunos deseja cadastrar de 1 a 10: ");
        tamVetor = scanner.nextInt();

        pensionatoClass[] aluno = new pensionatoClass[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Registro %d\n", i + 1);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Quarto: ");
            escolhaQuarto = scanner.nextInt();

            aluno[i] = new pensionatoClass(nome, email);
            quartos[escolhaQuarto] = aluno[i];

        }


        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                System.out.printf("Quarto %d:\n", i);
                System.out.println("Nome: " + quartos[i].getNome());
                System.out.println("Email: " + quartos[i].getEmail());
                System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            }
        }


    }
}
