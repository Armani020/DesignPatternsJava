package com.company;

public class Investor implements Observer, Display{
    private final String name;
    private float rate;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float rate) {
        this.rate = rate;
        display();
    }

    @Override
    public void display() {
        System.out.println("Hello " + name + ", the bitcoin rate changed! Now the rate is " + rate + "$ for 1 BTC.");
    }
}
