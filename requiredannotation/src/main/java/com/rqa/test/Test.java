package com.rqa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rqa.beans.Robot;

public class Test {
	public static void main(String[] args) {
		BeanFactory context = new XmlBeanFactory(new ClassPathResource(
				"com/rqa/commons/application-context.xml"));
		BeanPostProcessor postProcessor = context.getBean("bpp", BeanPostProcessor.class);
		((DefaultListableBeanFactory)context).addBeanPostProcessor(postProcessor);
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/rqa/commons/application-context.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
