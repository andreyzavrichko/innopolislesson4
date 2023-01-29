package com.example.animal;

public class Hippo extends Animal{
    private Boolean water;

    @Override
    public Boolean getWater() {
        return water;
    }

    @Override
    public void setWater(Boolean water) {
        this.water = water;
    }
}
