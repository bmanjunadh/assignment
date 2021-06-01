package com.cvs.assignment.model;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
	
	
	

	@Id
	private Integer movieId;
	
	private String imdbId;
	
	private String title;
	
	private String overview;
	
	private String productionCompanies;
	
	private String releaseDate;
	
	private Integer budget;
     
	private Integer revenue;
	
	private Float runtime;
	
	private String language;
	
	private String genres;
	
	private String status;
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	 

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Integer getRevenue() {
		return revenue;
	}

	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}

	public Float getRuntime() {
		return runtime;
	}

	public void setRuntime(Float runtime) {
		this.runtime = runtime;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getMovieId() {
		return movieId;
	}


	public String getProductionCompanies() {
		return productionCompanies;
	}

	public void setProductioncompanies(String productionCompanies) {
		this.productionCompanies = productionCompanies;
	}


	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public void setProductionCompanies(String productionCompanies) {
		this.productionCompanies = productionCompanies;
	}

}
