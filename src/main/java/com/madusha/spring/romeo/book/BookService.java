package com.madusha.spring.romeo.book;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	private List<Book> books = Arrays.asList(
			
			new Book("a", "Atlas", "A4", "red"),
			new Book("b", "Weerodara", "A3", "blue"),
			new Book("c", "ABC", "A3", "ash"),
			new Book("d", "XYZ", "A4", "black"),
			new Book("f", "KMO", "A4", "pink")
			);
	
	public List<Book> getAllBooks(){
		return books;
	}

}
