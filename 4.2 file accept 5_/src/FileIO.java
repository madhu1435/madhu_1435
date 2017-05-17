
import java.io.File;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSLCELTP1784
 */
public class FileIO {
    public static void main(String[] a)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 5 numbers");
    for(int i=0;i<a.length;i++)
    {
 a[i]=sc.next();

    if(a.length==5)
    {
    try{
    System.out.println("enter the numbers");
    System.out.println(a[i]);
    }catch(ArithmeticException ae)
    {
    System.out.println("enter 5 inputs");
    }
    }
    System.out.println(a[i]);
    }
    System.out.print("enter the file name");
    String f=sc.next();
    File file=new File("filename.txt");
    if(!file.exists())
    {
    
    }
    
    }
   }
    

