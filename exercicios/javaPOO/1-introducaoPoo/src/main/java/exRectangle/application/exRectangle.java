package exRectangle.application;
import java.util.Scanner;
import exRectangle.entities.Rectangle;

public class exRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();
        double area;
        double perimetro;
        double diagonal;

        System.out.print("Digite a base do retangulo: ");
        retangulo.base = scanner.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        retangulo.altura = scanner.nextDouble();

        area = retangulo.area();
        perimetro = retangulo.perimetro();
        diagonal = retangulo.diagonal();

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);


    }
}
