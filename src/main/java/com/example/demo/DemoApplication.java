package com.example.demo;

import com.example.designpattern.duck.Duck;
import com.example.designpattern.duck.MallardDuck;
import com.example.designpattern.duck.ModelDuck;
import com.example.designpattern.fly.FlyRocketPower;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.performFly();

		//Change the flying mode!
		model.setFlyBehavior(new FlyRocketPower());

		model.performFly();

		SpringApplication.run(DemoApplication.class, args);
	}

}
