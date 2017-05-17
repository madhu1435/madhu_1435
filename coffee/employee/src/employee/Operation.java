/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author MSLCELTP1784
 */
public class Operation extends Employee {
     public String jobDesc;
    public String grade;

    public Operation(int empId,String empName,double basicSal,String jobDesc, String grade)
    {
        super(empId,empName,basicSal);
        this.jobDesc = jobDesc;
        this.grade = grade;
    }
   
 public void showDetails()
    {
System.out.println("empId:"+empId+"empName:"+empName+"basicsal:"+basicSal);
    System.out.println("jobDesc:"+jobDesc+"'grade:"+grade);
    }
    public void calSal()
    {  
float bonus=(float) (0.05*basicSal);
    System.out.println("bonus:"+bonus);
    float totalIncome=(float) (basicSal+bonus);
    System.out.println("totalIncome:"+totalIncome);
    }
}
