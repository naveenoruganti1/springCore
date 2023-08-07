package com.nioc.beans;

public class FuelTank {
	public String fuelName;
	public String capacity;

	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "FuelTank [fuelName=" + fuelName + ", capacity=" + capacity + "]";
	}
}
