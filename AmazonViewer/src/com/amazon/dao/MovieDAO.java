package com.amazon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static com.amazon.db.DataBase.*;
import com.amazon.db.IDBConnection;
import com.amazon.model.Movie;

public interface MovieDAO extends IDBConnection{
	
	//Metodos CRUD
	
	default Movie setMovieViewed(Movie movie) {
		try(Connection connection = connectToDB()){
			Statement statement = connection.createStatement();
			String query= "INSERT INTO " + TVIEWED + 
					"(" + TVIEWED_IDM + ", " + TVIEWED_IDELEMENT +
					", " + TVIEWED_IDUSER + ")" + " VALUES(" + IDMATERIALS[0] + ", "+
					movie.getIdMovie()+", "+TUSER_IDUSER+")";
			if (statement.executeUpdate(query)>0) { //number of rows afected
				System.out.println("Movie viwed");
				
			}else {
				System.out.println("Error executind query: " + query);
			}
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
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
			  movie.setViewedMovie(getMovieViewed(ps, connection,Integer.valueOf(rs.getString(TMOVIE_ID))));
			  movies.add(movie);
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return movies;
	}
	
	private boolean getMovieViewed(PreparedStatement prepareStatement, Connection connection, int id_movie){
		boolean viewed =  false;
		String query = "SELECT * FROM " + TVIEWED + 
				" WHERE " + TVIEWED_IDM + "=?" +
				" AND " + TVIEWED_IDELEMENT + "=?" +
				" AND " + TVIEWED_IDUSER + "=?";
		ResultSet rs= null;
		
		try {
			prepareStatement = connection.prepareStatement(query);
			prepareStatement.setInt(1, IDMATERIALS[0]);
			prepareStatement.setInt(2, id_movie);
			prepareStatement.setInt(3, TUSER_IDUSER);
			rs = prepareStatement.executeQuery();
			viewed = rs.next();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return  viewed;
	}

}
