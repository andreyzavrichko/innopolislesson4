package com.example.people;

public class People {

    private String name;
    private String position;

    private Boolean infection;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getInfection() {
        return infection;
    }

    public void setInfection(Boolean infection) {
        this.infection = infection;
    }

    public People(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public People() {
    }
}
