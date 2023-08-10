package com.awareinterface.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.awareinterface.beans.Car;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/awareinterface/common/application-context.xml"));
		Car car = beanFactory.getBean("car", Car.class);
		car.drive();
		
	}

}
