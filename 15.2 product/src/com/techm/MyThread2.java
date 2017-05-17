package com.techm;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread2 extends Thread
{
	ArrayList al;
	MyThread1 t1;
	
	public MyThread2(MyThread1 t1,ArrayList al) {
		super();
		this.t1=t1;
		this.al = al;
	}
	public synchronized void m1() throws InterruptedException
	{
	
		t1.join();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Product p=(Product) itr.next();
			
			System.out.println("Product No:"+p.getProdNo()+"\nProduct Name:"+p.getProdName()+"\nProduct Price:"+p.getProdPrice());
			
		}
		
	}
	public void run()
	{
		try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
