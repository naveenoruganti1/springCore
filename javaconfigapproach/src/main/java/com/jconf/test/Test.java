package com.jconf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jconf.beans.Car;
import com.jconf.beans.JavaConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Car car = context.getBean("car",Car.class);
		car.start();
	}

}
