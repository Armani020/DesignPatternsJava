package com.company.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoreOrder extends Order {

    @Override
    void receiveMoney() {
        System.out.println("Receiving money from you personally...");
    }

    @Override
    void giveCheck() {
        System.out.println("Giving a check into your hands...");
    }

    @Override
    void deliver() {
        System.out.println("Giving a product into your hands...");
    }

    @Override
    void giveWarranty() {
        System.out.println("Giving an one-year warranty...");
    }

    @Override
    public boolean getWarranty() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Do you need a one-year warranty? (y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
