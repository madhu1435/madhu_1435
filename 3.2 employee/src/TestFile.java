import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of employees:");
		int n = sc.nextInt();

		int arraySize = 0;
		Employee emp[] = new Employee[n];
		for (int count = 0; count < n; count++) {
			System.out.println("enter employee id:");
			int empId = sc.nextInt();
			System.out.println("enter employee name:");
			String empName = sc.next();
			System.out.println("enter employee grade:");
			String grade = sc.next();
			Employee emp1 = new Employee(empId, empName, grade);
			try {
				int x = 0;
				x = emp1.validate(grade);
				if (x == 1) {
					emp[arraySize] = emp1;
					arraySize++;
				}

			} catch (InvalidGradeException e) {
				System.out.println(e);
			}
		}

		System.out
				.println("The number correct entered records are" + arraySize);
		FileOutputStream fos = new FileOutputStream("empdetails.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < arraySize; i++) {
			oos.writeObject(emp[i]);
		}
		FileInputStream fis = new FileInputStream("empdetails.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for (int i = 0; i < arraySize; i++) {
			Employee emp2 = (Employee) ois.readObject();
			System.out.println("the emp details are.." + emp2);
		}

	}

}
