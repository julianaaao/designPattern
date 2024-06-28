package com.headfirst.api.chapter2.book.display;

import com.headfirst.api.chapter2.book.observer.Observer;
import com.headfirst.api.chapter2.book.weather.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast : ");
        if(currentPressure > lastPressure){
            System.out.println("Improving weather on the way");
        }else if (currentPressure == lastPressure){
            System.out.println("More of the same");
        }else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
