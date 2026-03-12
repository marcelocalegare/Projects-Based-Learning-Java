package org.example.ex06;

import java.util.Scanner;

public class sumVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVector;

        System.out.print("Enter vector size: ");
        tamVector = scanner.nextInt();

        int[] numbers1 = new int[tamVector];
        int[] numbers2 = new int[tamVector];
        int[] result = new int[tamVector];

        System.out.println("Enter numbers of vector 1: ");
        for (int i = 0; i < tamVector; i++) {
            System.out.printf("Number %d: ", i + 1);
            numbers1[i] = scanner.nextInt();
        }

        System.out.println("Enter numbers of vector 2: ");
        for (int i = 0; i < tamVector; i++) {
            System.out.printf("Number %d: ", i + 1);
            numbers2[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamVector; i++) {
            result[i] = numbers1[i] + numbers2[i];
        }

        System.out.println("RESULT: ");
        for (int i = 0; i < tamVector; i++) {
            System.out.printf("POSITION %d = %d\n", i, result[i]);
        }

    }
}
