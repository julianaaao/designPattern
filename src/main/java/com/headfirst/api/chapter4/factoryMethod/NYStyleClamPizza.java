package com.headfirst.api.chapter4.factoryMethod;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈");
        toppings.add("롱아일랜드산 신선한 조개");
    }
}
