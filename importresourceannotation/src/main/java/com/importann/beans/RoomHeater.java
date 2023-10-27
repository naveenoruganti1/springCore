package com.importann.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//source code
@Component
public class RoomHeater {
	@Autowired
	private Thermostat thermostat;
	
	public void on(int degrees) {
		System.out.println("turned on tempareture : "+degrees);
		thermostat.setTempareture(degrees);
	}
}
