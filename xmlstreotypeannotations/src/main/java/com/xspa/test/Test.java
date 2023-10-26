package com.xspa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xspa.beans.Job;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/xspa/commons/application-context.xml");
		Job job = context.getBean("job", Job.class);
		System.out.println(job);
	}
}
