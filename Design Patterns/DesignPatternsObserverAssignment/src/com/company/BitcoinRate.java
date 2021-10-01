package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BitcoinRate implements Subject {
    private float rate;
    private final ArrayList<Investor> investors;

    public BitcoinRate() {
        investors = new ArrayList<Investor>();
    }

    @Override
    public void subscribe(Investor... investor) {
        //investors.add(investor); //I have changed this method for more convenient data entry

        Collections.addAll(investors, investor);
    }

    @Override
    public void unSubscribe(Investor... investor) {
        //investors.remove(investor); //I have changed this method for more convenient data deletion

        for (Investor investor1 : investor) {
            investors.remove(investor1);
        }
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(rate);
        }
    }

    public void rateChanged() {
        notifyInvestors();
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
        rateChanged();
    }
}
