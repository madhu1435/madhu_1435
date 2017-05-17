//program for copying and displaying files
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


class file1 implements Serializable{
    public int empid;
    public String ename;
    public float sal;

    public file1(int empid, String ename, float sal) {
        this.empid = empid;
       this.ename=ename;
        this.sal = sal;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }

    public float getSal() {
        return sal;
    }
    
  
        
        
    }
    
    
    
    
    

public class comArg {
    public static void  main(String[] a) throws FileNotFoundException, IOException, ClassNotFoundException{
        //creation of file
        file1 f=new file1(10010,"raju",200);
        File F =new File("empdetails.txt");
        FileOutputStream fos=new FileOutputStream("empdetails.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(f);
        fos.close();
        oos.close();
        System.out.println( "  MENU ");
        System.out.println( "1.Display");
        System.out.println( "2.Copy");
        System.out.println( "3.Exit");
        Scanner s=new Scanner(System.in);
        System.out.println("enter your option");
        int n=s.nextInt();
        String filename;
        switch(n){
                
            case 1:{
        System.out.println("enter the filename to open");
        filename=(s.next());
        
       FileInputStream fis=new FileInputStream(filename);
       ObjectInputStream ois=new ObjectInputStream(fis);
       file1 F1=(file1)ois.readObject();
       fis.close();
       ois.close();
       System.out.println("emp id:"+F1.getEmpid()+"emp name:"+F1.getEname()+"emp salary:"+F1.getSal());
       
            break;}
            case 2:{
                System.out.println("enter source file");
                String source=s.next();
                System.out.println("enter destination file");
                String destination=s.next();
        File F1 =new File(destination);
        FileOutputStream fos1=new FileOutputStream(destination);
        ObjectOutputStream oos1=new ObjectOutputStream(fos1);
        oos1.writeObject(f);
        fos1.close();
        oos1.close();
        System.out.println("copied successfully");
         FileInputStream fis1=new FileInputStream(destination);
       ObjectInputStream ois1=new ObjectInputStream(fis1);
       file1 F2=(file1)ois1.readObject();
       fis1.close();
       ois1.close();
       
       System.out.println("displaying the content of"+destination+"file");
       System.out.println("emp id:"+F2.getEmpid()+"emp name:"+F2.getEname()+"emp salary:"+F2.getSal());
       break;
    }
            case 3:
                System.out.println("exited successfully");
    }
        
            }

    }
