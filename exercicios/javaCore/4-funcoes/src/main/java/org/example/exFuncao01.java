/*Crie um programa que tenha uma função chamada converterCelsiusParaFahrenheit.*/
package org.example;
import java.util.Scanner;

public class exFuncao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = scanner.nextDouble();

        double fahrenheit = conversorTemp(celsius);

        System.out.println("TEMPERATURA CONVERTIDA PARA FAHRENHEIT: " + fahrenheit);

        scanner.close();

    }
    public static double conversorTemp(double celsius){
        return celsius * 1.8 + 32;
    }
}
