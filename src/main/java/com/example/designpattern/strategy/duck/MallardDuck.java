package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.fly.FlyWithWings;
import com.example.designpattern.strategy.quack.Squeak;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.print("I'm a real Mallard Duck!");
    }
}
