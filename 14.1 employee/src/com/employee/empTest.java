package com.employee;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;



public class empTest {
	public static void main(String[] args) {
		System.out.println("Enter the No of Employees\t:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vector v=new Vector();
		for(int i=0;i<n;i++)
		{
			Employee e=new Employee();
			System.out.println("Enter Employee "+(i+1)+" Details");
			System.out.println("Emter empNo\t:");
			e.empNo=sc.nextInt();
			System.out.println("Enter Basic pay, hra, conveyance, epf, tax ");
			e.basicPay=sc.nextFloat();
			e.hra=sc.nextFloat();
			e.conveyance=sc.nextFloat();
			e.epf=sc.nextFloat();
			e.tax=sc.nextFloat();
			v.add(e);
		}
		
		Enumeration e=v.elements();
			while (e.hasMoreElements())
			{
				synchronized (e) 
				{
					MyThread m = new MyThread((Employee) e.nextElement());
					m.start();
	
				}
			}
		System.out.println("Main thread");

	}
	
}
