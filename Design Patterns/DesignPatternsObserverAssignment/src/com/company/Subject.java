package com.company;

public interface Subject {
    void subscribe(Investor... investor);
    void unSubscribe(Investor... investor);
    void notifyInvestors();
}
