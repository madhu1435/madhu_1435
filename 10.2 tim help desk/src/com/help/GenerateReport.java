package com.help;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GenerateReport
{
	public void generateReport() throws IOException
	{
		File f=new File("callrequest.txt");
		if(f.exists())
		{
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String str;
		int i=1;
		System.out.println("empId"+"\t"+"requestId"+"\t"+"problem"+"\t"+"status"+"\t"+"remarks");
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		}
		else
		{
			try
			{
				throw new FileNotAvailable("FileNotAvailable");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		
	}
	
	
}
