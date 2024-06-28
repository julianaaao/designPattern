package com.headfirst.api.chapter1.book.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("SQUEAK");
    }
}
