package org.example.ex03.application;
import org.example.ex03.entities.Client;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVetor;
        double mediumHeight = 0;
        double coutnAge16 = 0;
        double countAge = 0;
        double agePercentage;

        System.out.print("Enter the number of customers: ");
        tamVetor = scanner.nextInt();

        Client[] client = new Client[tamVetor];

        for (int i = 0; i < tamVetor; i++) {

            System.out.printf("Client %d\n", i + 1);
            System.out.print("Enter name: ");
            scanner.nextLine(); // Clear Buffer
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();
            System.out.println("=-=-=-=-=-=-=-=-=");

            client[i] = new Client(name, age, height);
        }

        // Medium Height
        for (int i = 0; i < tamVetor; i++) {
            mediumHeight += client[i].getHeight();
        }
        mediumHeight = mediumHeight/tamVetor;

        // Age Percentage
        for (int i = 0; i < tamVetor; i++) {
            if (client[i].getAge() < 16){
                coutnAge16 += 1;
            }
        }
        for (int i = 0; i < tamVetor; i++) {
            countAge += 1;
        }
        agePercentage = (coutnAge16 / countAge) * 100;



        for (int i = 0; i <tamVetor; i++) {
            System.out.printf("Client %d\n", i+1);
            System.out.printf("Name: %s\n", client[i].getName());
            System.out.printf("Age: %d\n", client[i].getAge());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }

        System.out.printf("Medium Height: %.2f\n", mediumHeight);
        System.out.printf("percentage of ages under 16 years: %.2f ", agePercentage);
        System.out.println("People under the age of 16:");
        for (int i = 0; i < tamVetor; i++) {
            if (client[i].getAge() < 16){
                System.out.printf("%s\n", client[i].getName());
            }
        }

    }

}
