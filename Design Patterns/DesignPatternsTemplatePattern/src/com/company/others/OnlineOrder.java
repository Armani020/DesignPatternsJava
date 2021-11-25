package com.company.others;

public class OnlineOrder extends Order {

    @Override
    void receiveMoney() {
        System.out.println("Online card payment...");
    }

    @Override
    void giveCheck() {
        System.out.println("Sending check to your email...");
    }

    @Override
    void deliver() {
        System.out.println("Starting delivery...");
    }

    @Override
    void giveWarranty() {
        System.out.println("You can buy a warranty in our store!");
    }
}
