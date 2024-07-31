package com.headfirst.api.chapter9.iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;   //반복 작업이 처리되고 있는 위치를 저장

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}