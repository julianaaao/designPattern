package com.headfirst.api.chapter2.book.observer;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers(); //method called to notify ob when subject's sts has changed
}
