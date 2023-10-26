package com.jconf.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Motor motor() {
		Motor motor = new Motor();
		return motor;
	}
	
	@Bean
	public Car car(Motor motor) {
		Car car = new Car(motor);
		return car;
	}
}
