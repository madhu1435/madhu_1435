/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testemployee;
import employee.DateOfJoin;
import employee.Employee;
import employee.Operation;
import employee.Technical;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MSLCELTP1784
 */
public class TestEmployee {
    public static void main(String[] b)
    {
        int empId;
        String empName;
        double basicSal;
        String jobDesc;
        String grade;
        int[] a = new int[3];
        Scanner sc=new Scanner(System.in);
        Employee arr[]=new Employee[2];
        System.out.println("enter the details of operational employee");
        
        empId = sc.nextInt();
        empName = sc.next();
        basicSal = sc.nextDouble();
        jobDesc = sc.next();
        grade = sc.next();
        System.out.println("enter doj of operation");
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }
        DateOfJoin doj = new DateOfJoin(a[0],a[1],a[2]);
        doj.showDate();
        arr[0] = new Operation(empId,empName,basicSal,jobDesc,grade);
        arr[0].showDetails();
        arr[0].calSal();
        System.out.println("'enter the details of technical employee");
         empId = sc.nextInt();
        empName = sc.next();
        basicSal = sc.nextDouble();
        jobDesc = sc.next();
        grade = sc.next();
        System.out.println("enter doj of operation");
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }
        doj.day = a[0];
        doj.month = a[1];
        doj.year = a[2];
        doj.showDate();
        arr[1] = new Technical(empId,empName,basicSal,jobDesc,grade);
        arr[1].showDetails();
        arr[1].calSal();
        
        
       
    }
    }