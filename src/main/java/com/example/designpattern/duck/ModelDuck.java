package com.example.designpattern.duck;

import com.example.designpattern.fly.FlyNoWay;
import com.example.designpattern.quack.Squeak;

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
