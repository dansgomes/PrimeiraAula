package com.primeiraaula.service;

import com.primeiraaula.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    //ATRIBUTOS DA CLASSE / PROPRIEDADE
    List<Person> personList = new ArrayList<>();


    //METODO DA CLASE, SEMPRE VAI ABRIR E FECHAR CHAVES
    public void newPerson( Person person) {

        personList.add(person);

    }

    //METODO DA CLASE, SEMPRE VAI ABRIR E FECHAR CHAVES
    public void imprimirNomeDasPessoas() {
        for (int i =0; i < personList.size(); i++){
            System.out.println(personList.get(i).name);
        }

    }


    public boolean deMaior(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
