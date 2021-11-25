package com.company.interfaceversion;

public abstract class CondimentDecorator implements Beverage{
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription();
    }

    public double getCost() {
        return beverage.getCost();
    }
}
