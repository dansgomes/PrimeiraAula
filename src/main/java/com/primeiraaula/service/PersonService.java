package com.primeiraaula.service;

import com.primeiraaula.domain.Person;

public class PersonService {
    public void newPerson(String name, int age, boolean live, double hour, boolean employed){
        Person person = new Person();

        person.name = name;
        person.age = age;
        person.live = live;
        person.hour = hour;
        person.employed = employed;


        System.out.println("O nome da pessoa é. " + name);
        System.out.println("A pessoa tem " + person.age + "anos de idade.");
        System.out.println("O horário da pessoa é "+ person.hour);

        if (age >= 18){
            System.out.println("A pessoa é maior de idade.");
        } else{
            System.out.println("A pessoa é menor de idade.");
        }

        if (live){
            System.out.println("A pessoa " + person.name + " está viva. ");
        }else {
            System.out.println("A pessoa " + person.name + " está morto. ");
        }
        if (employed){
            System.out.println("A pessoa " + person.name + "está empregada.");
        }else {
            System.out.println("A pessoa " + person.name + "está desempregada.");
        }
    }
}
