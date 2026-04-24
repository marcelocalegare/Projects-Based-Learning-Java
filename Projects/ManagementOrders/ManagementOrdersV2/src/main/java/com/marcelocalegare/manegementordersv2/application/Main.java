package com.marcelocalegare.manegementordersv2.application;
import com.marcelocalegare.manegementordersv2.entities.Client;
import com.marcelocalegare.manegementordersv2.entities.Orders;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Orders> orders = new ArrayList<>();

        int tamListClients;
        int tamListOrders;
        Client tempClient;

        System.out.print("Enter how many clients you wish to register: ");
        tamListClients = scanner.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < tamListClients; i++) {
            clients.add(new Client().registerClient(i));
        }

        System.out.print("Enter CPF client: ");
        scanner.nextLine();
        String tempCpf = scanner.nextLine();

        for (Client client : clients){
            if (Objects.equals(tempCpf, client.getCpf())){
                tempClient = client;
                System.out.printf("Hi %s, please enter your order:\n", client.getName());
                orders.add(new Orders().registerOrder(tempClient));
            }
        }

        System.out.print("Enter your CPF to search for the order: ");
        String tempCpf2 = scanner.nextLine();

        for (Orders order : orders){
            if (Objects.equals(tempCpf2, order.getClient().getCpf())){
                order.showOrder();
            }
        }


    }
}
