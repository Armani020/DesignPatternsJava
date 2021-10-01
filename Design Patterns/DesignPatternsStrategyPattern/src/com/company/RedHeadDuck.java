package com.company;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        super(new FlyWIthWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("I am ReadHead Duck");
    }
}
