package com.example.designpattern.duck;

import com.example.designpattern.fly.FlyNoWay;
import com.example.designpattern.quack.MuteQuack;

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
