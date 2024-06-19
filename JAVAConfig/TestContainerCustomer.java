package com.JAVAConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContainerCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);

		Customer customer1 = (Customer) context.getBean("customer1"); 
		customer1.setCustomer_Id(103);
		customer1.setCustomer_Name("Atul");
		customer1.setCustomer_Address("Pune");
		
		System.out.println(customer1);
		
		System.out.println("--------------------------------");
		
		Customer customer2 = (Customer) context.getBean("customer1"); 
		customer2.setCustomer_Id(106);
		customer2.setCustomer_Name("Madhav");
		customer2.setCustomer_Address("Nanded");
		
		System.out.println(customer2);
	}

	

}
