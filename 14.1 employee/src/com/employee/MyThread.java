package com.employee;


public class MyThread extends Thread{
	Employee e;
	static int emp_count=1;
	MyThread(Employee e)
	{
		this.e=e;
	}
	public void run()
	{
		
		
			float NetSalary=e.basicPay+e.hra+e.conveyance-e.epf-e.tax;
			System.out.println("NetSalary of Employee "+emp_count+" with EMP_Id "+e.empNo+" is... "+NetSalary);
			emp_count++;
			System.out.println("end of salary generation");
	}
	
}
