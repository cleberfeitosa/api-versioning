package com.cleberfeitosa.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleberfeitosa.movie.dto.MovieDTO;
import com.cleberfeitosa.movie.dto.MovieGenreDTO;
import com.cleberfeitosa.movie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(produces = "application/vnd.cleberfeitosa.movie-v1+json")
	public Page<MovieGenreDTO> findAllV1(Pageable pageable) {
		return service.findAllMovieGenre(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping(value = "/{id}", produces = "application/vnd.cleberfeitosa.movie-v1+json")
	public MovieGenreDTO findByIdV1(@PathVariable Long id) {
		return service.findByIdMovieGenre(id);
	}
}
