package com.vehicle.test;

import java.util.Scanner;
import com.vehicle1.Car;
import com.vehicle1.Vehicle;
public  class TestVehicle {
	 public static void main(String[] args)
	{
		boolean power=true;
    	String fuel=null;
		Vehicle v=new Car(power,fuel);
		v.ignite();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter flag value:");
		int flag=sc.nextInt();
		v.changeGear(flag);
		v.stop();
		sc.close();
		Car c =(Car) v;
		c.showCarDetails();
	}
}
