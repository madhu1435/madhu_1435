import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		ArrayList<CyberCafe> al=new ArrayList<CyberCafe>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s.nextInt();
		for(int i=0;i<number;i++)
		{
			
		
		System.out.println("Enter Cafe Name:");
		String cafeName=s.next();
		System.out.println("Enter Address:");
		String address=s.next();
		System.out.println("Enter no of members:");
		int	membersCount=s.nextInt();
		System.out.println("Enter rate:");
		int ratePerHour=s.nextInt();
		CyberCafe cyber = new CyberCafe(cafeName, address, membersCount, ratePerHour);
		
		al.add(cyber);
		}
		
		MyThread m=new MyThread(al);
		m.start();
		MyThread m1=new MyThread(al);
		m1.start();
		

	}

}
