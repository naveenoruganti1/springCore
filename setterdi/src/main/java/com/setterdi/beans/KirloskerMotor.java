package com.setterdi.beans;

import com.setterdi.intrf.Motor;

public class KirloskerMotor implements Motor{

	@Override
	public void run() {
		System.out.println("Kirlosker Motor Started...");
	}
	
}
