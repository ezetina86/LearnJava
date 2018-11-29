package com.amazon.dao;

import java.util.ArrayList;

import com.amazon.model.Movie;

public interface MovieDAO {
	
	//Metodos CRUD
	
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList<>();
		return movies;
	}
	
	private boolean getMovieViewed(){
		return false;
	}

}
