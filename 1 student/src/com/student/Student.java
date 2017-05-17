package com.student;
import java.io.Serializable;

public class Student implements StudentInt,Serializable {

	private static final long serialVersionUID = 1L;
	int rollNo;
	String name;
	int subject1;
	int subject2;
	int subject3;
	int totalMarks;
	
	public Student(int rollNo,String name,int subject1,int subject2,int subject3,int totalMarks){
		this.rollNo=rollNo;
		this.name=name;
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
		this.totalMarks=totalMarks;
	}
public int getrollNo(){
	return rollNo;
}
public String getname(){
	return name;
}
public int getsubject1(){
	return subject1;
}
public int getsubject2(){
	return subject2;
}
public int getsubject3(){
	return subject3;
}

public int gettotalMarks(){
	return totalMarks;
}
public void readStudentInfo(){
	System.out.println("enter student information");
}
public void calcTotal(){
	int totalMarks=subject1+subject2+subject3;
	System.out.println("total marks"+ totalMarks);
}

public void PrintStudInfo(){
	System.out.println("roll no is"+ getrollNo());
	System.out.println("name is "+ getname());
	System.out.println("subject1 :"+ getsubject1());
	System.out.println("subject2 :"+ getsubject2());
	System.out.println("subject3 is:"+ getsubject3());
	System.out.println("totalmarks :"+ gettotalMarks());
  }
@Override
public void printStudInfo() {
	// TODO Auto-generated method stub
	
}
}

