package com.company;

public class Knight extends Character{

    public Knight() {
        super(new SwordBehavior());
    }

    @Override
    void fight() {
        System.out.println("I am knight!");
    }
}
