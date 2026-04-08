package com.marcelocalegare.enums.entities;
import com.marcelocalegare.enums.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for (OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    public void showOrder(){

    }

}
