package com.cpe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cpe.beans.GeoLocation;
import com.cpe.registring.NavigationPropertyRegistarer;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/cpe/common/application-context.xml"));
		((ConfigurableListableBeanFactory)beanFactory).addPropertyEditorRegistrar(new NavigationPropertyRegistarer());
		GeoLocation geoLocation = beanFactory.getBean("GeoLocation", GeoLocation.class);
		System.out.println(geoLocation);
	}
}
