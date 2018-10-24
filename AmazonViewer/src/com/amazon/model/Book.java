package com.amazon.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable {
	
	private int idBook;
	private int timeReaded;

	public Book(int isbnBook, String titleBook, String authorBook) {
		super(isbnBook, titleBook, authorBook);
	}

	public int getIdBook() {
		return idBook;
	}
	
	
	
	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		return "Tittle: " + getTitleBook() + "\n" +
				"ISBN: " +  getIsbnBook() + "\n" +
				"Author: " + getAuthorBook() + "\n";
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds()- dateI.getSeconds());
		}else{
			setTimeReaded(0);
		}
		
	}
	

}
