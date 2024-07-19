package com.headfirst.api.chapter4.intrface;

public class Client {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza clamPizza = chicagoStore.orderPizza("clam");
        System.out.println("에단이 주문한 " + clamPizza.getName() + "\n");

        Pizza cheesePizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + cheesePizza.getName() + "\n");

    }
}
