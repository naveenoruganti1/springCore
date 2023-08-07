package com.nioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nioc.beans.Motor;

public class Test {

	public static void main(String[] args) {
		BeanFactory parentBeanFactory = new XmlBeanFactory(new ClassPathResource("com/nioc/common/parent-context.xml"));
		BeanFactory childBeanFactory = new XmlBeanFactory(new ClassPathResource("com/nioc/common/child-context.xml"),
				parentBeanFactory);
		Motor motor = childBeanFactory.getBean("motor", Motor.class);
		System.out.println(motor);
	}

}
