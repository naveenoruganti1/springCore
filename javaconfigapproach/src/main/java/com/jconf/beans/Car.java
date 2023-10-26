package com.jconf.beans;

//no source code
public class Car {
	private Motor motor;

	public Car(Motor motor) {
		this.motor = motor;
	}
	
	public void start() {
		motor.on();
	}
}
