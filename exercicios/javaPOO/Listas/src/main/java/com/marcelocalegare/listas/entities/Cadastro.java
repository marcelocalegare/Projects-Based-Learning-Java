package com.marcelocalegare.listas.entities;
import java.util.Scanner;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);

    private int id;
    private String name;
    private double salary;
    private int idTemp = 0;

    public Cadastro(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Cadastro(){

    }

    public Cadastro cadastrar(){

        idTemp += 1;
        System.out.printf("ID: %d\n", idTemp);

        System.out.print("Nome: ");
        String nameTemp = scanner.nextLine();

        System.out.print("Salario: ");
        double salaryTemp = scanner.nextDouble();

        System.out.println("Registering...");
        scanner.nextLine();

        return new Cadastro(idTemp, nameTemp, salaryTemp);
    }

    public void mostrarDados(){
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("=-=-=-=-=-=-=-=-=-=");
    }

    public double aumentarSalario(){
        System.out.print("Digite a porcentagem que deseja aumentar: ");
        double tempPorcentagem = scanner.nextDouble();
        this.salary += (getSalary() * (tempPorcentagem / 100));
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
