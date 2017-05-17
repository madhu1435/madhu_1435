package com.book.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.book.BookStore;
import com.book.Book;

public class BookUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BookStore bookstore=new BookStore();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of books you want to store:");
		int noOfBooks=Integer.parseInt(br.readLine());
		for(int i=0;i<noOfBooks;i++)
		{
			System.out.println("***Enter book"+(i+1)+"Details*********");
			System.out.println("Enter bookID which must start with 'B' and of length 4:");
			String bookID=br.readLine();
			System.out.println("Enter title:");
			String title=br.readLine();
			System.out.println("Enter author:");
			String author=br.readLine();
			System.out.println("Enter category which can be Science or Fiction or Technology or Others}:");
			String category=br.readLine();
			System.out.println("Enter price which should be positive:");
			float price=Float.parseFloat(br.readLine());
			bookstore.addBook(new Book(bookID,title,author,category,price));
		}
		System.out.println("Enter the title of book to search:");
		String stitle=br.readLine();
		bookstore.searchByTitle(stitle);
		System.out.println("Enter the author of book to search:");
		String sauthor=br.readLine();
		bookstore.searchByAuthor(sauthor);
		bookstore.displayAll();
		// TODO Auto-generated method stub

	}

}
