package com.headfirst.api.chapter8.starbuzz;

public interface CaffeineBeverage {

    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    default void boilWater(){
        System.out.println("물 끓이는 중 ");
    }

    default void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    void brew();
    void addCondiments();
}
