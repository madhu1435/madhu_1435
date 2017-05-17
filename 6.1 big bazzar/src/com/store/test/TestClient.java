package com.store.test;
import com.store.*;
import java.util.Scanner;

import com.store.InvalidOrderException;

public class TestClient{

	
	public static void main(String[] args) throws InvalidOrderException {
		
		Scanner sc = new Scanner(System.in);
	int orderId = (int) (Math.random() * 10000);
	  System.out.println("enter order id");
	  int orderID=sc.nextInt();
	  System.out.println("please enter your name");
	  String customerName = sc.next();
	  System.out.println("enter order amount");
	  float orderAmount = sc.nextFloat();
	  System.out.println("please enter the type of order");
	  String paymentOption = sc.next();
	  
	  
	  Order od = new Order(orderId,customerName,orderAmount,paymentOption);
	  
	  OrderServiceUtil osc = new OrderServiceUtil(od);
	  osc.addOrder(od);
	  osc.searchOrder(orderId);
	  osc.findTotal();
	 boolean value = osc.validate();
	  
	  
	  
		

	}

}
