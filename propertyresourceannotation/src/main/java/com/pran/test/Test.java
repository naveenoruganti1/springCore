package com.pran.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pran.beans.Employee;
import com.pran.beans.JavaConfig;
import com.pran.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.pran.beans");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Employee employee = context.getBean("emp", Employee.class);
//		System.out.println(employee);
	}
}
