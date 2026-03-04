package org.example.BankRegistration.application;
import org.example.BankRegistration.entities.BankRegistration;

import java.util.Scanner;

public class BankRegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coutNumber;
        String name;
        double balance;
        String option;

        System.out.println("Enter account number: ");
        coutNumber = scanner.nextInt();
        System.out.println("Enter account holder: ");
        name = scanner.nextLine();
        System.out.println("Is there na initial deposit (y/s): ");
        option = scanner.nextLine();
        if (option == "y" || option == "Y"){
            System.out.println("Enter initial deposit value: ");
            balance = scanner.nextDouble();

            BankRegistration registration = new BankRegistration(coutNumber, name, balance);
        }
        else if (option == "n" || option == "N"){
            BankRegistration registration = new BankRegistration(coutNumber, name);
        }










    }
}
