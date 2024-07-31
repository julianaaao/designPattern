package com.headfirst.api.chapter9.iterator;

import java.util.Iterator;

public class Waitress {
    PancakeHouseMenu  pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(PancakeHouseMenu  pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        //Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = (Iterator) dinerMenu.createIterator();

        System.out.println("메뉴\n ---- \n 아침메뉴");
        //printMenu(pancakeIterator);
        System.out.println("\n 점심 메뉴");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription() + ", ");
        }
    }
}