package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.fly.FlyNoWay;
import com.example.designpattern.strategy.quack.Squeak;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Model Duck!");
    }
}
