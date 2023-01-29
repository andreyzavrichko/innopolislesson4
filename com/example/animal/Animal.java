package com.example.animal;

import com.example.people.People;

public class Animal {

    private String name;
    private String type;
    private Boolean sick;
    private Boolean quarantine;
    private Boolean fullness;
    private Boolean water;

    private Boolean bite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSick() {
        return sick;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    public Boolean getFullness() {
        return fullness;
    }

    public void setFullness(Boolean fullness) {
        this.fullness = fullness;
    }

    public Boolean getWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }


    // Кусаем
    public void bite(People people, Animal animal) {
        people.setInfection(true);
        if (people.getInfection()== true) {
            System.out.println(people.getPosition() + " укушен");
        } else {
            System.out.println("Неудача, укушу в другой раз");
        }
    }




    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal() {
    }
}
