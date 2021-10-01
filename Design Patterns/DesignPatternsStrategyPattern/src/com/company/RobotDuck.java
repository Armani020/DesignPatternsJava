package com.company;

public class RobotDuck extends Duck{
    public RobotDuck() {
        super(new FlyWithRocketPower(), new NoQuack());
    }

    @Override
    void display() {
        System.out.println("I am robot Duck");
    }

}
