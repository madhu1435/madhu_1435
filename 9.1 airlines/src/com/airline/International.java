package com.airline;

public class International extends Airlines {
	String countryCode;
	double ticketCost;
	
	public International(String airId,String source,String destination, String countryCode)
	{
		super(airId,source,destination);
		this.countryCode=countryCode;

	}
	public void bookTicket(int noOfTickets)
	{
		double totalCost;
		if(countryCode.equals("I001")){
			ticketCost=25000;
			totalCost=noOfTickets*ticketCost;
			System.out.println("TOTALCOST IS:"+totalCost);
			}
        else if(countryCode.equals("I002")){
            ticketCost=36000;
        totalCost=noOfTickets*ticketCost;
        System.out.println("TOTALCOST IS:"+totalCost);
        }
        else if(countryCode.equals("I003")){
            ticketCost=38000;
        totalCost=noOfTickets*ticketCost;
        System.out.println("TOTALCOST IS:"+totalCost);} 
		}
	}
