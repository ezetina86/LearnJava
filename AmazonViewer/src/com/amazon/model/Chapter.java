package com.amazon.model;

import java.util.ArrayList;

public class Chapter extends Movie  {
	
	private int idChapter;
	private int seasonNumberChapter;
	
	public Chapter(int durationMovie, String titleMovie, String genereMovie, String creatorMovie, int year, int seasonNumberChapter) {
		super(durationMovie, titleMovie, genereMovie, creatorMovie, year);
		this.setSeasonNumberChapter(seasonNumberChapter);
	}

	public int getIdChapter() {
		return idChapter;
	}

	public int getSeasonNumberChapter() {
		return seasonNumberChapter;
	}

	public void setSeasonNumberChapter(int seasonNumberChapter) {
		this.seasonNumberChapter = seasonNumberChapter;
	}
	
	@Override
	public String toString() {
		
		return "Tittle: " + getTitleMovie() + "\n" +
				"Genere: " +  getGenereMovie() + "\n" +
				"Year: " + getYearMovie() + "\n" +
				"Creator:" + getCreatorMovie() +  "\n";
		
	}
	
	public static ArrayList<Chapter> makeChapterList(){
		
		ArrayList<Chapter> chapters  = new ArrayList<Chapter>();
		
		for (int i = 1; i <5; i++) {
			chapters.add(new Chapter(20, "Capitulo. "+i, "Terror", "Zetina", 2018+1, i));
		}
		
		return chapters;
	}
	
}
