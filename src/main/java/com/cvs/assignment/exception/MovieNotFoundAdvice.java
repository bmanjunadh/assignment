package com.cvs.assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MovieNotFoundAdvice extends RuntimeException {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	  @ResponseBody
	  @ExceptionHandler(MovieNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String employeeNotFoundHandler(MovieNotFoundException ex) {
	    return ex.getMessage();
	  }
	}