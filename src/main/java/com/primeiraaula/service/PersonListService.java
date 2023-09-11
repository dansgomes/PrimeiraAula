package com.primeiraaula.service;

import com.primeiraaula.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListService {

    private List<Person> personList = new ArrayList<>();

    public void newPerson( Person person) {

        personList.add(person);

    }

    public void deletePerson(int position){
        Person person = this.personList.get(position);

        this.personList.remove(person);
    }

    public void printAllName(){
        for (int i = 0; i < this.personList.size(); i++) {
            System.out.println("Posição na lista: ["+i+"] " + this.personList.get(i));
        }
    }
}
