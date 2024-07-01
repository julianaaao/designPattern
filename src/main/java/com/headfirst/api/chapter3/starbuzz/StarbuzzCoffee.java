package com.headfirst.api.chapter3.starbuzz;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;
import com.headfirst.api.chapter3.starbuzz.beverage.DarkRoast;
import com.headfirst.api.chapter3.starbuzz.beverage.Espresso;
import com.headfirst.api.chapter3.starbuzz.beverage.HouseBlend;
import com.headfirst.api.chapter3.starbuzz.decorator.Mocha;
import com.headfirst.api.chapter3.starbuzz.decorator.Soymilk;
import com.headfirst.api.chapter3.starbuzz.decorator.WhippingCream;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new WhippingCream(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soymilk(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new WhippingCream(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
