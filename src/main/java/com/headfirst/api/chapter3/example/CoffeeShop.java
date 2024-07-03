package com.headfirst.api.chapter3.example;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;
import com.headfirst.api.chapter3.starbuzz.beverage.Espresso;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = BeverageDecoratorFactory.addAll(beverage); //use factory to add all decorators

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}