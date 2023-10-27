package com.pran.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:emp.properties")
public class JavaConfig {
	
//	@Autowired
//	private Environment env;
	
	@Bean
	public Employee emp(@Value("${empId}") int empId, @Value("${empName}")String empName, 
			@Value("${empSal}") String empSal, @Value("${designation}") String designation ) {
		Employee emp = new Employee();
//		emp.setEmpId(Integer.parseInt(env.getProperty("empId")));
//		emp.setEmpName(env.getProperty("empName"));
//		emp.setEmpSal(env.getProperty("empSal"));
//		emp.setDesignation(env.getProperty("designation"));
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpSal(empSal);
		emp.setDesignation(designation);
		return emp;
	}
}
