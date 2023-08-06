package com.beanautowire.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanautowire.beans.SalesOrder;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/beanautowire/common/application-context.xml"));
		SalesOrder salesOrder = beanFactory.getBean("salesOrder", SalesOrder.class);
		System.out.println(salesOrder);
	}
}
