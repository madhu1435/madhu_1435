package flat;

import java.util.ArrayList;

public class Employee {
int empId;
String empName;
ArrayList<Flat> flatsSold=new ArrayList<>();
public Employee(int empId,String empName)
{
	this.empName = empName;
	this.empId=empId;
}
public double calculateIncentive(String flatType,double flatCost)
{
	if(flatType.equals("1BHK"))
		flatCost=0.04*flatCost;
	if(flatType.equals("2BHK"))
        flatCost=0.06*flatCost;
	if(flatType.equals("3BHK"))
		flatCost=0.08*flatCost;
	System.out.println("Incentive valiue:" +flatCost);
	return flatCost;
}
public void addFlat(Flat f)
{
	flatsSold.add(f);
}
public void generateReport(Flat f)
{
	System.out.println("EmpID:" +empId +"Empname:" +empName);
	System.out.println("Flat ID"+"  "+"Flat Type"+"  "+" Flat Cost");
	System.out.println(f.getflatId()+" "+ f.getflatType() + " "+ f.getflatCost());
}

}
