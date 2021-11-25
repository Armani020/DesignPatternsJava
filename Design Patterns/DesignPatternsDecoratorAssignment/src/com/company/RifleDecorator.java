package com.company;

public abstract class RifleDecorator implements Rifle{
    protected Rifle rifle;

    public RifleDecorator(Rifle rifle) {
        this.rifle = rifle;
    }

    public String getDescription() {
        return rifle.getDescription();
    }

    public double getCost() {
        return rifle.getCost();
    }
}
