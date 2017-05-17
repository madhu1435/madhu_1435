package com.help;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test 
{
	
	public static void main(String[] args) throws IOException 
	{
		CallRequest callRequest=new CallRequest();
		GenerateReport generateReport=new GenerateReport();
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Request Id:");
		int requestId=Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Id:");
		int empId=Integer.parseInt(br.readLine());
		System.out.println("Enter Problem:");
		 String problem=br.readLine();
		System.out.println("Enter Status:");
		String status=br.readLine();
		System.out.println("Enter Remarks:");
		String remarks=br.readLine();
		HelpDesk hd=new HelpDesk(requestId, empId, problem, status, remarks);
		
		callRequest.callRequest(hd);
			
		generateReport.generateReport();
				
			
		
		
	}

}
