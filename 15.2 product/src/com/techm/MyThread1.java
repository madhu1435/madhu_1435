package com.techm;

import java.util.ArrayList;
import java.util.Scanner;

public class MyThread1 extends Thread
{
	ArrayList al;
	
	
	public MyThread1(ArrayList al) {
		
		this.al = al;
	}

	public synchronized void m1()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter product number:");
			int prodNo=sc.nextInt();
			System.out.println("Enter product name:");
			String prodName=sc.next();
			System.out.println("Enter product price:");
			int prodPrice=sc.nextInt();
			
			Product p=new Product();
			p.setProdNo(prodNo);
			p.setProdName(prodName);
			p.setProdPrice(prodPrice);
			
			al.add(p);
		}
	}
	public void run()
	{
		m1();
	}
	
}
