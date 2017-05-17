package com.store;

import java.util.TreeMap;


public class OrderServiceUtil {
	
	
	Order order;
    
	 public OrderServiceUtil(Order order) {
		super();
		this.order = order;
	}

	
	public void addOrder(Order o1)
	{
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(o1.getOrderId(),o1.getCustomerName());
		System.out.println("your order has been added ...");
	}
	
	public Order searchOrder(int OrderId)
	{
		System.out.println("your ordered items has been found ..");
		return order;
	}
	
	public void findTotal()
	{
		order.setOrderAmount((int) (Math.random() * 1000));
		System.out.println("your bill amount is ....");
		System.out.println(order.getOrderAmount());
		
	}

	public boolean validate() throws InvalidOrderException
	 {  
		
		
		
		  if(order.getOrderAmount()<100) throw new InvalidOrderException("amount should be greater than 100");
		  
			  
			  return false;
		  
		  
		  /*if(order.getPaymentOption() =="COD" || order.getPaymentOption() =="InternetBanking") throw new InvalidOrderException("sorry COD is not allowed ..");
		  
			  return false;
		*/
		
		  
		 
		 
			 
		
		  }} 
		  
	 
	

