package org.example.BankAccount.entities;

public class BankAccount {
    public String holderName;
    public double balance = 0;
    static int totalAccounts = 0;
    private static int counterInstances = 0;

    public BankAccount() {
        counterInstances++;
    }

    public static int getCount(){
        return counterInstances;
    }

    public double deposit(double value){
        return balance += value;
    }

    public double withdraw(double value){
        if (value <= balance){
            return balance -= value;
        }
        else {
            System.out.println("No Balance!");
        }
        return 0.0;
    }

    public void showData(){
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("-=-=-=-=-=-=-=-");

    }


}
