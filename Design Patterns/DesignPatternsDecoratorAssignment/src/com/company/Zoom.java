package com.company;

public class Zoom extends RifleDecorator{

    public Zoom(Rifle rifle) {
        super(rifle);
    }

    @Override
    public String getDescription() {
        return rifle.getDescription() + " has a Zoom,";
    }

    @Override
    public double getCost() {
        return rifle.getCost() + 200;
    }
}
