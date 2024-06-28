package com.headfirst.api.chapter1.book.duck;

import com.headfirst.api.chapter1.book.fly.FlyBehavior;
import com.headfirst.api.chapter1.book.quack.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack (){
        quackBehavior.quack();
    }

    public void performFly (){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }

    public void swim(){

    }

    public void display(){

    }

}