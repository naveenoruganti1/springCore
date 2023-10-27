package com.importann.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.importann.beans.JavaConfig;
import com.importann.beans.RoomHeater;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		RoomHeater roomHeater = context.getBean("roomHeater", RoomHeater.class);
		roomHeater.on(100);
	}

}
