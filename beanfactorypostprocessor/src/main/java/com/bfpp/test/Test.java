package com.bfpp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bfpp.beans.ConnectionManager;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/bfpp/commons/application-context.xml");
		ConnectionManager manager = applicationContext.getBean("connectionManager",ConnectionManager.class);
		System.out.println(manager);
	}

}
