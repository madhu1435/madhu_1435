package org.book;
class InvalidDataException extends RuntimeException{
	InvalidDataException(String s){
		super(s);
	}
}
public class Book {
	private int bookId;
	private String title;
	private String author;
	private String type;
	private String status;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		InvalidDataException ide2 = new InvalidDataException("incorrect type");
		if(type.equals("technical")||type.equals("nontechnical"))
		this.type = type;
		else
			throw ide2;
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		InvalidDataException ide1 = new InvalidDataException("incorrect status");
		if(status.equals("A")||status.equals("N"))
		this.status = status;
		else
			throw ide1;
		
	}
	
}
