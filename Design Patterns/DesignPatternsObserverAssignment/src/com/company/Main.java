package com.company;

public class Main {

    public static void main(String[] args) {
        BitcoinRate btc = new BitcoinRate();

        Investor investor1 = new Investor("Arman");
        Investor investor2 = new Investor("Aruzhan");
        Investor investor3 = new Investor("Marat");

        btc.subscribe(investor1, investor2, investor3);

        btc.setRate(5.22f);

        btc.unSubscribe(investor1, investor3);

        System.out.println();

        btc.setRate(17.33f);
    }
}
