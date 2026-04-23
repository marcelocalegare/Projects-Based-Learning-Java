package org.example.CurrencyConverter.entities;

public class CurrencyConverter {
    public static double liquidDollars;

    public static double amountDollar(double dollarPrice, double amountDollar){
        liquidDollars = (amountDollar * dollarPrice);
        liquidDollars = (liquidDollars + (liquidDollars * ((double) 6 /100)));
        return liquidDollars;
    }




}
