package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.fly.FlyNoWay;
import com.example.designpattern.strategy.quack.MuteQuack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Redhead Duck!");
    }
}
