package com.primeiraaula.service;

import com.primeiraaula.domain.Person;

public class PersonService {
    public void newPerson(String name, int age, boolean live){
        Person person = new Person();

        person.name = name;
        person.age = age;
        person.live = live;

        if (live){
            System.out.println("A pessoa " + person.name + " está viva ");

        }else {
            System.out.println("A pessoa " + person.name + " está morto ");
        }
    }
}
