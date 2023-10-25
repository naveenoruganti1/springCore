package com.aan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Radio {
	@Autowired
	@Qualifier("digital")
	private Tuner tuner;

	@Override
	public String toString() {
		return "Radio [tuner=" + tuner + "]";
	}

//	@Autowired
//	public void setTuner(Tuner tuner) {
//		this.tuner = tuner;
//	}
}
