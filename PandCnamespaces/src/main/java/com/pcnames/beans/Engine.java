package com.pcnames.beans;

public class Engine {
	private int engineId;
	private String model;

	public Engine(int engineId, String model) {
		super();
		this.engineId = engineId;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", model=" + model + "]";
	}
}
