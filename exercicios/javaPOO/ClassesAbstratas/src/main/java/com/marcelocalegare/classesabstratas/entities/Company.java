package com.marcelocalegare.classesabstratas.entities;

public final class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public final double tax() {
        if (numberOfEmployees > 10){
            return getAnualIncome() * 0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
