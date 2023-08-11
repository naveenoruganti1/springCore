package com.singleton.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	public static DateConverter instance;

	private DateConverter(){
	}
	public static DateConverter getInstance() {
		if(null==instance) {
			instance = new DateConverter();	
		}
		return instance;
	}
	
	public Date toDate(String inputDate, String pattern) throws ParseException {
		Date date = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		date = dateFormat.parse(inputDate);
		return date;
	}
}
