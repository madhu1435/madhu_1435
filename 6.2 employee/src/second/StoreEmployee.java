package second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class StoreEmployee {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		System.out.println("enter the details of the employee ");
		System.out.println("enter the employeeId");
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		System.out.println("enter the employee name ");
		String empName = sc.next(); 
		System.out.println("enter the department_number");
		int deptNo = sc.nextInt();
		Employee emp = new Employee();
		emp.setDeptNo(deptNo);
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		
		FileOutputStream fos = new FileOutputStream("employee1.txt "); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("serialization done..");
		FileInputStream fis = new FileInputStream(args[0]);

		ObjectInputStream ois = new ObjectInputStream(fis);

	  emp =   (Employee) ois.readObject();
      
	 System.out.println(emp.getDeptNo());
		
		
		
		
		

	}

}
