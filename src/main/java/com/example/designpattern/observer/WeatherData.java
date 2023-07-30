package com.example.designpattern.observer;

import com.example.designpattern.observer.observer.Observer;
import com.example.designpattern.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;
    private float heatIndex;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(temp, humidity, pressure, heatIndex);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure, float heatIndex){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = heatIndex;
        measurementsChanged();
    }
}
