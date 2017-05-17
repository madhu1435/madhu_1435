	import java.io.*;
public class LoginValidate {
	public static void main(String args[])
	{
		try{
			if (args.length == 2){
			String uspa=(args[0].concat(",")).concat(args[1]);
			String line;
			int x=0;
			FileInputStream fin = new FileInputStream("login.txt");
			BufferedReader bin = new BufferedReader(new InputStreamReader(fin));
			while((line=bin.readLine())!=null)
			{
				if (line.equals(uspa)){
					System.out.println("Login successful");x=1;break;}
			}
			if (x==0)
				System.out.println("Invalid username/password");}
			else
				System.err.println("<Usage> java  LoginValidate <UserName> <Password> ");
			
		}
		catch(IOException e){
							if (e!=null){System.err.println("File not found!!");}
		}
	}

}
