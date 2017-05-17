package com.airline;

public abstract  class Airlines {
String airId;
String source;
String destination;

public Airlines(String airId,String source,String destination)
{
	if(airId.startsWith("BOEING")){
	
		this.airId=airId;
		this.source=source;
		this.destination=destination;
	}
	else 
	{
		try{
			
		
		throw new InvalidInputException();
		}
		catch(RuntimeException e)
		{
			System.out.println(e.toString());
		}
	}
	if(!source.matches(destination)){
		this.source=source;
		this.destination=destination;
	}
	else
		try{
			
			
			throw new InvalidInputException();
			}
			catch(RuntimeException e)
			{
				System.out.println(e.toString());
			}
		}

public abstract   void  bookTicket(int noOfTickets);
}