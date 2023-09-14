package com.primeiraaula.service;

import com.primeiraaula.domain.Champion;

import java.util.ArrayList;
import java.util.List;

public class ChampionListService {

    private List<Champion> championList = new ArrayList<>();

    public void newChampion( Champion champion) {

        championList.add(champion);

    }

    public void deleteChampion(int position){
        Champion champion = this.championList.get(position);

        this.championList.remove(champion);
    }

    public void printAllName(){
        for (int i = 0; i < this.championList.size(); i++) {
            System.out.println("Posição na lista: ["+i+"] " + this.championList.get(i));
        }
    }
}
