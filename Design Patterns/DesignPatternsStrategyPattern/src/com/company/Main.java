package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Duck duck = new DecoyDuck();
//
//        duck.display();
//        duck.performFly();
//        duck.performQuack();
//
//        duck.setFlyStrategy(new FlyWithRocketPower());
//
//        duck.performFly();

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck decoy = new DecoyDuck();
        decoy.performFly();
        decoy.setFlyStrategy(new FlyWithRocketPower());
        decoy.performFly();
        decoy.display();

    }
}
