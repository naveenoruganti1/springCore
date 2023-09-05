package com.pcnames.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pcnames.beans.Car;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/pcnames/common/application-context.xml"));
		Car car = beanFactory.getBean("car", Car.class);
		System.out.println(car);
	}
}
