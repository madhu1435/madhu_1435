package com.vehicle1;
public class Car extends Vehicle
{
  boolean powerSteering=true;
  String fuelType="Gas";
 public Car(boolean power,String fuel) {
		super(vehicleNo, engineStatus, currentGear);
			
	}
 public void showCarDetails()
 {
 	System.out.println("the vehicle number is.."+super.vehicleNo);
 	System.out.println("engine status is.."+super.engineStatus);
 	System.out.println("current gear is.."+super.currentGear);
 	System.out.println("power steering is.."+powerSteering);
    System.out.println("fuel type is..."+fuelType);
 	
 }
   public void ignite() {
		 int flag=0;
		if(flag == 0)
			super.engineStatus="on";
		super.currentGear=1;
		System.out.println("engineStatus.."+engineStatus+"currentGear.."+currentGear);
	}
	public int changeGear(int flag) {
	if(flag == 1 && currentGear<=5)
	   {
		   super.currentGear+=1;
	   }
	   else if(flag ==-1 && currentGear>=2)
	   {
		   super.currentGear-=1;
	   }
	   else
	   {
		   System.out.println("invalid flag value"); 
	   }
	 System.out.println("current gear is.."+currentGear);
	return 0;
	}
	public void stop() {
	   int flag=0;
	   if(flag ==0)
		   super.engineStatus="off";
	   System.out.println("engine status is.."+engineStatus);
	}
	}
