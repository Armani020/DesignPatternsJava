package com.company;

public class RubberDuck extends Duck{

    public RubberDuck() {
        super(new NoFly(), new Squeak());
    }

    @Override
    void display() {
        System.out.println("I am RubberDuck");
    }
}
