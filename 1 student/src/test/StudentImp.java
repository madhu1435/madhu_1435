package test;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.Serializable;

import com.student.Student;

@SuppressWarnings("unused")
public class StudentImp {



	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter student details");
		Student s;
		
		s=new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		s.readStudentInfo();
		s.calcTotal();
		s.PrintStudInfo();
		FileOutputStream fis=new FileOutputStream("StudentInfo.txt");
		ObjectOutputStream oss=new ObjectOutputStream(fis);
		oss.writeObject(s);
		fis.close();
		oss.close();
		System.out.println("serialization successful");
		FileInputStream fin;
		fin=new FileInputStream("StudentInfo.txt");
		ObjectInputStream ois= new ObjectInputStream(fin);
		Student s1=(Student)ois.readObject();
		fin.close();
		ois.close();
		System.out.println("deserialization successful");
		s1.PrintStudInfo(); 
		
		
		
		
		
		
		
	}

}
