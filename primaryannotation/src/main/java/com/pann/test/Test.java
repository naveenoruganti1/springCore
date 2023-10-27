package com.pann.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pann.beans.Alarm;
import com.pann.beans.JavaConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Alarm alarm = context.getBean("alarm", Alarm.class);
		alarm.remaind();
	}
}
