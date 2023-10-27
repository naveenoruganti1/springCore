package com.ia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:common.properties")
@Import({TelephoneJavaConfig.class, ExchangeJavaConfig.class})
public class RootConfig {

}
