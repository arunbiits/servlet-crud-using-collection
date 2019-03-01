/**
 * 
 */
package com.bics.demo.model;

/**
 * @author bosco
 *
 */
public class Book {

	private Integer id;
	private String name;
	private String author;
	private String edition;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param id
	 * @param name
	 * @param author
	 * @param edition
	 */
	public Book(Integer id, String name, String author, String edition) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.edition = edition;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	
}
