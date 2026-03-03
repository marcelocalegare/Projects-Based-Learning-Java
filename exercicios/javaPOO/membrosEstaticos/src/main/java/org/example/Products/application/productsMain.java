package org.example.Products.application;
import org.example.Products.entities.Products;

import java.util.Scanner;

public class productsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products product1 = new Products();
        double newTax;

        System.out.print("Name: ");
        product1.name = scanner.nextLine();
        System.out.print("Price: ");
        product1.price = scanner.nextDouble();

        product1.showProducts();

        System.out.print("Enter new tax: ");
        newTax = scanner.nextDouble();

        product1.newTax(newTax);

        product1.showProducts();

    }
}
