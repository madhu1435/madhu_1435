package com.bank;

import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class Customer  {
private int custNo;
private String custName;
private int custPhone;
Account al;
static TreeSet account = new TreeSet();



public Customer(int custNo, String custName, int custPhone) {
	super();
	this.custNo = custNo;
	this.custName = custName;
	this.custPhone = custPhone;
}
public int getCustNo() {
	return custNo;
}
public String getCustName() {
	return custName;
}
public int getCustPhone() {
	return custPhone;
}
public void addNewAccount(Account al) throws InterruptedException, IOException{
	account.add(al);
		
}
public TreeSet getAccountList(){
	
	return account;
}

public void printBal(Account al){
	
} 


}
