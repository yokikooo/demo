package com.example.designpattern.duck;

import com.example.designpattern.fly.FlyWithWings;
import com.example.designpattern.quack.Squeak;

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
