package org.example.ProductControl.entities;

public class Product {
    private String name;
    private double price;
    private double totalPrice;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        addStock(quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String addStock(int quantity){
        if (quantity < 0){
            return "Error, the value entered is less than 0. ";
        }
        else{
            this.quantity = quantity;
            this.totalPrice +=  this.price * this.quantity;
        }
        return null;
    }

    public String removeStock(int quantity){
        if (quantity <= this.quantity){
            this.quantity -= quantity;
        }
        return null;
    }

    public void showData(){
        System.out.println("Product: " + this.name);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Value per unit: " + this.price);
        System.out.println("Value in Stock: " + this.totalPrice);
    }

}
