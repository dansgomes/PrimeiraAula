package com.primeiraaula.domain;

public class Person {

    //ATRIBUTOS DA CLASSE / PROPRIEDADES
    public String name;
    public int age;
    public String birthdate;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
