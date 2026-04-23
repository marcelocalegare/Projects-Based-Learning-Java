/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação*/
package org.example;
import java.util.Scanner;

public class exEstruturaCondicional07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;

        System.out.print("Digite o valor de X: ");
        x = scanner.nextDouble();
        System.out.print("Digite o valor de Y: ");
        y = scanner.nextDouble();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

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

        //ORIGEM
        else{
            System.out.println("ORIGEM!");
        }

    }
}
