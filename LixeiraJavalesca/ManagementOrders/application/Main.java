package org.example.ManagementOrders.application;
import org.example.ManagementOrders.entities.Client;
import org.example.ManagementOrders.entities.Orders;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Client client = new Client(name, cpf, email);
        client.showClient();

        System.out.print("Enter client CPF:");
        String cpfSearch = scanner.nextLine();

        System.out.print("Order number: ");
        int number = scanner.nextInt();

        scanner.nextLine(); // buffer clear

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Value: ");
        double value = scanner.nextDouble();

        Orders orders = new Orders(number, description, value, client);
        orders.showOrder();



    }
}
