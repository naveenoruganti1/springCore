package com.ia.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ia.beans.Exchange;
import com.ia.config.RootConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		Exchange exchange = context.getBean("exchange", Exchange.class);
		System.out.println(exchange);
	}

}
