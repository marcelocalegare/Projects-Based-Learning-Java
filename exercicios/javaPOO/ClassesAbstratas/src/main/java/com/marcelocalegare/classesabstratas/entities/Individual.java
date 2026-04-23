package com.marcelocalegare.classesabstratas.entities;

public final class Individual extends TaxPayer{

    private double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public final double tax() {
        if (getAnualIncome() <= 20000){
            return getAnualIncome() + getAnualIncome() * 0.15;
            if (getHealthExpenditures() > 1){
                return getAnualIncome() - (getHealthExpenditures() / 2);
            }
        }
        else if (getAnualIncome() >= 20000){
            return getAnualIncome() + getAnualIncome() * 0.25;
            if (getHealthExpenditures() > 1){
                return getAnualIncome() - (getHealthExpenditures() * 0.50);
            }
        }
    }
}
