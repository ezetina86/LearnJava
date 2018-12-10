package com.amazon.model;

import java.util.ArrayList;
import java.util.Date;
import com.amazon.dao.MovieDAO;

/**
 * Hereda de {@link Film}
 * Implementa {@IVisualizable}
 * @author Enrique Zetina
 *
 */
public class Movie extends Film implements IVisualizable, MovieDAO{
	
	private int idMovie;
	private int timeViewedMovie;
	
	public Movie() {
		
	};

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
	
	public void setIdMovie(int idMovie) {
		this.idMovie=idMovie;
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
		Movie movie = new Movie();
		return movie.read();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void viewed() {
		// TODO Auto-generated method stub
		setViewedMovie(true);
		Movie movie = new Movie();
		movie.setMovieViewed(this);
		
		
		Date dateI = startToSee(new Date());
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(".........");
		}
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("You saw: " + toString());
		System.out.println("During: " + getTimeViewedMovie() + " seconds");
		setViewedMovie(true);
		
	}

}