package com.headfirst.api.chapter8.starbuzz;

public class Tea implements CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
