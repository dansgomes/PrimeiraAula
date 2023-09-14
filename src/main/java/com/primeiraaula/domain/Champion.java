package com.primeiraaula.domain;

public class Champion {

    //ATRIBUTOS DA CLASSE / PROPRIEDADES
    private String name;
    private String function;
    private String region;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", function='" + function + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
