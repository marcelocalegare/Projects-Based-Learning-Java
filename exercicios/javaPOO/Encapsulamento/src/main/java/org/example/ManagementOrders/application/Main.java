package org.example.ManagementOrders.application;
import org.example.ManagementOrders.entities.Client;
import org.example.ManagementOrders.entities.Orders;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Orders> orders = new ArrayList<>();
        int option;

        while (true){
            System.out.println("MENU");
            System.out.println("1 - Register User");
            System.out.println("2 - Register Order");
            System.out.println("0 - Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // buffer clear

            if (option == 0){
                break;
            }

            if (option == 1){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("E-mail: ");
                String email = scanner.nextLine();

                Client client = new Client(name, cpf, email);
                clients.add(client);

                System.out.println("Press enter to return menu...");
                scanner.nextLine(); // buffer clear

            }

            if (option == 2){
                System.out.print("Enter client CPF:");
                String cpfSearch = scanner.nextLine();

                scanner.nextLine(); // buffer clear

                Client clientFound = null;

                for (Client c : clients){
                    clientFound = c;
                    break;
                }
                if (clientFound != null){
                    System.out.print("Order number: ");
                    int number = scanner.nextInt();

                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Value: ");
                    double value = scanner.nextDouble();

                    scanner.nextLine(); // buffer clear
                }
                else {
                    System.out.println("Client not found!");
                }
            }

        }










    }
}
