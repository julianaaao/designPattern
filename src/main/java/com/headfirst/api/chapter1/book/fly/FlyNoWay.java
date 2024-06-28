package com.headfirst.api.chapter1.book.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("NOT flying");
    }
}
