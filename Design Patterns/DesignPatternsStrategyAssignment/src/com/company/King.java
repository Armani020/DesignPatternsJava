package com.company;

public class King extends Character{

    public King() {
        super(new KnifeBehavior());
    }

    @Override
    void fight() {
        System.out.println("I am king!");
    }
}
