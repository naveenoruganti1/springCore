package com.pann.beans;

public class DigitalBell implements Bell{

	@Override
	public void ring() {
		System.out.println("Digital bell rings");
	}
}
