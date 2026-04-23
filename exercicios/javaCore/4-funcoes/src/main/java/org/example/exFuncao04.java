/*Crie uma função chamada contarVogais.*/
package org.example;
import java.util.Scanner;

public class exFuncao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        int total = contarVogais(palavra);

        System.out.printf("A PALAVRA POSSUI %d VOGAIS!", total);
    }
    public static int contarVogais(String palavra){
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i); // Pega o caractere na posição i

            // Verifica se o caractere é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;

    }
}
