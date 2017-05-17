package flat;

public class Flat {
 private int flatId;
 private String flatType;
 private double flatCost;
 
  public Flat(int faltId,String flatType,double flatCost)
  {
	  super();
	  this.flatId = flatId;
	  this.flatType = flatType;
	  this.flatCost = flatCost;
  }
 public int getflatId()
 {
	 return flatId;
 }
 public void setflatId(int flatId)
 {
	 this.flatId = flatId;
	
 }
 public String getflatType()
 {
	 return flatType;
 }
 public void setflatType(String flatType) throws InvalidInputException{
	 if(flatType.equals("1BHK")||flatType.equals("2BHK")||flatType.equals("3BHK"))
		 this.flatType = flatType;
	 else
		 throw new InvalidInputException("flat type must be 1BHK or 2BHK or 3BHK");
 }

public double getflatCost()
{
	return flatCost;
}
public void setflatCost(double flatCost)throws InvalidInputException
{
	if(flatCost>1000000)
	{
		this.flatCost=flatCost;
	}
		else 
			throw new InvalidInputException("flat cost must be more than 100000");
	}
}