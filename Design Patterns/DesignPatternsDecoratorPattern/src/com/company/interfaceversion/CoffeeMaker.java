package com.company.interfaceversion;

public class CoffeeMaker {

    public static void main(String[] args) {
        Beverage espresso = new Whip(new Milk(new Espresso()));

        System.out.println("Ingredients: " + espresso.getDescription() + " cost: " + espresso.getCost());
    }
}
