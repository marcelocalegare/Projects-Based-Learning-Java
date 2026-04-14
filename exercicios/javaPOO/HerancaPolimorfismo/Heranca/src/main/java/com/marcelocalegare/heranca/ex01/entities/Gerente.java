package com.marcelocalegare.heranca.ex01.entities;

public class Gerente extends Funcionario {

    private double aumento;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public final double calcularSalario(){
        return super.calcularSalario() + 500;
    }

    @Override
    public final void showData(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + calcularSalario());
    }

}
