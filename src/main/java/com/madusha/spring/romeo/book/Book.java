package com.madusha.spring.romeo.book;



public class Book {
	
	private String bookid;
	private String bookname;
	private String booktype;
	private String bookcolor;
	
	public Book() {
		
	}
	
	public Book(String bookid, String bookname, String booktype, String bookcolor) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.booktype = booktype;
		this.bookcolor = bookcolor;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public void setBookcolor(String bookcolor) {
		this.bookcolor = bookcolor;
	}	
	public String getBookcolor() {
		return bookcolor;
	
	}

}
