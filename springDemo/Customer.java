package com.springDemo;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	
	public Customer() {
		
	}


	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	
}
