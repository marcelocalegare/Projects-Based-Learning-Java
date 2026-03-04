package org.example.BankRegistration.entities;

public class Account {
    private int coutNumber;
    private String name;
    private double balance = 0;

    public Account(int coutNumber, String name) {
        this.coutNumber = coutNumber;
        this.name = name;
    }

    public Account(int coutNumber, String name, double initialValue) {
        this.coutNumber = coutNumber;
        this.name = name;
        deposit(initialValue);
    }

    public double deposit(double value) {
        return this.balance += value;
    }

    public double withdraw(double value){
        if (value <= this.balance){
            return this.balance -= (value + 5);
        }
        else {
            System.out.println("No Balance!");
        }
        return 0.0;
    }

    public void showData() {
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("Account: " + this.coutNumber);
        System.out.println("Holder: " + this.name);
        System.out.println("Balance: " + this.balance);
        System.out.println("=-=-=-=-=-=-=-=-=-=");
    }
}