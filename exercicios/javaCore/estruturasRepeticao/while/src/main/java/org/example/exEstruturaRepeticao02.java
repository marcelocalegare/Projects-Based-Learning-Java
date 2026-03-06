/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int y = 1;

        while (true){
            System.out.print("Digite o valor de X: ");
            x = scanner.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = scanner.nextInt();

            // 1° QUADRANTE
            if (x > 0 && y > 0){
                System.out.println("1° QUADRANTE!");
            }

            // 2° QUADRANTE
            else if (x < 0 && y > 0){
                System.out.println("2° QUADRANTE!");
            }

            //3° QUADRANTE
            else if (x < 0 && y < 0){
                System.out.println("3° QUADRANTE!");
            }

            //4° QUADRANTE
            else if (x > 0 && y < 0){
                System.out.println("4° QUADRANTE!");
            }

            else if(x != 0 || y != 0){
                break;
            }

        }
        scanner.close();

    }
}
