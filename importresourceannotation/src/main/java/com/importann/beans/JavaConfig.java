package com.importann.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.importann.beans")
@ImportResource("classpath:com/importann/commons/application-context.xml")
public class JavaConfig {

	@Bean
	public HeatingElement heatingElement() {
		return new HeatingElement();
	}
}
