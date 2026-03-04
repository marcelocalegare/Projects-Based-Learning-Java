package org.example.Products.entities;

public class Products {
    public String name;
    public double price;
    static double taxRate = 0.1;

    public double finalPrice(){
        return price = (price * taxRate);
    }

    public double newTax(double newTax){
        return taxRate = newTax;
    }

    public void showProducts(){
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("Name: " + name);
        System.out.println("Price: " + finalPrice());
        System.out.println("-=-=-=-=-=-=-=-");
    }



}


