package com.primeiraaula.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceTest {

    @Test
    public void sePessoaDeMaior() {
        PersonService personService = new PersonService();

        assertEquals(true, personService.deMaior(33));


    }

    @Test
    public void sePessoaDeMenor() {
        PersonService personService = new PersonService();

        assertEquals(false, personService.deMaior(17));
    }
}
