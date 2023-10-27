package com.importann.beans;

//no source code
public class Thermostat {
	private HeatingElement heatingElement;
	
	public void setTempareture(int degrees) {
		System.out.println("setting heating element to tempareture : "+degrees);
		heatingElement.heat(degrees);
	}

	public void setHeatingElement(HeatingElement heatingElement) {
		this.heatingElement = heatingElement;
	}
}
