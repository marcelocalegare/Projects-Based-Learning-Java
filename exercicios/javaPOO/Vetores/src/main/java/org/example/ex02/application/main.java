package org.example.ex02.application;
import org.example.ex02.entities.Client;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamVetor;
        System.out.print("Enter the number of customers: ");
        tamVetor = scanner.nextInt();

        Client[] client = new Client[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

        }


    }

}
