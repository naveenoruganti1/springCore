package com.collectiondi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.collectiondi.beans.Product;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/collectiondi/common/application-context.xml"));
		Product product = beanFactory.getBean("product", Product.class);
		System.out.println(product);
	}

}
