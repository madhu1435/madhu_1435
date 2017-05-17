package com.pr;

import java.util.Enumeration;
import java.util.Vector;

class Copier extends Thread {
	private Vector v;
	private Feeder f;
	private Press p;
	int count=0;

	public Copier(Vector v, Feeder f) {
		this.v = v;
		this.f = f;
	}

	public void run() {
		
		synchronized (f) {
			//System.out.println("consumer got lock");
			try {
				f.wait();
				System.out.println("copier:i have printed paper"+count++);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			Enumeration e = v.elements();
			while (e.hasMoreElements()) {
				// System.out.println("the elements.." + e.nextElement());
				count++;
				p = (Press) e.nextElement();

			}
		}
	}
}
