package com.marcelocalegare.polimorfismo.entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product{

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        String dateFormater = manufactureDate.format(format);
        return dateFormater;
    }

    @Override
    public final String priceTag(){

        return getName() + " (used) " + " $" + getPrice() + " (Manufacture date: " + getManufactureDate() + ")";
    }

}
