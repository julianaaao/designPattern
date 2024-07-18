package com.headfirst.api.chapter4.intrface;

public interface PizzaStore {
    Pizza createPizza(String type);

    Pizza orderPizza(String type);
}
