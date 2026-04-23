package com.marcelocalegare.polimorfismo.entities;

public final class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    @Override
    public final String priceTag(){
        return getName() + " $" + totalPrice() + " (Customs fee: $" + getCustomsFee() + ")";
    }

    public double totalPrice(){
        return getPrice() + getCustomsFee();
    }


}
