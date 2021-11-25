package com.company;

public class Suppressor extends RifleDecorator{

    public Suppressor(Rifle rifle) {
        super(rifle);
    }

    @Override
    public String getDescription() {
        return rifle.getDescription() + " has a Suppressor,";
    }

    @Override
    public double getCost() {
        return rifle.getCost() + 1000;
    }
}
