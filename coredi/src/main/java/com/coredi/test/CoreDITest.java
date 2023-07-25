package com.coredi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.coredi.beans.MessageWritter;

public class CoreDITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory
				(new ClassPathResource("com/coredi/common/application-context.xml"));
		MessageWritter messageWritter =  beanFactory.getBean("messageWritter", MessageWritter.class);
		messageWritter.writeMessage("Welcome");
	}
}
