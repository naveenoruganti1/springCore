package com.awareinterface.beans;

public class YamahaEngine implements IEngine{

	@Override
	public void drive() {
		System.out.println("Yamaha Engine Started.....");
	}
}
