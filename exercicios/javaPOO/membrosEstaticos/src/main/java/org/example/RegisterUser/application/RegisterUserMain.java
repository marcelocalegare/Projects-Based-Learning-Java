package org.example.RegisterUser.application;
import org.example.RegisterUser.entities.RegisterUser;

import java.util.Scanner;

public class RegisterUserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegisterUser user1 = new RegisterUser();
        RegisterUser user2 = new RegisterUser();

        System.out.print("Enter name: ");
        user1.name = scanner.nextLine();
        System.out.print("Enter age: ");
        user1.age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter name: ");
        user2.name = scanner.nextLine();
        System.out.print("Enter age: ");
        user2.age = scanner.nextInt();

        user1.showData();
        user2.showData();
        System.out.println("Total instances created: " + RegisterUser.getCount());




    }
}
