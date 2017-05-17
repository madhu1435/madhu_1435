import java.io.*;

import java.util.*;
public class Test {
	public static void main(String args[]) throws IOException
	{
		if (args.length==2)
		{	
		FileInputStream in = new FileInputStream(args[0]);
		FileOutputStream out = new FileOutputStream(args[1]);
		int c;
		while ((c=in.read())!=-1)
		{
			char ch = (char)c;
			if(Character.isUpperCase(ch))
			{
				ch = Character.toLowerCase(ch);
			}
			else
				ch = Character.toUpperCase(ch);
			out.write(ch);
		}
		}
		else{
			try{throw new  InvalidArgException();}
			catch(RuntimeException e){}
			}
		}
	
}

