import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class MyThread extends Thread
{
	ArrayList al;
	
	public MyThread(ArrayList al) {
		super();
		this.al = al;
		//System.out.println("size:"+al.size());
	}



	public void run()
	{
		synchronized(this)
		{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter cafe name:");
		String cafename=s.next();
				
		Iterator itr = al.iterator();
		int count=0;
		while(itr.hasNext())
		{
			CyberCafe cyber=(CyberCafe)itr.next();
			if(cyber.getCafeName().equals(cafename))
			{
				System.out.println("Cyber Cafe name:"+cyber.getCafeName());
				System.out.println("Cyber Cafe Address:"+cyber.getAddress());
				System.out.println("Cyber Cafe members:"+cyber.getMembersCount());
				System.out.println("Cyber Cafe Rate:"+cyber.getRatePerHour());
				count++;
				
			}
			
		}
		if(count==0)
		{
			System.out.println("Not in the list");
			
		}
		}
	}

	
}
