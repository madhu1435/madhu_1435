/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author MSLCELTP1784
 */
public  abstract class Employee {
     public int empId;
     public String empName;
     public double basicSal;
     //public DateOfJoin doj;
     public Employee(int empId,String empName,double basicSal)
     {
         this.basicSal = basicSal;
         this.empId = empId;
         this.empName = empName;
     }
    
     abstract public void calSal();
     public void showDetails()
     {
     System.out.println("empId:"+empId);
     System.out.println("empname:"+empName);
     System.out.println("basicsal:"+basicSal);
     }
    
}

    

