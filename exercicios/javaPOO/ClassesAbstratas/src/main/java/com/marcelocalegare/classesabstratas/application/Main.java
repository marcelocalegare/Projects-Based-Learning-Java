package com.marcelocalegare.classesabstratas.application;
import com.marcelocalegare.classesabstratas.entities.Company;
import com.marcelocalegare.classesabstratas.entities.Individual;
import com.marcelocalegare.classesabstratas.entities.TaxPayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TaxPayer> clients = new ArrayList<>();

        int tamList;

        System.out.print("Enter the number of tax payers: ");
        tamList = scanner.nextInt();

        for (int i = 0; i < tamList; i++) {
            System.out.printf("Tax payer #%d data:\n", i + 1);
            System.out.print("Individual or company [i | c]: ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = scanner.nextDouble();

            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();

                clients.add(new Individual(name, anualIncome, healthExpenditures));
            }

            else if (ch == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();

                clients.add(new Company(name, anualIncome, numberOfEmployees));
            }

        }

        System.out.println("TAXES PAID:");
        double totalTax = 0;
        for (TaxPayer client : clients){
            System.out.printf("%s: %.2f\n", client.getName(), client.tax());
            totalTax += client.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f", totalTax);
    }
}
