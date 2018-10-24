package com.amazon.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{
	
	private int idMovie;
	private int timeViewedMovie;

	public Movie(int durationMovie, String titleMovie, String genereMovie, String creatorMovie, int year) {
		super(durationMovie, titleMovie, genereMovie, creatorMovie);
		setYearMovie((short)year);
	}

	public void showData() {
		/*System.out.println("Titte: " + titleMovie);
		System.out.println("Genere: " + genereMovie);
		System.out.println("Year: " + yearMovie);*/
	}

	public int getTimeViewedMovie() {
		return timeViewedMovie;
	}

	public void setTimeViewedMovie(int timeViewedMovie) {
		this.timeViewedMovie = timeViewedMovie;
	}

	public int getIdMovie() {
		return idMovie;
	}
	
	@Override
	public String toString() {
		return "Tittle: " + getTitleMovie() + "\n" +
				"Genere: " +  getGenereMovie() + "\n" +
				"Year: " + getYearMovie() + "\n" +
				"Creator:" + getCreatorMovie() +  "\n";
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
			setTimeViewedMovie(dateF.getSeconds()- dateI.getSeconds());
		}else{
			setTimeViewedMovie(0);
		}
		
	}
	
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie>  movies = new ArrayList<Movie>();
		
		movies.add(new Movie(120, "Coco", "Animation", "Lee", (short)2017));
		for (int i = 1; i < 10; i++) {
			movies.add(new Movie(120, "Coco" + i , "Animation" + i, "Lee" + 1 , (short)2017+i));
		}
		
		return movies;
		
	}

}