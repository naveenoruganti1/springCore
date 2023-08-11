package com.singleton.beans;

public class AssingJobShedulaer {
	public void assign() {
		DateConverter converter = DateConverter.getInstance();
		System.out.println("AssignJobShecduler "+converter.hashCode());
	}
}
