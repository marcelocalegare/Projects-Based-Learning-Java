package exRectangle.entities;

public class Rectangle {
    public double altura;
    public double base;

    public double area(){
        return altura*base;
    }

    public double perimetro(){
        return 2 * (altura + base);
    }

    public double diagonal(){
        return Math.sqrt((altura * altura) + (base * base));
    }

}
