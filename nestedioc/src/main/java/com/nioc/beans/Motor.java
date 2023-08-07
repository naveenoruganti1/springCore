package com.nioc.beans;

public class Motor {
	public String motorName;
	public FuelTank fuelTank;

	public void setMotorName(String motorName) {
		this.motorName = motorName;
	}
	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}
	@Override
	public String toString() {
		return "Motor [motorName=" + motorName + ", fuelTank=" + fuelTank + "]";
	}
}
