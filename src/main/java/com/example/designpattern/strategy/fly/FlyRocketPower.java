package com.example.designpattern.strategy.fly;

public class FlyRocketPower implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying as a Rocket!");
    }
}
