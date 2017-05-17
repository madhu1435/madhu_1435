package bill;

import java.util.Scanner;

import bill.Customer;
import bill.premiumCustomer;
import bill.RegularCustomer;

public class TestClient
{
	private static Scanner sc;

	public static void main(String args[])
	{
		Customer c[] = new Customer[2]; 
		sc = new Scanner(System.in);
		System.out.println("Enter 0 for Regular Customer\n1 for Premium Customer");
		int x = sc.nextInt();
		
		System.out.println("Enter  Customer details");
		int customerId= (int)Math.round(Math.random()*10);
		
		System.out.println("Enter Customer Name");
		String customerName=sc.next();
		
		System.out.println("Enter mobile no:");
		long mobileNo = sc.nextLong();
		
		System.out.println("Enter Bill Number");
		int billNo=sc.nextInt();
		
		System.out.println("Enter number of minutes:");
		 int minutes=sc.nextInt();

		switch(x){
		
			case 0:
				c[0]= new RegularCustomer(customerId, customerName, mobileNo, billNo, minutes);
				c[0].calculateBill(minutes);
				System.out.println(c[0]);
				break;
			case 1:
				c[1]= new premiumCustomer(customerId, customerName, mobileNo, billNo, minutes);
				c[1].calculateBill(minutes);
				System.out.println(c[1]);
				break;
			default:
				System.out.println("Invalid Option");
				
		}
	}
}
