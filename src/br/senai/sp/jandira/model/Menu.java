package br.senai.sp.jandira.model;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Animais listAnimais = new Animais();

    Animais refListAnimais = new Animais();

    Alojamentos refListAlojamentos = new Alojamentos();

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
                    refListAnimais.adicionarAnimais(animais);
                    break;

                case 2:
                    System.out.println("Digite o nome do animal desejado: ");
                    String animalPesquisado = scanner.nextLine();
                    boolean validaAnimal = false;

                    if (animalPesquisado != null && animalPesquisado != ""){
                        validaAnimal = listAnimais.procurarAnimais(animalPesquisado);
                    }
                    if (validaAnimal){
                        System.out.println("Qual o tipo de animal? [1- Mamíferos, 2- Aves, 3- Répteis]: ");
                        int escolhaUsuario = scanner.nextInt();
                        switch (escolhaUsuario){
                            case 1:
                                Alojamentos mamiferos = new Alojamentos();
                                refListAlojamentos.adicionarMamiferos(mamiferos);
                                System.out.println("Mamífero: " + mamiferos.nome + "adicionado.");
                                System.out.println("Temos " + refListAlojamentos.listMamiferos.size() + " mamíferos.");
                                break;
                        }
                    }
                    break;

                case 3:
                    listAnimais.listarAnimais();
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
