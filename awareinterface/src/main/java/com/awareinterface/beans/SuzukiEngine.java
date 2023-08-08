package com.awareinterface.beans;

public class SuzukiEngine implements IEngine{

	@Override
	public void drive() {
		System.out.println("Suzuki Engine Started.....");
	}
}
