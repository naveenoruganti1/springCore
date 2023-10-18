package com.bpp.test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Gasstation;
import com.bpp.beans.ObjectTracker;
import com.bpp.beans.ObjectTrackerBPP;
import com.bpp.beans.ToolBox;

public class Test {

	public static void main(String[] args) {
		try {
//			DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//			BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//			reader.loadBeanDefinitions(new ClassPathResource("com/bpp/commons/application-context.xml"));
//			BeanPostProcessor beanPostProcessor= beanFactory.getBean("objectTrackerBpp", ObjectTrackerBPP.class);
//			beanFactory.addBeanPostProcessor(beanPostProcessor);
			
			//The application context will loaded the object for beans and as well as beanpostprocessors
			ApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/bpp/commons/application-context.xml");
			Gasstation gasstation = beanFactory.getBean("gasstation",Gasstation.class);
			ToolBox box = beanFactory.getBean("toolBox",ToolBox.class);
			System.out.println(ObjectTracker.getCounter());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
