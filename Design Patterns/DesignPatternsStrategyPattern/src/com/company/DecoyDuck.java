package com.company;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super(new NoFly(), new NoQuack());
    }

    @Override
    void display() {
        System.out.println("I am decoy Duck");
    }
}
