package org.example.ex01;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamVetor;

        System.out.print("Enter the vector size: ");
        tamVetor = scanner.nextInt();

        int[] numbers = new int[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Enter %d° number: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("Negative Numbers: ");

        for (int i = 0; i < tamVetor; i++) {
            if (numbers[i] < 0){
                System.out.printf("%d ", numbers[i]);
            }
        }


    }
}
