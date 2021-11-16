package com.syntax.homework.class17;
	/*
	 * Write Book class that will have instance variables and 2 Constructors. 
	 * While creating an object make sure:
		Instance variables are being initialized
		Both Constructors are being executed
	 */
public class Book {
	private String bookName;
	private String bookAuthor;
	private int pages;
	
	public Book(String bookName, String bookAuthor, int pages) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pages = pages;
		System.out.println("Book: "+bookName);
		System.out.println("Writen by: "+bookAuthor);
		System.out.println("It has "+pages+" pages");
	}

	public Book(int pages) {
		super();
		this.pages = pages;
		if(pages<20) {
			System.out.println("Such a tiny book bro");
		}else {
			System.out.println("At least it has more than 20 pages");
		}
	}
	
	
	
	

}
