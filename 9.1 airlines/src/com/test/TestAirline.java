package com.test;

import java.util.Scanner;

import com.airline.Airlines;
import com.airline.Domestic;
import com.airline.International;
import com.airline.InvalidInputException;

public class TestAirline {

	public static void main(String[] args)throws InvalidInputException{
		Scanner s=new Scanner(System.in);
		Airlines[] a=new Airlines[2];
		System.out.println("Enter the values of Domestic Airlines");
	    a[0]=new Domestic(s.next(),s.next(),s.next(),s.next());
	    System.out.println("Enter the values of International Airlines");
	    a[1]=new International(s.next(),s.next(),s.next(),s.next());
	    a[0].bookTicket(2);
	    a[1].bookTicket(2);
		
	}
}
