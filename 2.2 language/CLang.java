package com.language;

public class CLang implements Language,Runnable { //to run as thread implementing Runnable

	/**
	 * @param args
	 */

	@Override
	public void run()
	{
		showMessage();
	}
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("C Program is running");
		
	}

}
