package org.example.ex01;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamVector;

        System.out.print("Enter the vector size: ");
        tamVector = scanner.nextInt();

        int[] numbers = new int[tamVector];

        for (int i = 0; i < tamVector; i++) {
            System.out.printf("Enter %d° number: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("Negative Numbers: ");

        for (int i = 0; i < tamVector; i++) {
            if (numbers[i] < 0){
                System.out.printf("%d ", numbers[i]);
            }
        }

        scanner.close();

    }
}
