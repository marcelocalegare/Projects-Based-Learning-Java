package org.example.ManagementOrders.application;
import org.example.ManagementOrders.entities.Client;
import org.example.ManagementOrders.entities.Orders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client;
        Orders orders;

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Enter e-mail: ");
        String email = scanner.nextLine();

        client = new Client(name, cpf, email);
        client.showClient();

        System.out.println("Enter your CPF: ");


    }
}
