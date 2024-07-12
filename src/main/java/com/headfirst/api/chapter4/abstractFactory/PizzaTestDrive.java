package com.headfirst.api.chapter4.abstractFactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("에단이가 주문한 " + pizza + "\n");
        
        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("조엘이가 주문한 " + pizza + "\n");
    }
}
