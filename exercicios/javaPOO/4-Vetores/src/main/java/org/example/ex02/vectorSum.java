package org.example.ex02;

import java.util.Scanner;

public class vectorSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVector;
        int sumVector = 0;
        int mediaVector = 0;

        System.out.print("Enter vector size: ");
        tamVector = scanner.nextInt();
        int[] numbers = new int[tamVector];

        for (int i = 0; i < tamVector; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        // Sum Vector
        for (int i = 0; i < tamVector; i++) {
            sumVector += numbers[i];
        }

        // Media
        mediaVector = sumVector / tamVector;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("VALUES = ");
        for (int i = 0; i < tamVector; i++) {
            System.out.printf(" %d", numbers[i]);
        }
        System.out.printf("\nSUM: %d", sumVector);
        System.out.printf("\nMEDIA: %d\n", mediaVector);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        scanner.close();

    }
}
