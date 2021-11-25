package com.company;

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        System.out.println("");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("");

        gumballMachine.refill(10);

        System.out.println(gumballMachine);
        System.out.println("");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("");

        System.out.println(gumballMachine);
    }
}
