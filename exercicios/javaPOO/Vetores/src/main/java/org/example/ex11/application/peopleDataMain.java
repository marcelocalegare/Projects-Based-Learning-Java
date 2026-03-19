package org.example.ex11.application;
import org.example.ex11.entities.peopleDataClass;
import java.util.Scanner;

public class peopleDataMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamVetor;
        double maiorAltura;
        double menorAltura;
        double mediaAlturaMulheres = 0;
        int contMulheres = 0;
        int contHomens;

        System.out.print("Digite quantas pessoas irá cadastrar: ");
        tamVetor = scanner.nextInt();

        peopleDataClass[] cliente = new peopleDataClass[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.printf("Altura da %d pessoa: ", i + 1);
            double altura = scanner.nextDouble();
            System.out.printf("Genero da %d pessoa: ", i + 1);
            scanner.nextLine();
            String genero = scanner.nextLine();

            cliente[i] = new peopleDataClass(altura, genero);
        }

        // Menor Altura
        menorAltura = cliente[0].getAltura();
        for (int i = 0; i < tamVetor; i++) {
            if (cliente[0].getAltura() < menorAltura){
                menorAltura = cliente[i].getAltura();
            }
        }

        // Maior Altura
        maiorAltura = cliente[0].getAltura();
        for (int i = 0; i < tamVetor; i++) {
            if (cliente[0].getAltura() > maiorAltura){
                maiorAltura = cliente[i].getAltura();
            }
        }

        // Media Mulheres
        for (int i = 0; i < tamVetor; i++) {
            if (cliente[i].getGenero() == "f" || cliente[i].getGenero() == "f"){
                mediaAlturaMulheres += cliente[i].getAltura();
                contMulheres += 1;
            }
        }

        mediaAlturaMulheres = mediaAlturaMulheres / contMulheres;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Menor Altura: " + menorAltura);
        System.out.println("Maior Altura: " + maiorAltura);
        System.out.println("Media das alturas das mulheres: " + mediaAlturaMulheres);



    }
}
