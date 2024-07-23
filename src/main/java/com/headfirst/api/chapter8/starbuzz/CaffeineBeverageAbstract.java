package com.headfirst.api.chapter8.starbuzz;

public abstract class CaffeineBeverageAbstract {

    // 템플릿 메소드. 서브 클래스에서 오버라이드를 막기 위해 final 로 선언
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 서브 클래스에서 구현해야 하는 메소드는 abstract 로 선언
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중 ");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
