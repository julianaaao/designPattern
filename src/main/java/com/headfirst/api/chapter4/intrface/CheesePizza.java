package com.headfirst.api.chapter4.intrface;

public class CheesePizza implements Pizza{
    PizzaIngredientFactory ingredientFactory;
    String name;
    Dough dough;
    Cheese cheese;
    Sauce sauce;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    @Override
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    @Override
    public void box() {
        System.out.println("상자에 피자 담기");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("--- ").append(name).append("--- \n");

        if(dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if(sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if(cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        return result.toString();
    }
}
