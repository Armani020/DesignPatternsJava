package com.company;

public class FlyWIthWings implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }
}
