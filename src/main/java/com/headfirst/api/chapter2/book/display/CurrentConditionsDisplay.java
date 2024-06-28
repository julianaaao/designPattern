package com.headfirst.api.chapter2.book.display;

import com.headfirst.api.chapter2.book.observer.Observer;
import com.headfirst.api.chapter2.book.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    @Override
    public void display() {
        System.out.println("Current condition : Temperature : " + temperature + "F , Humidity : " + humidity + "%");
    }
}
