package com.headfirst.api.chapter9.iterator;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String description, String name, boolean vegetarian, double price) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
