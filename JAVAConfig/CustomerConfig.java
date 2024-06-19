package com.JAVAConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean(name="customer1")
	public Customer getCustomer() {
		
		return new Customer();
		
	}
	
	@Bean(name="customer2")
	public Customer getCustomer2() {
		
		return new Customer();
		
	}

}
