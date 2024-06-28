package com.headfirst.api.chapter2.book;

import com.headfirst.api.chapter2.book.display.CurrentConditionsDisplay;
import com.headfirst.api.chapter2.book.display.ForecastDisplay;
import com.headfirst.api.chapter2.book.display.StatisticDisplay;
import com.headfirst.api.chapter2.book.weather.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(84, 65, 30.4f);
        weatherData.setMeasurements(58, 70, 29.2f);
        weatherData.setMeasurements(67, 90, 24.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(96, 84, 28.1f);
    }
}
