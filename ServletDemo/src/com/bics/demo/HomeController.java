package com.bics.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bics.demo.model.Book;
import com.bics.demo.service.impl.BookServiceImpl;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String EDIT_BOOK = "/edit-book.jsp";
	private static final String ADD_BOOK = "/add-book.jsp";
	private static final String LIST_BOOK = "/list-book.jsp";
	
    BookServiceImpl bookService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        bookService = new BookServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String navigation = "";
		if(action.equals("addBook")) {
			navigation = ADD_BOOK;
		}
		else if(action.equals("editBook")) {
			Integer id = Integer.parseInt(request.getParameter("id"));
			Book book = bookService.findBookById(id);
			request.setAttribute("book", book);
			navigation = EDIT_BOOK;
		}
		else if(action.equals("deleteBook")) {
			Integer id =Integer.parseInt(request.getParameter("id"));
			bookService.deleteBookById(id);
			List<Book> books = bookService.listAllBooks();
			request.setAttribute("books", books);
			navigation = LIST_BOOK;
		}
		else{
			List<Book> books = bookService.listAllBooks();
			request.setAttribute("books", books);
			navigation = LIST_BOOK;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(navigation);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String navigation = "";
		
		if(action.equals("addBook")) {
			Book book = new Book();
			book.setName(request.getParameter("name"));
			book.setAuthor(request.getParameter("author"));
			book.setEdition(request.getParameter("edition"));
			bookService.addBook(book);
			request.setAttribute("books", bookService.listAllBooks());
			navigation = LIST_BOOK;
		}
		else {
			Book book = new Book();
			book.setId(Integer.parseInt(request.getParameter("id")));
			book.setName(request.getParameter("name"));
			book.setAuthor(request.getParameter("author"));
			book.setEdition(request.getParameter("edition"));
			bookService.updateBook(book);
			request.setAttribute("books", bookService.listAllBooks());
			navigation = LIST_BOOK;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(navigation);
		rd.forward(request, response);
	}

}
