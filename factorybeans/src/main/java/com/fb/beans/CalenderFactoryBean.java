package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalenderFactoryBean implements FactoryBean{
	private int day;
	private int month;
	private int year;
	private int hours;
	private int minutes;
	
	public CalenderFactoryBean(int day, int month, int year, int hours, int minutes) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
	}

	@Override
	public Object getObject() throws Exception {
		System.out.println("getObject()");
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day, hours, minutes);
		return calendar;
	}

	@Override
	public Class getObjectType() {
		System.out.println("getObjectTyep()");
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton()");
		return true;
	}
	
}
