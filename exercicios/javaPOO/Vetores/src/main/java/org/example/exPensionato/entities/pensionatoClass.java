package org.example.exPensionato.entities;

public class pensionatoClass {
    private String nome;
    private String email;

    public pensionatoClass(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
