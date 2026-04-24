package com.marcelocalegare.manegementordersv2.entities;
import java.util.Scanner;

public class Orders{

    Scanner scanner = new Scanner(System.in);

    private int orderNumber;
    private String description;
    private double value;
    private Client client;

    public Orders() {
    }

    public Orders(int orderNumber, String description, double value, Client client) {
        this.orderNumber = orderNumber;
        this.description = description;
        this.value = value;
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public Client getClient() {
        return client;
    }

    public Orders registerOrder(Client tempClient){
        System.out.print("Order number: ");
        int orderNumber = scanner.nextInt();
        System.out.print("Description: ");
        scanner.nextLine();
        String description = scanner.nextLine();
        System.out.print("Value: ");
        double value = scanner.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=");

        return new Orders(orderNumber, description, value, tempClient);
    }

    public void showOrder(){
        System.out.println("Client: " + client.getName());
        System.out.println("Order number: " + getOrderNumber());
        System.out.println("Description: " + getDescription());
        System.out.println("Value: " + getValue());
        System.out.println("=-=-=-=-=-=-=-=-=");
    }



}
