package com.company.interfaceversion;

public class Espresso implements Beverage{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 7.0;
    }
}
