/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
package org.example;
import java.util.Scanner;

public class exEstruturaRepeticao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int N2;
        int in = 0;
        int out = 0;

        System.out.print("Digite um numero inteiro: ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.printf("Digite o numero %d: ", i+1);
            N2 = scanner.nextInt();

            if (N2 >= 10 && N2 <= 20){
                in += 1;
            }
            else{
                out += 1;
            }

        }

        System.out.printf("QUANTIDADE DE NUMEROS DIGITADOS: %d\n", N);
        System.out.printf("NUMEROS DENTRO DO INTERVALO [10 : 20]: %d\n", in);
        System.out.printf("NUMEROS FORA DO INTERVALO [10 : 20]: %d", out);


        scanner.close();
    }
}
