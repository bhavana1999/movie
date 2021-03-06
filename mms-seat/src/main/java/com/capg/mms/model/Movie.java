package com.capg.mms.model;

import java.util.List;

import javax.persistence.ElementCollection;

import java.time.LocalDate;

import org.springframework.boot.actuate.autoconfigure.health.HealthProperties.Show;
import org.springframework.format.annotation.DateTimeFormat;

public class Movie {
private int movieId;
private String movieName;
private String movieGenre;
private String movieDirector;
private int movieLength;
@ElementCollection
private List<String> languages;
@DateTimeFormat(pattern = "yyyy/MM/dd")
private LocalDate movieReleaseDate;
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieGenre() {
	return movieGenre;
}
public void setMovieGenre(String movieGenre) {
	this.movieGenre = movieGenre;
}
public String getMovieDirector() {
	return movieDirector;
}
public void setMovieDirector(String movieDirector) {
	this.movieDirector = movieDirector;
}
public int getMovieLength() {
	return movieLength;
}
public void setMovieLength(int movieLength) {
	this.movieLength = movieLength;
}
public List<String> getLanguages() {
	return languages;
}
public void setLanguages(List<String> languages) {
	this.languages = languages;
}
public LocalDate getMovieReleaseDate() {
	return movieReleaseDate;
}
public void setMovieReleaseDate(LocalDate movieReleaseDate) {
	this.movieReleaseDate = movieReleaseDate;
}
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre + ", movieDirector="
			+ movieDirector + ", movieLength=" + movieLength + ", languages=" + languages + ", movieReleaseDate="
			+ movieReleaseDate + "]";
}


}