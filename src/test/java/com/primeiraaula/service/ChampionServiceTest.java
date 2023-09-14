package com.primeiraaula.service;

import com.primeiraaula.domain.Champion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChampionServiceTest {
    private ChampionListService championService = new ChampionListService ();


    @Test
    public void criarPrimeiroChampion() {

        // PersonService = Classe, sempre começa com maisculo
        // personService = o nome da variavel
        Champion primeiroChampion= new Champion();

        primeiroChampion.setFunction("Jungler");
        primeiroChampion.setRegion("Ionia");
        primeiroChampion.setName("Master Yi");

        championService.newChampion(primeiroChampion);
        championService.printAllName();

    }

    @Test
    public void createAndRemoveChampion(){

        Champion primeiroChampion = new Champion();
        primeiroChampion.setFunction("Jungler");
        primeiroChampion.setRegion("Ionia");
        primeiroChampion.setName("Master Yi");
        championService.newChampion(primeiroChampion);

        Champion segundoChampion = new Champion();
        segundoChampion.setFunction("Support");
        segundoChampion.setRegion("Demacia");
        segundoChampion.setName("Sona");
        championService.newChampion(segundoChampion);

        championService.printAllName();

        championService.deleteChampion(0);

        championService.printAllName();



    }

    @Test
    public void criarSegundoChampion() {
        Champion segundoChampion = new Champion();

        segundoChampion.setFunction("Support");
        segundoChampion.setRegion("Demacia");
        segundoChampion.setName("Sona");
        championService.newChampion(segundoChampion);
        championService.printAllName();



    }
}
