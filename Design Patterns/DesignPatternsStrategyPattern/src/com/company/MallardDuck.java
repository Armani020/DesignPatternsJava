package com.company;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWIthWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
