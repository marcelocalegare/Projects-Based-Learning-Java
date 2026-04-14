package com.marcelocalegare.heranca.ex01.entities;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario(){
        return salario += salario * 0.10;
    }

    public void showData(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + calcularSalario());
    }

}
