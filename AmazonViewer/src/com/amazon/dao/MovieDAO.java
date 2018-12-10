package com.amazon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static com.amazon.db.DataBase.*;
import com.amazon.db.IDBConnection;
import com.amazon.model.Movie;

public interface MovieDAO extends IDBConnection{
	
	//Metodos CRUD
	
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList<Movie>();
		try(java.sql.Connection connection = connectToDB()){
			String query="SELECT * FROM " + TMOVIE;
			//System.out.println(query);
			java.sql.PreparedStatement ps= connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
			  Movie movie = new Movie(Integer.valueOf(rs.getString(TMOVIE_DURATION)), 
					  rs.getString(TMOVIE_TITLE), 
					  rs.getString(TMOVIE_GENERE), 
					  rs.getString(TMOVIE_CREATOR), 
					  Integer.valueOf(rs.getString(TMOVIE_YEAR)));
			  
			  movie.setIdMovie(Integer.valueOf(rs.getString(TMOVIE_ID)));
			  movies.add(movie);
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hay un error!"+ e);
		}
		
		return movies;
	}
	
	private boolean getMovieViewed(){
		return false;
	}

}
