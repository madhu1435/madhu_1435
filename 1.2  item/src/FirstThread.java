import java.util.ArrayList;
import java.util.Scanner;


public class FirstThread extends Thread {
	Item item[]=new Item[5];
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	public void run(){
		synchronized(this){
			System.out.println("first thread getting lock to take the item details \n");
			for(int obj=0;obj<5;obj++){
				System.out.println("enter item" + (obj+1)+ "details");
				System.out.println("enter item id");
				int id=sc.nextInt();
				System.out.println("enter the itemname");
				String name=sc.next();
				item[obj]=new Item(id,name);
				al.add(item[obj]);
				
				
			}
			System.out.println("\nfirst thread giving notification to second thread \n");
		}
	}


	
	
	

}
