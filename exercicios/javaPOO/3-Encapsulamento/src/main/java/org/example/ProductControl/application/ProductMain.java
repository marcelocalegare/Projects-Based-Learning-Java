package org.example.ProductControl.application;
import org.example.ProductControl.entities.Product;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product;

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        product = new Product(name, price, quantity);

        product.showData();

        System.out.print("Enter the amount you wish to withdraw from inventory: ");
        int amountToRemove = scanner.nextInt();
        product.removeStock(amountToRemove);

        System.out.println("Product Update: ");
        product.showData();

    }
}
