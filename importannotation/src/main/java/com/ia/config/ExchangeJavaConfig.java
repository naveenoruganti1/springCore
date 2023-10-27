package com.ia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ia.beans.Exchange;
import com.ia.beans.Telephone;

@Configuration
public class ExchangeJavaConfig {

	@Bean
	public Exchange exchange(@Value("${exchangeNo}") int exchangeNo,
			@Value("${area}") String area, Telephone telephone) {
		Exchange exchange = new Exchange(exchangeNo);
		exchange.setArea(area);
		exchange.setTelephone(telephone);
		return exchange;
	}
}
