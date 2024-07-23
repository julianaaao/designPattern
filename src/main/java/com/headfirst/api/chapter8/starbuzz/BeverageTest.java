package com.headfirst.api.chapter8.starbuzz;

public class BeverageTest {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
        System.out.println("\n making tea ---");
        beverage = new Tea();
        beverage.prepareRecipe();

        System.out.println("\n ---Abstract version ---");

        CaffeineBeverageAbstract beverageAb = new CoffeeAbstract();
        beverageAb.prepareRecipe();
        System.out.println("\n making tea ---");
        beverageAb = new TeaAbstract();
        beverageAb.prepareRecipe();
    }
}
