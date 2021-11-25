package com.company.interfaceversion;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
        System.out.println("Adding a Whip");
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .50;
    }
}
