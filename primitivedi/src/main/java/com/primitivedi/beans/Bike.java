package com.primitivedi.beans;

public class Bike {
	private String engineNo;
	private String chasisNo;
	private String registrationNo;
	private String color;
	private String fuelType;

	public Bike(String engineNo, String chasisNo, String registrationNo) {
		super();
		this.engineNo = engineNo;
		this.chasisNo = chasisNo;
		this.registrationNo = registrationNo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Bike [engineNo=" + engineNo + ", chasisNo=" + chasisNo + ", registrationNo=" + registrationNo
				+ ", color=" + color + ", fuelType=" + fuelType + "]";
	}
	
}
