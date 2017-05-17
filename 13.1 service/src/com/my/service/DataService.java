package com.my.service;

public class DataService extends Service{
	int charge=0;
	int chargeableUnits=0;
	@Override
	public int calculateCharge(int noOfUnits) {
		
		if(noOfUnits<=getFreeUnits())
		{
			charge=0;
		}
		else
		{
			charge=(int)(noOfUnits-getFreeUnits() * 0.02); 
		}
		return charge;

	}
	

}

