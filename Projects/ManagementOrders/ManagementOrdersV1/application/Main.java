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

        do {
            System.out.println("\n========== ORDER MANAGEMENT ==========");
            System.out.println("1 - Register client");
            System.out.println("2 - Register order");
            System.out.println("3 - List clients");
            System.out.println("4 - List orders");
            System.out.println("5 - Search orders by client CPF");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // buffer clear

            switch (option) {
                case 1:
                    System.out.println("\n--- Register Client ---");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();

                    Client client = new Client(name, cpf, email);
                    clients.add(client);
                    System.out.println("Client registered successfully!");
                    client.showClient();
                    break;

                case 2:
                    if (clients.isEmpty()) {
                        System.out.println("No clients registered. Register a client first!");
                        break;
                    }

                    System.out.println("\n--- Register Order ---");
                    System.out.print("Enter client CPF: ");
                    String cpfSearch = scanner.nextLine();

                    Client foundClient = null;
                    for (Client c : clients) {
                        if (c.getCpf().equals(cpfSearch)) {
                            foundClient = c;
                            break;
                        }
                    }

                    if (foundClient == null) {
                        System.out.println("Client not found with CPF: " + cpfSearch);
                        break;
                    }

                    System.out.println("Client found: " + foundClient.getName());

                    System.out.print("Order number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine(); // buffer clear

                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Value: ");
                    double value = scanner.nextDouble();
                    scanner.nextLine(); // buffer clear

                    Orders order = new Orders(number, description, value, foundClient);
                    orders.add(order);
                    System.out.println("Order registered successfully!");
                    order.showOrder();
                    break;

                case 3:
                    System.out.println("\n--- Registered Clients ---");
                    if (clients.isEmpty()) {
                        System.out.println("No clients registered.");
                    } else {
                        for (int i = 0; i < clients.size(); i++) {
                            System.out.println("\nClient #" + (i + 1));
                            clients.get(i).showClient();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Registered Orders ---");
                    if (orders.isEmpty()) {
                        System.out.println("No orders registered.");
                    } else {
                        for (int i = 0; i < orders.size(); i++) {
                            System.out.println("\nOrder #" + (i + 1));
                            orders.get(i).showOrder();
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Search Orders by CPF ---");
                    System.out.print("Enter client CPF: ");
                    String searchCpf = scanner.nextLine();

                    boolean found = false;
                    for (Orders o : orders) {
                        if (o.getClient().getCpf().equals(searchCpf)) {
                            o.showOrder();
                            System.out.println("---");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No orders found for CPF: " + searchCpf);
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }

        } while (option != 0);

        scanner.close();
    }
}
