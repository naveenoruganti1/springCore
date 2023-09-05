package com.pcnames.beans;

public class Car {
	private String regId;
	private String manufacturer;
	private String color;
	private Engine engine;

	public void setRegId(String regId) {
		this.regId = regId;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [regId=" + regId + ", manufacturer=" + manufacturer + ", color=" + color + ", engine=" + engine
				+ "]";
	}
}
