package com.company;

public class FlyWithRocketPower implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("I am flying with rocket engine power");
    }
}
