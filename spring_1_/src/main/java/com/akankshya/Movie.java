package com.akankshya;

public class Movie {
	String movieId ;
	String movieName ;
	String movieActor ;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}// no argument constructor
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieActor=" + movieActor + "]";
	}
	
	
	

}
