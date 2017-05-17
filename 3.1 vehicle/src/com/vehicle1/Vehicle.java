package com.vehicle1;
public  abstract class Vehicle {
	static int vehicleNo;
	 protected static String engineStatus;
	 protected static int currentGear;
	 public Vehicle(int vehicleNo,String engineStatus,int currentGear) {
		 this.vehicleNo=(int)Math.round(Math.random()*100);
		this.engineStatus="on";
		this.currentGear=(int)Math.round(Math.random()*10);
		}
	 public abstract void ignite();
	 public abstract int changeGear(int flag);
	 public abstract void stop();
} 
 