package org.example.ManagementOrders.entities;

public class Orders {
    private int orderNumber;
    private String description;
    private double value;
    private Client client;

    public Orders(int numberOrder, String description, double value, Client client) {
        this.orderNumber = numberOrder;
        this.description = description;
        this.value = value;
        this.client = client;
    }

    public void showOrder(){
        System.out.println("Client: " + client.getCpf());
        System.out.println("Order number: " + this.orderNumber);
        System.out.println("Descripition: " + this.description);
        System.out.println("Value: " + this.value);
    }

}
