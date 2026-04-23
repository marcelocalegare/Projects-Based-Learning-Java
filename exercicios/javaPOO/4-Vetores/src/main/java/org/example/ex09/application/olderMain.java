/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

package org.example.ex09.application;
import org.example.ex03.entities.Client;
import org.example.ex09.entities.olderClass;

import java.util.Scanner;

public class olderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVetor;
        int maiorIdade;
        int indexNome = 0;

        System.out.print("Digite quantas pessoas deseja cadastrar: ");
        tamVetor = scanner.nextInt();

        olderClass[] client = new olderClass[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i + 1);
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.printf("Digite a idade da pessoa %d: ", i + 1);
            int age = scanner.nextInt();

            client[i] = new olderClass(name, age);
        }

        maiorIdade = client[0].getAge();
        for (int i = 0; i < tamVetor; i++) {
            if (client[i].getAge() > maiorIdade){
                maiorIdade = client[i].getAge();
                indexNome = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", client[indexNome].getName());

    }
}
