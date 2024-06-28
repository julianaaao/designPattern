package com.headfirst.api.chapter1.book;

import com.headfirst.api.chapter1.book.duck.Duck;
import com.headfirst.api.chapter1.book.duck.RubberDuck;
import com.headfirst.api.chapter1.book.fly.FlyWithWings;
import com.headfirst.api.chapter1.book.quack.MuteQuack;

public class Application {

    public static void main(String[] args) {
        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
        rubber.display();
        rubber.performQuack();
        rubber.setQuackBehavior(new MuteQuack());
        rubber.performQuack();
    }
}
