package com.amazon.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {
	
	private int idBook;
	private int timeReaded;
	private boolean isreaded;

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

	@SuppressWarnings("deprecation")
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds()- dateI.getSeconds());
		}else{
			setTimeReaded(0);
		}
		
	}
	
	public boolean isIsreaded() {
		return isreaded;
	}

	public void setIsreaded(boolean isreaded) {
		this.isreaded = isreaded;
	}

	public void view() {
		
		setIsreaded(true);
		Date dateI = startToSee(new Date());
		
		for (int i = 0; i < 100; i++) {
			System.out.println(".........");
		}
		
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("leiste : " + toString());
		System.out.println("Por: " + getTimeReaded());
	}
	
	public static ArrayList<Book> makeBookList(){
		ArrayList<Book> books = new ArrayList<>();
		String[] authors = new String[3];
		for (int i = 0; i < authors.length; i++) {
			authors[i]="autor "+i;
		}
		for (int i = 0; i < 5; i++) {
			books.add(new Book(1+i,"it"+i, "King"+i));
		}
		return books;
	}

}
