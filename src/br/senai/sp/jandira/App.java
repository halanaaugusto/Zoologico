package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("|-------------------------|");
        System.out.println("|        Bem Vindo        |");
        System.out.println("|      Zoológico Senai    |");
        System.out.println("|-------------------------|");

        Menu menu = new Menu();
        menu.executarMenu();
    }
}
