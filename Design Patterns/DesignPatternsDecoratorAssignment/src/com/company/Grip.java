package com.company;

public class Grip extends RifleDecorator{

    public Grip(Rifle rifle) {
        super(rifle);
    }

    @Override
    public String getDescription() {
        return rifle.getDescription() + " has a Grip,";
    }

    @Override
    public double getCost() {
        return rifle.getCost();
    }
}
