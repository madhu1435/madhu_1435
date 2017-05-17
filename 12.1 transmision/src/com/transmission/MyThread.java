package com.transmission;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread{
	ArrayList al;
	
	public MyThread(ArrayList al) {
		super();
		this.al = al;
	}
	public void run()
	{
		thread();
	}
   public synchronized void thread()
   {
	 Iterator itr=al.iterator();
	 while(itr.hasNext())
	 {
		 Transmission t=( Transmission)itr.next();
		 System.out.println("Bandwidth:"+t.bandwidth);
		 System.out.println("signalNoiseRatio:"+t.signalNoiseRatio);
		 System.out.println("propagationTime:"+t.propagationTime);
		 System.out.println("crosstalk:"+t.crosstalk);
	 }
	   
	 
   }
   
}
