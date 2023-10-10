package com.fb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fb.beans.Meeting;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/fb/commons/application-context.xml"));
		Meeting meeting = beanFactory.getBean("meeting",Meeting.class);
		System.out.println(meeting);

	}

}
