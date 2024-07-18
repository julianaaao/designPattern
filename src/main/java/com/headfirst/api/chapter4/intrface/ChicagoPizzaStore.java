package com.headfirst.api.chapter4.intrface;

public class ChicagoPizzaStore implements PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("시카코 스타일 치즈 피자");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("시카코 스타일 조개 피자");
        }
        return null;
    }

    @Override
    public Pizza orderPizza(String type) {
        return null;
    }
}
