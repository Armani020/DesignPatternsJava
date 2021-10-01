package com.company;

public class Main {

    public static void main(String[] args) {

        Character king = new King();
        king.fight();
        king.performUseWeapon();
        king.setWeaponBehavior(new AxeBehavior());
        king.performUseWeapon();
    }
}
