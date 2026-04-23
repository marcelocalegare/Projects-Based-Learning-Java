package org.example.ex11.entities;

public class peopleDataClass {
    private double altura;
    private String genero;

    public peopleDataClass(double altura, String genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public String getGenero() {
        return genero;
    }
}
