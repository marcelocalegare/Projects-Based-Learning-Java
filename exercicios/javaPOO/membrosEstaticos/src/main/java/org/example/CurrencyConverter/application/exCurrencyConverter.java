package org.example.CurrencyConverter.application;
import org.example.CurrencyConverter.entities.CurrencyConverter;

import java.util.Scanner;

public class exCurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollarPrice;
        double amountDollars;

        System.out.print("What is the dollar price? ");
        dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        amountDollars = scanner.nextDouble();

        System.out.printf("Dollar Price: %.2f\n", dollarPrice);
        System.out.printf("Amount Dollar: %.2f\n", amountDollars);
        System.out.printf("Dollars in Reais: %.2f", CurrencyConverter.amountDollar(dollarPrice, amountDollars));





    }
}
