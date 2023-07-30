package com.example.designpattern.observer.observer;

import com.example.designpattern.observer.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    private float heatIndex;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure, float heatIndex) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = heatIndex;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temp + " F degree and " + humidity + "% humidity and " + pressure
        + "  pressure and " + heatIndex + " heat index");
    }
}
