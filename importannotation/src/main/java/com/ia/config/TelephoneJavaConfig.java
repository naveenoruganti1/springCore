package com.ia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ia.beans.Telephone;

@Configuration
public class TelephoneJavaConfig {
	
	@Bean
	public Telephone telephone(@Value("${telephoneNumber}") String telephoneNo, 
			@Value("${subscriptionType}") String subscriptionType) {
		Telephone telephone = new Telephone(telephoneNo);
		telephone.setSubscriptionType(subscriptionType);
		return telephone;
	}
}
