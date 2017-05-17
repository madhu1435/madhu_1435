package com.language;

public class JavaLang implements Language,Runnable{//to run as thread implementing Runnable

	public void run()
	{
		showMessage();
	}
	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Java Program is running");
		
	}

	/**
	 * @param args
	 */
	

}
