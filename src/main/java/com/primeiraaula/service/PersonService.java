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
        System.out.println("A pessoa tem " + person.age + " anos de idade.");
        System.out.println("O horário da pessoa é "+ person.hour);

        //deMaior(age);

        //CRIAR MÉTODOS E TESTES PARA O SEUS IFS

        if (live){
            return "Está";
        }else {
            System.out.println("A pessoa " + person.name + " está morto. ");
        }
        if (employed){
            System.out.println("A pessoa " + person.name + "está empregada.");
        }else {
            System.out.println("A pessoa " + person.name + "está desempregada.");
        }
    }

   public boolean deMaior(int age){


       if (age >= 18){
           return true;
       } else{
           return false;
       }
   }
}
