package com.cvs.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cvs.assignment.dao.repository.MoviesDao;
import com.cvs.assignment.model.Movie;



@Service
public class MoviesService {
	
	@Autowired
	private MoviesDao moviesDao;
	
	/* 
	 * Using Spring Data QBE for filtering and pagination with order by.
	 * If genre and year are not passed , by default it is select all condition.
	 * If any one value or both values are given is passed that will be used in where condition .
	 * Page is defaulted to 0
	 * page size is defaulted to 50
	 * */
	public Page<Movie> findAllMovies(String genre,String year,Integer page, Integer size) {

		Movie query= new Movie();
		query.setGenres(genre);
		query.setReleaseDate(year);
		
		ExampleMatcher matcher = ExampleMatcher.matching()     
	                  .withStringMatcher(StringMatcher.CONTAINING)     
	                  .withIgnoreCase();  
		
		Example<Movie> example = Example.of(query, matcher); 
		Pageable pagination = PageRequest.of(page, size,Sort.by("releaseDate").descending());
		return  moviesDao.findAll(example,pagination); 
	}

	public Optional<Movie> findById(Integer id) {
 		return moviesDao.findByMovieId(id);
	}

}
