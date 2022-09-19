package com.cg.client;

import com.cg.dao.BookDaoImpl;

public class Client {

	public static void main(String[] args) {
		BookDaoImpl obj = new BookDaoImpl();
		System.out.println("Total No. of Books");
		System.out.println("Total Books : " +obj.getBookCount());
		
		System.out.println("Listing Book with Id");
		System.out.println("Total Books : " +obj.getBookById(102));
		
		System.out.println("Listing All Books");
		System.out.println("Total Books : " +obj.getAllBooks());
		
		System.out.println("Book Written by Nihal");
		System.out.println("Total Books : " +obj.getBookByAuthor("Nihal"));
		
		System.out.println("Book by Title");
		System.out.println("Total Books : " +obj.getBookByTitle("Java"));
		
		System.out.println("Listing Books between 200 and 500");
		System.out.println("Total Books : " +obj.getBookInPriceRange(200, 500));
		
	}

}