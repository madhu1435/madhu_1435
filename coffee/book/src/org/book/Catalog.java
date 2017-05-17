package org.book;

import java.util.ArrayList;

public class Catalog {
	private ArrayList<Book> books = new ArrayList<Book>(); 
	public void addBook(Book b){
		books.add(b);
	}
	public void showBooks(){
		for(int i=0;i<2;i++){
		System.out.println(books.get(i).getAuthor());
		System.out.println(books.get(i).getBookId());
		System.out.println(books.get(i).getStatus());
		System.out.println(books.get(i).getTitle());
		System.out.println(books.get(i).getType());
		System.out.println("-----------------------");
		
	}}
	public String searchBook(int id){
		int count=0;
		for(int i=0;i<2;i++){
			if(books.get(i).getBookId()==id){
				System.out.println(books.get(i).getAuthor());
				System.out.println(books.get(i).getBookId());
				System.out.println(books.get(i).getStatus());
				System.out.println(books.get(i).getTitle());
				System.out.println(books.get(i).getType());
				count++;
			}
		}
		if(count==0)
				System.out.println("book not present");
		return null;
	}
}
