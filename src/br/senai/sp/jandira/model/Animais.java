package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animais {

    //    Variáveis
    String nome;
    int idade;
    String sexo;
    int idAnimal;
    String especie;
    String habitoAlimentar;
    String alojamento;
    LocalDate ultimaConsultaVeterinaria;

    //    Instancia o Scanner
    Scanner scanner = new Scanner(System.in);

    List<Animais> listAnimais = new ArrayList<>();

    public Animais() {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.idAnimal = idAnimal;
        this.especie = especie;
        this.habitoAlimentar = habitoAlimentar;
        this.alojamento = alojamento;
    }

    //    Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitoAlimentar() {
        return habitoAlimentar;
    }

    public void setHabitoAlimentar(String habitoAlimentar) {
        this.habitoAlimentar = habitoAlimentar;
    }

    public String getAlojamento() {
        return alojamento;
    }

    public void setAlojamento(String alojamento) {
        this.alojamento = alojamento;
    }

    public LocalDate getUltimaConsultaVeterinaria() {
        return ultimaConsultaVeterinaria;
    }

    public void setUltimaConsultaVeterinaria(LocalDate ultimaConsultaVeterinaria) {
        this.ultimaConsultaVeterinaria = ultimaConsultaVeterinaria;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
//    fim dos getters e setter

    public void cadastrarAnimais() {
        System.out.println("=============== Cadastro de Animais ===============");
        System.out.println("Nome do animal: ");
        nome = scanner.nextLine();
        System.out.println("Espécie do animal: ");
        especie = scanner.nextLine();
        System.out.println("Idade do animal: ");
        idade = scanner.nextInt();
        System.out.println("Sexo do animal: ");
        sexo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Hábito alimentar do animal: ");
        habitoAlimentar = scanner.nextLine();
        System.out.println("Informe um id para o animal: ");
        idAnimal = scanner.nextInt();
        System.out.println("\nAnimal cadastrado com sucesso.");

        System.out.println("\nDados cadastrados do animal");
        System.out.println("\nNome do animal: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Hábito alimentar: " + habitoAlimentar);
        System.out.println("Id animal: " + idAnimal);

    }

    public void adicionarAnimais(Animais animais) {
        listAnimais.add(animais);
    }

    public boolean procurarAnimais(String animalPesquisado) {
        for (Animais animais : listAnimais) {
            if (animais.nome.equalsIgnoreCase(animalPesquisado)) {
                return false;
            }
        }
        return false;
    }

    public void listarAnimais() {
        for (Animais animais : listAnimais) {
            System.out.println("Consulta de informações do animal");
            System.out.println("\nNome: " + animais.nome);
            System.out.println("Espécie: " + animais.especie);
            System.out.println("Idade: " + animais.idade);
            System.out.println("Hábito Alimentar: " + animais.habitoAlimentar);
            System.out.println("Localização do animal: " + animais.alojamento);
        }
    }




    public void registrarHistoricoMedico(String informacao) {

    }

}
