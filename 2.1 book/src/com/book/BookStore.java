package com.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BookStore {

	/**
	 * @param args
	 */
	LinkedList store = new LinkedList();	//LinkedList object to store book instances

	public void addBook(Book b) {			//method to add books in book store
		if (b.price >=0) {					//if book members are initialized then only we can add the book
											//if book members are initialized then price value should be nonnegative,for that i am only comparing book value 
			store.add(b);
		}
	}

	public void searchByTitle(String title) {	//method to search a book by it's title
		if (store.size()!=0) {					//if store doesn't have any book then we can't search
			System.out.println("Book details:");	
			System.out.println("bookID\ttitle\tauthor\tcategory\tprice");
			System.out.println("------\t-----\t------\t--------\t-----");
			Book bookdetails = null;
			Iterator itr = store.iterator();
			while (itr.hasNext()) {
				Object obj = itr.next();
				Book book = (Book) obj;

				if (book.title.equals(title)) {
					bookdetails = book;
					break;
				}
			}
			System.out.println(bookdetails.bookID + "\t"
					+ bookdetails.title + "\t" + bookdetails.author + "\t"
					+ bookdetails.category + "\t\t" + bookdetails.price);
		}
		else
		{
			System.out.println("There is no book in the store:");
		}
	}

	public void searchByAuthor(String author) {	//method to search a book by it's title
		if (store.size()!=0) {	
		System.out.println("Book details:");	
		System.out.println("bookID\ttitle\tauthor\tcategory\tprice");//if store doesn't have any book then we can't search
		System.out.println("------\t-----\t------\t--------\t-----");
		Book bookdetails = null;
		String details = null;
		Iterator itr = store.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			Book book = (Book) obj;
			if (book.author.equals(author)) {
				bookdetails = book;
				System.out.println(bookdetails.bookID + "\t"
						+ bookdetails.title + "\t" + bookdetails.author + "\t"
						+ bookdetails.category + "\t\t" + bookdetails.price);

			}
		}
		}
		else
		{
			System.out.println("There is no book in the store:");
		}

	}

	public void displayAll() {										//method to dispaly all books
		if (store.size()!=0) {									//if store doesn't have any book then we can't search
		System.out.println("********Details of all books:**********");
		System.out.println("bookID\ttitle\tauthor\tcategory\tprice");
		System.out.println("------\t-----\t------\t--------\t-----");
		Book bookdetails = null;
		Iterator itr = store.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			Book book = (Book) obj;
			System.out.println(book.bookID + "\t" + book.title + "\t"
					+ book.author + "\t" + book.category + "\t\t" + book.price);
		}
	}
		else
		{
			System.out.println("There is no book in the store:");
		}
	}

}
