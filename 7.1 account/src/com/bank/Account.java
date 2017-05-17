package com.bank;
class InvalidDataException extends RuntimeException{
	public InvalidDataException(String s){
		super(s);
	}
}
public class Account implements Comparable {
private String accountNumber;
private double accountBalance;
private String chequeBookstatus;
public Account(String accountNumber, double accountBalance, String chequeBookstatus) {
	super();
	InvalidDataException ide1 = new InvalidDataException("invalid account number");
	InvalidDataException ide2 = new InvalidDataException("Minimum balance should be 1000");
	InvalidDataException ide3 = new InvalidDataException("cheque book status shouldbe YES or NO");
	
	if(accountNumber.substring(0, 3).equals("ACC"))
	{
	this.accountNumber = accountNumber;
	}else throw ide1;
	
	if(accountBalance>1000)
	{
	this.accountBalance = accountBalance;
	}else throw ide2;
	if(chequeBookstatus.equals("YES")||chequeBookstatus.equals("NO"))
	{
		this.chequeBookstatus = chequeBookstatus;
	}else throw ide3;
}
public String getAccountNumber() {
	return accountNumber;
}
public double getAccountBalance() {
	return accountBalance;
}
public String getChequeBookstatus() {
	return chequeBookstatus;
}
public int compareTo(Object o) {
	Account a = (Account)o;
	return getAccountNumber().compareTo(a.getAccountNumber());
}
}
