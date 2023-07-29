package com.example.designpattern.strategy.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
