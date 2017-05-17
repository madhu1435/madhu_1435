package com.help;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CallRequest 
{
	public void callRequest(HelpDesk hd) throws IOException
	{
		
		String filename="callrequest.txt";
		File file=new File(filename);
		if (!file.exists())
		{
			file.createNewFile();
		}
		if(!file.createNewFile())
		{
		
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(hd.empId+"\t"+hd.requestId+"\t"+hd.problem+"\t"+hd.status+"\t"+hd.remarks);
			bw.flush();
		}
	}

}
