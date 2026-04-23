package com.marcelocalegare.polimorfismo.application;
import com.marcelocalegare.polimorfismo.entities.ImportedProduct;
import com.marcelocalegare.polimorfismo.entities.Product;
import com.marcelocalegare.polimorfismo.entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int tamVetor;

        System.out.print("Enter how many products you wish to register: ");
        tamVetor = scanner.nextInt();
        ArrayList<Product> products = new ArrayList<>(tamVetor);

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Product #%d data\n", i + 1);
            System.out.print("Common, Used or Imported (c/u/i): ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (ch == 'c') {
                products.add(new Product(name, price));
            }

            if (ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }

            if (ch == 'u'){
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                products.add(new UsedProduct(name, price, date));

            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=");
        for (Product product : products){
            System.out.println(product.priceTag());
            System.out.println("=-=-=-=-=-=-=-=-=");
        }

    }

}
