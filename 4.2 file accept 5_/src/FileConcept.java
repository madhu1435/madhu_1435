import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileConcept 
{
	private static Scanner sc;

	public static void main(String args[]) throws IOException
	{
		int args1[]=new int[5];
		sc = new Scanner(System.in);
		System.out.println("Enter five numbers:\n");
		
		for(int i=0;i<args1.length;i++)
		{
			
			args1[i]=sc.nextInt();
		}
		int n1=args1.length;
		try {
			for(int i=0;i<n1;i++)
			{
					if(n1!=5)
					
					{
						throw new MoreThanFiveException();
					}
			}
		} catch (Exception e) 
		{
				System.out.println(e);
		}
		
		File file = new File("filename.txt");

		if (!file.exists())
		{
			file.createNewFile();
		}
		
		boolean bool = file.exists();
		if(bool==true)
		{
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<5;i++){
			bw.write(args1[i]);
			}
			bw.close();
		
		}
		System.out.println("Done");
		 try {
	         
			 FileReader fr=new FileReader("filename.txt");  
			 BufferedReader br=new BufferedReader(fr);
			 int i=0;
			    while((i=br.read())!=-1)
			    { 
			    	System.out.println(i);
			    }
	         br.close();
	       } catch (FileNotFoundException e) {
	         System.out.println(e);
	       }
		
		
	}
}
