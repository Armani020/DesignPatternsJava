package com.company;

public class Main {

    public static void main(String[] args) {
        Rifle akm = new Grip(new Suppressor(new AKM()));
        System.out.println(akm.getDescription() + " and cost: " + akm.getCost() + "$");
    }
}
