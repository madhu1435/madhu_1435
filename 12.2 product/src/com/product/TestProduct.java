package com.product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProduct {

	
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Product> al = new ArrayList<Product>();
		System.out.println("Enter no of products:");
		int n =s.nextInt();
		FileWriter fw = new FileWriter("product.txt",true);
		BufferedWriter bw= new BufferedWriter(fw);
		for(int count =0;count<n;count++)
		{
			System.out.println("Enter Product ID:");
			int prodID=s.nextInt();
			System.out.println("Enter Product NAME:");
			String prodName=s.next();
			System.out.println("Enter Product PRICE:");
			double prodPrice=s.nextDouble();
			System.out.println("Enter Product QUANTITY:");
			int prodQty=s.nextInt();
			
			
			Product product=new Product(prodID, prodName, prodPrice,prodQty);
			al.add(product);
			if(product.calTotal()>300)
			{
				
				bw.write(product.prodName+"\n");
				
			}
			
			
		}
		bw.flush();
		fw.close();
		
	}

}
