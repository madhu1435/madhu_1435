package com.store;

public class Order {
	
	 private int orderId;
	 private String customerName;
	 private float orderAmount;
	 private String paymentOption;
	
	 public Order(int orderId,String customerName,float orderAmount,String paymentOption) 
	 {
	   
		 this.customerName=customerName;
		 this.orderId=orderId;
		 this.paymentOption=paymentOption;
		 this.orderId=orderId;
		  
	 }
	 
	 
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}


	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}


	public int getOrderId() {
		return orderId;
	}

	

	public String getCustomerName() {
		return customerName;
	}

	

	public float getOrderAmount() {
		return orderAmount;
	}

	
	public String getPaymentOption() {
		return paymentOption;
	}

	


}
