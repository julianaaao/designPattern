package com.headfirst.api.chapter1.book.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FLYING");
    }
}
