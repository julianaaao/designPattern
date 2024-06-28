package com.headfirst.api.chapter1.book.duck;

import com.headfirst.api.chapter1.book.fly.FlyNoWay;
import com.headfirst.api.chapter1.book.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck (){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    public void display(){
        System.out.println("----SHOW----");
    }
}