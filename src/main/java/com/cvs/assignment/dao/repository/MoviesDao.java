package com.cvs.assignment.dao.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvs.assignment.model.Movie;

 
@Repository
@Transactional
public interface MoviesDao extends JpaRepository<Movie, Long>{

	Optional<Movie> findByMovieId(Integer id);

}
