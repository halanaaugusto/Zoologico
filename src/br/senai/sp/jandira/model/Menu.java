package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        while (true) {
            System.out.println("\n================ Menu ================");
            System.out.println("1- Cadastrar animal                   ");
            System.out.println("2- Alocar Animal                      ");
            System.out.println("3- Consultar informações do animal    ");
            System.out.println("4- Informações sobre saúde do animal  ");
            System.out.println("5- Sair                               ");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:
                    Animais animais = new Animais();
                    animais.cadastrarAnimais();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Encerrando o sistema.");
                    System.exit(0);
                    break;

            }


        }

    }


}
