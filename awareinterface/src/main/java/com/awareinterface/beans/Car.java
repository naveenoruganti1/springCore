package com.awareinterface.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware{
	public String engineId;
	public BeanFactory beanFactory;

	public Car(String engineId) {
		this.engineId = engineId;
	}

	public void drive() {
		IEngine engine;
		engine = beanFactory.getBean(engineId, IEngine.class);
		engine.drive();
		System.out.println("DRIVE....");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}
