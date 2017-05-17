package org.app;

import java.util.Scanner;

import org.book.Book;
import org.book.Catalog;

public class TestCatalog {

	public static void main(String[] args) {
		Catalog c = new Catalog(); 
		Scanner sc = new Scanner(System.in);
		/*Book b1= new Book();
		Book b2= new Book();
		b1.setTitle("java");
		b1.setAuthor("rahim");
		b1.setBookId(1001);
		b1.setStatus("A");
		b1.setType("technical");
		b2.setTitle("python");
		b2.setAuthor("goutham");
		b2.setBookId(1002);
		b2.setStatus("A");
		b2.setType("technical");
		c.addBook(b1);
		c.addBook(b2);*/
		
		Book b = new Book();
		
			System.out.println("enter title");
			String s1=sc.next();
			b.setTitle(s1);
			System.out.println("enter bookid");
			b.setBookId(sc.nextInt());
			System.out.println("enter author name");
			b.setAuthor(sc.next());
			System.out.println("enter status");
			b.setStatus(sc.next());
			System.out.println("enter type");
			b.setType(sc.next());
			c.addBook(b);
		
		c.showBooks();
		c.searchBook(1001);

	}

}
