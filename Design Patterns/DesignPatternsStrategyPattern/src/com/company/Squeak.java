package com.company;

public class Squeak implements  QuackStrategy{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
