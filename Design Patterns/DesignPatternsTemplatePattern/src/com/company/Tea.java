package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends BeverageMaker {

    @Override
    void brew() {
        System.out.println("Brewing tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
