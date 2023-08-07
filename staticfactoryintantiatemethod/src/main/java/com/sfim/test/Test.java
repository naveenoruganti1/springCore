package com.sfim.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfim.beans.JobShechduler;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/sfim/common/application-context.xml"));
		JobShechduler jobShechduler = beanFactory.getBean("jobschedular", JobShechduler.class);
		System.out.println(jobShechduler);
	}
}
