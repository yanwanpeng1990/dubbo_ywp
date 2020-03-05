package com.shican.spi.car.impl;

import com.shican.spi.car.Car;

public class SmallCar implements Car<Father>{
	public void drive() {
		System.out.println("small(default) car is driving");
	}

}
