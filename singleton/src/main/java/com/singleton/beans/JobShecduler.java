package com.singleton.beans;

public class JobShecduler {
	public void execute() {
		DateConverter converter = DateConverter.getInstance();
		System.out.println("JobShecduler "+converter.hashCode());
	}
}
