///Just to test
package com.amazon;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.amazon.model.Chapter;
import com.amazon.model.Movie;
import com.amazon.model.Serie;
import com.ezetina.makereport.Report;

public class AmazonViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------------------------------");
		System.out.println("Amazon Viewer");
		System.out.println("Welcome!");
		System.out.println("Version BETA 2018.10.17-001");
		System.out.println("By: Enrique Zetina");
		System.out.println("-----------------------------------------");
		
		
		
		showMenu();
	}
	
	public static void showMenu() {
		
		int  exit =0;

		do {
			//keyboardInput = new Scanner(System.in);

			System.out.println("");

			System.out.println("MENU");
			System.out.println("");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");

			System.out.println("Choose one option: ");

			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextInt());

			switch(response) {
			case 0 :
				System.out.println("Bye!");
				System.out.println("Power by @ezetina");
				//exit=0;
				break;				
			case 1:
				showMovies();
				//exit=1;
				break;
			case 2:
				showSeries();
				//exit=1;
				break;
			case 3:
				showBooks();
				//exit=1;
				break;
			case 4:
				showMagazines();
				//exit=1;
				break;
			case 5:
				makeReport();
				//exit=1;
				break;
			case 6:
				makeReport(new Date());
				//exit=1;
				break;
			default:
				System.out.println("Not valid option try again!");
				System.out.println("");
				break;
			}
		}

		while (exit != 0);	

		
	}
	static ArrayList<Movie> movies = Movie.makeMoviesList();
	public static void showMovies() {
		
		int exit=1;
		
		do {
			System.out.println();
			System.out.println("::MOVIES::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTitleMovie() + " is viewed: " + movies.get(i).isViewedMovie());
			}
			System.out.println();
			System.out.println("0.- Regresar al menu Anterior");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextInt());
			
			if(response ==0) {
				showMenu();
			}
			
			if (response >0) {
				Movie movieSelected = movies.get(response - 1);
				Date dateI = movieSelected.startToSee(new Date());
				for (int i = 0; i < 1000; i++) {
					System.out.println(".........");
				}
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("You saw: " + movieSelected);
				System.out.println("During: " + movieSelected.getTimeViewedMovie() + " seconds");
				movieSelected.setViewedMovie(true);
			}			
		}while( exit !=0);
		
	}
	
	public static void showSeries() {
		
		int exit=1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println("::SERIES::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) {
				System.out.println(i+1 + ". " + series.get(i).getTitleMovie() + " is viewed: " + series.get(i).isViewedMovie());
			}
			System.out.println();
			System.out.println("0.- Regresar al menu Anterior");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextInt());
			
			if(response ==0) {
				showMenu();
			}
		
				showChapters(series.get(response - 1).getChapters());
			
			
		}while( exit !=0);
		
	}
	
	static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit=0;
		do { 
			
		System.out.println();
		System.out.println("::CHAPTERS::");
		System.out.println();
		
		for (int i = 0; i < chaptersOfSerieSelected.size(); i++) {
			System.out.println(1+i+"."+ chaptersOfSerieSelected.get(i).getTitleMovie() 
					+ " Visto: " + chaptersOfSerieSelected.get(i).isViewedMovie());
		}
		
		System.out.println();
		System.out.println("0.- Regresar al menu Anterior");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int response = Integer.valueOf(sc.nextInt());
		
		if(response ==0) {
			showSeries();
		}
		
		if (response>0) {
			Chapter chapterSelected = chaptersOfSerieSelected.get(response - 1);
			chapterSelected.setViewedMovie(true);
			Date dateI = chapterSelected.startToSee(new Date());
			for (int i = 0; i < 1000; i++) {
				System.out.println(".........");
			}
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("You saw:" + chapterSelected);
			System.out.println("During: " + chapterSelected.getTimeViewedMovie() + " seconds");
		}
			
		}while(exit !=0);
	}
	
	public static void showBooks() {
		int exit=1;
		do {
			System.out.println();
			System.out.println("::BOOKS::");
			System.out.println();
		}while( exit !=0);
		
	}
				
	public static void showMagazines() {
		int exit=1;
		do {
			System.out.println();
			System.out.println("::MAGAZINES::");
			System.out.println();
		}while( exit !=0);
		
	}
	
	
	public static  void makeReport() {
		Report rep = new Report();
		rep.setNameFile("Report");
		rep.setExtension(".txt");
		rep.setTittle(":::Vistos:::");
		String content = "";
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				content += movie.toString() + "\n";
			}
		}
		
		rep.setContent(content);
		rep.makeReport();
		
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		String dateString = df.format(date);
		Report rep = new Report();
		rep.setNameFile("Report"+ dateString);
		rep.setExtension(".txt");
		rep.setTittle(":::Vistos:::");
		String content = "";
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				content += movie.toString() + "\n";
			}
		}
		rep.setContent(content);
		rep.makeReport();
	}
}