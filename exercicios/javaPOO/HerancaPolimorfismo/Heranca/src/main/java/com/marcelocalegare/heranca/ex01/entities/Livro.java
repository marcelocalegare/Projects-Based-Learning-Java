package com.marcelocalegare.heranca.ex01.entities;

public class Livro {
    private String autor;
    private int codigo;
    private boolean status;

    public Livro() {
    }

    public Livro(String autor, int codigo, boolean status) {
        this.autor = autor;
        this.codigo = codigo;
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
