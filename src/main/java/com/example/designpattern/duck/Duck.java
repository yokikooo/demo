package com.example.designpattern.duck;

import com.example.designpattern.fly.FlyBehavior;
import com.example.designpattern.quack.QuackBehavior;

public abstract class Duck {

    //These are regularly changing, so we created an interface for them and all the variations
    //are created into separate classes which implement these interfaces!
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    //We want all the classes which extend the Duck class to implement display method,
    //so that it is displayed the variation of the Duck!
    public abstract void display();

    //This method is allowing to change the Flying Behavior during runtime, so that from one flying behavior
    //we can change to another
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    //This is calling the specific fly implementation of the specified fly behavior class
    public void performFly(){
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    //This method is inherited by all the classes that extend the Duck class because we don't have any change here
    //All the Duck types can swim in the same way!
    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
