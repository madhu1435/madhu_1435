package com.transmission;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread2 extends Thread {
	ArrayList al;
	
	public MyThread2(ArrayList al) {
		super();
		this.al = al;
	}
	public void run()
	{
		thread2();
	}
	public synchronized void thread2()
	   {
		   Iterator itr=al.iterator();
		   while(itr.hasNext())
		   {
			   itr.remove();
			   
		   }
			
	   }

}
