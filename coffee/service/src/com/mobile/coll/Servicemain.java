package com.mobile.coll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mobile.exp.UnavailableServiceException;
import com.my.service.DataService;
import com.my.service.SMSService;
import com.my.service.Service;

public class Servicemain {
	static Service availableServices[];

	/*
	 * public Servicemain( availableServices[]) {
	 * this.availableServices[]=availableServices[5]; }
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter service id");

	Service service=ServiceCollection.getService(Integer.parseInt(br.readLine()));



		if (service==null) {
			try {
				throw new UnavailableServiceException();
			} catch (UnavailableServiceException e) {

				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("enter no of units");

			int noOfUnits = Integer.parseInt(br.readLine());
			
			System.out.println("the  charge is.."+ service.calculateCharge(noOfUnits));
		}
		
	}

}
