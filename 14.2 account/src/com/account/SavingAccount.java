package com.account;

public class SavingAccount extends Account {
	double  intRate ;

	public SavingAccount(int accNo, double currentBalance, String accHolder,
			String address, double intRate) {
		super(accNo, currentBalance, accHolder, address);
		this.intRate = intRate;
	}

	@Override
	double calculateInterest(double amt) {
		
		return (intRate/100)*amt ;
	}
	
  

   
}
