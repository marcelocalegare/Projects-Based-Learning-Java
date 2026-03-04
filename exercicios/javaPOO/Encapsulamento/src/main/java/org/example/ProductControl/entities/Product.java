package org.example.ProductControl.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        if (price > 0){
            this.price = price;
        }
        else {
            System.out.println("Invalid Price.");
        }

        if (quantity >= 0){
            this.quantity = quantity;
        }
        else{
            System.out.println("Invalid Quantity.");
        }
    }

    public void addStock(int quantity){
       if (quantity > 0){
           this.quantity += quantity;
       }
       else{
           System.out.println("Invalid quantity!");
       }
    }

    public void removeStock(int quantity){
        if (quantity <= 0){
            System.out.println("Invalid quantity!");
        }
        else if (quantity > this.quantity){
            System.out.println("Insufficient Stock!");
        }
        else{
            this.quantity -= quantity;
        }
    }

    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void showData(){
        System.out.println("Product: " + this.name);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Value per unit: " + this.price);
        System.out.println("Value in Stock: " + totalValueInStock());
    }

}
