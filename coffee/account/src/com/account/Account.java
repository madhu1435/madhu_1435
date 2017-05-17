package com.account;

public abstract class Account {
	int accNo    ;  	  	
	double currentBalance ; 	
	String accHolder  ;	   
	String address;
	public Account(int accNo, double currentBalance, String accHolder,
			String address) {
		super();
		this.accNo = accNo;
		this.currentBalance = currentBalance;
		this.accHolder = accHolder;
		this.address = address;
	}	
	abstract double calculateInterest(double amt);

}
