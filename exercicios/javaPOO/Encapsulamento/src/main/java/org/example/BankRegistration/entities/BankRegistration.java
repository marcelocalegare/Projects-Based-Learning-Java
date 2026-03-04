package org.example.BankRegistration.entities;

public class BankRegistration {
    private int coutNumber;
    private String name;
    private double balance;

    public BankRegistration(int coutNumber, String name){
        this.coutNumber = coutNumber;
        this.name = name;
    }

    public BankRegistration(int coutNumber, String name, double balance){
        this.coutNumber = coutNumber;
        this.name = name;
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    public double deposit(double balance){
        return this.balance + balance;
    }

    public double withdraw(double balace){
        return (this.balance - balance) - 5;
    }

    public void showData(){
        System.out.println("Account: " + this.coutNumber);
        System.out.println("Holder: " + this.name);
        System.out.println("Balance: " + this.balance);
    }



}
