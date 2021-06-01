package com.cvs.assignment.exception;

public class MovieNotFoundException extends RuntimeException {

  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovieNotFoundException(Integer id) {
    super("Could not find movie " + id);
  }
}