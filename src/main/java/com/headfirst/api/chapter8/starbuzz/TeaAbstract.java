package com.headfirst.api.chapter8.starbuzz;

public class TeaAbstract extends CaffeineBeverageAbstract {
    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
