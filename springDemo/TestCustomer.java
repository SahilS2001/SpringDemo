package com.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		
		Customer customer = (Customer)context.getBean("customer");
		
		System.out.println(customer.toString());
	}

}
