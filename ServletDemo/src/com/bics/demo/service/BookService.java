package com.bics.demo.service;

import java.util.List;

import com.bics.demo.model.Book;

public interface BookService {

	public void addBook(Book book);
	
	public void updateBook(Book book);
	
	public Book findBookById(Integer id);
	
	public void deleteBookById(Integer id);
	
	public List<Book> listAllBooks();
	
	public void deleteAllBooks();
}
