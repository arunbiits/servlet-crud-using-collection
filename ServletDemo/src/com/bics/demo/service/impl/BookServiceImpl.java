/**
 * 
 */
package com.bics.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.bics.demo.model.Book;
import com.bics.demo.service.BookService;

/**
 * @author bosco
 *
 */
public class BookServiceImpl implements BookService{

	/**
	 * id that generated automatically...
	 */
	AtomicInteger id = new AtomicInteger(0);
	
	/**
	 * static list to store the book list...
	 */
	static List<Book> books = new ArrayList<Book>();
	
	/**
	 * constructor that intially add some books in the list...
	 */
	public BookServiceImpl() {
		books = generateDummyBooks();
	}
	
	/**
	 * code to generate dummy books list and store in the static book list...
	 * @return
	 */
	private List<Book> generateDummyBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(id.incrementAndGet(), "Java", "Herbert", "8th Edition"));
		books.add(new Book(id.incrementAndGet(), "c++", "Balagurusamy", "5th Edition"));
		books.add(new Book(id.incrementAndGet(), "c", "Dennis", "4th Edition"));
		return books;
	}
	
	/**
	 * code to add new book in the list...
	 */
	@Override
	public void addBook(Book book) {
		book.setId(id.incrementAndGet());
		books.add(book);
	}

	/**
	 * code to update the book in the list...
	 */
	@Override
	public void updateBook(Book book) {
		for(Book b:books) {
			if(b.getId().equals(book.getId())) {
				int index = books.indexOf(b);
				books.set(index, book);
				break;
			}
		}
	}

	/**
	 * code to find the book in the list using the book id...
	 * 
	 */
	@Override
	public Book findBookById(Integer id) {
		for(Book b:books) {
			if(b.getId().equals(id)) {
				return b;
			}
		}
		return null;
	}

	/**
	 * code to delete the book in the list using the book id...
	 */
	@Override
	public void deleteBookById(Integer id) {
		for(Book b:books) {
			if(b.getId().equals(id)) {
				books.remove(b);
				break;
			}
		}
	}

	/**
	 * code to list all the books in the list...
	 */
	@Override
	public List<Book> listAllBooks() {
		return books;
	}

	/**
	 * code to delete all the books in the list...
	 */
	@Override
	public void deleteAllBooks() {
		books.clear();
	}
	
	

}
