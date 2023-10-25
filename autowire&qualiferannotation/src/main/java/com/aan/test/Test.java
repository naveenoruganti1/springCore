package com.aan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aan.beans.Radio;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aan/commons/application-context.xml");
		Radio radio = context.getBean("radio",Radio.class);
		System.out.println(radio);

	}
}
