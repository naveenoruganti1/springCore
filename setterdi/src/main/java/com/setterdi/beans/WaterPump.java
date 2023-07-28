package com.setterdi.beans;

import com.setterdi.intrf.Motor;

public class WaterPump {
	private Motor motor;
	public void on() {
		motor.run();
	}
	// setter Injection
	/*
	 * public void setMotor(Motor motor) { this.motor = motor; }
	 */
	
	//constructor injection
	public WaterPump(Motor motor) {
		this.motor = motor;
	}	
}
