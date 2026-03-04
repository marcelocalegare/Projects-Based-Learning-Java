package org.example.ManagementOrders.entities;

public class Orders {
    private int numberOrder;
    private String descripition;
    private double value;
    private Client client;

    public Orders(int numberOrder, String descripition, double value, Client client) {
        this.numberOrder = numberOrder;
        this.descripition = descripition;
        this.value = value;
        this.client = client;
    }

    public void showOrder(){
        System.out.println("Client: " + this.client);
        System.out.println("Number Order: " + this.numberOrder);
        System.out.println("Descripition: " + this.descripition);
        System.out.println("Value: " + this.value);
    }

}
