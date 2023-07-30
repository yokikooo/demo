package com.example.designpattern.observer.subject;

import com.example.designpattern.observer.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
