package org.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileCompress {

	
	public static void main(String[] args) throws IOException {
		if(args.length==2)
		{
			File f=new File(args[0]);
			if(f.exists())
			{
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				String str;
				
				FileWriter fw=new FileWriter(args[1]);
				BufferedWriter bw=new BufferedWriter(fw);
				
				while((str=br.readLine())!=null)
				{
					String str1="";
					for(int i=0;i<str.length();i++)
					{
						if(str.charAt(i)!=' ')
						{
						str1=str1+(char)str.charAt(i);
						}
					}
					bw.write(str1);
				}
				bw.flush();
				br.close();
			}
			
		}
		else
		{
			System.out.println("You have entered wrong input");
		}

	}

}
