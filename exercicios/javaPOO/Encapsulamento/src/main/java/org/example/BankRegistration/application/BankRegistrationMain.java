package org.example.BankRegistration.application;

import org.example.BankRegistration.entities.Account;
import java.util.Scanner;

public class BankRegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coutNumber;
        String name;
        double value;
        String option;

        System.out.print("Enter account number: ");
        coutNumber = scanner.nextInt();

        scanner.nextLine(); // used to clear the buffer

        System.out.print("Enter account holder: ");
        name = scanner.nextLine();

        Account registration;

        System.out.print("Is there an initial deposit (y/n): ");
        option = scanner.nextLine();

        if (option.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            value = scanner.nextDouble();
            registration = new Account(coutNumber, name, value);
        } else {
            registration = new Account(coutNumber, name);
        }

        System.out.println("Account Data:");
        registration.showData();

        System.out.print("Enter a deposit value: ");
        value = scanner.nextDouble();
        registration.deposit(value);

        System.out.println("Update Account:");
        registration.showData();

        System.out.print("Enter a withdraw value: ");
        value = scanner.nextDouble();
        registration.withdraw(value);

        System.out.println("Update Account:");
        registration.showData();

        scanner.close();
    }
}