package com.pann.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alarm {
	@Autowired
	private Bell bell;
	
	public void remaind() {
		bell.ring();
	}
}
