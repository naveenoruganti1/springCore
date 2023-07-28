package com.setterdi.beans;

import com.setterdi.intrf.Motor;

public class CromptonMotor implements Motor{

	@Override
	public void run() {
		System.out.println("Crompton Motor Started...");
	}
}
