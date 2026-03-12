package org.example.ex04;
import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamVector;
        int countEvenNumbers = 0;

        System.out.print("Enter vecto size: ");
        tamVector = scanner.nextInt();

        int[] numbers = new int[tamVector];

        for (int i = 0; i < tamVector; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamVector; i++) {
            if (numbers[i] % 2 == 0){
                countEvenNumbers += 1;
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("EVEN NUMBERS: ");
        for (int i = 0; i < tamVector; i++) {
            if (numbers[i] % 2 == 0){
                System.out.printf(" %d", numbers[i]);
            }
        }
        System.out.println();
        System.out.printf("QUANTITY OF EVEN NUMBERS: %d\n", countEvenNumbers);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
