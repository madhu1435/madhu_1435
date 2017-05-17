package com.mobile.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceBill {
	double mobileNumber;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter mobile number");
		double mobileNumber = (Integer.parseInt(br.readLine()));
		System.out.println("enter the number of services you have");
		int num = (Integer.parseInt(br.readLine()));
		for(int i=0;i<num;i++)
		{
			System.out.println("enter service id");
		int serid=(Integer.parseInt(br.readLine()));
		System.out.println("enter number of units");
		int serno=(Integer.parseInt(br.readLine()));
		
		}

	}

}
