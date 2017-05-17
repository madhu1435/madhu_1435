package com.my.service;

public class SMSService extends Service{
	int chargeableUnits;
	int charge;
	
	@Override
	public int calculateCharge(int noOfUnits) {
		
	if(noOfUnits<=getFreeUnits())
	{
	 charge=0;
		
	}
	else
	{
		 chargeableUnits=noOfUnits-getFreeUnits();

	}
	if(chargeableUnits<=getFreeUnits())
	
	{
		charge=(int)(chargeableUnits*0.5);
	}
	else if(chargeableUnits>getFreeUnits())
	{
		charge = (int) ((getFreeUnits() * 0.5 ) + ((chargeableUnits-getFreeUnits()) * 0.2));
	}
	else
	{
		System.out.println();
	}
		return charge;
	}



}
