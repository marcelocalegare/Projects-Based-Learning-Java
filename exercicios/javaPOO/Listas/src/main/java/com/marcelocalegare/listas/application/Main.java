package com.marcelocalegare.listas.application;
import com.marcelocalegare.listas.entities.Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro user = new Cadastro();
        ArrayList<Cadastro> users = new ArrayList<>();
        int tamList;

        System.out.print("Digite quantas pessoas deseja cadastrar: ");
        tamList = scanner.nextInt();

        for (int i = 0; i < tamList; i++) {
            System.out.printf("Registro %d\n", i + 1);
            users.add(user.cadastrar());
        }

        System.out.print("Digite o ID que deseja alterar aumentar o salario: ");
        int idTemp = scanner.nextInt();
        for (Cadastro client : users){
            if (client.getId() == idTemp){
                client.aumentarSalario();
            }
        }

        System.out.println("Lista de cadastros: ");
        for (Cadastro client : users) {
            client.mostrarDados();
        }


    }
}
