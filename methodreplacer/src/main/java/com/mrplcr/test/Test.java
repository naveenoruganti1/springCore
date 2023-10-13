package com.mrplcr.test;

import java.util.List;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.mrplcr.beans.PlanFinder;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/mrplcr/commons/application-context.xml"));
		PlanFinder finder = beanFactory.getBean("planFinder", PlanFinder.class);
		List<String> plans = finder.planFinder("23-25", 0, "Health Insurence", true);
		plans.stream().forEach(System.out::println);
	}
}
