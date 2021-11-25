package com.company;

public class AKM implements Rifle{

    @Override
    public String getDescription() {
        return "AKM rifle";
    }

    @Override
    public double getCost() {
        return 400;
    }
}
