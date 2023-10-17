package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Alojamentos extends Animais {
    List <Alojamentos> listMamiferos = new ArrayList<>();

    public void adicionarMamiferos(Alojamentos mamiferos){
        listMamiferos.add(mamiferos);
    }

    public void listarMamiferos(){
        for (Alojamentos mamiferos : listMamiferos) {
            System.out.println(mamiferos.nome);
            System.out.println(mamiferos.idade);
            System.out.println(mamiferos.sexo);
            System.out.println(mamiferos.idAnimal);
            System.out.println(mamiferos.especie);
            System.out.println(mamiferos.habitoAlimentar);
            System.out.println(mamiferos.alojamento);
            System.out.println(mamiferos.ultimaConsultaVeterinaria);
        }
    }

    List<Alojamentos> listAves = new ArrayList<>();

    public void adicionarAves(Alojamentos aves){
        listAves.add(aves);
    }

    public void listarAves(){
        for (Alojamentos aves : listAves){
            System.out.println(aves.nome);
            System.out.println(aves.idade);
            System.out.println(aves.sexo);
            System.out.println(aves.idAnimal);
            System.out.println(aves.especie);
            System.out.println(aves.habitoAlimentar);
            System.out.println(aves.alojamento);
            System.out.println(aves.ultimaConsultaVeterinaria);
        }
    }

    List<Alojamentos> listRepteis = new ArrayList<>();

    public void adicionarRepteis(Alojamentos repteis){
        listAves.add(repteis);
    }

    public void listarRepteis(){
        for (Alojamentos repteis : listRepteis){
            System.out.println(repteis.nome);
            System.out.println(repteis.idade);
            System.out.println(repteis.sexo);
            System.out.println(repteis.idAnimal);
            System.out.println(repteis.especie);
            System.out.println(repteis.habitoAlimentar);
            System.out.println(repteis.alojamento);
            System.out.println(repteis.ultimaConsultaVeterinaria);
        }
    }



}
