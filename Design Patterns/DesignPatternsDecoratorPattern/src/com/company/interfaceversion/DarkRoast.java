package com.company.interfaceversion;

public class DarkRoast implements Beverage{

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
