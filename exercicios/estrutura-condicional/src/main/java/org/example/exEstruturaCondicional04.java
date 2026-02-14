/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

package org.example;
import java.util.Scanner;

public class exEstruturaCondicional04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora1;
        int hora2;
        int tempoDeJogo;

        System.out.print("Digite a hora de inicio do jogo: ");
        hora1 = scanner.nextInt();
        System.out.print("Digite a hora de término do jogo: ");
        hora2 = scanner.nextInt();

        if (hora1 < hora2){
            tempoDeJogo = hora2 - hora1;
        }
        else{
            tempoDeJogo = 24 - hora1 + hora2;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)",tempoDeJogo);

    }
}
