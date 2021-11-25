package com.company.interfaceversion;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
        System.out.println("Adding a Milk");
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.50;
    }
}
