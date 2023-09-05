package com.primeiraaula.service;

import com.primeiraaula.domain.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceTest {
    PersonService personService = new PersonService();


    @Test
    public void sePessoaDeMaior() {

        assertEquals(true, personService.deMaior(33));

    }

    @Test
    public void sePessoaDeMenor() {

        //Com exceção da primeira letra, a forma de escrever mantem a mesma, por exemplo: PersonService = classe
        //personService = variavel
        //Person = classe
        //persn = variavel
        //PersonServiceTest = classe
        //personServiceTest = variavel

        assertEquals(false, personService.deMaior(17));
    }

    @Test
    public void criarPrimeiraPessoa() {

        // PersonService = Classe, sempre começa com maisculo
        // personService = o nome da variavel
        Person primeiraPessoa = new Person();

        primeiraPessoa.birthdate = "10/06/1990";
        primeiraPessoa.age = 33;
        primeiraPessoa.name = "Rafael Monteiro";

        personService.newPerson(primeiraPessoa);
        personService.imprimirNomeDasPessoas();


    }

    @Test
    public void criarSegundaPessoa() {
        Person segundaPessoa = new Person();

        segundaPessoa.name = "Daniel Gomes";
        segundaPessoa.age = 24;
        segundaPessoa.birthdate = "10/09/1999";

        personService.newPerson(segundaPessoa);
        personService.imprimirNomeDasPessoas();

    }
}
