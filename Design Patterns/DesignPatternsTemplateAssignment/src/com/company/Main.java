package com.company;

public class Main {

    public static void main(String[] args) {

        StoreOrder storeOrder = new StoreOrder();

        System.out.println("Buying product by yourself:");
        storeOrder.sellProduct();

        System.out.println("");

        OnlineOrder onlineOrder = new OnlineOrder();

        System.out.println("Buying online:");
        onlineOrder.sellProduct();
    }
}
