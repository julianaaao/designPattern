package com.headfirst.api.chapter3.starbuzzWithSizes;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;
import com.headfirst.api.chapter3.starbuzzWithSizes.beverage.DarkRoast;
import com.headfirst.api.chapter3.starbuzzWithSizes.beverage.Espresso;
import com.headfirst.api.chapter3.starbuzzWithSizes.beverage.HouseBlend;
import com.headfirst.api.chapter3.starbuzzWithSizes.decorator.Mocha;
import com.headfirst.api.chapter3.starbuzzWithSizes.decorator.Soymilk;
import com.headfirst.api.chapter3.starbuzzWithSizes.decorator.WhippingCream;

public class StarbuzzCoffeeWithSizes {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription() + " $" + String.format("%.2f" , beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new WhippingCream(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f" , beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soymilk(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new WhippingCream(beverage3);
        System.out.println(beverage3.getDescription() + " $" + String.format("%.2f" , beverage3.cost()));

    }
}
