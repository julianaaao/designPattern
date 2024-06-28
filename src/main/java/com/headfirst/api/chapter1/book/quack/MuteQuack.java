package com.headfirst.api.chapter1.book.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" <<- silent ->> ");
    }
}
