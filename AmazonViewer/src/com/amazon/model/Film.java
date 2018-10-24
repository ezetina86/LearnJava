package com.amazon.model;

public class Film {
	
	//encapsulamiento
		private int durationMovie;		
		private short yearMovie;	
		private String titleMovie;
		private String genereMovie;
		private String creatorMovie;
		private String directorMovie;
		private String countryMovie;
		private boolean isViewedMovie;
		
		
		public Film(int durationMovie, String titleMovie, String genereMovie, String creatorMovie) {
			super();
			this.durationMovie = durationMovie;
			this.titleMovie = titleMovie;
			this.genereMovie = genereMovie;
			this.creatorMovie = creatorMovie;
		}

		public Film(String titleMovie) {
			super();
			this.titleMovie = titleMovie;
		}

		public int getDurationMovie() {
			return durationMovie;
		}
		public void setDurationMovie(int durationMovie) {
			this.durationMovie = durationMovie;
		}
		public short getYearMovie() {
			return yearMovie;
		}
		public void setYearMovie(short yearMovie) {
			this.yearMovie = yearMovie;
		}
		public String getTitleMovie() {
			return titleMovie;
		}
		public void setTitleMovie(String titleMovie) {
			this.titleMovie = titleMovie;
		}
		public String getGenereMovie() {
			return genereMovie;
		}
		public void setGenereMovie(String genereMovie) {
			this.genereMovie = genereMovie;
		}
		public String getCreatorMovie() {
			return creatorMovie;
		}
		public void setCreatorMovie(String creatorMovie) {
			this.creatorMovie = creatorMovie;
		}
		public String getDirectorMovie() {
			return directorMovie;
		}
		public void setDirectorMovie(String directorMovie) {
			this.directorMovie = directorMovie;
		}
		public String getCountryMovie() {
			return countryMovie;
		}
		public void setCountryMovie(String countryMovie) {
			this.countryMovie = countryMovie;
		}
		public String isViewedMovie() {
			String visto = "";
			if(isViewedMovie == true) {
			   visto = "Si";
			}else {
				visto="No";
			}
	
			return visto;
		}
		
		public boolean getIsViewed() {
			return isViewedMovie;
		}
		
		
		public void setViewedMovie(boolean isViewedMovie) {
			this.isViewedMovie = isViewedMovie;
		}
		
}
