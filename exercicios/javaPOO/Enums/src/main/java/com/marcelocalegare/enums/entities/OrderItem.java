package com.marcelocalegare.enums.entities;

public class OrderItem {
    private int quantidade;
    private double preco;
    private Product product;

    public OrderItem(int quantidade, double preco, Product product) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.product = product;
    }

    public double subTotal(){
        return preco * quantidade;
    }

}
