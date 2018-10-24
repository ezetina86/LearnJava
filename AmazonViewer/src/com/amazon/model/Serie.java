package com.amazon.model;

import java.util.ArrayList;

public class Serie extends Film {
	
	private int idSerie;
	private int timeViewedSerie;
	private int seasonQuantity;
	private ArrayList<Chapter> chapters;
	
	public Serie(int durationMovie, String titleMovie, String genereMovie, String creatorMovie, int seasonQuantity, ArrayList<Chapter> chapters ) {
		super(durationMovie, titleMovie, genereMovie, creatorMovie);
		this.seasonQuantity=seasonQuantity;
		this.chapters=chapters;
	}

	public int getIdSerie() {
		return idSerie;
	}

	public int getTimeViewedSerie() {
		return timeViewedSerie;
	}

	public void setTimeViewedSerie(int timeViewedSerie) {
		this.timeViewedSerie = timeViewedSerie;
	}

	public int getSeasonQuantity() {
		return seasonQuantity;
	}

	public void setSeasonQuantity(int seasonQuantity) {
		this.seasonQuantity = seasonQuantity;
	}

	public ArrayList<Chapter>  getChapters() {
		return chapters;
	}

	public void setChapter(ArrayList<Chapter>  chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return "Tittle: " + getTitleMovie() + "\n" +
				"Genere: " +  getGenereMovie() + "\n" +
				"Year: " + getYearMovie() + "\n" +
				"Creator:" + getCreatorMovie() +  "\n" +
				"Season:" + getSeasonQuantity() + "\n";
	}
	
	
	public static ArrayList<Serie> makeSeriesList(){
		ArrayList<Serie>  serie = new ArrayList<Serie>();
		
		for (int i = 1; i < 5; i++) {
			serie.add(new Serie(40+i, "Serie"+i, "Action"+i, "Warner"+i, 3+i, Chapter.makeChapterList()));
		}
		
		return serie;
		
	}

	
	
}
