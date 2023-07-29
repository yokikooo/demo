package com.example.designpattern.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying Not!");
    }
}
