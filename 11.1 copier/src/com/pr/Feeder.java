package com.pr;

import java.util.Scanner;
import java.util.Vector;

/*package com.pr;

 import java.util.Vector;

 public class Feeder extends Thread
 {
 Copier c=new Copier();
 public void place(Copier c)
 {

 System.out.println("Feeder:I have placed paper");
 c.start();
 }
 }*/

class Feeder extends Thread {
	// public int sum = 1;
	private Vector v;

	Feeder(Vector v) {
		this.v = v;
	}
	public void run() {
		synchronized (this) {
			System.out.println("Feeder:I have placed paper");
			Scanner sc = new Scanner(System.in);
			Vector v = new Vector();
			v.add(v);
			
			System.out.println("Feeder given notification");
			notify();
		}
	}

}