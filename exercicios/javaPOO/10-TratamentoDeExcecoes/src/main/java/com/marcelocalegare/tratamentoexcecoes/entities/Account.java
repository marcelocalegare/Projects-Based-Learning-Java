package com.marcelocalegare.tratamentoexcecoes.entities;
import com.marcelocalegare.tratamentoexcecoes.exceptions.WhithdrawException;

import java.util.Scanner;

public class Account {

    Scanner scanner = new Scanner(System.in);

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Account registerAccount(){
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdraw = scanner.nextDouble();

        return new Account(number, holder, balance, withdraw);
    }

    public double deposit(){
        System.out.print("Enter amount for deposit: ");
        double deposit = scanner.nextDouble();
        return this.balance += deposit;
    }

    public double withdraw() throws WhithdrawException {
            System.out.print("Enter amount for withdraw: ");
            double withdraw = scanner.nextDouble();
            if (withdraw > getWithdrawLimit()){
                throw new WhithdrawException("The amount exceeds whithdraw limit");
            }
            if (withdraw > getBalance()){
                throw new WhithdrawException("Not enough balance");
            }
            return this.balance -= withdraw;
    }


}
