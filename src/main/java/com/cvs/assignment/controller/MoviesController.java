package com.cvs.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.assignment.exception.MovieNotFoundException;
import com.cvs.assignment.model.Movie;
import com.cvs.assignment.service.MoviesService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class MoviesController {
	
	@Autowired
	private MoviesService moviesService;
	
	@GetMapping(path = "/movies")
	public Page<Movie> getMovies(@RequestParam(name="genre",required = false) String genre,
								@RequestParam(name="year",required = false) String year,
								@RequestParam(value = "page", required = false, defaultValue = "0" ) Integer page,
							    @RequestParam(value = "size", required = false, defaultValue = "50")  Integer size) throws JsonProcessingException {
		return moviesService.findAllMovies(genre,year,page,size);
 	}
	
	@GetMapping("/movies/{id}")
	  Movie one(@PathVariable Integer id) {
	    
	    return moviesService.findById(id)
	    							.orElseThrow(() -> new MovieNotFoundException(id));
	  }
	
     
}
