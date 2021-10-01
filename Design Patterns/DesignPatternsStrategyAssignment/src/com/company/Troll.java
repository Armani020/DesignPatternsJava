package com.company;

public class Troll extends Character{

    public Troll() {
        super(new AxeBehavior());
    }

    @Override
    void fight() {
        System.out.println("I am troll arghhhhh...");
    }
}
