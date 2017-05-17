package com.transmission;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<Transmission> al = new ArrayList<Transmission>();
		for(int count=0;count<5;count++)
		{
		System.out.println("Enter Bandwidth:");
		int bandwidth=s.nextInt();
		System.out.println("Enter signalNoise Ratio:");
		double signalNoiseRatio=s.nextDouble();
		System.out.println("Enter propagationTime:");
		int propagationTime=s.nextInt();
		System.out.println("Enter crosstalk:");
		float crosstalk=s.nextFloat();
		
			
		Transmission t = new Transmission(bandwidth, signalNoiseRatio, propagationTime, crosstalk);
	
		al.add(t);
	}
		
		MyThread mythread=new MyThread(al);
		mythread.start();
		MyThread2 mythread2=new MyThread2(al);
		mythread2.start();
		
	}

}
