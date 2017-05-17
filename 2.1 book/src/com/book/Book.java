package com.book;	//creating package com.book

public class Book {

	/**
	 * @param args
	 */
		String bookID;
		String title;
		String author;
		String category;
		float price;
		
	public Book(String bookID, String title, String author,
				String category, float price) {
		super();
			//category must be Science,Fiction,Technology,Others
			//Price cannot be negative
			//bookID must start with 'B' and must be of length 4 characters
if((category.equals("Science") || category.equals("Fiction")|| category.equals("Technology")||category.equals("Others")) && (price>=0) && (bookID.length()==4 && bookID.charAt(0)=='B'))
			{
				
				this.bookID = bookID;
				this.title = title;
				this.author = author;
				this.category = category;
				this.price = price;
			}
			else
			{
				
				try
				{
					throw new InvalidBookException(); //throwing an InvalidBookException
				}
				catch(RuntimeException e)
				{
					
					System.out.println(e.toString());
				}
			}
		}
}
class InvalidBookException extends RuntimeException
{
		public String toString()                   //overriding toString() method
		{
			return("The entered book is invalid");
		}
}
