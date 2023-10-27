package com.pann.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.pann.beans")
public class JavaConfig {
	@Bean
	@Primary
	public MonoBell monoBell() {
		MonoBell monoBell = new MonoBell();
		return monoBell;
	}
	@Bean
	public DigitalBell digitalBell() {
		DigitalBell digitalBell = new DigitalBell();
		return digitalBell;
	}
}
