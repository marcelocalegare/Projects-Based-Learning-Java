package com.marcelocalegare.heranca.ex01.application;
import com.marcelocalegare.heranca.ex01.entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Menu
        System.out.print("Menu\n1 - Cadastrar o usuário\n2 - Cadastar um novo livro\n3 - Mostrar usuários\n4 - Mostrar livros\n0 - Exit\n\nDigite uma opção: ");
        opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.println("Cadastro de usuário");
            System.out.print("Digite seu nome: ");
            String tempNome = scanner.nextLine();

            System.out.print("Digite seu cpf: ");
            int tempCpf = scanner.nextInt();

            System.out.print("Digite seu e-mail: ");
            String tempEmail = scanner.nextLine();

            Usuario user = new Usuario(tempNome, tempCpf, tempEmail);

        }




    }
}
