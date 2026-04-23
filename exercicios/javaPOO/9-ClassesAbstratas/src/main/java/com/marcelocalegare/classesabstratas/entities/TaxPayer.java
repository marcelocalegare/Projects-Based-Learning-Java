package com.marcelocalegare.classesabstratas.entities;

public abstract class TaxPayer {

    private String name;
    private double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public abstract double tax();

}
