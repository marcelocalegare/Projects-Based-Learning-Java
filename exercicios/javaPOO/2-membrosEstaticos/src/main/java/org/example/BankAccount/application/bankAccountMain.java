package org.example.BankAccount.application;
import org.example.BankAccount.entities.BankAccount;

import java.util.Scanner;

public class bankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount();
        double value;

        System.out.print("Enter name: ");
        account1.holderName = scanner.nextLine();
        System.out.print("Enter the amount you wish to deposit: ");
        value = scanner.nextDouble();
        account1.deposit(value);

        System.out.print("PARE DE CODAR FOFO!");

        account1.showData();

        System.out.print("Enter the amount you wish to withdraw: ");
        value = scanner.nextDouble();
        account1.withdraw(value);

        account1.showData();
        System.out.println("Total instances created: " + BankAccount.getCount());


    }
}
