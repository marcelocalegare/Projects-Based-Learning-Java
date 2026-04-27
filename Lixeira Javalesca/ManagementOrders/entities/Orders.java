package org.example.ManagementOrders.entities;

public class Orders {
    private int orderNumber;
    private String description;
    private double value;
    private Client client;

    public Orders(int orderNumber, String description, double value, Client client) {
        this.orderNumber = orderNumber;
        this.description = description;
        this.value = value;
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Client getClient() {
        return client;
    }

    public void showOrder() {
        System.out.println("Order number: " + this.orderNumber);
        System.out.println("Description: " + this.description);
        System.out.println("Value: R$ " + String.format("%.2f", this.value));
        System.out.println("Client: " + client.getName() + " (CPF: " + client.getCpf() + ")");
    }
}
