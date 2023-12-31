package com.example.demo;

import com.example.designpattern.observer.WeatherData;
import com.example.designpattern.observer.observer.CurrentConditionDisplay;
import com.example.designpattern.observer.observer.ForecastDisplay;
import com.example.designpattern.observer.observer.StatisticsDisplay;
import com.example.designpattern.strategy.duck.Duck;
import com.example.designpattern.strategy.duck.MallardDuck;
import com.example.designpattern.strategy.duck.ModelDuck;
import com.example.designpattern.strategy.fly.FlyRocketPower;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
/*
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.performFly();

		//Change the flying mode!
		model.setFlyBehavior(new FlyRocketPower());

		model.performFly();
*/

		SpringApplication.run(DemoApplication.class, args);

		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f, 12);
		weatherData.setMeasurements(60, 25, 15.3f, 14);
		weatherData.setMeasurements(40, 20, 50f, 12);
	}

}
