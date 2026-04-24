package com.marcelocalegare.manegementordersv2.entities;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    Scanner scanner = new Scanner(System.in);

    private int idClient;
    private String name;
    private String cpf;
    private String email;

    public Client() {
    }

    public Client(int idClient, String name, String cpf, String email) {
        this.idClient = idClient;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public int getId() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Client registerClient(int idClient){
        System.out.printf("Client #%d\n", idClient + 1);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.println("=-=-=-=-=-=-=-=-=");

        return new Client(idClient + 1, name, cpf, email);
    }

    public void showClient(){
        System.out.println(getId());
        System.out.println("Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("E-mail: " + getEmail());
        System.out.println("=-=-=-=-=-=-=-=-=");
    }

}
