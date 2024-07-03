package com.headfirst.api.chapter3.example;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;
import com.headfirst.api.chapter3.starbuzz.decorator.Mocha;
import com.headfirst.api.chapter3.starbuzz.decorator.Soymilk;
import com.headfirst.api.chapter3.starbuzz.decorator.WhippingCream;

public class BeverageDecoratorFactory {
    public static Beverage addMocha(Beverage beverage) {
        return new Mocha(beverage);
    }

    public static Beverage addSoy(Beverage beverage) {
        return new Soymilk(beverage);
    }

    public static Beverage addWhip(Beverage beverage) {
        return new WhippingCream(beverage);
    }

    public static Beverage addAll(Beverage beverage) {
        beverage = addMocha(beverage);
        beverage = addSoy(beverage);
        beverage = addWhip(beverage);
        return beverage;
    }
}