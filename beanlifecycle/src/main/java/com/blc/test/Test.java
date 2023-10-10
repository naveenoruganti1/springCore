package com.blc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blc.beans.Rectangle;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource
				("com/blc/commons/application-context.xml"));
		Rectangle rectangle = beanFactory.getBean("rectangle", Rectangle.class);
		System.out.println(rectangle);
		((ConfigurableListableBeanFactory)beanFactory).destroySingletons();
		System.out.println(rectangle);
	}
}
