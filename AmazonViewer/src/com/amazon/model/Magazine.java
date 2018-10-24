package com.amazon.model;

public class Magazine extends Publication {
	
	
	private int idMagazine;
	
	public Magazine(int isbnBook, String titleBook, String authorBook) {
		super(isbnBook, titleBook, authorBook);
		// TODO Auto-generated constructor stub
	}

	public int getIdMagazine() {
		return idMagazine;
	}
	
	@Override
	public String toString() {
		return "Tittle: " + getTitleBook() + "\n" +
				"ISBN: " +  getIsbnBook() + "\n" +
				"Author: " + getAuthorBook() + "\n" +
				"Publiser: " + getPublisherBook() + "\n";
	}
	

}
