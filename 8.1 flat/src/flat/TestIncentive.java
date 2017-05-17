package flat;

import java.util.Scanner;

public class TestIncentive {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the flatId");
	int t=sc.nextInt();
	System.out.println("enter the flatType");
	String s=sc.next();
	System.out.println("enter the flatCost");
	double z=sc.nextDouble();
	
	Flat f= new Flat(t,s,z);
	System.out.println("enter the emp id");
	int em=sc.nextInt();
	System.out.println("enter the empName");
	String ename=sc.next();
	Employee e = new Employee(em,ename);
	e.calculateIncentive(f.getflatType(),f.getflatCost());
	e.addFlat(f);
	e.generateReport(f);
	sc.close();
}
}
