package org.example.ex05;
import java.util.Scanner;

public class highestPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamVector;
        int highestValue = 0;
        int highestValuePosition = 0;

        System.out.print("Enter vector size: ");
        tamVector = scanner.nextInt();

        int[] numbers = new int[tamVector];

        for (int i = 0; i < tamVector; i++) {
            System.out.printf("Enter a number %d: ", i + 1);
            numbers[i] = scanner.nextInt();

        }

        highestValue = numbers[0];
        for (int i = 0; i < tamVector; i++) {
            if (highestValue < numbers[i]){
                highestValue = numbers[i];
                highestValuePosition = i;
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("Highest Value: %d\n", highestValue);
        System.out.printf("Highest Value Position: %d\n", highestValuePosition);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


    }
}
