package com.company;


// Favor(prefer) composition over inheritance
// Program interface, not implementation
public abstract class Duck {

    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;

    public Duck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }

    abstract void display();

    public void performFly() {
        this.flyStrategy.fly();
    }

    public void performQuack() {
        this.quackStrategy.quack();
    }

    public FlyStrategy getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public QuackStrategy getQuackStrategy() {
        return quackStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }
}



