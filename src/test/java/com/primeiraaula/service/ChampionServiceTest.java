package com.primeiraaula.service;

import com.primeiraaula.domain.Champion;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChampionServiceTest {
    private ChampionListService championService = new ChampionListService();


    @Test
    public void criarPrimeiroChampion() {

        Champion primeiroChampion = new Champion();

        primeiroChampion.setFunction("Jungler");
        primeiroChampion.setRegion("Ionia");
        primeiroChampion.setName("Master Yi");
        championService.newChampion(primeiroChampion);

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
    @Test
    public void criarTerceiroChampion() {
        Champion terceiroChampion = new Champion();

        terceiroChampion.setFunction("Support");
        terceiroChampion.setRegion("Ionia");
        terceiroChampion.setName("Karma");
        championService.newChampion(terceiroChampion);
        championService.printAllName();
    }
    @Test
    public void createAndRemoveChampion() {
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


        Champion terceiroChampion = new Champion();
        terceiroChampion.setFunction("Support");
        terceiroChampion.setRegion("Ionia");
        terceiroChampion.setName("Karma");
        championService.newChampion(terceiroChampion);

        championService.printAllName();

        championService.deleteChampion(0);
    // Aqui o atualizado aparece duas vezes, tem uma forma mais limpa de atualizar dois campeoes simultaneamente? (Xin Zhao e Syndra)
        System.out.println("-----------------------ATUALIZADO----------------------------");
        championService.printAllName();
    }

    @Test
    public void updateChampion(){
        this.criarPrimeiroChampion();
        this.criarPrimeiroChampion();
        this.criarSegundoChampion();
        this.criarTerceiroChampion();
        this.criarTerceiroChampion();
        //Aqui ele se repete varias vezes no teste, [0,1,2] [0,1,2,3] etc. Por que?
        Champion xinZhao = this.championService.findChampion(1);
        Champion syndra = this.championService.findChampion(4);
        xinZhao.setName("Xin Zhao");
        xinZhao.setRegion("Demacia");
        syndra.setName("Syndra");
        syndra.setFunction("Mage");

     // Syndra poderia começar com maiúsculo?


        this.championService.updateChampion(1, xinZhao);
        this.championService.updateChampion(4, syndra);
        this.championService.printAllName();

    }
}
