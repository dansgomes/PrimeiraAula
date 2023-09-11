package com.primeiraaula.domain;

public class Person {

    //ATRIBUTOS DA CLASSE / PROPRIEDADES
    private String name;
    private int age;
    private String birthdate;

    private int phone;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {

        if (phone == 12){
            this.phone = phone;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
