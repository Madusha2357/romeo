package com.madusha.spring.romeo.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;

	@RequestMapping("/books")
	public List<Book> getAllBooks(){
		return bookservice.getAllBooks();
		
		
	}
	
	 
	
}
