package com.amazon.model;

public class Publication {

	private int isbnBook;
	private int numberOfPagesBook;
	private short yearBook;
	private short editionBook;
	private String titleBook;
	private String authorBook;
	private String publisherBook;
	private String languajeBook;
	
	
	public Publication(int isbnBook, String titleBook, String authorBook) {
		super();
		this.isbnBook = isbnBook;
		this.titleBook = titleBook;
		this.authorBook = authorBook;
	}


	public int getIsbnBook() {
		return isbnBook;
	}


	public void setIsbnBook(int isbnBook) {
		this.isbnBook = isbnBook;
	}


	public int getNumberOfPagesBook() {
		return numberOfPagesBook;
	}


	public void setNumberOfPagesBook(int numberOfPagesBook) {
		this.numberOfPagesBook = numberOfPagesBook;
	}


	public short getYearBook() {
		return yearBook;
	}


	public void setYearBook(short yearBook) {
		this.yearBook = yearBook;
	}


	public short getEditionBook() {
		return editionBook;
	}


	public void setEditionBook(short editionBook) {
		this.editionBook = editionBook;
	}


	public String getTitleBook() {
		return titleBook;
	}


	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}


	public String getAuthorBook() {
		return authorBook;
	}


	public void setAuthorBook(String authorBook) {
		this.authorBook = authorBook;
	}


	public String getPublisherBook() {
		return publisherBook;
	}


	public void setPublisherBook(String publisherBook) {
		this.publisherBook = publisherBook;
	}


	public String getLanguajeBook() {
		return languajeBook;
	}


	public void setLanguajeBook(String languajeBook) {
		this.languajeBook = languajeBook;
	}
	
	
}
