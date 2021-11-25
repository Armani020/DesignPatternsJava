package com.company.others;

public abstract class Order {
    final void sellProduct() {
        receiveMoney();
        giveCheck();
        deliver();
        if (getWarranty()) {
            giveWarranty();
        }
    }

    abstract void receiveMoney();
    abstract void giveCheck();
    abstract void deliver();
    abstract void giveWarranty();
    boolean getWarranty() {
        return true;
    };
}
