package com.account;

import java.util.Scanner;

public class Bank {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int accNo;
		double currentBalance;
		String accHolder;
		String address;
		double intRate;
		System.out.println("Enter accNo"); accNo=sc.nextInt();
		System.out.println("Enter CurrentBalance "); currentBalance=sc.nextDouble();
		
		if(currentBalance<=0)
		{
			try {
				throw new MinBalanceException();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Enter accHolder"); accHolder=sc.next();
			System.out.println("Enter address "); address=sc.next();
			System.out.println("Enter intRate"); intRate=sc.nextDouble();
			SavingAccount sa=new SavingAccount(accNo,currentBalance, accHolder, address, intRate);
			
			System.out.println("Total amount is ");
			double total=currentBalance+sa.calculateInterest(currentBalance);
			System.out.println(total);
		}

	}

}
