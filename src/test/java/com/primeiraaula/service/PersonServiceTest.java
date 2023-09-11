package com.primeiraaula.service;

import com.primeiraaula.domain.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceTest {
    private PersonListService personService = new PersonListService();


    @Test
    public void criarPrimeiraPessoa() {

        // PersonService = Classe, sempre começa com maisculo
        // personService = o nome da variavel
        Person primeiraPessoa = new Person();

        primeiraPessoa.setBirthdate("10/06/1990");
        primeiraPessoa.setAge(33);
        primeiraPessoa.setName("Rafael Monteiro");
        primeiraPessoa.setPhone(12);

        personService.newPerson(primeiraPessoa);
        personService.printAllName();

    }

    @Test
    public void createAndRemovePerson(){

        Person primeiraPessoa = new Person();
        primeiraPessoa.setBirthdate("10/06/1990");
        primeiraPessoa.setAge(33);
        primeiraPessoa.setName("Rafael Monteiro");
        primeiraPessoa.setPhone(12);
        personService.newPerson(primeiraPessoa);

        Person segundaPessoa = new Person();
        segundaPessoa.setName("Daniel Gomes");
        segundaPessoa.setAge(24);
        segundaPessoa.setBirthdate("10/09/1999");
        personService.newPerson(segundaPessoa);

        personService.printAllName();

        personService.deletePerson(0);

        personService.printAllName();



    }

    @Test
    public void criarSegundaPessoa() {
        Person segundaPessoa = new Person();

        segundaPessoa.setName("Daniel Gomes");
        segundaPessoa.setAge(24);
        segundaPessoa.setBirthdate("10/09/1999");
        personService.newPerson(segundaPessoa);
        personService.printAllName();



    }
}
