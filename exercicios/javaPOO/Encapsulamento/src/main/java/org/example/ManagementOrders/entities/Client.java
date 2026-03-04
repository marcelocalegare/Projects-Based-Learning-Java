package org.example.ManagementOrders.entities;

public class Client {
    private String name;
    private String cpf;
    private String email;

    public Client(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public void showClient(){
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
    }

}
