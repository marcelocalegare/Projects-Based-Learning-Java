package com.marcelocalegare.heranca.ex01.entities;

public class Usuario {
    private String nome;
    private int cpf;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

}
