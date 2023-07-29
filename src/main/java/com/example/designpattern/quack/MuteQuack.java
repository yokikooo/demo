package com.example.designpattern.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
