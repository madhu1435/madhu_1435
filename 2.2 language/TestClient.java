package com.language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClient {

	private static final int Max_Priotity = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		CLang clang=new CLang();
		JavaLang javalang=new JavaLang();
		Thread thread1=new Thread(clang);
		Thread thread2=new Thread(javalang);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your favourite language C/Java");
		String languageName=br.readLine();
		if(languageName.equals("C"))
		{
			thread1.setPriority(10);   //giving max priority to CLang thread
			thread1.start();
			thread2.start();
			
		}
		else if(languageName.equals("Java"))
		{
			thread2.setPriority(10);	//giving max priority to javaLang thread
			thread2.start();
			thread1.start();
			
		}
	}

}
